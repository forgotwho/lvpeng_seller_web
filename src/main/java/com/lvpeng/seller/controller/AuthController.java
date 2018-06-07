package com.lvpeng.seller.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.CheckBean;
import com.lvpeng.seller.bean.LoginBean;
import com.lvpeng.seller.bean.SmsCodeBean;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.mongo.model.SmsCode;
import com.lvpeng.seller.mongo.repository.SmsCodeRepository;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private SmsCodeRepository smsCodeRepository;

	/**
	 * 登录
	 */
	@RequestMapping(value = "/login")
	@ResponseBody
	public ResultBean login(String phone, String sms_code, String app_code) {
		ResultBean result = new ResultBean();
		LoginBean bean = new LoginBean();
		bean.setLogin_code("token");

		result.setCode(0);
		result.setData(bean);

		return result;
	}

	/**
	 * 短信验证码
	 */
	@RequestMapping(value = "/sms_code")
	@ResponseBody
	public ResultBean sms_code(String phone) {
		ResultBean result = new ResultBean();
		try {
			SmsCode smsCode = new SmsCode();
			smsCode.setPhone(phone);
			smsCode.setCode(Math.round(Math.random() * 100000) + "");
			smsCode.setStatus("01");
			smsCode.setCreateTime(new Date());
			smsCode = smsCodeRepository.save(smsCode);

			SmsCodeBean bean = new SmsCodeBean();
			bean.setResult(smsCode.getCode());

			result.setCode(0);
			result.setData(bean);
		} catch (Exception e) {
			e.printStackTrace();
			result.setCode(-1);
		}
		return result;
	}

	/**
	 * 检查登录情况
	 */
	@RequestMapping("/check")
	public ResultBean check(String login_code) {
		ResultBean result = new ResultBean();
		CheckBean bean = new CheckBean();
		bean.setResult("SUCCESS");

		result.setCode(0);
		result.setData(bean);

		return result;
	}

}
