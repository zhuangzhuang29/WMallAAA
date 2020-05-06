package com.wangzz.wmall.user.controller;

import com.wangzz.wmall.user.api.icontroller.IUserController;
import com.wangzz.wmall.user.api.iservice.IUserService;
import com.wangzz.wmall.user.vo.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangq on 2020/5/6.
 */
@RestController
public class UserController implements IUserController {
    @Autowired
    @Qualifier("MUserService")
    IUserService iUserService;

    @Override
    public UserModel getUserModel(@PathVariable Long userId) {
        UserModel userModel = iUserService.getUserModel(userId);
        return userModel;
    }

}
