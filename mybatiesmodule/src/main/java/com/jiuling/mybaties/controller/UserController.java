package com.jiuling.mybaties.controller;

import com.jiuling.mybaties.model.User;
import com.jiuling.mybaties.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fanxiaoming on 2018/7/5.
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "getUser")
    public User getUser(){
        return userService.getUserById();
    }

}
