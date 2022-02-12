package com.restfull_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@RestController
public class RestFullApplication {

    @GetMapping("/welcome")
    public String welcome() {
        return "Spring Boot Docker Demo";
    }

    public static void main(String[] args) {
        SpringApplication.run(RestFullApplication.class, args);
    }

}
