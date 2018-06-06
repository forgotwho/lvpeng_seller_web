package com.lvpeng.seller.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.response.LoginBean;
import com.lvpeng.seller.response.ShopListBean;

@RestController
@RequestMapping("/sellers")
public class SellerController {

	@RequestMapping("/shop_list")
	public ResultBean shop_list() {
		ResultBean result = new ResultBean();
		List<ShopListBean> listBean = new ArrayList<ShopListBean>();
		result.setCode(0);
		result.setData(listBean);

		return result;
	}

	@RequestMapping("/login")
	public ResultBean login(String phone, String sms_code, String app_code) {
		ResultBean result = new ResultBean();
		LoginBean bean = new LoginBean();
		bean.setLogin_code(
				"R09PMVlhUnB2eUZBMlNlaHFHc3lzRUdJakhCbWlPVXcjTGVTaGFyZSM0I0xlU2hhcmUjQXN5UXJKSjJBM0plYVBzNGEyTThyczlmaTRBemdSY2c");

		result.setCode(0);
		result.setData(bean);

		return result;
	}

}
