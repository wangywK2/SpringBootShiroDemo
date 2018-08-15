package com.example.shirodemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.shirodemo.utils.ReturnJson;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Method
 * @PACKAGE_NAME com.example.shirodemo.controller
 * @Auther player
 * @Date 2018/7/24
 * @Version 1.0
 */
@Controller
public class CommonController {
    public Logger logger = LoggerFactory.getLogger(CommonController.class);
    @GetMapping(value = "/login")
    public String loginPage(){
        return "login";
    }

    @PostMapping(value = "/login")
    @ResponseBody
    public JSONObject checkLogin(String username, String password){
        boolean remwmberme = true;
        UsernamePasswordToken upt = new UsernamePasswordToken(username,password,remwmberme);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(upt);
            return ReturnJson.success(null,"登陆成功。");
        }catch (AuthenticationException e) {
            //return ReturnJson.error("用户验证失败，请核实用户信息后在进行登录。");
            return ReturnJson.error(e.getMessage());
        }
    }

    @RequestMapping(value = "index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView();
        view.setViewName("index");
        return view;
    }
}
