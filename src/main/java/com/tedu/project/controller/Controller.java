package com.tedu.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/doLoginUI")
    public String doLoginUI(){
        return "login";
    }
}
