/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kingdom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author antti
 */
@Controller
@EnableAutoConfiguration
public class KingdomGates {

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(KingdomGates.class, args);
    }

}
