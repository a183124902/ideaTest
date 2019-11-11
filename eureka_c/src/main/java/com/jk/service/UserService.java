package com.jk.service;

import com.jk.model.UserModel;

import java.util.HashMap;

/**
 * @program: spring_cloud_parent
 * @author: yzy
 * @create: 2019-11-06 21:50
 **/
public interface UserService {
    HashMap<String, Object> initTable(Integer page, Integer rows);

    void addBook(UserModel u);

    UserModel queryUser(Integer id);

    void updateBook(UserModel u);
}
