package com.flyfire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

import java.io.InputStream;
import java.util.Map;

@Controller
public class IndexController {

    /**
     * 首页
     * @param map
     * @return
     */
    @RequestMapping("/" )
    public String velocityTest(Map map){
        map.put("message", "这是测试的内容11。。。");
        map.put("toUserName", "张三1");
        map.put("fromUserName", "老许");

        return "index";
    }

    /**
     * 首页
     * @param map
     * @return
     */
    /*@RequestMapping("/error" )
    public String error(Map map){
        map.put("message", "这是测试的内容11。。。");
        map.put("toUserName", "张三1");
        map.put("fromUserName", "老许");
        System.err.println("22");
        return "error";
    }*/


}
