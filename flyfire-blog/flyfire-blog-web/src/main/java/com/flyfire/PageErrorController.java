package com.flyfire;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageErrorController implements ErrorController {

    @RequestMapping("/error")
    public String getErrorPath() {
        return "404";
    }
}
