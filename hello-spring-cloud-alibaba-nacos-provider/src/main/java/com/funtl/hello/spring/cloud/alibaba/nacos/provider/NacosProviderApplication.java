package com.funtl.hello.spring.cloud.alibaba.nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: ld
 * @Date: 2019/7/9 09:52
 * @Param ${tags}
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(NacosProviderApplication.class, args);
	}
}
