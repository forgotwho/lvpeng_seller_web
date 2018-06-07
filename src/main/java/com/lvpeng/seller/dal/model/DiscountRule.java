/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.dal.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-07 11:31:33
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class DiscountRule {

	@Id
	private String id;
	private int cardId;
	private int level;
	private String levelName;
	private int discount;
	private int upgradeFee;
	private Date createTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public int getCardId() {
		return cardId;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getDiscount() {
		return discount;
	}

	public void setUpgradeFee(int upgradeFee) {
		this.upgradeFee = upgradeFee;
	}

	public int getUpgradeFee() {
		return upgradeFee;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

}