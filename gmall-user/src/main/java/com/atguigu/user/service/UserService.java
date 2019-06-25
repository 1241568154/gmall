package com.atguigu.user.service;

import com.atguigu.user.bean.UserInfo;

import java.util.List;

/**
 * UserService
 *
 * @author xiaojiao.qin@hand-china.com
 * @Created on 2019/6/5 9:37
 */
public interface UserService {
    List<UserInfo> getUserInfoList();

    public void addUser(UserInfo userInfo);
    public void updateUserInfo(UserInfo userInfo);
}
