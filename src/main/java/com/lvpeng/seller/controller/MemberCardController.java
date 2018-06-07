package com.lvpeng.seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.MemberCard;
import com.lvpeng.seller.dal.repository.MemberCardRepository;

@RestController
@RequestMapping("/memberCards")
public class MemberCardController {

	
	@Autowired
	private MemberCardRepository memberCardRepository;
	/**
	 * 会员卡信息
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean info(@RequestHeader("shop_id") int shopId) {
		ResultBean result = new ResultBean();
		MemberCard memberCard = memberCardRepository.findByShopId(shopId);
		result.setData(memberCard);
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
