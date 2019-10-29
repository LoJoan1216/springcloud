package com.itheima.consumer.client;

import com.itheima.consumer.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @author Joan
 * @date 2019-10-28 20:14
 */
@Component
public class UserFeignClient implements UserClient {
    @Override
    public User queryById(Long id) {

        User user = new User();
        user.setId(id);
        user.setName("用户异常");
        return user;
    }
}
