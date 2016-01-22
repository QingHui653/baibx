package com.hengshuo.baibx.model;

/**
 * Payinformation entity. @author MyEclipse Persistence Tools
 */

public class Payinformation implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userid;
	private String ordertime;
	private String productcode;
	private String paytime;
	private String payment;
	private String phone;
	private Double price;
	private String productgroup;
	private Integer gold;
	private String status;

	// Constructors

	/** default constructor */
	public Payinformation() {
	}

	/** full constructor */
	public Payinformation(String userid, String ordertime, String productcode,
			String paytime, String payment, String phone, Double price,
			String productgroup, Integer gold, String status) {
		this.userid = userid;
		this.ordertime = ordertime;
		this.productcode = productcode;
		this.paytime = paytime;
		this.payment = payment;
		this.phone = phone;
		this.price = price;
		this.productgroup = productgroup;
		this.gold = gold;
		this.status = status;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getOrdertime() {
		return this.ordertime;
	}

	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}

	public String getProductcode() {
		return this.productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getPaytime() {
		return this.paytime;
	}

	public void setPaytime(String paytime) {
		this.paytime = paytime;
	}

	public String getPayment() {
		return this.payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getProductgroup() {
		return this.productgroup;
	}

	public void setProductgroup(String productgroup) {
		this.productgroup = productgroup;
	}

	public Integer getGold() {
		return this.gold;
	}

	public void setGold(Integer gold) {
		this.gold = gold;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}