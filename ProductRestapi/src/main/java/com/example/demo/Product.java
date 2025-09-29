package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int productId;
	
	@Column
	String productName;
	
	@Column
	String producttype;
	
	@Column
	int category_id;
	
	@Column
	int price;
	
	@Column
	int stock;

	public Product() {
		
	}

	public Product(int productId, String productName, String productttype, int category_id, int price, int stock) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.producttype = productttype;
		this.category_id = category_id;
		this.price = price;
		this.stock = stock;
	}

	public Product(String productName, String productttype, int category_id, int price, int stock) {
		super();
		this.productName = productName;
		this.producttype = productttype;
		this.category_id = category_id;
		this.price = price;
		this.stock = stock;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductttype() {
		return producttype;
	}

	public void setProductttype(String productttype) {
		this.producttype = productttype;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", producttype=" + producttype
				+ ", category_id=" + category_id + ", price=" + price + ", stock=" + stock + "]";
	}

}