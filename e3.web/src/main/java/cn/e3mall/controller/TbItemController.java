package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.common.pojo.DataGridResult;
import cn.e3mall.po.TbItem;
import cn.e3mall.service.ItemServiceI;

/**
* @author lv
* @version 1.0
*
*
*/
@Controller
public class TbItemController {
	@Autowired
	private ItemServiceI itemServiceI;
	@RequestMapping("/item/{id}")
	@ResponseBody
	public TbItem showItem(@PathVariable long id) {
		TbItem item = itemServiceI.getListById(id);
		return item;
	}
	@RequestMapping("/item/list")
	@ResponseBody
	public DataGridResult getItemList(Integer page, Integer rows) {
		DataGridResult result = itemServiceI.getResult(page, rows);
		return result;
	}
}
