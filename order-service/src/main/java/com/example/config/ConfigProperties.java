package com.example.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class ConfigProperties {

    @Value("${name}")
    private String name;
    @Value("${mysql.host}")
    private String mysqlHost;
    @Value("${mysql.port}")
    private String mysqlPort;
    @Value("${user_name}")
    private String userName;

    @Value("${spring.datasource.url}")
    private String springUrl;
}
