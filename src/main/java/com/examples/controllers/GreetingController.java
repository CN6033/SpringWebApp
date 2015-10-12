package com.examples.controllers;

import com.examples.security.Principal;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by huangshitao on 15/10/11.
 */
@Controller
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public
    @ResponseBody
    String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
        Principal currentUser = (Principal) SecurityUtils.getSubject().getPrincipal();
        return String.format(template, name);
    }

    // ? 如何定义rest接口，并返回application/json格式数据
}


