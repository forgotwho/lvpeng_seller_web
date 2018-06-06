package com.lvpeng.seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.mongo.model.SmsCode;
import com.lvpeng.seller.mongo.repository.SmsCodeRepository;
import com.lvpeng.seller.response.CheckBean;
import com.lvpeng.seller.response.LoginBean;
import com.lvpeng.seller.response.SmsCodeBean;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private SmsCodeRepository smsCodeRepository;

	@RequestMapping("/sms_code")
	public ResultBean sms_code(String phone) {
		ResultBean result = new ResultBean();
		try {
			SmsCode smsCode = new SmsCode();
			smsCode.setPhone(phone);
			smsCode.setCode(Math.round(Math.random() * 100000) + "");
			smsCode.setStatus("01");
			smsCode.setCreateTime(System.currentTimeMillis());
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
