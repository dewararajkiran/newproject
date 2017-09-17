package com.docsolr.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "sitefileinfo")
public class SiteFileInfo extends BaseEntity{
	

	private long folderId;
	private String name;
	private String fileRelativeURL;
	private String uniqueId;
	
	private String siteURL;
	private Date fileCreatedDate;
	private Date fileLastModifiedDate;
	
	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public long getFolderId() {
		return folderId;
	}
	public void setFolderId(long folderId) {
		this.folderId = folderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFileRelativeURL() {
		return fileRelativeURL;
	}
	public void setFileRelativeURL(String fileRelativeURL) {
		this.fileRelativeURL = fileRelativeURL;
	}
	public String getSiteURL() {
		return siteURL;
	}
	public void setSiteURL(String siteURL) {
		this.siteURL = siteURL;
	}
	
	public Date getFileCreatedDate() {
		return fileCreatedDate;
	}
	public void setFileCreatedDate(Date fileCreatedDate) {
		this.fileCreatedDate = fileCreatedDate;
	}
	
	public Date getFileLastModifiedDate() {
		return fileLastModifiedDate;
	}
	public void setFileLastModifiedDate(Date fileLastModifiedDate) {
		this.fileLastModifiedDate = fileLastModifiedDate;
	}


}