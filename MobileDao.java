package com.cg.springmobile.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springmobile.dto.Mobile;
@Repository("mobiledao")
public class MobileDao implements IMobileDao{
	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public int addMobile(Mobile mob) {
		// TODO Auto-generated method stub
		entitymanager.persist(mob);
		entitymanager.flush();
		return mob.getMobileId();
	}

	@Override
	public List<Mobile> showAllProduct() {
		// TODO Auto-generated method stub
		Query query=entitymanager.createQuery("FROM Mobile");
		List<Mobile> myProd=query.getResultList();
		return myProd;
	}

	@Override
	public List<Mobile> searchProduct(int prodId) {
		// TODO Auto-generated method stub
		Query queryOne=entitymanager.createQuery("FROM Mobile where mobileId=:mobile_id");
		queryOne.setParameter("mobile_id", prodId);
		List<Mobile> myProd=queryOne.getResultList();
		return myProd;
	}

	@Override
	public int removemobiledata(int delid) {
		// TODO Auto-generated method stub
		Query queryOne=entitymanager.createQuery("DELETE FROM Mobile where mobileId=:mobile_id");
		queryOne.setParameter("mobile_id", delid);
		int status=queryOne.executeUpdate();
		return status;
		
		
	}

}
