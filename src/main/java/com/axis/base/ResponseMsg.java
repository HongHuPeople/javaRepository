package com.axis.base;

import java.io.Serializable;


/**
 * @ClassName: Snippet
 * @Description: Ajax请求相应信息
 * @author: xiaoning
 * @version: V1.0.0
 */
public class ResponseMsg implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 响应码
	 * 默认值:200
	 */
	private int code = 200;
	/**
	 * 响应信息
	 */
	private String msg;
	/**
	 * 相应的数据，json字符串
	 */
	private Object data;


	public String getMsg() {
		return msg;
	}

	public ResponseMsg setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public ResponseMsg setData(Object data) {
		this.data = data;
		return this;
	}

	public Object getData() {
		return data;
	}

	public int getCode() {
		return code;
	}

	public ResponseMsg setCode(int code) {
		this.code = code;
		return this;
	}
}