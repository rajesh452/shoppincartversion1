package com.niit.shoppingcartdao;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcartversionmodel.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}
	
      
	@Autowired
	private SessionFactory sessionFactory;

	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		
	}
	@Transactional
	public void delete(String id) {
		// TODO Auto-generated method stub
		User UserToDelete = new User();
		UserToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(UserToDelete);
		
	}
	@Transactional
	public List<User> listUser() {
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUser;
	}
	
	
	
@Transactional
	public User get(String id) {
		String hql = "from User where id=" + "'" + id + "'";
		Query query =sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> listUser =query.list();

		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		}
	
		// TODO Auto-generated method stub
		return null;
	}
}
