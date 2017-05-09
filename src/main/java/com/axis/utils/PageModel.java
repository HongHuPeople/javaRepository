package com.axis.utils;

import java.util.ArrayList;
import java.util.List;

public class PageModel {
	
	private int thisPage=1;// 目标页
	private int pageSize=10;// 每页显示条数
	private int totalPage;// 总页
	private int totalRecord;// 总记录数
	private int startRow;//起始条数
	private List list = new ArrayList();// 分页数据
	
	public PageModel() {
		
	}
	
	public PageModel(Integer thisPage) {
		if(thisPage==null || thisPage==0){
			this.thisPage = 1;
		}else{
			this.thisPage = thisPage;
		}
		startRow = (this.thisPage - 1) * pageSize;
	}
	
	public PageModel(Integer thisPage, Integer pageSize) {
		if(thisPage==null || thisPage==0){
			this.thisPage = 1;
		}else{
			this.thisPage = thisPage;
		}
		if(pageSize==null || pageSize==0){
			this.pageSize = 10;
		}else{
			this.pageSize = pageSize;
		}
	}

	public int getThisPage() {
		return thisPage;
	}

	public void setThisPage(int thisPage) {
		this.thisPage = thisPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
		if(this.totalRecord % pageSize==0){
			totalPage = this.totalRecord / pageSize;
		}else{
			totalPage = this.totalRecord / pageSize + 1;
		}
		if(thisPage < 1){
			thisPage = 1;
		}else if(thisPage > totalPage){
			thisPage = totalPage;
		}
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public int getStartRow() {
		return startRow;
	}
}
