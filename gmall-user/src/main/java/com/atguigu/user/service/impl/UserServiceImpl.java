package com.atguigu.user.service.impl;

import com.atguigu.user.bean.UserInfo;
import com.atguigu.user.mapper.UserInfoMapper;
import com.atguigu.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserServiceImpl
 *
 * @author xiaojiao.qin@hand-china.com
 * @Created on 2019/6/5 9:37
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getUserInfoList() {
         return userInfoMapper.selectAll();

    }
    @Override
    public void addUser(UserInfo userInfo){
        userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }


}
