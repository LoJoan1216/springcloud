package com.itheima.consumer.client;

import com.itheima.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Joan
 * @date 2019-10-28 19:27
 */

/**
 * feign客户端接口类
 */
@FeignClient(value = "user-service",fallback = UserFeignClient.class)
public interface UserClient {

    @GetMapping("/user/{id}")
    User queryById(@PathVariable("id") Long id);
}
