package com.wangzz.wmall.user.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

/**
 * Created by wangq on 2020/5/2.
 */
@Entity
public class User extends BaseEntity {
    @Column(columnDefinition = "varchar(20) COMMENT '真实姓名'")
    private String realName;

    @Column(columnDefinition = "varchar(20) COMMENT '昵称'")
    private String nickName;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "varchar(10) COMMENT '性别'")
    private Sex sex;

    @Column(columnDefinition = "datetime COMMENT '出生日期'")
    private Date birthDate;

    public User() {
    }

    public String getRealName() {
        return realName;
    }

    public String getNickName() {
        return nickName;
    }

    public Sex getSex() {
        return sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
