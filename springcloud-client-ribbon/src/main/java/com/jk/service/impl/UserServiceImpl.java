package com.jk.service.impl;/**
 * @program: spring_cloud_parent
 * @author: yzy
 * @create: 2019-11-06 21:26
 **/

import com.jk.model.UserModel;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

/**
 *@ClassName UserServiceImpl
 *@Author yzy
 *@Date 2019/11/6 21:26
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private RestTemplate restTemplate;


    @Override
    public HashMap<String, Object> initSubTable(Integer page, Integer rows) {


        HashMap<String, Object> forObject = restTemplate.getForObject("http://eurekac/user/query?page={1}&row={2}",HashMap.class,page,rows);

        return forObject;
    }

    @Override
    public String addBook(UserModel u) {

        String s = restTemplate.postForObject("http://eurekac/user/add", u, String.class);

        return s;
    }

    @Override
    public UserModel queryUser(Integer id) {

        UserModel s = restTemplate.postForObject("http://eurekac/user/queryUser",id,UserModel.class);

        return s;
    }
}
