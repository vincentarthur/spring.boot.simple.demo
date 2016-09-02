package spring.boot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = { "/", "/index" })
	public String home() {
		return "index";
	}
	
	@RequestMapping(value = { "/list"})
	public String list() {
		return "list";
	}
}
