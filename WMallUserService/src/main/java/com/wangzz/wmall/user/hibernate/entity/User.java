package com.wangzz.wmall.user.hibernate.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by wangq on 2020/5/2.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String realName;

    private String nickName;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @OneToOne
    User inviteUser;

    private Date createTime;

    public User() {
    }


}
