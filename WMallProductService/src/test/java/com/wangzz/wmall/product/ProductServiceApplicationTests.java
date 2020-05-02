package com.wangzz.wmall.product;

import com.wangzz.wmall.product.mybatis.vo.ProductVO;
import com.wangzz.wmall.product.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductServiceApplicationTests {

    @Autowired
    ProductService productService;

    @Test
    void contextLoads() {

        ProductVO productVO = new ProductVO();

        productVO.setProductName("卫龙大面筋");
        productVO.setProductDesc("麻辣味长条面筋");
        productVO.setProductProducePlace("河南省漯河市");

        ProductVO newProduct = productService.createProduct(productVO);
    }

}
