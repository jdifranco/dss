package com.dridco.dss.solr.repository;

import java.util.Map;

import com.dridco.dss.solr.model.Category;

/**
 * 
 * @author jdifranco
 * 
 */
public class CategoriesRepository {

	private static Category categoriesTree;

	static {

		categoriesTree = new Category(1, "ROOT", null);

		Category business = new Category(10, "Business", categoriesTree);
		business.addSubCategory(new Category(11, "Computer/Internet", business));
		business.addSubCategory(new Category(12, "Employment", business));
		categoriesTree.addSubCategory(business);

		Category fiction = new Category(20, "Fiction", categoriesTree);
		fiction.addSubCategory(new Category(22, "Adventure", fiction));
		fiction.addSubCategory(new Category(21, "General", fiction));
		fiction.addSubCategory(new Category(23, "Horror", fiction));
		fiction.addSubCategory(new Category(24, "SCI-FI", fiction));
		categoriesTree.addSubCategory(fiction);

		Category law = new Category(30, "Law", categoriesTree);
		law.addSubCategory(new Category(31, "Criminal Justice", law));
		law.addSubCategory(new Category(32, "Law", law));
		categoriesTree.addSubCategory(law);

	}

	/**
	 * Not needed.
	 */
	private CategoriesRepository() {

	}

	public static Category getCategoryById(Integer id) {
		return getCategory(categoriesTree.getChildren(), id);
	}

	private static Category getCategory(Map<Integer, Category> categoriesMap, Integer id) {
		
		Category category = categoriesMap.get(id);
		
		if(category == null) {
			for(Category categoryValue : categoriesMap.values()) {
				return getCategory(categoryValue.getChildren(), id);
			}
		}
		
		return category;
	}

}
