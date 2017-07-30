package com.wwh.iot.easylinker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wwhai on 2017/7/27.
 */

/**
 * 首页控制器
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/loginPage")
    public String loginPage() {
        return "loginpage";
    }

    @RequestMapping("/loginFailed")
    public String loginFailed() {
        return "loginfailed";
    }


}
