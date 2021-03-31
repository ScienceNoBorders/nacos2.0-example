package com.xiaotijun.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author XiaoTiJun
 * @date 2021-03-31 11:30
 */
@SpringBootApplication
@RestController
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerFeignApplication {

    public ConsumerFeignApplication(RemoteClient remoteClient) {
        this.remoteClient = remoteClient;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignApplication.class, args);
    }

    private final RemoteClient remoteClient;

    @GetMapping("/feign")
    public String test() {
        return remoteClient.remoteFeign();
    }

}
