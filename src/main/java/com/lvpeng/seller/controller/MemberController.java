package com.lvpeng.seller.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.BonusDetailBean;
import com.lvpeng.seller.bean.CouponBean;
import com.lvpeng.seller.common.ResultBean;

@RestController
@RequestMapping("/member")
public class MemberController {

	/**
	 * 获取会员信息
	 */
	@RequestMapping(value = "/number", method = RequestMethod.GET)
	public ResultBean Info(String number) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 增加积分信息
	 */
	@RequestMapping(value = "/bonus_detail", method = RequestMethod.POST)
	public ResultBean memberAdd(BonusDetailBean bean) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 历史积分信息
	 */
	@RequestMapping(value = "/bonus_detail", method = RequestMethod.GET)
	public ResultBean bonusPage(String by, String sort, String customer_id) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 获取买家会员数据
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean customerInfo(String customer_id) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 获取买家会员卡数据
	 */
	@RequestMapping(value = "/memberCards", method = RequestMethod.GET)
	public ResultBean cardInfo() {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 编辑自定义折扣
	 */
	@RequestMapping(value = "/custom_discount", method = RequestMethod.POST)
	public ResultBean customDiscount() {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 卖家为用户开通会员卡
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean registe() {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
