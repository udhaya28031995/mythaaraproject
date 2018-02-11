package com.cg.springmobile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="mobilepurchase")
public class Mobile {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mobseq")
@SequenceGenerator(name="mobseq",sequenceName="mobilesequence")
@Column(name="mobile_id")
Integer mobileId;
@Column(name="mobile_name")
@NotEmpty(message="Product Name Field cannot be empty")
String mobileName;
@Column(name="mobile_brand")
String mobileBrand;
@Column(name="feature")
@NotEmpty(message="feature is mandatory")
String feature;
@Column(name="mobile_price")
@NotNull(message="Price Field cannot be empty")
Integer mobilePrice;

	public Integer getMobilePrice() {
	return mobilePrice;
}
public void setMobilePrice(Integer mobilePrice) {
	this.mobilePrice = mobilePrice;
}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public Integer getMobileId() {
		return mobileId;
	}
	public void setMobileId(Integer mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileBrand() {
		return mobileBrand;
	}
	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	@Override
	public String toString() {
		return "Mobile [mobileName=" + mobileName + ", mobileId=" + mobileId
				+ ", mobileBrand=" + mobileBrand + ", feature=" + feature + "]";
	}
	
	
	
	
}
