package com.dridco.dss.dao.impl;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.dridco.dss.AppContextTest;
import com.dridco.dss.dao.UserDao;
import com.dridco.dss.model.Role;
import com.dridco.dss.model.User;

/**
 * 
 * @author jdifranco
 *
 */
public class UserDaoImplTest extends AppContextTest {
	
	private UserDao dao;
	
	@Before
	public void setUp() {
		super.setUp();
		
		this.dao = getContext().getBean(UserDao.class);
		
		Assert.assertNotNull(this.dao);
	}
	
	@Test
	public void testUserDaoImpl () {
		
		Assert.assertEquals(0, this.dao.list().size());
		
		List<Role> roles = new ArrayList<Role>();
		Role role = new Role();
		role.setName("admin");
		roles.add(role);
		
		User u = new User();
		u.setName("test1");
		u.setRoles(roles);
		
		this.dao.save(u);
		
		Assert.assertEquals(1, this.dao.list().size());
		
	}
	
}
