package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MybatisController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    @ResponseBody
    public List<User> queryUserList() {
        List<User> users = userMapper.findAll();
        return users;
    }

    @RequestMapping(value = "/query2", method = RequestMethod.GET)
    @ResponseBody
    public List<User> queryUserList2() {
        List<User> users = userMapper.findAll();
        return users;
    }

    @RequestMapping(value = "/query3", method = RequestMethod.GET)
    @ResponseBody
    public List<User> queryUserList3() {
        List<User> users = userMapper.findAll();
        return users;
    }

    public void test() {
        int i = 1;
        System.out.println(i);
    }

}
