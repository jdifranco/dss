package com.dridco.dss;

import junit.framework.Assert;

import org.junit.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppContextTest {
	
	private AnnotationConfigApplicationContext context;
	
	@Before
	public void setUp() {
		context = new AnnotationConfigApplicationContext(
				AppContext.class);
		Assert.assertNotNull(context);
	}
	
	public AnnotationConfigApplicationContext getContext() {
		return context;
	}

}
