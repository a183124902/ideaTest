package com.jk.service;

import com.jk.model.UserModel;

import java.util.HashMap;

/**
 * @program: spring_cloud_parent
 * @author: yzy
 * @create: 2019-11-06 21:25
 **/
public interface UserService {

    HashMap<String, Object> initSubTable(Integer page, Integer rows);


    String addBook(UserModel u);

    UserModel queryUser(Integer id);
}
