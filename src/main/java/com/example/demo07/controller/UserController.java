package com.example.demo07.controller;

import com.example.demo07.mapper.UserMapper;
import com.example.demo07.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getList")
    public List<User> getList(){
        for (User user : userMapper.getList()) {
            System.out.println(user.toString());
        }
        return userMapper.getList();
    }

}
