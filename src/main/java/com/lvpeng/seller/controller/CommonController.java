package com.lvpeng.seller.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.OrderBean;
import com.lvpeng.seller.bean.OrderCountBean;
import com.lvpeng.seller.bean.OrderNoteBean;
import com.lvpeng.seller.bean.ShopStatusBean;
import com.lvpeng.seller.bean.TodayCountBean;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Notice;
import com.lvpeng.seller.dal.model.ShopCategory;
import com.lvpeng.seller.dal.model.ShopChargeLimit;
import com.lvpeng.seller.dal.repository.SellerRepository;
import com.lvpeng.seller.dal.repository.ShopCategoryRepository;
import com.lvpeng.seller.dal.repository.ShopChargeLimitRepository;

@RestController
public class CommonController {

	@Autowired
	private SellerRepository sellerRepository;

	@Autowired
	private ShopChargeLimitRepository shopChargeLimitRepository;
	
	@Autowired
	private ShopCategoryRepository shopCategoryRepository;

	@RequestMapping(value = "/shop_charge_limit", produces = "application/json;charset=UTF-8")
	public ResultBean shop_charge_limit(@RequestHeader("shop_id") int shopId) {
		ResultBean result = new ResultBean();
		ShopChargeLimit bean = shopChargeLimitRepository.findByShopId(shopId);
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

	@RequestMapping(value = "/count", produces = "application/json;charset=UTF-8")
	public ResultBean count(String count_type) {
		ResultBean result = new ResultBean();
		TodayCountBean bean = new TodayCountBean();

		result.setCode(0);
		result.setData(bean);

		return result;
	}

	@RequestMapping(value = "/count/order", produces = "application/json;charset=UTF-8")
	public ResultBean countOrder() {
		ResultBean result = new ResultBean();
		List<OrderCountBean> beanList = new ArrayList<OrderCountBean>();

		result.setCode(0);
		result.setData(beanList);

		return result;
	}

	@RequestMapping(value = "/orders", produces = "application/json;charset=UTF-8")
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
	
	/**
	 * 店铺分类
	 */
	@RequestMapping(value = "/shop_parent_categories/0", method = RequestMethod.GET)
	public ResultBean getShopCategories() {
		ResultBean result = new ResultBean();
		List<ShopCategory> beanList = shopCategoryRepository.findAll();
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

}
