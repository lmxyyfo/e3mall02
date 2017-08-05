package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.po.TbItem;
import cn.e3mall.service.ItemServiceI;
import cn.e3mall.service.impl.ItemService;

/**
* @author lv
* @version 1.0
*
*
*/
@Controller
public class TbItemController {
	@Autowired
	private ItemServiceI ItemService;
	@RequestMapping("/item/{id}")
	@ResponseBody
	public TbItem showItem(@PathVariable long id) {
		TbItem item = ItemService.getListById(id);
		return item;
	}
}
