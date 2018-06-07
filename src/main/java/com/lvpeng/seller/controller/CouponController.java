package com.lvpeng.seller.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.CouponBean;
import com.lvpeng.seller.common.ResultBean;

@RestController
@RequestMapping("/coupon")
public class CouponController {

	/**
	 * 客户历史订单分页
	 * 
	 * @param customerId
	 * @returns {Promise.<Pagination>}
	 */
	@RequestMapping(value = "/customers/{customerId}/coupon_list", method = RequestMethod.GET)
	public ResultBean cutomerCouponPage(@PathVariable String customerId, int from, int limit) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

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
	 * 优惠券使用情况分页方法
	 */
	@RequestMapping(value = "/{couponId}/used_info", method = RequestMethod.GET)
	public ResultBean pagePick(@PathVariable String couponId, String type) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 新增卡券
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean create(CouponBean data) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 删除卡券
	 */
	@RequestMapping(value = "/{couponId}", method = RequestMethod.DELETE)
	public ResultBean remove(@PathVariable String couponId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 查询卡券信息
	 */
	@RequestMapping(value = "/{couponId}", method = RequestMethod.GET)
	public ResultBean info(@PathVariable String couponId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 编辑卡券
	 */
	@RequestMapping(value = "/{couponId}", method = RequestMethod.PUT)
	public ResultBean update(@PathVariable String couponId, CouponBean data) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 使用卡券
	 */
	@RequestMapping(value = "/use/{couponId}", method = RequestMethod.PUT)
	public ResultBean use(@PathVariable String couponId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 卖家发放优惠券给买家数据处理
	 */
	/**
	 * 根据客户发放优惠券
	 * 
	 * @param params(couponId,
	 *            cusomterId)
	 */
	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public ResultBean send(String couponId, String cusomterId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
