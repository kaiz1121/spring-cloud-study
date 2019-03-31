package com.kaiz.product.service.interfaces;

import com.kaiz.product.pojo.vo.ProductVO;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 16:43 2019/3/31.
 */
public interface IProductSV {
    ProductVO getProductById(Integer productId);
}
