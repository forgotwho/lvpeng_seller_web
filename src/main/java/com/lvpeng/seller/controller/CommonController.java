package com.lvpeng.seller.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.OrderBean;
import com.lvpeng.seller.bean.OrderCountBean;
import com.lvpeng.seller.bean.OrderNoteBean;
import com.lvpeng.seller.bean.ShopStatusBean;
import com.lvpeng.seller.bean.TodayCountBean;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.mongo.model.Notice;
import com.lvpeng.seller.mongo.model.Shop;
import com.lvpeng.seller.mongo.model.ShopChargeLimit;

@RestController
public class CommonController {

	@RequestMapping("/shop_charge_limit")
	public ResultBean shop_charge_limit() {
		ResultBean result = new ResultBean();
		ShopChargeLimit bean = new ShopChargeLimit();
		result.setCode(0);
		result.setData(bean);

		return result;
	}

	@RequestMapping("/shops")
	public ResultBean shops() {
		ResultBean result = new ResultBean();
		Shop bean = new Shop();

		result.setCode(0);
		result.setData(bean);

		return result;
	}

	@RequestMapping("/shops/status")
	public ResultBean shopsStatus() {
		ResultBean result = new ResultBean();
		ShopStatusBean bean = new ShopStatusBean();

		result.setCode(0);
		result.setData(bean);

		return result;
	}

	@RequestMapping("/notices")
	public ResultBean notices(int from, int limit, String status) {
		ResultBean result = new ResultBean();
		List<Notice> beanList = new ArrayList<Notice>();

		result.setCode(0);
		result.setData(beanList);

		return result;
	}

	@RequestMapping("/count")
	public ResultBean count(String count_type) {
		ResultBean result = new ResultBean();
		TodayCountBean bean = new TodayCountBean();

		result.setCode(0);
		result.setData(bean);

		return result;
	}

	@RequestMapping("/count/order")
	public ResultBean countOrder() {
		ResultBean result = new ResultBean();
		List<OrderCountBean> beanList = new ArrayList<OrderCountBean>();

		result.setCode(0);
		result.setData(beanList);

		return result;
	}

	@RequestMapping("/orders")
	public ResultBean orders() {
		ResultBean result = new ResultBean();
		List<OrderBean> beanList = new ArrayList<OrderBean>();

		result.setCode(0);
		result.setData(beanList);

		return result;
	}

	@RequestMapping("/orders/{orderId}/note")
	public ResultBean orderNote(int orderId, String sellerNote) {
		ResultBean result = new ResultBean();
		OrderNoteBean bean = new OrderNoteBean();

		result.setCode(0);
		result.setData(bean);

		return result;
	}

}
