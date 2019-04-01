package com.kaiz.product_order.dto;

import java.io.Serializable;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 17:08 2019/3/31.
 */
public class UserDto implements Serializable {
    private Integer userId;
    private String userName;
    //设置端口号，可以看出ribbon默认负载均衡策略为轮询
    private String userServicePort;

    public String getUserServicePort() {
        return userServicePort;
    }

    public void setUserServicePort(String userServicePort) {
        this.userServicePort = userServicePort;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
