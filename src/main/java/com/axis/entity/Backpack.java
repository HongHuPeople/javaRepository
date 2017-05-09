package com.axis.entity;

import com.axis.base.BaseEntity;

public class Backpack extends BaseEntity{
    /**
	 * 
	 */
	private static final long serialVersionUID = -8267787887698218101L;

	private Integer id;

    private Integer roleId;

    private Goods goodsId;

    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Goods getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Goods goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}