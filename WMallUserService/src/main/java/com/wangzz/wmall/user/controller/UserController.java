package com.wangzz.wmall.user.controller;

import com.wangzz.wmall.user.api.icontroller.IUserController;
import com.wangzz.wmall.user.api.iservice.IUserService;
import com.wangzz.wmall.user.vo.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by wangq on 2020/5/6.
 */
@RestController
public class UserController implements IUserController {
    @Autowired
    @Qualifier("HUserService")
    IUserService iUserService;


    @Override
    public UserModel getUserModel(Long userId,HttpSession httpSession) {

        System.out.println(httpSession.getId());
        UserModel userModel = iUserService.getUserModel(userId);
        System.out.println(httpSession.getAttribute("user"));
        return userModel;
    }


    public UserModel getUserModel(Long userId) {
        return null;
    }

    @Override
    public String userLogin(String userName, String password,HttpSession httpSession) {
        return iUserService.userLogin(userName, password,httpSession);
    }

}
