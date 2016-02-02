package org.mybatis.bu.service;

import java.util.List;

import org.mybatis.bu.domain.Category;
import org.mybatis.bu.domain.Item;
import org.mybatis.bu.domain.Product;
import org.mybatis.bu.persistence.CategoryMapper;
import org.mybatis.bu.persistence.ItemMapper;
import org.mybatis.bu.persistence.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {

  @Autowired
  private CategoryMapper categoryMapper;
  @Autowired
  private ItemMapper itemMapper;
  @Autowired
  private ProductMapper productMapper;

  public List<Category> getCategoryList() {
    return categoryMapper.getCategoryList();
  }

  public Category getCategory(String categoryId) {
    return categoryMapper.getCategory(categoryId);
  }

  public Product getProduct(String productId) {
    return productMapper.getProduct(productId);
  }
private String x;
  public List<Product> getProductListByCategory(String categoryId) {
       this.x = categoryId.trim();
    System.out.println(x+" dawd");
    return productMapper.getProductListByCategory(categoryId);
  
  }

  // TODO enable using more than one keyword
  public List<Product> searchProductList(String keyword) {
    return productMapper.searchProductList("%" + keyword.toLowerCase() + "%");
  }

  public List<Item> getItemListByProduct(String productId) {
    return itemMapper.getItemListByProduct(productId);
  }

  public Item getItem(String itemId) {
    return itemMapper.getItem(itemId);
  }

  public boolean isItemInStock(String itemId) {
    return itemMapper.getInventoryQuantity(itemId) > 0;
  }
}