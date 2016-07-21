package com.niit.shoppingcartdao;

import java.util.List;

import com.niit.shoppingcartversionmodel.Category;

public interface CategoryDAO{
	 public List<Category> list();
	 public Category get(String id);
	 public void saveOrUpdate(Category category);
	 public void delete(String id);
	 public List<Category>listCategory();
}



