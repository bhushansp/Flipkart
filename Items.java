package com.te.pro;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Items {
	@Id
	private int id;
	private String Product_Name;
	private double price;
	
	@ManyToOne
	private Cart cart;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct_Name() {
		return Product_Name;
	}

	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", Product_Name=" + Product_Name + ", price=" + price + ", cart=" + cart + "]";
	}

	
	
	

	
}
