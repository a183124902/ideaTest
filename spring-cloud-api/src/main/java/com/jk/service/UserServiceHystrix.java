package com.jk.service;/**
 * @program: spring_cloud_parent
 * @author: yzy
 * @create: 2019-11-07 17:05
 **/

import com.jk.model.UserModel;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

/**
 *@ClassName UserServiceHystrix
 *@Author yzy
 *@Date 2019/11/7 17:05
 */
@Component
public class UserServiceHystrix implements UserService {


    @Override
    public HashMap<String, Object> initSubTable(Integer page, Integer rows) {


        System.out.println("查询失败");
        return null;
    }

    @Override
    public String addBook(UserModel u) {
        System.out.println("新增失败");
        return null;
    }

    @Override
    public UserModel queryUser(@RequestParam Integer id) {
        System.out.println("回显失败");
        return null;
    }

    @Override
    public UserModel getUser(String name) {
        System.out.println("登录失败");
        return null;
    }

}
