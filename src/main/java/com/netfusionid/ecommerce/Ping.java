package com.netfusionid.ecommerce;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("api/v1/test")
public class Ping {

    @GetMapping
    public String ping() {
        return "Ok";
    }
}
