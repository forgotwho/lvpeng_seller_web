package com.lvpeng.seller.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.CouponBean;
import com.lvpeng.seller.common.ResultBean;

@RestController
@RequestMapping("/orders")
public class OrderController {

	/**
	 * 分页方法
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean page(int from, int limit) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 订单详情
	 */
	@RequestMapping(value = "/{orderId}", method = RequestMethod.GET)
	public ResultBean info(@PathVariable String orderId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 物流发货
	 */
	@RequestMapping(value = "/{orderId}/send", method = RequestMethod.PUT)
	public ResultBean send(@PathVariable String orderId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 订单备注
	 */
	@RequestMapping(value = "/{orderId}/note", method = RequestMethod.PUT)
	public ResultBean note(@PathVariable String orderId, String sellerNote) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 订单打印
	 */
	@RequestMapping(value = "/{orderId}/print", method = RequestMethod.PUT)
	public ResultBean print(@PathVariable String orderId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 关闭订单
	 */
	@RequestMapping(value = "/{orderId}/status/close", method = RequestMethod.PUT)
	public ResultBean close(@PathVariable String orderId, String note) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 确认收货
	 */
	@RequestMapping(value = "/{orderId}/status/comments", method = RequestMethod.PUT)
	public ResultBean confirmOrder(@PathVariable String orderId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 接单
	 */
	@RequestMapping(value = "/{orderId}/take_food_order", method = RequestMethod.PUT)
	public ResultBean take(@PathVariable String orderId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 订单改价
	 */
	@RequestMapping(value = "/{orderId}/modify_money", method = RequestMethod.PUT)
	public ResultBean reprice(@PathVariable String orderId, String param) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 同意退款
	 */
	/**
	 * 拒绝退款
	 */
	@RequestMapping(value = "/{orderId}/refund_money", method = RequestMethod.PUT)
	public ResultBean agreeRefund(@PathVariable String orderId, String isAgree, String disagreeCause) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 创建订单
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean createOrder(CouponBean data) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
