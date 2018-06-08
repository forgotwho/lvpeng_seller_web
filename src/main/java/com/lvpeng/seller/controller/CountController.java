package com.lvpeng.seller.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.MonthCountBean;
import com.lvpeng.seller.bean.OrderCountBean;
import com.lvpeng.seller.bean.TodayCountBean;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Member;
import com.lvpeng.seller.dal.repository.MemberRepository;

@RestController
@RequestMapping("/count")
public class CountController {

	@Autowired
	private MemberRepository memberRepository;

	/**
	 * 统计
	 */
	@RequestMapping(method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public ResultBean count(String count_type) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		if ("TODAY".equals(count_type)) {
			TodayCountBean bean = new TodayCountBean();
			result.setData(bean);
		} else if ("MONTH".equals(count_type)) {
			MonthCountBean bean = new MonthCountBean();
			result.setData(bean);
		}
		return result;
	}

	/**
	 * 订单统计
	 */
	@RequestMapping(value = "/order", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public ResultBean order() {
		ResultBean result = new ResultBean();
		List<OrderCountBean> beanList = new ArrayList<OrderCountBean>();
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

	/**
	 * 分页方法
	 */
	@RequestMapping(value = "/customer/price", method = RequestMethod.GET)
	public ResultBean countCustomerPrice() {
		ResultBean result = new ResultBean();
		List<Member> beanList = memberRepository.findAll();
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

	/**
	 * 分页方法
	 */
	@RequestMapping(value = "/customer/time", method = RequestMethod.GET)
	public ResultBean countCustomerTime() {
		ResultBean result = new ResultBean();
		List<Member> beanList = memberRepository.findAll();
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

	/**
	 * 分页方法
	 */
	@RequestMapping(value = "/customer/times", method = RequestMethod.GET)
	public ResultBean countCustomerTimes() {
		ResultBean result = new ResultBean();
		List<Member> beanList = memberRepository.findAll();
		result.setCode(0);
		result.setData(beanList);
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
