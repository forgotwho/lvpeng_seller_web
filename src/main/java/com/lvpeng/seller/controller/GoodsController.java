package com.lvpeng.seller.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.GoodsBean;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.InnerCategory;

@RestController
@RequestMapping("/goods")
public class GoodsController {

	/**
	 * 客户常购商品
	 */
	@RequestMapping(value = "/customers/{customerId}/order_goods_list", method = RequestMethod.GET)
	public ResultBean oftenGoodsPage(@PathVariable String customerId, int from, int limit) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 分页方法
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean page(int from, int limit, String goods_status) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 分页方法
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResultBean list(int from, int limit) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 商品分类
	 */
	@RequestMapping(value = "/inner_category", method = RequestMethod.GET)
	public ResultBean getInnerCategories() {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 新增商品分类
	 */
	@RequestMapping(value = "/inner_category", method = RequestMethod.POST)
	public ResultBean addInnerCategories(InnerCategory data) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 更新商品分类
	 */
	@RequestMapping(value = "/inner_category", method = RequestMethod.PUT)
	public ResultBean updateInnerCategories(InnerCategory data) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 删除商品分类
	 */
	@RequestMapping(value = "/inner_category/{id}", method = RequestMethod.DELETE)
	public ResultBean removeInnerCategories(@PathVariable String id) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 新增商品
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean create(GoodsBean data) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 更新商品
	 */
	@RequestMapping(value = "/{goodsId}", method = RequestMethod.PUT)
	public ResultBean update(@PathVariable String goodsId, GoodsBean data) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 删除商品
	 */
	@RequestMapping(value = "/{goodsId}", method = RequestMethod.DELETE)
	public ResultBean remove(@PathVariable String goodsId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 商品详情
	 */
	@RequestMapping(value = "/{goodsId}", method = RequestMethod.GET)
	public ResultBean detail(@PathVariable String goodsId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 商品上架
	 */
	@RequestMapping(value = "/{goodsId}/on_sale", method = RequestMethod.PUT)
	public ResultBean onSale(@PathVariable String goodsId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 商品下架
	 */
	@RequestMapping(value = "/{goodsId}/off_sale", method = RequestMethod.PUT)
	public ResultBean offSale(@PathVariable String goodsId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 获取商品库存
	 */
	@RequestMapping(value = "/{goodsId}/stock", method = RequestMethod.GET)
	public ResultBean stock(@PathVariable String goodsId, String sku) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
