package com.kona.springboot.sample.web.controller;

import com.kona.springboot.sample.web.config.StudentConfig;
import com.kona.springboot.sample.web.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Yuan.Pan 2019/6/21 2:59 PM
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserConfig userConfig;

    @Autowired
    private StudentConfig studentConfig;

    @Value("${app-env}")
    private String env;

    @GetMapping("/hello")
    public String testDemo1() {
        return "Hello Spring Boot";
    }

    @GetMapping("properties")
    public Map<String, Object> getConfig() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("user", userConfig);
        map.put("student", studentConfig);
        return map;
    }

    @GetMapping("/env")
    public String getEnv() {
        return env;
    }
}
