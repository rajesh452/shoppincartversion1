package com.niit.shoppingcartdao;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcartversionmodel.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}
	
      
	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Category category) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(category);
		
	}
	@Transactional
	public void delete(String id) {
		// TODO Auto-generated method stub
		Category CategoryToDelete = new Category();
		CategoryToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(CategoryToDelete);
		
	}
	@Transactional
	public List<Category> listCategory() {
		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>) sessionFactory.getCurrentSession().createCriteria(Category.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listCategory;
	}
	
	
	
@Transactional
	public Category get(String id) {
		String hql = "from Category where id=" + "'" + id + "'";
		Query query =sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Category> listCategory =query.list();

		if (listCategory != null && !listCategory.isEmpty()) {
			return listCategory.get(0);
		}
	
		// TODO Auto-generated method stub
		return null;
	}
}
