package com.niit.shoppingcarttest;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcartdao.SupplierDAO;
import com.niit.shoppingcartversionmodel.Supplier;

public class SupplierTest {
	
	public static void main(String[]args){
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext c1=  new  AnnotationConfigApplicationContext();
		c1.scan("com.niit");
		c1.refresh();
		
       SupplierDAO supplierDAO = (SupplierDAO)c1.getBean("supplierDAO");
 		
		Supplier supplier =  (Supplier) c1.getBean("supplier");
		supplier.setId("supp001");
		supplier.setName("su356");
		supplier.setAddress("suppdes120");
		
		
		supplierDAO.saveOrUpdate(supplier);

	
	}

}
