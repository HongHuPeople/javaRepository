package com.axis.entity;

import java.util.Date;

import com.axis.base.BaseEntity;

public class UserLoginRecord extends BaseEntity{
    /**
	 * 
	 */
	private static final long serialVersionUID = 2252039745633489542L;

	private Integer id;

    private Integer userId;

    private String loginIp;

    private Date loginDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
}