package com.kaiz.product.pojo.po;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="product")
@DynamicUpdate
public class ProductPO{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(columnDefinition="int(10) COMMENT '商品编号'")
    private Integer productId;
    
    @Column(columnDefinition="varchar(255) COMMENT '商品名'", nullable=false)
    private String productName;

    
    @Column(columnDefinition="varchar(255) COMMENT '价格'", nullable=false)
    private String price;

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
