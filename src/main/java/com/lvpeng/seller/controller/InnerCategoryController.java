package com.lvpeng.seller.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.InnerCategory;
import com.lvpeng.seller.dal.repository.InnerCategoryRepository;

@RestController
@RequestMapping("/goods")
public class InnerCategoryController {

	@Autowired
	private InnerCategoryRepository innerCategoryRepository;

	/**
	 * 商品分类
	 */
	@RequestMapping(value = "/inner_category", method = RequestMethod.GET)
	public ResultBean getInnerCategories(@RequestHeader("shop_id") int shopId) {
		ResultBean result = new ResultBean();
		List<InnerCategory> beanList = innerCategoryRepository.findByShopId(shopId);
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

	/**
	 * 新增商品分类
	 */
	@RequestMapping(value = "/inner_category", method = RequestMethod.POST)
	public ResultBean addInnerCategories(@RequestHeader("shop_id") int shopId, @RequestBody InnerCategory data) {
		ResultBean result = new ResultBean();
		int id = (int)innerCategoryRepository.count()+1;
		data.setId(id);
		data.setShopId(shopId);
		data.setCreateTime(new Date());
		innerCategoryRepository.save(data);
		result.setCode(0);
		return result;
	}

	/**
	 * 更新商品分类
	 */
	@RequestMapping(value = "/inner_category", method = RequestMethod.PUT)
	public ResultBean updateInnerCategories(@RequestBody InnerCategory data) {
		ResultBean result = new ResultBean();
		InnerCategory bean = innerCategoryRepository.findById(data.getId());
		BeanUtils.copyProperties(data, bean, new String[] { "id", "createTime", "shopId" });
		bean.setUpdateTime(new Date());
		innerCategoryRepository.save(bean);
		result.setCode(0);
		return result;
	}

	/**
	 * 删除商品分类
	 */
	@RequestMapping(value = "/inner_category/{id}", method = RequestMethod.DELETE)
	public ResultBean removeInnerCategories(@PathVariable int id) {
		ResultBean result = new ResultBean();
		innerCategoryRepository.delete(innerCategoryRepository.findById(id));
		result.setCode(0);
		return result;
	}

}
