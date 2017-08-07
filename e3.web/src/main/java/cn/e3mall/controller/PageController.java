package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author XYY
* @version 1.0
*
*
*/
@Controller
public class PageController {
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	@RequestMapping("/{page}")
	public String page(@PathVariable String page){
		return page;
	}
}
