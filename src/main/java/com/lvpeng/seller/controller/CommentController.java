package com.lvpeng.seller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Comment;

@RestController
@RequestMapping("/comments")
public class CommentController {

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
	 * 创建
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean create(Comment data) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 评价统计
	 */
	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public ResultBean count(String goodsId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
