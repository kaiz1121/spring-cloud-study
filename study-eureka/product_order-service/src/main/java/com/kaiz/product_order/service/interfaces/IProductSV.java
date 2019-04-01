package com.kaiz.product_order.service.interfaces;

import com.kaiz.product_order.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>Title: IProductSV</p>
 * <p>Description: 使用Fegin直接定义接口完成远程调用</p>
 *
 * @author kaiz
 * @date 20:24 2019/4/1.
 */
@FeignClient("PRODUCT-SERVICE")
public interface IProductSV {
    @GetMapping(value = "/products/{productId}")
    ProductDto getProductById(@PathVariable(value = "productId") Integer productId);
}
