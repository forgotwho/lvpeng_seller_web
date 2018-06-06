package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.response.SmsCodeBean;

@RestController
public class HelloController {

	@RequestMapping("/")
	public ResultBean index() {
		ResultBean result = new ResultBean();
		SmsCodeBean bean = new SmsCodeBean();
		bean.setResult("123456");

		result.setCode(0);
		result.setData(bean);

		return result;
	}

}
