package com.hengshuo.baibx.model;

/**
 * Orderb entity. @author MyEclipse Persistence Tools
 */

public class Orderb implements java.io.Serializable {

	// Fields

	private Integer orderid;
	private String time;
	private String status;
	private Double price;
	private String name;
	private String phone;
	private String address;
	private String logistics;
	private String payment;
	private String userid;
	private String orNo;

	// Constructors

	/** default constructor */
	public Orderb() {
	}

	/** full constructor */
	public Orderb(String time, String status, Double price, String name,
			String phone, String address, String logistics, String payment,
			String userid, String orNo) {
		this.time = time;
		this.status = status;
		this.price = price;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.logistics = logistics;
		this.payment = payment;
		this.userid = userid;
		this.orNo = orNo;
	}

	// Property accessors

	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLogistics() {
		return this.logistics;
	}

	public void setLogistics(String logistics) {
		this.logistics = logistics;
	}

	public String getPayment() {
		return this.payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getOrNo() {
		return this.orNo;
	}

	public void setOrNo(String orNo) {
		this.orNo = orNo;
	}

}