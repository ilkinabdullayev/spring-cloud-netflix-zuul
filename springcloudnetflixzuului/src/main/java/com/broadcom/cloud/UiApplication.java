package com.broadcom.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableZuulProxy
@SpringBootApplication
@Controller
@RequestMapping("/ui")
public class UiApplication {

    @GetMapping(value = "/home")
    public String home(Model model) {
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(UiApplication.class, args);
    }
}
