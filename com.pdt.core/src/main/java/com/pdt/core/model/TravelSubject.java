package com.pdt.core.model;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Cacheable(true)
@Table(name = "pdt_travelsubject")
public class TravelSubject extends BaseEntity {
	private static final long serialVersionUID = -8973856402562950930L;

	private String name;
	private String description;

	public TravelSubject() {
	}

	public TravelSubject(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
