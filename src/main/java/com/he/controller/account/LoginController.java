package com.he.controller.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hzq on 16/10/27.
 */
@Controller
public class LoginController {

	@RequestMapping({"", "/"})
	public String login(){
		return "index";
	}

}
