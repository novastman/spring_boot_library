package com.krgt.library.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String author;
	private BigDecimal price;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public Book() {
		super();
	}
}
