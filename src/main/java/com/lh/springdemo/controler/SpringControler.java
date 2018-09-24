package com.lh.springdemo.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuhe on 2018/9/24.
 */
@RestController
public class SpringControler {

    @RequestMapping("login")
    public String login(String username, String password) {
        if ("liuhe".equals(username) && "123".equals(password)) {
            return "login success";
        }
        return "login failed";
    }
}
