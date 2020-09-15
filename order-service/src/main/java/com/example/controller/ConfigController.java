package com.example.controller;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import com.example.config.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired
    private ConfigProperties configProperties;

    @Value("${name}")
    private String name;
    @Value("${spring.datasource.url}")
    private String url;

    @Value("${redis}")
    private String redisName;

    @GetMapping("/name")
    public String getName() {
        Config config = ConfigService.getConfig("app-mysql");
        String username = config.getProperty("spring.datasource.username", null);
        System.out.println(redisName);
        System.out.println(url);
        System.out.println(username);
        System.out.println(configProperties.getMysqlHost());
        System.out.println(configProperties.getMysqlPort());
        System.out.println(configProperties.getUserName());
        System.out.println(configProperties.getSpringUrl());
        return configProperties.getName();
    }
}
