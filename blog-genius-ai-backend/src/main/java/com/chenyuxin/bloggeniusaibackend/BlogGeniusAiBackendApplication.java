package com.chenyuxin.bloggeniusaibackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication
public class BlogGeniusAiBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogGeniusAiBackendApplication.class, args);
    }

}
