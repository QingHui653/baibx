package com.hengshuo.baibx.model;

/**
 * Image entity. @author MyEclipse Persistence Tools
 */

public class Image implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String imagepath;

	// Constructors

	/** default constructor */
	public Image() {
	}

	/** full constructor */
	public Image(String name, String imagepath) {
		this.name = name;
		this.imagepath = imagepath;
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

	public String getImagepath() {
		return this.imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

}