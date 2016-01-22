package com.hengshuo.baibx.model;

/**
 * Userb entity. @author MyEclipse Persistence Tools
 */

public class Userb implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userid;
	private String password;
	private String type;
	private String verifycode;
	private String acticode;
	private Integer gold;
	private String regtime;
	private String phone;
	private String name;
	private String position;
	private String heart;
	private String sex;
	private String address;
	private String insurer;
	private String company;
	private String honorphotos;
	private String status;
	private String renewaltime;
	private String employeenumber;
	private String insurerperson;

	// Constructors

	/** default constructor */
	public Userb() {
	}

	/** full constructor */
	public Userb(String userid, String password, String type,
			String verifycode, String acticode, Integer gold, String regtime,
			String phone, String name, String position, String heart,
			String sex, String address, String insurer, String company,
			String honorphotos, String status, String renewaltime,
			String employeenumber, String insurerperson) {
		this.userid = userid;
		this.password = password;
		this.type = type;
		this.verifycode = verifycode;
		this.acticode = acticode;
		this.gold = gold;
		this.regtime = regtime;
		this.phone = phone;
		this.name = name;
		this.position = position;
		this.heart = heart;
		this.sex = sex;
		this.address = address;
		this.insurer = insurer;
		this.company = company;
		this.honorphotos = honorphotos;
		this.status = status;
		this.renewaltime = renewaltime;
		this.employeenumber = employeenumber;
		this.insurerperson = insurerperson;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVerifycode() {
		return this.verifycode;
	}

	public void setVerifycode(String verifycode) {
		this.verifycode = verifycode;
	}

	public String getActicode() {
		return this.acticode;
	}

	public void setActicode(String acticode) {
		this.acticode = acticode;
	}

	public Integer getGold() {
		return this.gold;
	}

	public void setGold(Integer gold) {
		this.gold = gold;
	}

	public String getRegtime() {
		return this.regtime;
	}

	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getHeart() {
		return this.heart;
	}

	public void setHeart(String heart) {
		this.heart = heart;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getInsurer() {
		return this.insurer;
	}

	public void setInsurer(String insurer) {
		this.insurer = insurer;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getHonorphotos() {
		return this.honorphotos;
	}

	public void setHonorphotos(String honorphotos) {
		this.honorphotos = honorphotos;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRenewaltime() {
		return this.renewaltime;
	}

	public void setRenewaltime(String renewaltime) {
		this.renewaltime = renewaltime;
	}

	public String getEmployeenumber() {
		return this.employeenumber;
	}

	public void setEmployeenumber(String employeenumber) {
		this.employeenumber = employeenumber;
	}

	public String getInsurerperson() {
		return this.insurerperson;
	}

	public void setInsurerperson(String insurerperson) {
		this.insurerperson = insurerperson;
	}

}