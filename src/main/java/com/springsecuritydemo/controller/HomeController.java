package com.springsecuritydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by diwakar on 15/07/17.
 */
@Controller
public class HomeController {



    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public ModelAndView user(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user");
        return modelAndView;
    }

    @RequestMapping(value = "/admin",method = RequestMethod.GET)
    public ModelAndView admin(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin");
        return modelAndView;
    }
}
