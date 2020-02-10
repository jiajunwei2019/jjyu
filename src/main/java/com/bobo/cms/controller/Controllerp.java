package com.bobo.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllerp {

	@RequestMapping("list")
	public String list() {
		
		return "list";
	}
	
}
