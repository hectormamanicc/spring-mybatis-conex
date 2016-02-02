package org.mybatis.bu.persistence;

import java.util.List;

import org.mybatis.bu.domain.Product;

public interface ProductMapper {

  List<Product> getProductListByCategory(String categoryId);

  Product getProduct(String productId);

  List<Product> searchProductList(String keywords);

}
