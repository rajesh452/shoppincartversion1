package com.niit.shoppingcarttest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcartdao.ProductDAO;
import com.niit.shoppingcartversionmodel.Product;

public class ProductTest {
	@SuppressWarnings("resource")
	public static void main(String[]args){
		
		AnnotationConfigApplicationContext context=  new  AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		Product product=(Product)context.getBean("product");
		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
		
		product.setId("pc001");
		product.setName("pcname356");
		product.setDescription("pcdes120");
		product.setPrice("200");
		productDAO.saveOrUpdate(product);
		}

}
