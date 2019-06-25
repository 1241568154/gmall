package com.atguigu.user.controller;

import com.atguigu.user.bean.UserInfo;
import com.atguigu.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController
 *
 * @author xiaojiao.qin@hand-china.com
 * @Created on 2019/6/5 9:34
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/userInfoList")
    public ResponseEntity<List<UserInfo>> userInfoList(){
        List<UserInfo> userInfo = userService.getUserInfoList();
        return ResponseEntity.ok(userInfo);
    }
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
   public ResponseEntity<String> addUser(UserInfo userInfo){

        userService.addUser(userInfo);
        return ResponseEntity.ok().build();
   }
   @RequestMapping(value = "updateUserInfo",method = RequestMethod.POST )
   public ResponseEntity<Void> updateUserInfo(UserInfo userInfo){
        userService.updateUserInfo(userInfo);
        return ResponseEntity.ok().build();
   }

}
