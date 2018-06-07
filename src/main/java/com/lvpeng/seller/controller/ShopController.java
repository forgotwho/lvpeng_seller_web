package com.lvpeng.seller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.mongo.model.Shop;

@RestController
@RequestMapping("/shops")
public class ShopController {

	/**
	 * 获取店铺信息
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean page(int from, int limit) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 更新店铺信息
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean create(Shop data) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 获取店铺状态
	 */
	@RequestMapping(value = "/status", method = RequestMethod.GET)
	public ResultBean getStatus(String shopId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 修改店铺状态
	 */
	@RequestMapping(value = "/status", method = RequestMethod.PUT)
	public ResultBean setStatus(String shopId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
