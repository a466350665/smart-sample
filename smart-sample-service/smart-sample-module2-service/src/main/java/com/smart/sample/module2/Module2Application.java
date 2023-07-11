package com.smart.sample.module2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableFeignClients(basePackages = {"com.smart.sample.module1.api"})
@SpringBootApplication
public class Module2Application {

    public static void main(String[] args) {
        SpringApplication.run(Module2Application.class, args);
    }
}
