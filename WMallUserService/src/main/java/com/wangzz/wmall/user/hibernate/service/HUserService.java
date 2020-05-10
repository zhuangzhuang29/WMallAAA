package com.wangzz.wmall.user.hibernate.service;

import com.wangzz.wmall.user.api.iservice.IUserService;
import com.wangzz.wmall.user.vo.UserModel;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

/**
 * Created by wangq on 2020/5/6.
 */
@Service
@Transactional
//@Component("HUserService")
public class HUserService implements IUserService {
    @Override
    public UserModel getUserModel(Long userId) {
        return null;
    }

    @Override
    public String userLogin(String userName, String password, HttpSession httpSession) {
        if (userName.equals("root") && password.equals("root")) {
            httpSession.setAttribute("user", userName);
            return "login success";
        }
        return "login error";
    }
}
