package com.chenyuxin.bloggeniusaibackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YuXin.Dev
 * @Date: 2025/10/3 22:16
 */
@RestController
@RequestMapping("/health")
public class HealthController {
    @GetMapping("/")
    public String health(){
        return "health";
    }
}
