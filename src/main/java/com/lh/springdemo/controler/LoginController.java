package com.lh.springdemo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuhe on 2018/9/24.
 */
//@RestController 返回值看做字符串
//@Controller 返回值看做资源的名称（元数据）

@Controller
public class LoginController {

    //1. 在浏览器访问这个方法。
    //2. 方法执行完毕，要跳转到一个页面。 在方法的内部存数据
    //3. 在页面上显示我要显示的数据
    @RequestMapping("user_login")
    public String login(String username , String password){
        System.out.println(username + " : " + password);
        return "index.html";
    }
}
