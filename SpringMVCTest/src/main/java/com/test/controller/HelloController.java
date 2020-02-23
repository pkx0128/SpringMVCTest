package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器类
 */
@Controller
public class HelloController {

    @RequestMapping(path = "/hello")
    public String SayHello(){
        System.out.println("Hello World!");
        /**
         * 配置好视图解析器，如果返回success字符串，就会到相应的配置中的目录查找与success同名的jsp页面作为结果返回请求
         */
        return "success";
    }
}
