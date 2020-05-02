package com.wangzz.wmall.product;

import com.wangzz.wmall.product.hibernate.entity.Product;
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
        Product product = new Product();
        product.setProductName("卫龙大面筋");
        product.setProductDesc("麻辣味长条面筋");
        product.setProductProducePlace("河南省漯河市");

        Product newProduct = productService.createProduct(product);
    }

}
