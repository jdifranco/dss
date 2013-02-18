package com.dridco.dss.solr.model;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author jdifranco
 * 
 */
public class Category {
	
	private Integer id;
	private String name;
	private Category parent;
	private Map<Integer, Category> children;

	public Category(Integer id, String name, Category parent) {
		this.id = id;
		this.name = name;
		this.parent = parent;
		this.children = new HashMap<Integer, Category>();
	}

	public void addSubCategory(Category subCategory) {
		this.children.put(subCategory.id, subCategory);
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return this.name;
	}

	public Category getParent() {
		return this.parent;
	}

	public Map<Integer, Category> getChildren() {
		return this.children;
	}

	public boolean isRoot() {
		return this.parent == null;
	}
	
	public boolean hasSubCategories() {
		return !this.children.isEmpty();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj == this) {
			return true;
		}
		if(obj instanceof Integer) {
			Integer idToCompare = (Integer) obj;
			return this.id.equals(idToCompare);
		}
		if(obj instanceof Category){
			Category catToCompare = (Category) obj;
			return this.id.equals(catToCompare.id);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int prime = 17;
		return this.id.hashCode() * prime;
	}
	
}
