package com.kaiz.product_order.service.interfaces;

import com.kaiz.product_order.pojo.vo.ProductOrderVO;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 17:02 2019/3/31.
 */
public interface IProductOrderSV {
    ProductOrderVO getOrderById(Integer orderId);
}
