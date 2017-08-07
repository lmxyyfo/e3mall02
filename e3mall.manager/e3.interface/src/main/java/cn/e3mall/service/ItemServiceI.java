package cn.e3mall.service;

import cn.e3mall.common.pojo.DataGridResult;
import cn.e3mall.po.TbItem;

/**
* @author lv
* @version 1.0
*
*
*/
public interface ItemServiceI {
	public TbItem getListById(Long id);
	
	public DataGridResult getResult(Integer page,Integer rows);
}
