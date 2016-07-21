package com.niit.shoppingcarttest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcartdao.CategoryDAO;
import com.niit.shoppingcartversionmodel.Category;

public class CategoryTest {
	@SuppressWarnings("resource")
	public static void main(String[]args){
		
		AnnotationConfigApplicationContext context=  new  AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		Category category=(Category)context.getBean("category");
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		
		category.setId("sc001");
		category.setName("scname356");
		category.setDescription("scdes120");
		
		categoryDAO.saveOrUpdate(category);
		}

}
