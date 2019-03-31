package com.kaiz.product_order.pojo.po;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 16:58 2019/3/31.
 */
@Entity
@Table(name="product_order")
@DynamicUpdate
public class ProductOrderPO{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int(10) COMMENT '用户编号'")
    private Integer orderId;

    @Column(columnDefinition = "int(10) COMMENT '商品编号'", nullable = false)
    private Integer productId;


    @Column(columnDefinition = "int(10) COMMENT '用户编号'", nullable = false)
    private Integer userId;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}


