package com.zzy.robot.model;

import java.util.Date;
import javax.persistence.*;

public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String avatar;

    private Integer level;

    @Column(name = "create_time")
    private Date createTime;

    private String phone;

    @Column(name = "favorable_rate")
    private Float favorableRate;

    @Column(name = "description_matches")
    private Float descriptionMatches;

    private Float attitude;

    private Float logistics;

    private String shopkeeper;

    private String city;

    private String address;

    private String description;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return favorable_rate
     */
    public Float getFavorableRate() {
        return favorableRate;
    }

    /**
     * @param favorableRate
     */
    public void setFavorableRate(Float favorableRate) {
        this.favorableRate = favorableRate;
    }

    /**
     * @return description_matches
     */
    public Float getDescriptionMatches() {
        return descriptionMatches;
    }

    /**
     * @param descriptionMatches
     */
    public void setDescriptionMatches(Float descriptionMatches) {
        this.descriptionMatches = descriptionMatches;
    }

    /**
     * @return attitude
     */
    public Float getAttitude() {
        return attitude;
    }

    /**
     * @param attitude
     */
    public void setAttitude(Float attitude) {
        this.attitude = attitude;
    }

    /**
     * @return logistics
     */
    public Float getLogistics() {
        return logistics;
    }

    /**
     * @param logistics
     */
    public void setLogistics(Float logistics) {
        this.logistics = logistics;
    }

    /**
     * @return shopkeeper
     */
    public String getShopkeeper() {
        return shopkeeper;
    }

    /**
     * @param shopkeeper
     */
    public void setShopkeeper(String shopkeeper) {
        this.shopkeeper = shopkeeper;
    }

    /**
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}