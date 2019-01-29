package com.flyfire;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ArticleController {

    @ResponseBody
    @RequestMapping(value="/article/list",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String list(){

        return "";
    }
}
