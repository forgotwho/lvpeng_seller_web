package com.lvpeng.seller.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.lvpeng.seller.bean.OrderBean;
import com.lvpeng.seller.bean.OrderCountBean;
import com.lvpeng.seller.bean.OrderNoteBean;
import com.lvpeng.seller.bean.TodayCountBean;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.File;
import com.lvpeng.seller.dal.model.Notice;
import com.lvpeng.seller.dal.model.ShopCategory;
import com.lvpeng.seller.dal.model.ShopChargeLimit;
import com.lvpeng.seller.dal.model.ShopStatus;
import com.lvpeng.seller.dal.repository.FileRepository;
import com.lvpeng.seller.dal.repository.SellerRepository;
import com.lvpeng.seller.dal.repository.ShopCategoryRepository;
import com.lvpeng.seller.dal.repository.ShopChargeLimitRepository;

@RestController
public class CommonController {

	@Autowired
	private FileRepository fileRepository;

	@Autowired
	private SellerRepository sellerRepository;

	@Autowired
	private ShopChargeLimitRepository shopChargeLimitRepository;

	@Autowired
	private ShopCategoryRepository shopCategoryRepository;

	@RequestMapping(value = "/shop_charge_limit", produces = "application/json;charset=UTF-8")
	public ResultBean shop_charge_limit(@RequestHeader("shop_id") int shopId) {
		ResultBean result = new ResultBean();
		ShopChargeLimit bean = shopChargeLimitRepository.findByShopId(shopId);
		result.setCode(0);
		result.setData(bean);

		return result;
	}

	@RequestMapping("/shops/status")
	public ResultBean shopsStatus() {
		ResultBean result = new ResultBean();
		ShopStatus bean = new ShopStatus();

		result.setCode(0);
		result.setData(bean);

		return result;
	}

	@RequestMapping("/notices")
	public ResultBean notices(int from, int limit, String status) {
		ResultBean result = new ResultBean();
		List<Notice> beanList = new ArrayList<Notice>();

		result.setCode(0);
		result.setData(beanList);

		return result;
	}

	@RequestMapping(value = "/count", produces = "application/json;charset=UTF-8")
	public ResultBean count(String count_type) {
		ResultBean result = new ResultBean();
		TodayCountBean bean = new TodayCountBean();

		result.setCode(0);
		result.setData(bean);

		return result;
	}

	@RequestMapping(value = "/count/order", produces = "application/json;charset=UTF-8")
	public ResultBean countOrder() {
		ResultBean result = new ResultBean();
		List<OrderCountBean> beanList = new ArrayList<OrderCountBean>();

		result.setCode(0);
		result.setData(beanList);

		return result;
	}

	@RequestMapping(value = "/orders", produces = "application/json;charset=UTF-8")
	public ResultBean orders() {
		ResultBean result = new ResultBean();
		List<OrderBean> beanList = new ArrayList<OrderBean>();

		result.setCode(0);
		result.setData(beanList);

		return result;
	}

	@RequestMapping("/orders/{orderId}/note")
	public ResultBean orderNote(int orderId, String sellerNote) {
		ResultBean result = new ResultBean();
		OrderNoteBean bean = new OrderNoteBean();

		result.setCode(0);
		result.setData(bean);

		return result;
	}

	/**
	 * 店铺分类
	 */
	@RequestMapping(value = "/shop_parent_categories/0", method = RequestMethod.GET)
	public ResultBean getShopCategories() {
		ResultBean result = new ResultBean();
		List<ShopCategory> beanList = shopCategoryRepository.findAll();
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

	@ResponseBody
	@RequestMapping(value = "/images", method = {
			RequestMethod.POST }, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Map<String, String> upload(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> map = new HashMap<String, String>();
		response.addHeader("Access-Control-Allow-Origin", "*");
		String contextpath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
				+ request.getContextPath();
		try {
			if (request instanceof MultipartHttpServletRequest) {
				MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;
				Iterator<String> fileNames = req.getFileNames();
				while (fileNames.hasNext()) {
					String fileName = fileNames.next();
					List<MultipartFile> ffs = req.getFiles(fileName);
					for (MultipartFile ff : ffs) {
						File file = new File(ff.getOriginalFilename(), ff.getContentType(), ff.getSize(),
								ff.getBytes());
						file.setMd5(MD5Encoder.encode(file.getContent()));
						file = fileRepository.save(file);
						map.put("id", file.getId());
						map.put("url", contextpath + "/images/" + file.getId());
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return map;
	}

	@RequestMapping(value = "/images/{fileName}", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public byte[] get(@PathVariable String fileName) throws IOException {
		File result = fileRepository.findById(fileName).get();
		return result.getContent();
	}
	
	@RequestMapping(value = "/images/{fileName}/{type}", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public byte[] getType(@PathVariable String fileName) throws IOException {
		File result = fileRepository.findById(fileName).get();
		return result.getContent();
	}

}
