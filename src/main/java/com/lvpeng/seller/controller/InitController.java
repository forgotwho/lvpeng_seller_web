package com.lvpeng.seller.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Seller;
import com.lvpeng.seller.dal.model.SellerShop;
import com.lvpeng.seller.dal.model.Shop;
import com.lvpeng.seller.dal.repository.SellerRepository;
import com.lvpeng.seller.dal.repository.SellerShopRepository;
import com.lvpeng.seller.dal.repository.ShopRepository;

@RestController
@RequestMapping("/auth")
public class InitController {

	@Autowired
	private SellerRepository sellerRepository;

	@Autowired
	private SellerShopRepository sellerShopRepository;

	@Autowired
	private ShopRepository shopRepository;

	/**
	 * 初始化数据
	 */
	@RequestMapping("/init")
	public ResultBean init() {
		ResultBean result = new ResultBean();

		Seller seller = new Seller();
		seller.setId(1);
		seller.setAppCode("XXX");
		seller.setCreateTime(new Date());
		seller.setPhone("13816638520");
		seller.setStatus("01");

		seller = sellerRepository.insert(seller);

		Shop shop = new Shop();
		shop.setId(1);
		shop.setAddress("十堰");
		shop.setAutoOrder(0);
		shop.setAvatar("http://ostb6zm4z.bkt.clouddn.com/SMGZJ.png");
		shop.setCategoryId(1);
		shop.setCategoryName("餐饮");
		shop.setCreateTime(new Date());
		shop.setDescribe("");
		shop.setDetailAddress("");
		shop.setExpiredTime("2019-06-08 00:00:00");
		shop.setImages(null);
		shop.setInShop(0);
		shop.setIsDelete(0);
		shop.setLatitude("0");
		shop.setLeArea(0);
		shop.setLongitude("");
		shop.setName("十堰饭来张口");
		shop.setOffPay(0);
		shop.setPhone("13816638520");
		shop.setSupportMember(0);
		shop = shopRepository.save(shop);

		SellerShop sellerShop = new SellerShop();
		sellerShop.setSeller("吕鹏");
		sellerShop.setSellerId(seller.getId());
		sellerShop.setShopId(shop.getId());
		sellerShop.setShopName("十堰饭来张口");
		sellerShop.setAvatar("http://ostb6zm4z.bkt.clouddn.com/SMGZJ.png");
		sellerShop.setCreateTime(new Date());

		sellerShopRepository.save(sellerShop);

		shop = new Shop();
		shop.setId(2);
		shop.setAddress("南化");
		shop.setAutoOrder(0);
		shop.setAvatar("http://img.leshare.shop/seller/shulanriyongpin.png");
		shop.setCategoryId(1);
		shop.setCategoryName("餐饮");
		shop.setCreateTime(new Date());
		shop.setDescribe("");
		shop.setDetailAddress("");
		shop.setExpiredTime("2019-06-08 00:00:00");
		shop.setImages(null);
		shop.setInShop(0);
		shop.setIsDelete(0);
		shop.setLatitude("0");
		shop.setLeArea(0);
		shop.setLongitude("");
		shop.setName("南化饭来张口");
		shop.setOffPay(0);
		shop.setPhone("13816638520");
		shop.setSupportMember(0);
		shop = shopRepository.save(shop);

		sellerShop = new SellerShop();
		sellerShop.setSeller("吕鹏");
		sellerShop.setSellerId(seller.getId());
		sellerShop.setShopId(shop.getId());
		sellerShop.setShopName("南化饭来张口");
		sellerShop.setAvatar("http://img.leshare.shop/seller/shulanriyongpin.png");
		sellerShop.setCreateTime(new Date());
		sellerShopRepository.save(sellerShop);

		result.setCode(0);

		return result;
	}

}
