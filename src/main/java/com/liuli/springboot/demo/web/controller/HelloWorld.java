package com.liuli.springboot.demo.web.controller;

import com.liuli.springboot.demo.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Hello World
 *
 * @author li.liu
 */

@Controller
@RequestMapping("/demo")
public class HelloWorld {

    @Autowired
    private Map<String, BaseService> map;

    @RequestMapping(value = "/helloWorld/{name}")
    public String helloWorld(@PathVariable("name") String name,
                             Model model) {
        model.addAttribute("name", name);
        return "welcome";
    }

    @RequestMapping(value = "/helloWorldApi/{name}")
    @ResponseBody
    public String helloWorldApi(@PathVariable("name") String name,
                                @RequestParam("word") String word) {
        System.out.println(word);
        System.out.println(map);
        return "你好： " + word;
    }
}
