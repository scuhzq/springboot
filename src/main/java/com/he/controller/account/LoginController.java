package com.he.controller.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hzq on 16/10/27.
 */
@Controller
public class LoginController {

	@RequestMapping({"", "/", "/index"})
	public String login(){
		return "index";
	}

	@RequestMapping("/baobao")
	public String about(){
		return "baobao";
	}

	@RequestMapping("/gege")
	public String services(){
		return "gege";
	}

	@RequestMapping("/we")
	public String portfolio(){
		return "we";
	}

	@RequestMapping("/love")
	public String contact(){
		return "love";
	}

}
