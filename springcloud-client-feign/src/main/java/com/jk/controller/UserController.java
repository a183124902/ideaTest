package com.jk.controller;/**
 * @program: spring_cloud_parent
 * @author: yzy
 * @create: 2019-11-06 21:21
 **/


import com.jk.model.UserModel;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 *@ClassName UserController
 *@Author yzy
 *@Date 2019/11/6 21:21
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("toAdd")
    public String toAdd(){


        return "add1.html";
    }

    @RequestMapping("toShow")
    public String toShow(){

        System.out.println("sys");
        return "stu.html";
    }
    @RequestMapping("query")
    @ResponseBody
    public  HashMap<String, Object> initSubTable(Integer page, Integer rows){


        return userService.initSubTable(page,rows);

    }

    @RequestMapping("addBook")
    @ResponseBody
    public String addBook(UserModel u){



        return userService.addBook(u);

    }

    @RequestMapping("toUpdate")
    public String toAdd(Integer id, Model mo){

        UserModel userModel= userService.queryUser(id);
        mo.addAttribute("u",userModel);
        return "add2.html";
    }


    @RequestMapping("toLogin")
    public String toLogin(){

        return "login.html";
    }



}
