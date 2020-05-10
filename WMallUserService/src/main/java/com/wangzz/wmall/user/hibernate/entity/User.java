package com.wangzz.wmall.user.hibernate.entity;

import javax.persistence.*;

/**
 * Created by wangq on 2020/5/2.
 */
@Entity
public class User implements BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String realName;

    private String nickName;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @OneToOne
    User inviteUser;

    public User() {
    }


}
