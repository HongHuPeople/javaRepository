package com.axis.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 * table翻页实现
 * @author xiaoning
 *
 */
public final class PageModel implements Serializable {
	/**
	 * 默认的序列化版本 id.
	 */
	private static final long serialVersionUID = 1L;
	private int currentPage=1;// 当前页
	private int pageSize=10;// 每页显示条数
	private int totalPage;// 总页
	private int totalRecord;// 总记录数
	private List list = new ArrayList();// 分页数据
	private String pageStr;
	private boolean entityOrField = true; // true:分页的地方，传入的参数就是Page实体；false:分页的地方，传入的参数所代表的实体拥有Page属性

	public PageModel() {
	}
    
	public PageModel(Integer currentPage){
		this.currentPage=currentPage;
	}
	/*
	 * 初始化PageModel
	 */
	public PageModel(final int pageSize, final int page) {
		// 初始化每页显示条数
		this.pageSize = pageSize;
		this.currentPage = page;
	}
	/*
	 * 初始化PageModel实例
	 */
	private PageModel(final int pageSize, final String page) {
		// 初始化每页显示条数
		this.pageSize = pageSize;
		// 初始化页数
		setTotalPage();
		// 初始化当前页
		setCurrentPage();

	}
	/*
	 * 初始化PageModel实例
	 */
	private PageModel(final int pageSize, final String page,
			final int totalRecord) {
		// 初始化每页显示条页
		this.pageSize = pageSize;
		// 设置总记录数
		this.totalRecord = totalRecord;
		// 初始化页数
		setTotalPage();
		// 初始化当前页
		setCurrentPage();

	}

	/*
	 * 外界获得PageModel实例
	 */
	public static PageModel newPageModel(final int pageSize, final String page,
			final int totalRecord) {

		return new PageModel(pageSize, page, totalRecord);
	}

	// 设置当前请求页
	private void setCurrentPage() {

		// 如果当前页小于第1时，当前页指定到首页
		if (currentPage < 1) {

			currentPage = 1;
		}

		if (currentPage > totalPage) {

			currentPage = totalPage;

		}

	}

	private void setTotalPage() {
		if (totalRecord % pageSize == 0) {

			totalPage = totalRecord / pageSize;
		} else {
			totalPage = totalRecord / pageSize + 1;
		}
	}

	/*
	 * 获得当前页
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/*
	 * 获得总页数
	 */
	public int getTotalPage() {
		return totalPage;

	}

	/*
	 * 获得总行数
	 */
	public int getStartRow() {
		return (currentPage - 1) * pageSize;
	}

	/*
	 * 获得结束页
	 */
	public int getEndRow() {
		return currentPage * pageSize;
	}
	// 首页
	public int getFirst() {

		return 1;
	}

	// 上一页

	public int getPrevious() {

		return currentPage - 1;
	}

	// 下一页
	public int getNext() {

		return currentPage + 1;
	}

	// 尾页

	public int getLast() {

		return totalPage;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
		// 初始化页数
		setTotalPage();
		// 初始化当前页
		setCurrentPage();
	}

	public String getPageStr() {
		return pageStr;
	}

	public void setPageStr(String pageStr) {
		this.pageStr = pageStr;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
	
	
}
