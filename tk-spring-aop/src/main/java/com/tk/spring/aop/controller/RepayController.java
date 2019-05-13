package com.tk.spring.aop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 支付处理
 * @Author WeiLi
 **/
@RestController
public class RepayController extends BaseController{

    @RequestMapping("/repay")
    public String repay() throws Exception{
        return "支付成功！";
    }
}
