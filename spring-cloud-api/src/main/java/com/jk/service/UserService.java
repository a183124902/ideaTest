package com.jk.service;

import com.jk.model.UserModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

/**
 * @program: spring_cloud_parent
 * @author: yzy
 * @create: 2019-11-07 16:58
 **/
@FeignClient(value = "springcloudprovider",fallback = UserServiceHystrix.class)
public interface UserService {

    @GetMapping("user/query")
    HashMap<String, Object> initSubTable(@RequestParam Integer page, @RequestParam("row") Integer rows);

    @PostMapping("user/add")
    String addBook(UserModel u);

    @PostMapping("user/queryUser")
    UserModel queryUser(@RequestParam Integer id);

    @GetMapping("user/getUser")
    UserModel getUser(String name);
}
