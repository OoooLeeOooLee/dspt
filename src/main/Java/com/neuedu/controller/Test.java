package com.neuedu.controller;

import com.neuedu.pojo.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(value = "/shopping/")
public class Test {
    @RequestMapping(value = "userinfo")
    public UserBean test(){
        UserBean user= new UserBean();
        user.setUname("哈哈哈哈哈哈");
        user.setUpwd("123456");
        return user;

    }
}
