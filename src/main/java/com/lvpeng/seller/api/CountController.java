package com.lvpeng.seller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.MonthCountBean;
import com.lvpeng.seller.bean.TodayCountBean;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Order;
import com.lvpeng.seller.dal.repository.OrderRepository;

@RestController
@RequestMapping("/count")
public class CountController {

	@Autowired
	private OrderRepository orderRepository;

	/**
	 * 统计
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean count(@RequestHeader("shop_id") int shopId, String count_type) {
		ResultBean result = new ResultBean();

		Order query = new Order();
		query.setShopId(shopId);
		query.setStatus(1);
		Example<Order> example = Example.of(query);
		double income = orderRepository.count(example);
		query = new Order();
		query.setShopId(shopId);
		query.setStatus(2);
		example = Example.of(query);
		long paymentOrder = orderRepository.count(example);
		query = new Order();
		query.setShopId(shopId);
		query.setStatus(3);
		example = Example.of(query);
		long paymentGoods = orderRepository.count(example);
		query = new Order();
		query.setShopId(shopId);
		query.setStatus(4);
		example = Example.of(query);
		long visitShopLog = orderRepository.count(example);

		result.setCode(0);
		if ("TODAY".equals(count_type)) {
			TodayCountBean bean = new TodayCountBean();
			bean.setIncome(income);
			bean.setPaymentGoods(paymentGoods);
			bean.setPaymentOrder(paymentOrder);
			bean.setVisitShopLog(visitShopLog);
			result.setData(bean);
		} else if ("MONTH".equals(count_type)) {
			MonthCountBean bean = new MonthCountBean();
			bean.setIncome(income);
			bean.setPaymentGoods(paymentGoods);
			bean.setPaymentOrder(paymentOrder);
			bean.setVisitShopLog(visitShopLog);
			result.setData(bean);
		}
		return result;
	}
}
