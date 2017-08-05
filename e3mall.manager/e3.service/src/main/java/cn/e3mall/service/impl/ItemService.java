package cn.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.po.TbItem;
import cn.e3mall.service.ItemServiceI;

/**
* @author lv
* @version 1.0
*
*
*/
@Service
public class ItemService implements ItemServiceI{
	
	@Autowired
	private TbItemMapper tbItemMapper;
	
	public TbItem getListById(Long id) {
		TbItem item = tbItemMapper.selectByPrimaryKey(id);
		return item;
	}
}
