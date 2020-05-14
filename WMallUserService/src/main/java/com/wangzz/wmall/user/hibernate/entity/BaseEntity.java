package com.wangzz.wmall.user.hibernate.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by wangq on 2020/5/10.
 */
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint(20) COMMENT '自增长id'")
    private Long id;

    @Column(columnDefinition = "datetime COMMENT '创建时间'")
    private Date createTime;

    @Column(columnDefinition = "bigint(20) COMMENT '创建人id'")
    private Long createBy;

    @Column(columnDefinition = "datetime COMMENT '更新时间'")
    private Date lastUpdateTime;

    @Column(columnDefinition = "bigint(20) COMMENT '更新人id'")
    private Long lastUpdateBy;

    public BaseEntity() {
    }

    public Long getId() {
        return id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public Long getLastUpdateBy() {
        return lastUpdateBy;
    }
}
