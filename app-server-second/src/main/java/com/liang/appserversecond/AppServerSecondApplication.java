package com.liang.appserversecond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.liang")
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class AppServerSecondApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppServerSecondApplication.class, args);
    }

}
