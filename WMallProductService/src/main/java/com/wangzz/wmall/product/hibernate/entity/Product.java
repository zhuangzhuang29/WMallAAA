package com.wangzz.wmall.product.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by wangq on 2020/4/25.
 */
@Entity
public class Product {
    @Id
    private Long id;

    private String productName;

    private String productDesc;

    private String productProducePlace;

    private Date createTime;

    public Product() {
    }
}
