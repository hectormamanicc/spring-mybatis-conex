package org.mybatis.bu.persistence;

import java.util.List;

import org.mybatis.bu.domain.Category;

public interface CategoryMapper {

  List<Category> getCategoryList();

  Category getCategory(String categoryId);

}
