package com.pdt.core.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="adt_tour")
public class Tour extends BaseEntity {

	private static final long serialVersionUID = 4534493609310679662L;
	
	private String name;
	private String description;
	private int mintDay;
	private int minNight;
	private int maxDay;
	private int maxNight;
	private Date beginDate;
	private Date endDate;
	private double fromPrice;
	private double toPrice;
	private PriceUnit priceUnit;
	private AvailableState availableState;
	private SessionType sessionType;
	private RegionType regionType;
	private Priority priority;
	private Articles articles;
	
	public Tour() {}
	
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
	public int getMintDay() {
		return mintDay;
	}
	public void setMintDay(int mintDay) {
		this.mintDay = mintDay;
	}
	public int getMinNight() {
		return minNight;
	}
	public void setMinNight(int minNight) {
		this.minNight = minNight;
	}
	public int getMaxDay() {
		return maxDay;
	}
	public void setMaxDay(int maxDay) {
		this.maxDay = maxDay;
	}
	public int getMaxNight() {
		return maxNight;
	}
	public void setMaxNight(int maxNight) {
		this.maxNight = maxNight;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public double getFromPrice() {
		return fromPrice;
	}
	public void setFromPrice(double fromPrice) {
		this.fromPrice = fromPrice;
	}
	public double getToPrice() {
		return toPrice;
	}
	public void setToPrice(double toPrice) {
		this.toPrice = toPrice;
	}

	public PriceUnit getPriceUnit() {
		return priceUnit;
	}
	public void setPriceUnit(PriceUnit priceUnit) {
		this.priceUnit = priceUnit;
	}
	public AvailableState getAvailableState() {
		return availableState;
	}
	public void setAvailableState(AvailableState availableState) {
		this.availableState = availableState;
	}
	public SessionType getSessionType() {
		return sessionType;
	}
	public void setSessionType(SessionType sessionType) {
		this.sessionType = sessionType;
	}
	public RegionType getRegionType() {
		return regionType;
	}
	public void setRegionType(RegionType regionType) {
		this.regionType = regionType;
	}
	public Articles getArticles() {
		return articles;
	}
	public void setArticles(Articles articles) {
		this.articles = articles;
	}
	/**
	 * @return the priority
	 */
	public Priority getPriority() {
		return priority;
	}
	/**
	 * @param priority the priority to set
	 */
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
}
