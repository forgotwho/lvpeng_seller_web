package com.lvpeng.seller.api;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Comment;
import com.lvpeng.seller.dal.model.Goods;
import com.lvpeng.seller.dal.repository.CommentRepository;

@RestController
@RequestMapping("/comments")
public class CommentController {

	@Autowired
	private CommentRepository commentRepository;

	/**
	 * 分页方法
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean getCommentList(@RequestHeader("shop_id") int shopId, Integer from, Integer limit, String status) {
		ResultBean result = new ResultBean();
		Comment query = new Comment();
		query.setShopId(shopId);
		query.setStatus(status);
		Pageable pageable = PageRequest.of(from, limit);
		Example<Comment> example = Example.of(query);
		Page<Comment> page = commentRepository.findAll(example, pageable);
		result.setCode(0);
		result.setData(page.getContent());
		return result;
	}

	/**
	 * 创建
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean create(@RequestHeader("shop_id") int shopId, @RequestBody Comment data) {
		ResultBean result = new ResultBean();
		data.setShopId(shopId);
		data.setStatus("0");
		data.setCreateTime(new Date());
		commentRepository.save(data);
		result.setCode(0);
		return result;
	}

	/**
	 * 评价统计
	 */
	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public ResultBean count(@RequestHeader("shop_id") int shopId, int goodsId) {
		ResultBean result = new ResultBean();
		Comment query = new Comment();
		query.setShopId(shopId);
		Goods goods = new Goods();
		goods.setId(goodsId);
		query.setGoods(goods);
		Example<Comment> example = Example.of(query);
		long count = commentRepository.count(example);
		result.setCode(0);
		result.setData(count);
		return result;
	}

}
