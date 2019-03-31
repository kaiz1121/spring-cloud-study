package com.kaiz.product.controller;

import com.kaiz.product.pojo.vo.ProductVO;
import com.kaiz.product.service.interfaces.IProductSV;
import com.kaiz.product.utils.ResultBean;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 16:46 2019/3/31.
 */
@RestController
public class ProductController {
    @Autowired
    private IProductSV iProductSV;

    @GetMapping(value = "/products/{productId}")
    public ProductVO getProduct(@PathVariable Integer productId){
        return iProductSV.getProductById(productId);
    }
}
