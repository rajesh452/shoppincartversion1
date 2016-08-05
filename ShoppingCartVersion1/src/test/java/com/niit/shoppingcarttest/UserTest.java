package com.niit.shoppingcarttest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcartdao.UserDAO;
import com.niit.shoppingcartversionmodel.User;

public class UserTest {
	@SuppressWarnings("resource")
	public static void main(String[]args){
		
		AnnotationConfigApplicationContext context=  new  AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		User user=(User)context.getBean("user");
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		
		user.setId("sc001");
		user.setName("scname356");
		user.setMail("scdes120");
		user.setMobile("15454");
		user.setAddress("6sjs545");
		userDAO.saveOrUpdate(user);
		}

}
