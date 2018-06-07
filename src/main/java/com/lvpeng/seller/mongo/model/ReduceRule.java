package com.lvpeng.seller.mongo.model;

import org.springframework.data.annotation.Id;

public class ReduceRule {
	@Id
	private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
