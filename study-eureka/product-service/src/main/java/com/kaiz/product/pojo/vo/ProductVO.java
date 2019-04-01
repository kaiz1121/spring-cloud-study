package com.kaiz.product.pojo.vo;

import java.io.Serializable;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 16:42 2019/3/31.
 */
public class ProductVO implements Serializable {
    private Integer productId;
    private String productName;
    private String price;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
