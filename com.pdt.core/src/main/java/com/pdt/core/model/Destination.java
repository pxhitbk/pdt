package com.pdt.core.model;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

@Entity
@Table(name="pdt_destination")
@Cacheable(true)
@Audited
public class Destination extends BaseEntity {

	private static final long serialVersionUID = 4993027253227549715L;
	
	private String name;
	private String detailAddress;
	private String description;

	@Column(nullable=false, updatable=false, insertable=false)
	private Long cityId;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cityId")
	private City city;

	public Destination() {}
	
	public Destination(String name, String detailAddress, City city) {
		super();
		this.name = name;
		this.detailAddress = detailAddress;
		this.city = city;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetailAddress() {
		return detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	public void setCity(City city) {
		this.city = city;
	}
}
