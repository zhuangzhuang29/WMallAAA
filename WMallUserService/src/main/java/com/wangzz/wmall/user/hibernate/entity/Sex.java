package com.wangzz.wmall.user.hibernate.entity;

/**
 * Created by wangq on 2020/5/2.
 */
public enum Sex {
    male(0, "男"),
    female(1, "女"),
    unknown(2, "未知");

    Sex() {
    }

    Sex(int value, String content) {
    }
}
