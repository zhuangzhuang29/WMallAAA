package com.wangzz.wmall.user.api.icontroller;

import com.wangzz.wmall.user.vo.UserModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by wangq on 2020/5/6.
 */
@RestController
@RequestMapping(value = "/user")
public interface IUserController {
    @GetMapping(value = "/getUserInfo/{userId}")
    UserModel getUserModel(@PathVariable Long userId,HttpSession httpSession);

    @GetMapping(value = "/login/{userName}/{password}")
    String userLogin(@PathVariable String userName, @PathVariable String password,HttpSession httpSession);


}
