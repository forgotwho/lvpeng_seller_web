package com.lvpeng.seller.dal.model;

import org.springframework.data.annotation.Id;

public class DeliveryUser {
	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
