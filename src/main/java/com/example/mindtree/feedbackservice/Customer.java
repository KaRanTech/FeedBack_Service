package com.example.mindtree.feedbackservice;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	
	private String custInfo;
	
	private String address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustInfo() {
		return custInfo;
	}

	public void setCustInfo(String custInfo) {
		this.custInfo = custInfo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", custInfo=" + custInfo + ", address=" + address + "]";
	}
	
	

}
