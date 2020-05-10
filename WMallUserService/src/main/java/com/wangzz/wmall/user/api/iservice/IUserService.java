package com.wangzz.wmall.user.api.iservice;

import com.wangzz.wmall.user.vo.UserModel;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Created by wangq on 2020/5/6.
 */
@Service
public interface IUserService {

    UserModel getUserModel(Long userId);

    String userLogin(String userName, String password, HttpSession httpSession);
}
