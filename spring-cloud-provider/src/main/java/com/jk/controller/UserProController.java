package com.jk.controller;/**
 * @program: spring_cloud_parent
 * @author: yzy
 * @create: 2019-11-08 16:10
 **/

import com.jk.model.UserModel;

import com.jk.service.UserService;
import com.jk.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 *@ClassName UserProController
 *@Author yzy
 *@Date 2019/11/8 16:10
 */
@RestController
public class UserProController implements UserService {

    @Autowired
    private UsersService usersService;

    @Override
    public HashMap<String, Object> initSubTable(Integer page, Integer rows) {

        System.out.println("111");
        HashMap<String, Object> stringObjectHashMap = usersService.initTable(page, rows);
        return stringObjectHashMap;
    }

    @Override
    public String addBook(@RequestBody UserModel u) {

        if (u.getId()!=null){

            usersService.updateBook(u);

        }else {
            usersService.addBook(u);
        }

        return null;
    }

    @Override
    public UserModel queryUser(Integer id) {

        UserModel u  = usersService.queryUser(id);
        return u ;
    }

    @Override
    public UserModel getUser(String name) {


        return usersService.getUser(name);
    }


}
