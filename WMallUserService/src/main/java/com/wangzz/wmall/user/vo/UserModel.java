package com.wangzz.wmall.user.vo;

import com.wangzz.wmall.user.hibernate.entity.Sex;
import com.wangzz.wmall.user.hibernate.entity.User;

import java.util.Date;
import java.util.List;

/**
 * Created by wangq on 2020/5/6.
 */
public class UserModel {
    private Long id;

    private String realName;

    private String nickName;

    private Sex sex;

    private User inviteUser;

    private List<User> childUserList;

    private Date createTime;

    public UserModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public User getInviteUser() {
        return inviteUser;
    }

    public void setInviteUser(User inviteUser) {
        this.inviteUser = inviteUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<User> getChildUserList() {
        return childUserList;
    }

    public void setChildUserList(List<User> childUserList) {
        this.childUserList = childUserList;
    }
}
