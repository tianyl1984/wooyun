package com.tianyl.wooyun.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.tianyl.core.orm.annotation.Table;

@Table("drops")
public class Drop {

	private Integer id;

	private String category;

	private String author;

	private String wyurl;

	private String url;

	private String title;

	@JSONField(format = "yyyy-MM-dd HH:mm")
	private Date datetime;

	private Boolean delFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getWyurl() {
		return wyurl;
	}

	public void setWyurl(String wyurl) {
		this.wyurl = wyurl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public Boolean getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Boolean delFlag) {
		this.delFlag = delFlag;
	}

}
