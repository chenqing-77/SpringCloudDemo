package com.nicebin.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCaching
@EnableRedisHttpSession
@EnableAsync
@EnableFeignClients
public class ResourcesServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResourcesServiceApplication.class, args);
    }

}
