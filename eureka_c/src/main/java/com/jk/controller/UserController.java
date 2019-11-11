package com.jk.controller;/**
 * @program: spring_cloud_parent
 * @author: yzy
 * @create: 2019-11-06 20:34
 **/

import com.jk.model.UserModel;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 *@ClassName UserController
 *@Author yzy
 *@Date 2019/11/6 20:34
 */
@Controller
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;


    @GetMapping("query")
    @ResponseBody
    public HashMap<String, Object> initTable(Integer page,Integer row){
        System.out.println("111");
        HashMap<String, Object> stringObjectHashMap = userService.initTable(page, row);
        return stringObjectHashMap;
    }

    @PostMapping("add")
    @ResponseBody
    public String addBook(@RequestBody UserModel u){

        if (u.getId()!=null){

            userService.updateBook(u);

        }else {
            userService.addBook(u);
        }

        return null;
    }

    @PostMapping("queryUser")
    @ResponseBody
    public UserModel queryUser( Integer id){

        UserModel u  = userService.queryUser(id);
        return u ;
    }



 /*   @GetMapping()
    @ResponseBody
    public String test(){
        return "hello world!:"+serverPort;
    }

    @GetMapping("one")
    @ResponseBody
    public String one(String name,Integer age){
        return "hello world!:"+serverPort+"姓名："+name+"===年龄："+age;
    }

    @PostMapping()
    @ResponseBody
    public String two(@RequestBody UserBean user){
        return "hello world!:"+serverPort+"姓名："+user.getName()+"===年龄："+user.getAge();
    }*/

}
