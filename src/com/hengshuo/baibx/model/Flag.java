package com.hengshuo.baibx.model;

/**
 * Flag entity. @author MyEclipse Persistence Tools
 */

public class Flag implements java.io.Serializable {

	// Fields

	private Integer id;
	private String flag;

	// Constructors

	/** default constructor */
	public Flag() {
	}

	/** full constructor */
	public Flag(String flag) {
		this.flag = flag;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}