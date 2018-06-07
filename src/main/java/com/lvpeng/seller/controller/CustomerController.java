package com.lvpeng.seller.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	/**
	 * 获取客户详细信息
	 */
	@RequestMapping(value = "/{customerId}/detail_info", method = RequestMethod.GET)
	public ResultBean detailInfo(@PathVariable String customerId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 卖家获取用户列表
	 */
	@RequestMapping(value = "/sort_list", method = RequestMethod.GET)
	public ResultBean customersList(String selectedId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 卖家获取用户列表
	 */
	@RequestMapping(value = "/members/list", method = RequestMethod.GET)
	public ResultBean membersList(String selectedId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 分页方法
	 */
	@RequestMapping(value = "/order_list", method = RequestMethod.GET)
	public ResultBean hisPage(int from, int limit) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 分页方法
	 */
	@RequestMapping(value = "/visit_list", method = RequestMethod.GET)
	public ResultBean visitList(int from, int limit) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 分页方法
	 */
	@RequestMapping(value = "/visit_list", method = RequestMethod.POST)
	public ResultBean visitCreate() {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
