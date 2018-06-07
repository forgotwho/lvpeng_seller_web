package com.lvpeng.seller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;

@RestController
@RequestMapping("/addresses")
public class AddressController {

	/**
	 * 查找买家默认地址
	 */
	@RequestMapping(value = "/default", method = RequestMethod.GET)
	public ResultBean defaultAddress(String customer_id) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 查找买家地址列表
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean addresses(String customer_id, int from, int limit) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 上报FORM
	 */
	@RequestMapping(value = "/visit_shops/form_id", method = RequestMethod.GET)
	public ResultBean reportFormId(String formId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
