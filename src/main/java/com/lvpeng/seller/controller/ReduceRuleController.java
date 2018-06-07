package com.lvpeng.seller.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.ReduceRule;

@RestController
@RequestMapping("/reduce_rule")
public class ReduceRuleController {

	/**
	 * 配送员列表
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean listReduce(int from, int limit) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 创建
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean create(ReduceRule data) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 删除
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResultBean remove(@PathVariable String id) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 编辑公告
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResultBean update(@PathVariable String id, ReduceRule data) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
