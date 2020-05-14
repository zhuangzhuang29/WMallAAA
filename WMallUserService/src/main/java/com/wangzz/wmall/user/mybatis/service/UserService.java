package com.wangzz.wmall.user.mybatis.service;

import com.wangzz.wmall.user.api.iservice.IUserService;
import com.wangzz.wmall.user.common.config.ServiceConfig;
import com.wangzz.wmall.user.mybatis.mapper.IUserMapper;
import com.wangzz.wmall.user.vo.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Created by wangq on 2020/5/6.
 */
@Service(ServiceConfig.M_SERVICE)
public class UserService implements IUserService {
    @Autowired
    IUserMapper iUserMapper;

    @Override
    public UserModel getUserModel(Long userId) {
        return iUserMapper.getUserModelById(userId);
    }

    @Override
    public String userLogin(String userName, String password, HttpSession httpSession) {
        return null;
    }
}
