package com.kaiz.product_order.pojo.vo;

import java.io.Serializable;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 17:00 2019/3/31.
 */
public class ProductOrderVO implements Serializable {
    private Integer orderId;
    private Integer productId;
    private String productName;
    private String productServicePort;
    private Integer userId;
    private String userName;
    private String userServicePort;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductServicePort() {
        return productServicePort;
    }

    public void setProductServicePort(String productServicePort) {
        this.productServicePort = productServicePort;
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

    public String getUserServicePort() {
        return userServicePort;
    }

    public void setUserServicePort(String userServicePort) {
        this.userServicePort = userServicePort;
    }
}
