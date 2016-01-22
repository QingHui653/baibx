package com.hengshuo.baibx.model;

/**
 * Edition entity. @author MyEclipse Persistence Tools
 */

public class Edition implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String fileaddress;

	// Constructors

	/** default constructor */
	public Edition() {
	}

	/** full constructor */
	public Edition(String name, String fileaddress) {
		this.name = name;
		this.fileaddress = fileaddress;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFileaddress() {
		return this.fileaddress;
	}

	public void setFileaddress(String fileaddress) {
		this.fileaddress = fileaddress;
	}

}