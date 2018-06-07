package com.lvpeng.seller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.SellerShop;
import com.lvpeng.seller.dal.repository.SellerShopRepository;

@RestController
@RequestMapping("/sellers")
public class SellerController {

	@Autowired
	private SellerShopRepository sellerShopRepository;

	/**
	 * 获取卖家的店铺列表
	 */
	@RequestMapping(value = "/shop_list", method = RequestMethod.GET)
	public ResultBean list() {
		ResultBean result = new ResultBean();
		List<SellerShop> beanList = sellerShopRepository.findAll();
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
