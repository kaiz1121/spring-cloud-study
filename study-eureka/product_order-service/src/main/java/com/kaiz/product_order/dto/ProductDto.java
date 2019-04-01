package com.kaiz.product_order.dto;

import java.io.Serializable;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 17:08 2019/3/31.
 */
public class ProductDto implements Serializable {
    private Integer productId;
    private String productName;
    private String productServicePort;

    public String getProductServicePort() {
        return productServicePort;
    }

    public void setProductServicePort(String productServicePort) {
        this.productServicePort = productServicePort;
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

}
