package com.tech.learn.aws.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kuria on 8/6/2017.
 */
@RestController
@EnableAutoConfiguration
public class HelloWorldController {

    @RequestMapping("/")
    public String helloWorld(){
        return "HELLO WORLD !!";
    }

    public static void main(String [] args){
        SpringApplication.run(HelloWorldController.class, args);
    }

}
