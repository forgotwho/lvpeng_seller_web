package com.lvpeng.seller.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.TodayCountBean;
import com.lvpeng.seller.common.ResultBean;

@RestController
@RequestMapping("/count")
public class CountController {

	/**
	 * 统计
	 */
	@RequestMapping(method = RequestMethod.GET,produces="application/json;charset=UTF-8")
	public ResultBean count(String count_type) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		result.setData(new TodayCountBean());
		return result;
	}

	/**
	 * 订单统计
	 */
	@RequestMapping(value = "/order", method = RequestMethod.GET,produces="application/json;charset=UTF-8")
	public ResultBean order() {
		ResultBean result = new ResultBean();
		result.setCode(0);
		result.setData(new ArrayList());
		return result;
	}

	/**
	 * 分页方法
	 */
	@RequestMapping(value = "/customer/price", method = RequestMethod.GET)
	public ResultBean countCustomerPrice() {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 分页方法
	 */
	@RequestMapping(value = "/customer/time", method = RequestMethod.GET)
	public ResultBean countCustomerTime() {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 分页方法
	 */
	@RequestMapping(value = "/customer/times", method = RequestMethod.GET)
	public ResultBean countCustomerTimes() {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 浏览统计
	 */
	@RequestMapping(value = "/visit_count", method = RequestMethod.GET)
	public ResultBean visitCount() {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
