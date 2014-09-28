package com.pdt.core.model;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="pdt_city")
@Cacheable(true)
public class City extends BaseEntity {
	private static final long serialVersionUID = 8556954917632529453L;
	
	private String city;
	private String region;
	private String country;

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
