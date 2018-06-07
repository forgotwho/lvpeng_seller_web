package com.lvpeng.seller.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.mongo.model.DeliveryUser;

@RestController
@RequestMapping("/deliver_user")
public class DeliveryUserController {

	/**
	 * 配送员列表
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean listDeliver() {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 创建
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean createDeliver(DeliveryUser data) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 删除
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResultBean removeDeliver(@PathVariable String id) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 更新
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResultBean updateDeliver(@PathVariable String id, DeliveryUser data) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
