package com.dridco.dss.dao;

import java.util.List;

import com.dridco.dss.model.User;

/**
 * 
 * @author jdifranco
 *
 */
public interface UserDao {
	
	User getById(Long id);
	
	List<User> list();
	
	void save(User user);
	
}
