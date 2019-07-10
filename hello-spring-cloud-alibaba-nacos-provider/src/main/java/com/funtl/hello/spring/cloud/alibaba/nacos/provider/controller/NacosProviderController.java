package com.funtl.hello.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ld
 * @Date: 2019/7/9 10:10
 * @Param ${tags}
 * @Description:
 */
@RestController
public class NacosProviderController {
	@GetMapping(value = "/echo/{message}")
	public String echo(@PathVariable String message) {
		return "Hello Nacos Discovery " + message;
	}
}
