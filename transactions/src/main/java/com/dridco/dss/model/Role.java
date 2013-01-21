package com.dridco.dss.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author jdifranco
 * 
 */
@Entity
@Table
public class Role {
	
	@Id
	@GeneratedValue
	@Column
	private Long role;
	
	@Column
	private String name;

	public Long getRole() {
		return role;
	}

	public void setRole(Long role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
