package com.lvpeng.seller.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Notice;

@RestController
@RequestMapping("/notices")
public class NoticeController {

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
	 * 创建公告
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean create(Notice data) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 删除公告
	 */
	@RequestMapping(value = "/{noticeId}", method = RequestMethod.DELETE)
	public ResultBean remove(@PathVariable String noticeId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 单条信息
	 */
	@RequestMapping(value = "/{noticeId}", method = RequestMethod.GET)
	public ResultBean info(@PathVariable String noticeId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 编辑公告
	 */
	@RequestMapping(value = "/{noticeId}", method = RequestMethod.PUT)
	public ResultBean update(@PathVariable String noticeId, Notice data) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
