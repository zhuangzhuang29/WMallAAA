package com.wangzz.wmall.product.service;


import com.wangzz.wmall.product.mybatis.mapper.IProductMapper;
import com.wangzz.wmall.product.mybatis.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangq on 2020/4/25.
 */
@Service
public class ProductService {
    @Autowired
    IProductMapper iProductMapper;

    public ProductVO createProduct(ProductVO productVO) {
        return iProductMapper.createProduct(productVO);
    }
}
