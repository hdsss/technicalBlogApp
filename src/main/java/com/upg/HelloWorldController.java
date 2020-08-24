package com.upg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWorldController {

    @RequestMapping("/hellospring")
    public String helloSpring(){
        return "index";
    }
}
