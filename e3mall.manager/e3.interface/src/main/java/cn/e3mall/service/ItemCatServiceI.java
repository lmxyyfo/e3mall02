package cn.e3mall.service;

import java.util.List;

import cn.e3mall.common.pojo.TreeNode;
import cn.e3mall.po.TbItemCat;

/**
* @author XYY
* @version 1.0
*
*
*/
public interface ItemCatServiceI {
	List<TreeNode> getByParentId(long parentId);
}
