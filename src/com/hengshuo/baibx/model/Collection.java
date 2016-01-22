package com.hengshuo.baibx.model;

/**
 * Collection entity. @author MyEclipse Persistence Tools
 */

public class Collection implements java.io.Serializable {

	// Fields

	private Integer id;
	private String type;
	private Integer resouceid;
	private String title;
	private String url;
	private String top;
	private String time;
	private String userid;

	// Constructors

	/** default constructor */
	public Collection() {
	}

	/** full constructor */
	public Collection(String type, Integer resouceid, String title, String url,
			String top, String time, String userid) {
		this.type = type;
		this.resouceid = resouceid;
		this.title = title;
		this.url = url;
		this.top = top;
		this.time = time;
		this.userid = userid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getResouceid() {
		return this.resouceid;
	}

	public void setResouceid(Integer resouceid) {
		this.resouceid = resouceid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTop() {
		return this.top;
	}

	public void setTop(String top) {
		this.top = top;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}