package com.kaiz.product_order.controller;

import com.kaiz.product_order.service.interfaces.IProductOrderSV;
import com.kaiz.product_order.utils.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 17:04 2019/3/31.
 */
@RestController
public class ProductOrderController {
    @Autowired
    private IProductOrderSV iProductOrderSV;

    @GetMapping(value = "orders/{orderId}")
    public ResultBean getOrder(@PathVariable Integer orderId){
        return ResultBean.ok(iProductOrderSV.getOrderById(orderId));
    }
}
