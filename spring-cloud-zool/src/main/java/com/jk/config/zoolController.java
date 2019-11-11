package com.jk.config;/**
 * @program: spring_cloud_parent
 * @author: yzy
 * @create: 2019-11-08 20:24
 **/

import com.jk.model.UserModel;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 *@ClassName zoolController
 *@Author yzy
 *@Date 2019/11/8 20:24
 */
@Controller
@RequestMapping("zool")
public class zoolController {


    @Autowired
    private UserService userService;

    @RequestMapping("login")
    @ResponseBody
    public String login(UserModel userModel, HttpSession session){


        String name = userModel.getName();
        UserModel u =userService.getUser(name);
        if (u==null){

            return "用户不存在";
        }else if (!u.getName().equals(name)){
            return "密码错误";
        }
        session.setAttribute("user",u);

        return "登录成功";

    }



}
