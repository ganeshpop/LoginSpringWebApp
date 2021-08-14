package com.ganesh.controllers;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ganesh.model.bean.User;
import com.ganesh.model.service.LoginService;

@Controller
public class MyLoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/")
    public ModelAndView welcomePageController() {
        return new ModelAndView("login");
    }

    @RequestMapping("/login")
    public ModelAndView loginController(HttpServletRequest request) {
        ModelAndView modelAndView=new ModelAndView();
        String uname=request.getParameter("username");
        String pwd=request.getParameter("password");

        String message=null;
        if(loginService.loginCheck(new User(uname, pwd)))
            message="Login Successful";
        else
            message="Login Failed";

        modelAndView.addObject("message", message);
        modelAndView.setViewName("output");

        return modelAndView;
    }
}