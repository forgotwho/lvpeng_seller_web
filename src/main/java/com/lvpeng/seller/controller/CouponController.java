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
import com.lvpeng.seller.dal.model.Coupon;
import com.lvpeng.seller.dal.model.CouponCustomer;
import com.lvpeng.seller.dal.repository.CouponCustomerRepository;
import com.lvpeng.seller.dal.repository.CouponRepository;

@RestController
@RequestMapping("/coupons")
public class CouponController {

	@Autowired
	private CouponRepository couponRepository;

	@Autowired
	private CouponCustomerRepository couponCustomerRepository;

	/**
	 * 客户历史订单分页
	 * 
	 * @param customerId
	 * @returns {Promise.<Pagination>}
	 */
	@RequestMapping(value = "/customers/{customerId}/coupon_list", method = RequestMethod.GET)
	public ResultBean cutomerCouponPage(@PathVariable String customerId, int from, int limit) {
		ResultBean result = new ResultBean();
		List<Coupon> beanList = couponRepository.findAll();
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

	/**
	 * 分页方法
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean page(@RequestHeader("shop_id") int shopId,String from, String limit,String status) {
		ResultBean result = new ResultBean();
		List<Coupon> beanList = couponRepository.findAll();
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

	/**
	 * 优惠券使用情况分页方法
	 */
	@RequestMapping(value = "/{couponId}/used_info", method = RequestMethod.GET)
	public ResultBean pagePick(@PathVariable String couponId, String type) {
		ResultBean result = new ResultBean();
		List<Coupon> beanList = couponRepository.findAll();
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

	/**
	 * 新增卡券
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean create(@RequestHeader("shop_id") int shopId,@RequestBody Coupon data) {
		ResultBean result = new ResultBean();
		int id = (int)couponRepository.count()+1;
		data.setId(id);
		data.setShopId(shopId);
		data.setCreateTime(new Date());
		couponRepository.save(data);
		result.setCode(0);
		return result;
	}

	/**
	 * 删除卡券
	 */
	@RequestMapping(value = "/{couponId}", method = RequestMethod.DELETE)
	public ResultBean remove(@PathVariable int couponId) {
		ResultBean result = new ResultBean();
		couponRepository.delete(couponRepository.findById(couponId));
		result.setCode(0);
		return result;
	}

	/**
	 * 查询卡券信息
	 */
	@RequestMapping(value = "/{couponId}", method = RequestMethod.GET)
	public ResultBean info(@PathVariable int couponId) {
		ResultBean result = new ResultBean();
		Coupon bean = couponRepository.findById(couponId);
		result.setCode(0);
		result.setData(bean);
		return result;
	}

	/**
	 * 编辑卡券
	 */
	@RequestMapping(value = "/{couponId}", method = RequestMethod.PUT)
	public ResultBean update(@PathVariable int couponId, @RequestBody Coupon data) {
		ResultBean result = new ResultBean();
		Coupon bean = couponRepository.findById(couponId);
		bean.setIsPresent(data.getIsPresent());
		data.setIsSelfUse(data.getIsSelfUse());
		data.setIsShow(data.getIsShow());
		data.setIsShowHome(data.getIsShowHome());
		data.setName(data.getName());
		data.setPresentFee(data.getPresentFee());
		data.setStock(data.getStock());
		couponRepository.save(bean);
		result.setCode(0);
		return result;
	}

	/**
	 * 使用卡券
	 */
	@RequestMapping(value = "/use/{couponId}", method = RequestMethod.PUT)
	public ResultBean use(@PathVariable String couponId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 卖家发放优惠券给买家数据处理
	 */
	/**
	 * 根据客户发放优惠券
	 * 
	 * @param params(couponId,
	 *            cusomterId)
	 */
	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public ResultBean send(@RequestBody CouponCustomer data) {
		ResultBean result = new ResultBean();
		couponCustomerRepository.save(data);
		result.setCode(0);
		return result;
	}

}
