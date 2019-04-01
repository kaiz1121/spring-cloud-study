package com.kaiz.product.service.impl;

import com.kaiz.product.dao.ProductDao;
import com.kaiz.product.pojo.po.ProductPO;
import com.kaiz.product.pojo.vo.ProductVO;
import com.kaiz.product.service.interfaces.IProductSV;
import com.kaiz.product.utils.BeanMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 16:44 2019/3/31.
 */
@Service
@Transactional
public class ProductSVImpl implements IProductSV {
    @Autowired
    private ProductDao productDao;


    @Value("${server.port}")
    protected String serverPort;

    @Override
    public ProductVO getProductById(Integer productId) {
        ProductPO productPO = productDao.getOne(productId);
        if (null !=productPO){
            ProductVO productVO = BeanMapperUtil.map(productPO,ProductVO.class);
            productVO.setProductServicePort(serverPort);
            return productVO;
        }
        return null;
    }
}
