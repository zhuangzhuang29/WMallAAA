package com.wangzz.wmall.user.api.iservice;

import com.wangzz.wmall.user.vo.UserModel;
import org.springframework.stereotype.Service;

/**
 * Created by wangq on 2020/5/6.
 */
@Service
public interface IUserService {

    UserModel getUserModel(Long userId);
}
