package com.dridco.dss.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dridco.dss.dao.UserDao;
import com.dridco.dss.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	private EntityManager manager;
	
	@Override
	public User getById(Long id) {
		return this.manager.createQuery("from User where id = " + id, User.class).getSingleResult();
	}

	@Override
	public List<User> list() {
		return this.manager.createQuery("from User", User.class).getResultList();
	}
	
	@Transactional
	@Override
	public void save(User user) {
		this.manager.persist(user);
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.manager = entityManager;
	}
	
}
