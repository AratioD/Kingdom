/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kingdom;

import java.util.Map;
import javax.servlet.annotation.WebServlet;
import org.springframework.beans.factory.annotation.Value;
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
public class Kingdom {


    private String message = "Kingdom of internet";

       @RequestMapping("/")
    @ResponseBody
    public String welcome(Map<String, Object> model) {
        this.message = "sdfsdfsdf";
        model.put("message", this.message);
        return "welcome";
    }

}
