package com.niit.shoppingcartdao;

import java.util.List;

import com.niit.shoppingcartversionmodel.Product;

public interface ProductDAO{
	 public List<Product> list();
	 public Product get(String id);
	 public void saveOrUpdate(Product product);
	 public void delete(String id);
	 public List<Product>listProduct();
}



