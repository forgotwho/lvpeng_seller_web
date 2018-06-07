/**
  * Copyright 2018 Risingsun 
  */
package com.lvpeng.seller.dal.model;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-05 22:17:51
 *
 * @author Risingsun (Risingsun)
 * @website
 */
public class Seller {

	@Id
	public String id;

	private String phone;

	private String appCode;

	private String loginCode;

	private String status;

	private Long createTime;

	private Long updateTime;

	private Long lastLoginTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAppCode() {
		return appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getLoginCode() {
		return loginCode;
	}

	public void setLoginCode(String loginCode) {
		this.loginCode = loginCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public Long getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Long lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

}