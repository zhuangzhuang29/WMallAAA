package com.wangzz.wmall.user.hibernate.entity;

import java.util.Date;

/**
 * Created by wangq on 2020/5/10.
 */
public interface BaseEntity {
    Date createTime = null;
    Long createBy = null;

    Date lastUpdateTime = null;
    Long lastUpdateBy = null;


}
