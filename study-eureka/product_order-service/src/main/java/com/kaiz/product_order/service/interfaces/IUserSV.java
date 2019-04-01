package com.kaiz.product_order.service.interfaces;

import com.kaiz.product_order.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>Title: IUserSV</p>
 * <p>Description: 使用fegin只定义接口即可完成远程调用</p>
 *
 * @author kaiz
 * @date 20:23 2019/4/1.
 */
@FeignClient("USER-SERVICE")
public interface IUserSV {

    @GetMapping(value = "/users/{userId}")
    UserDto getUserById(@PathVariable(value = "userId") Integer userId);
}
