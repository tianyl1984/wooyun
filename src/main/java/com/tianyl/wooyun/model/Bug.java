package com.tianyl.wooyun.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.tianyl.core.orm.annotation.Table;

@Table("bugs")
public class Bug {

	private Integer id;

	private String bugType;

	private String author;

	private String wyid;

	private String url;

	private String title;

	@JSONField(format = "yyyy-MM-dd HH:mm")
	private Date dateTime;

	@JSONField(format = "yyyy-MM-dd HH:mm")
	private Date dateTimeOpen;

	private Boolean delFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBugType() {
		return bugType;
	}

	public void setBugType(String bugType) {
		this.bugType = bugType;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getWyid() {
		return wyid;
	}

	public void setWyid(String wyid) {
		this.wyid = wyid;
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

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public Date getDateTimeOpen() {
		return dateTimeOpen;
	}

	public void setDateTimeOpen(Date dateTimeOpen) {
		this.dateTimeOpen = dateTimeOpen;
	}

	public Boolean getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Boolean delFlag) {
		this.delFlag = delFlag;
	}

}
