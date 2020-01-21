package com.muniao.mycat.controller;

import com.muniao.mycat.entity.UserEntity;
import com.muniao.mycat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public String save(UserEntity user) {
        userService.insert(user);
        return "保存成功";
    }

    @RequestMapping("/list")
    public List<UserEntity> list() {
        return userService.selectAll();
    }
}
