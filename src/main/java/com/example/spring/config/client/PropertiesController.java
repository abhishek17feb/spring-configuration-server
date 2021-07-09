package com.example.spring.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class PropertiesController {

    @Value("${name}")
    private String name;

    @Value("${Address}")
    private String address;

    @GetMapping("/values")
    public String getValues(){return "Hello " + name + " Residing at " + address;}
}
