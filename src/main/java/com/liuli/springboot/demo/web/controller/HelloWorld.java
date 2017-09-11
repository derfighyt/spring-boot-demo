package com.liuli.springboot.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello World
 *
 * @author li.liu
 */

@Controller
@RequestMapping("/demo")
public class HelloWorld {

    @RequestMapping(value = "/helloWorld/{name}")
    public String helloWorld(@PathVariable("name") String name,
                             Model model) {
        model.addAttribute("name", name);
        return "welcome";
    }

    @RequestMapping(value = "/helloWorldApi/{name}")
    @ResponseBody
    public String helloWorldApi(@PathVariable("name") String name) {
        return "hello " + name;
    }
}
