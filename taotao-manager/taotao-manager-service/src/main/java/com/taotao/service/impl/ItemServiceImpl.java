package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EesyUiDataGridResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.pojo.TbItemExample.Criteria;
import com.taotao.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public TbItem getItemById(Long id) {

		TbItemExample example = new TbItemExample();
		/*添加查询条件*/
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		List<TbItem> list = tbItemMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			TbItem tbItem = list.get(0);
			return tbItem;
		}
		return null;
	}

	@Override
	public EesyUiDataGridResult getItemList(int page, int rows) {

		// ---------查询所有-----------------------
		TbItemExample example = new TbItemExample();
		// 相当于在查询的中间加了一个分页的方法
		PageHelper.startPage(page, rows);
		List<TbItem> list = tbItemMapper.selectByExample(example);
		// --------------------------------
		EesyUiDataGridResult eDataGridResult = new EesyUiDataGridResult();

		eDataGridResult.setRows(list);

		PageInfo<TbItem> pageInfo = new PageInfo<>(list);

		eDataGridResult.setTotal(pageInfo.getTotal());

		return eDataGridResult;
	}

}
