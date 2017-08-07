package cn.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.e3mall.common.pojo.DataGridResult;
import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.po.TbItem;
import cn.e3mall.po.TbItemExample;
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

	@Override
	public DataGridResult getResult(Integer page, Integer rows) {
		DataGridResult result = new DataGridResult();
		
		PageHelper.startPage(page, rows);
		TbItemExample example = new TbItemExample();
		List<TbItem> list = tbItemMapper.selectByExample(example);
		PageInfo<TbItem> info = new PageInfo<>(list);
		long total = info.getTotal();
		result.setTotal(total);
		result.setRows(list);
		return result;
	}
	
}
