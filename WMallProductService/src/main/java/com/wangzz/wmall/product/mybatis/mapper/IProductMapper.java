package com.wangzz.wmall.product.mybatis.mapper;


import com.wangzz.wmall.product.mybatis.vo.ProductVO;
import org.apache.ibatis.annotations.Param;

/**
 * Created by wangq on 2020/4/25.
 */
public interface IProductMapper {
    ProductVO createProduct(@Param("productVO") ProductVO productVO);
}
