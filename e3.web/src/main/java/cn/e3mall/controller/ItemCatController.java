package cn.e3mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.common.pojo.TreeNode;
import cn.e3mall.service.ItemCatServiceI;

/**
* @author XYY
* @version 1.0
*
*
*/
@Controller
public class ItemCatController {
	@Autowired
	private ItemCatServiceI itemCatServiceI;
	
	@RequestMapping("/item/cat/list")
	@ResponseBody
	public List<TreeNode> catList(@RequestParam(value="id" ,defaultValue="0")long parentId){
		List<TreeNode>  treeNodes = itemCatServiceI.getByParentId(parentId);
		return treeNodes;
	}
	
	
}
