package com.pdt.core.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="adt_tour")
public class Tour extends BaseEntity {

	private static final long serialVersionUID = 4534493609310679662L;
	
	private String name;
	private String title;
	
}
