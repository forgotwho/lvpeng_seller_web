package com.lvpeng.seller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;

@RestController
@RequestMapping("/memberCards")
public class MemberCardController {

	/**
	 * 会员卡信息
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean info() {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 添加会员卡
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean create() {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 编辑会员卡
	 */
	@RequestMapping(method = RequestMethod.PUT)
	public ResultBean update() {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
