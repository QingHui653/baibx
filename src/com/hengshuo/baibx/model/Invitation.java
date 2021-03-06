package com.hengshuo.baibx.model;

/**
 * Invitation entity. @author MyEclipse Persistence Tools
 */

public class Invitation implements java.io.Serializable {

	// Fields

	private Integer id;
	private String content;
	private String userid;
	private String type;

	// Constructors

	/** default constructor */
	public Invitation() {
	}

	/** minimal constructor */
	public Invitation(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Invitation(Integer id, String content, String userid, String type) {
		this.id = id;
		this.content = content;
		this.userid = userid;
		this.type = type;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}