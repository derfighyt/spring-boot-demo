package com.liuli.springboot.demo.web.controller;

import com.liuli.springboot.demo.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
                                @RequestParam("word") String word,
                                @RequestAttribute("userId") String userId,
                                HttpServletRequest request) {
        System.out.println(word);
        System.out.println(map);

        System.out.println("get userid from parameter: " + userId);
        System.out.println("get userid from request: " + request.getAttribute("userId"));
        return "你好： " + word;
    }
}
