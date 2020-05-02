package com.wangzz.wmall.product.mybatis.vo;

import java.util.Date;

/**
 * Created by wangq on 2020/5/1.
 */
public class ProductVO {

    private Long id;

    private String productName;

    private String productDesc;

    private String productProducePlace;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductProducePlace() {
        return productProducePlace;
    }

    public void setProductProducePlace(String productProducePlace) {
        this.productProducePlace = productProducePlace;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
