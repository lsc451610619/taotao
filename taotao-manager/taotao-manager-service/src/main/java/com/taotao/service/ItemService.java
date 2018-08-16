package com.taotao.service;

import com.taotao.common.pojo.EesyUiDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {

	TbItem getItemById(Long id);

	EesyUiDataGridResult getItemList(int page, int rows);

}
