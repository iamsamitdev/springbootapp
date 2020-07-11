package com.itgenius.springbootapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody

	public String index() {
		return "<h1>Home </h1><p>This is home page</p>";
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	@ResponseBody

	public String about() {
		return "<h1>About </h1><p>This is about page</p>";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@ResponseBody

	public String user() {
		return "This is post method user";
	}

	@GetMapping("/service")
	@ResponseBody
	public String service() {
		return "<h1>Service </h1><p>This is service page</p>";
	}

	@PostMapping("/mydata")
	@ResponseBody
	public String mydata() {
		return "This is post my data";
	}

}
