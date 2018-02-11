package com.cg.springmobile.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springmobile.dao.IMobileDao;
import com.cg.springmobile.dto.Mobile;
@Service("mobileservice")
@Transactional
public class MobileService implements IMobileService {
@Autowired
IMobileDao mobiledao;
	@Override
	public int addMobile(Mobile mob) {
		// TODO Auto-generated method stub
		return mobiledao.addMobile(mob);
	}
	@Override
	public List<Mobile> showAll() {
		// TODO Auto-generated method stub
		return mobiledao.showAllProduct();
	}
	@Override
	public List<Mobile> searchProduct(int prodId) {
		// TODO Auto-generated method stub
		return mobiledao.searchProduct(prodId);
	}
	@Override
	public int removemobile(int delid) {
		return mobiledao.removemobiledata(delid);
		// TODO Auto-generated method stub
		
	}

}
