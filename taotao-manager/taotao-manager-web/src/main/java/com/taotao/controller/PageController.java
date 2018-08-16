package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转
 * */
@Controller
public class PageController {

	@RequestMapping(value = { "/", "/index" })
	public String showIndex() {
		return "index";
	}

	/**
	 * 展示其他页面
	 * */
	@RequestMapping(value = "/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}

}
