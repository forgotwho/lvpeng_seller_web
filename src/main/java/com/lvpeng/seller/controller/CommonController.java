package com.lvpeng.seller.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.response.CountBean;
import com.lvpeng.seller.response.CountOrderBean;
import com.lvpeng.seller.response.NoticesBean;
import com.lvpeng.seller.response.OrderBean;
import com.lvpeng.seller.response.OrderNoteBean;
import com.lvpeng.seller.response.ShopChargeLimitBean;
import com.lvpeng.seller.response.ShopStatusBean;
import com.lvpeng.seller.response.ShopsBean;

@RestController
public class CommonController {

	@RequestMapping("/shop_charge_limit")
	public ResultBean shop_charge_limit() {
		ResultBean result = new ResultBean();
		ShopChargeLimitBean bean = new ShopChargeLimitBean();
		result.setCode(0);
		result.setData(bean);

		return result;
	}

	@RequestMapping("/shops")
	public ResultBean shops() {
		ResultBean result = new ResultBean();
		ShopsBean bean = new ShopsBean();

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
		List<NoticesBean> beanList = new ArrayList<NoticesBean>();

		result.setCode(0);
		result.setData(beanList);

		return result;
	}

	@RequestMapping("/count")
	public ResultBean count(String count_type) {
		ResultBean result = new ResultBean();
		CountBean bean = new CountBean();

		result.setCode(0);
		result.setData(bean);

		return result;
	}

	@RequestMapping("/count/order")
	public ResultBean countOrder() {
		ResultBean result = new ResultBean();
		List<CountOrderBean> beanList = new ArrayList<CountOrderBean>();

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
