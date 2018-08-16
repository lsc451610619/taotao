package com.taotao.common.pojo;

import java.util.List;

public class EesyUiDataGridResult {

	private Long total;
	private List<?> rows;

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "EesyUiDataGridResult [total=" + total + ", rows=" + rows + "]";
	}

}
