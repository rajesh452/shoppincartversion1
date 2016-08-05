package com.niit.shoppingcartdao;

import java.util.List;

import com.niit.shoppingcartversionmodel.User;

public interface UserDAO{
	 public List<User> list();
	 public User get(String id);
	 public void saveOrUpdate(User category);
	 public void delete(String id);
	 public List<User>listUser();
}



