package cn.e3mall.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.common.pojo.TreeNode;
import cn.e3mall.mapper.TbItemCatMapper;
import cn.e3mall.po.TbItemCat;
import cn.e3mall.po.TbItemCatExample;
import cn.e3mall.po.TbItemCatExample.Criteria;
import cn.e3mall.service.ItemCatServiceI;

/**
* @author XYY
* @version 1.0
*
*
*/
@Service
public class ItemCatService implements ItemCatServiceI {
	
	@Autowired
	private TbItemCatMapper tbItemCatMapper;
	public List<TreeNode> getByParentId(long parentId){
		TbItemCatExample example = new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<TbItemCat> list = tbItemCatMapper.selectByExample(example);
		ArrayList<TreeNode> arrayList = new ArrayList<>();
		for (TbItemCat tc : list) {
			TreeNode tn = new TreeNode();
			tn.setId(tc.getId());
			tn.setState(tc.getIsParent()?"closed":"open");
			tn.setText(tc.getName());
			arrayList.add(tn);
		}
		return arrayList;
	}
}
