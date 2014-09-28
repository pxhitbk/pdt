package com.pdt.core.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="pdt_articles")
public class Articles extends BaseEntity {
	private static final long serialVersionUID = 1771888439559007889L;

	private String title;
	private String author;
	private String lead;
	private String content;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getLead() {
		return lead;
	}
	public void setLead(String lead) {
		this.lead = lead;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
