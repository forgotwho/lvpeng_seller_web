package com.lvpeng.seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Shop;
import com.lvpeng.seller.dal.repository.ShopRepository;

@RestController
@RequestMapping("/shops")
public class ShopController {

	
	@Autowired
	private ShopRepository shopRepository;
	
	/**
	 * 获取店铺信息
	 */
	@RequestMapping(method = RequestMethod.GET,produces="application/json;charset=UTF-8")
	public ResultBean page(String from, String limit) {
		ResultBean result = new ResultBean();
		Shop shop = shopRepository.findAll().get(0);
		result.setData(shop);
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
