package com.tk.spring.aop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 登录处理
 * @Author WeiLi
 **/
@RestController
public class LoginController extends BaseController{

    @RequestMapping("/login")
    public String login() throws Exception {
        return "登录成功！";
    }
}
