package com.lvpeng.seller.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Seller;
import com.lvpeng.seller.dal.model.SellerShop;
import com.lvpeng.seller.dal.repository.SellerRepository;
import com.lvpeng.seller.dal.repository.SellerShopRepository;

@RestController
@RequestMapping("/sellers")
public class SellerController {

	@Autowired
	private SellerRepository sellerRepository;

	@Autowired
	private SellerShopRepository sellerShopRepository;

	/**
	 * 获取卖家的店铺列表
	 */
	@RequestMapping(value = "/shop_list", method = RequestMethod.GET)
	public ResultBean list(@CookieValue("login_code") String loginCode) {
		ResultBean result = new ResultBean();

		Seller seller = sellerRepository.findByLoginCodeAndExpireTimeGreaterThan(loginCode, new Date());
		if (seller == null) {
			result.setCode(-1);
			result.setMessage("非法操作");
		}
		List<SellerShop> beanList = sellerShopRepository.findBySellerId(seller.getId());
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

	/**
	 * 店铺分类
	 */
	@RequestMapping(value = "/shop_parent_categories/0", method = RequestMethod.GET)
	public ResultBean getShopCategories() {
		ResultBean result = new ResultBean();
		result.setCode(0);

		return result;
	}

}
