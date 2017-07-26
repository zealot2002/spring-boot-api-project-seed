package com.zzy.robot.model;

import javax.persistence.*;

public class Commodity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "detail_url")
    private String detailUrl;

    private Float price;

    @Column(name = "shop_id")
    private Integer shopId;

    @Column(name = "sold_num")
    private Integer soldNum;

    private Float freight;

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
     * @return detail_url
     */
    public String getDetailUrl() {
        return detailUrl;
    }

    /**
     * @param detailUrl
     */
    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    /**
     * @return price
     */
    public Float getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * @return shop_id
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * @param shopId
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * @return sold_num
     */
    public Integer getSoldNum() {
        return soldNum;
    }

    /**
     * @param soldNum
     */
    public void setSoldNum(Integer soldNum) {
        this.soldNum = soldNum;
    }

    /**
     * @return freight
     */
    public Float getFreight() {
        return freight;
    }

    /**
     * @param freight
     */
    public void setFreight(Float freight) {
        this.freight = freight;
    }
}