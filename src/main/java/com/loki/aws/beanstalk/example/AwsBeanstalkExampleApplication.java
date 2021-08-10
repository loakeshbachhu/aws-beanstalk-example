package com.loki.aws.beanstalk.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsBeanstalkExampleApplication {

    @RequestMapping("/applicationStatus")
    public String deploy(){
        return "Application deployed to AWS Beanstalk..!!";
    }
    public static void main(String[] args) {
        SpringApplication.run(AwsBeanstalkExampleApplication.class, args);
    }

}
