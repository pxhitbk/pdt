package com.pdt.core.model;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="assType")
@Cacheable(true)
public abstract class TourAssociation extends BaseEntity {
	private static final long serialVersionUID = -3905723912349768508L;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="tourId")
	private Tour tour;
	@Column(nullable=false, insertable=false, updatable=false)
	private long tourId;
	
	public TourAssociation(final Tour tour) {
		super();
		this.tour = tour;
	}
	public long getTourId() {
		return tourId;
	}

	public void setTour(Tour newTour) {
		this.tour = newTour;
		tourId = newTour.getId();
	}
}
