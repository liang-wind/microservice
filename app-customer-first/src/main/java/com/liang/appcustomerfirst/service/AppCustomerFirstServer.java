package com.liang.appcustomerfirst.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Liang
 * @create 2019/11/2 11:30
 * @Description
 */
@FeignClient(value = "app-server")
public interface AppCustomerFirstServer {

    @RequestMapping("/test")
    public String test();
}
