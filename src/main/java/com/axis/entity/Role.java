package com.axis.entity;

import java.util.Date;

import com.axis.base.BaseEntity;

public class Role extends BaseEntity{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1109761343926779150L;

	private Integer id;

    private Integer userId;

    private String roleName;

    private String description;

    private Integer sex;

    private Integer lv;

    private Integer lvTop;

    private Integer exp;

    private Integer upExp;

    private Integer gold;

    private Integer lk;

    private Integer iq;

    private Integer hp;

    private Integer nowHp;

    private Integer mp;

    private Integer nowMp;

    private Integer hit;

    private Double crit;

    private Integer evad;

    private Integer atk;

    private Integer def;

    private Integer vit;

    private Integer vitTop;

    private Integer str;

    private Integer strTop;

    private Integer agi;

    private Integer agiTop;

    private Integer zl;

    private Integer zlTop;

    private Integer freeProperty;

    private Integer occupTotal;

    private Integer occupTotalNow;

    private Integer petTotal;

    private Integer petNumLimit;

    private Integer mountTotal;

    private Integer backpack;

    private Date createDate;

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getLv() {
        return lv;
    }

    public void setLv(Integer lv) {
        this.lv = lv;
    }

    public Integer getLvTop() {
        return lvTop;
    }

    public void setLvTop(Integer lvTop) {
        this.lvTop = lvTop;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getUpExp() {
        return upExp;
    }

    public void setUpExp(Integer upExp) {
        this.upExp = upExp;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getLk() {
        return lk;
    }

    public void setLk(Integer lk) {
        this.lk = lk;
    }

    public Integer getIq() {
        return iq;
    }

    public void setIq(Integer iq) {
        this.iq = iq;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getNowHp() {
        return nowHp;
    }

    public void setNowHp(Integer nowHp) {
        this.nowHp = nowHp;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public Integer getNowMp() {
        return nowMp;
    }

    public void setNowMp(Integer nowMp) {
        this.nowMp = nowMp;
    }

    public Integer getHit() {
        return hit;
    }

    public void setHit(Integer hit) {
        this.hit = hit;
    }

    public Double getCrit() {
        return crit;
    }

    public void setCrit(Double crit) {
        this.crit = crit;
    }

    public Integer getEvad() {
        return evad;
    }

    public void setEvad(Integer evad) {
        this.evad = evad;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public Integer getVit() {
        return vit;
    }

    public void setVit(Integer vit) {
        this.vit = vit;
    }

    public Integer getVitTop() {
        return vitTop;
    }

    public void setVitTop(Integer vitTop) {
        this.vitTop = vitTop;
    }

    public Integer getStr() {
        return str;
    }

    public void setStr(Integer str) {
        this.str = str;
    }

    public Integer getStrTop() {
        return strTop;
    }

    public void setStrTop(Integer strTop) {
        this.strTop = strTop;
    }

    public Integer getAgi() {
        return agi;
    }

    public void setAgi(Integer agi) {
        this.agi = agi;
    }

    public Integer getAgiTop() {
        return agiTop;
    }

    public void setAgiTop(Integer agiTop) {
        this.agiTop = agiTop;
    }

    public Integer getZl() {
        return zl;
    }

    public void setZl(Integer zl) {
        this.zl = zl;
    }

    public Integer getZlTop() {
        return zlTop;
    }

    public void setZlTop(Integer zlTop) {
        this.zlTop = zlTop;
    }

    public Integer getFreeProperty() {
        return freeProperty;
    }

    public void setFreeProperty(Integer freeProperty) {
        this.freeProperty = freeProperty;
    }

    public Integer getOccupTotal() {
        return occupTotal;
    }

    public void setOccupTotal(Integer occupTotal) {
        this.occupTotal = occupTotal;
    }

    public Integer getOccupTotalNow() {
        return occupTotalNow;
    }

    public void setOccupTotalNow(Integer occupTotalNow) {
        this.occupTotalNow = occupTotalNow;
    }

    public Integer getPetTotal() {
        return petTotal;
    }

    public void setPetTotal(Integer petTotal) {
        this.petTotal = petTotal;
    }

    public Integer getPetNumLimit() {
        return petNumLimit;
    }

    public void setPetNumLimit(Integer petNumLimit) {
        this.petNumLimit = petNumLimit;
    }

    public Integer getMountTotal() {
        return mountTotal;
    }

    public void setMountTotal(Integer mountTotal) {
        this.mountTotal = mountTotal;
    }

    public Integer getBackpack() {
        return backpack;
    }

    public void setBackpack(Integer backpack) {
        this.backpack = backpack;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}