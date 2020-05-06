package com.wangzz.wmall.user.mybatis.mapper;

import com.wangzz.wmall.user.vo.UserModel;

/**
 * Created by wangq on 2020/5/6.
 */
public interface IUserMapper {

    UserModel getUserModelById(Long userId);
}
