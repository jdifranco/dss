package com.dridco.dss.solr.repository;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author jdifranco
 * 
 */
public class CategoriesRepositoryTest {

	@Test
	public void testGetCategoryWithExistentCategory() {
		Assert.assertNotNull(CategoriesRepository.getCategoryById(22));
	}

	@Test
	public void testGetCategoryWithInexistentCategory() {
		Assert.assertNull(CategoriesRepository.getCategoryById(9999));
	}

}
