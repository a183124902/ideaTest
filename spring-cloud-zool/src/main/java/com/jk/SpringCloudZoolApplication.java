package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZoolApplication.class, args);
    }

}
