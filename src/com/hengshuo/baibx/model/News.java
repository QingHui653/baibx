package com.hengshuo.baibx.model;

/**
 * News entity. @author MyEclipse Persistence Tools
 */

public class News implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String image;
	private String content;
	private String time;
	private String top;
	private Integer clicks;
	private String referee;
	private String chuchu;

	// Constructors

	/** default constructor */
	public News() {
	}

	/** full constructor */
	public News(String title, String image, String content, String time,
			String top, Integer clicks, String referee, String chuchu) {
		this.title = title;
		this.image = image;
		this.content = content;
		this.time = time;
		this.top = top;
		this.clicks = clicks;
		this.referee = referee;
		this.chuchu = chuchu;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTop() {
		return this.top;
	}

	public void setTop(String top) {
		this.top = top;
	}

	public Integer getClicks() {
		return this.clicks;
	}

	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}

	public String getReferee() {
		return this.referee;
	}

	public void setReferee(String referee) {
		this.referee = referee;
	}

	public String getChuchu() {
		return this.chuchu;
	}

	public void setChuchu(String chuchu) {
		this.chuchu = chuchu;
	}

}