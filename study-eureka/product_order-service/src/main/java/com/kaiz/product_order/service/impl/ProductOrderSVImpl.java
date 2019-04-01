package com.kaiz.product_order.service.impl;

import com.kaiz.product_order.dao.ProductOrderDao;
import com.kaiz.product_order.dto.ProductDto;
import com.kaiz.product_order.dto.UserDto;
import com.kaiz.product_order.pojo.po.ProductOrderPO;
import com.kaiz.product_order.pojo.vo.ProductOrderVO;
import com.kaiz.product_order.service.interfaces.IProductOrderSV;
import com.kaiz.product_order.service.interfaces.IProductSV;
import com.kaiz.product_order.service.interfaces.IUserSV;
import com.kaiz.product_order.utils.BeanMapperUtil;
import com.kaiz.product_order.utils.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 17:02 2019/3/31.
 */
@Service
@Transactional
public class ProductOrderSVImpl implements IProductOrderSV {
    @Autowired
    private ProductOrderDao productOrderDao;

    @Autowired
    @Qualifier(value = "restTemplate")
    private RestOperations restTemplate;

    @Autowired
    private IUserSV iUserSV;

    @Autowired
    private IProductSV iProductSV;

    /*
     * <p>Title: getOrderById</p>
     * <p>Description: 使用restTemplate直接调用远程服务</p>
     * @Author:kaiz
     * @param orderId :
     * @return: com.kaiz.product_order.pojo.vo.ProductOrderVO
     * @Date: 2019/4/1 20:28
     */
//    @Override
//    public ProductOrderVO getOrderById(Integer orderId) {
//        ProductOrderPO productOrderPO = productOrderDao.getOne(orderId);
//        if (null != productOrderPO){
//            ProductOrderVO productOrderVO = BeanMapperUtil.map(productOrderPO,ProductOrderVO.class);
//            UserDto userDto = this.restTemplate.getForEntity("http://USER-SERVICE/users/{userId}", UserDto.class, productOrderVO.getUserId()).getBody();
//            if (null !=userDto){
//                productOrderVO.setUserName(userDto.getUserName());
//                productOrderVO.setUserServicePort(userDto.getUserServicePort());
//            }
//            ProductDto productDto = this.restTemplate.getForEntity("http://PRODUCT-SERVICE/products/{productId}", ProductDto.class, productOrderVO.getProductId()).getBody();
//            if (null !=productDto){
//                productOrderVO.setProductName(productDto.getProductName());
//                productOrderVO.setProductServicePort(productDto.getProductServicePort());
//            }
//            return productOrderVO;
//        }
//        return null;
//    }


    /*
     * <p>Title:getOrderById</p>
     * <p>Description: 采用fegin调用远程服务</p>
     * @Author:kaiz
     * @param orderId :
     * @return: com.kaiz.product_order.pojo.vo.ProductOrderVO
     * @Date: 2019/4/1 20:28
     */
    @Override
    public ProductOrderVO getOrderById(Integer orderId) {
        ProductOrderPO productOrderPO = productOrderDao.getOne(orderId);
        if (null != productOrderPO){
            ProductOrderVO productOrderVO = BeanMapperUtil.map(productOrderPO,ProductOrderVO.class);
//            UserDto userDto = this.restTemplate.getForEntity("http://USER-SERVICE/users/{userId}", UserDto.class, productOrderVO.getUserId()).getBody();
            UserDto userDto = iUserSV.getUserById(productOrderVO.getUserId());
            if (null !=userDto){
                productOrderVO.setUserName(userDto.getUserName());
                productOrderVO.setUserServicePort(userDto.getUserServicePort());
            }
//            ProductDto productDto = this.restTemplate.getForEntity("http://PRODUCT-SERVICE/products/{productId}", ProductDto.class, productOrderVO.getProductId()).getBody();
            ProductDto productDto = iProductSV.getProductById(productOrderVO.getProductId());
            if (null !=productDto){
                productOrderVO.setProductName(productDto.getProductName());
                productOrderVO.setProductServicePort(productDto.getProductServicePort());
            }
            return productOrderVO;
        }
        return null;
    }

}
