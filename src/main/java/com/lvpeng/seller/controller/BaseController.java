package com.lvpeng.seller.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseController {

	public void addCookie(String key, String value, HttpServletRequest request, HttpServletResponse response) {
		Cookie cookie = new Cookie(key, value);
		cookie.setPath("/");
		cookie.setMaxAge(60 * 60 * 24);
		response.addCookie(cookie);
	}

	public void removeCookie(String key, HttpServletRequest request, HttpServletResponse response) {
		Cookie cookie = new Cookie(key, null);
		cookie.setPath("/");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
	}

	public String getCookie(String key, HttpServletRequest request, HttpServletResponse response) {
		String value = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null && cookies.length > 0) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals(key)) {
					value = cookie.getValue();
					break;
				}
			}
		}
		return value;
	}

	public String getLoginCode(HttpServletRequest request, HttpServletResponse response) {
		return this.getCookie("login_code", request, response);
	}
}
