package com.hengshuo.baibx.model;

/**
 * Activation entity. @author MyEclipse Persistence Tools
 */

public class Activation implements java.io.Serializable {

	// Fields

	private Integer id;
	private String accode;
	private String flag;
	private String userid;
	private String equipmentId;
	private String macaddress;
	private String type;

	// Constructors

	/** default constructor */
	public Activation() {
	}

	/** full constructor */
	public Activation(String accode, String flag, String userid,
			String equipmentId, String macaddress, String type) {
		this.accode = accode;
		this.flag = flag;
		this.userid = userid;
		this.equipmentId = equipmentId;
		this.macaddress = macaddress;
		this.type = type;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccode() {
		return this.accode;
	}

	public void setAccode(String accode) {
		this.accode = accode;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getEquipmentId() {
		return this.equipmentId;
	}

	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}

	public String getMacaddress() {
		return this.macaddress;
	}

	public void setMacaddress(String macaddress) {
		this.macaddress = macaddress;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}