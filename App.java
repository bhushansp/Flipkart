package com.te.pro;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.setPid(1);
		cart.setQuantity(3);
		
		Items items = new Items();
		items.setId(1);
		items.setProduct_Name("Nike Shoe");
		items.setPrice(1800);
		
		Items items2 = new Items();
		items2.setId(2);
		items2.setProduct_Name("Facewash");
		items2.setPrice(250);
		
		Items items3 =new Items();
		items3.setId(3);
		items3.setProduct_Name("Mobile");
		items3.setPrice(16500);
		
		Items items4 = new Items();
		items4.setId(5);
		items4.setProduct_Name("Shirts");
		items4.setPrice(450);
		
		Items items5 = new Items();
		items5.setId(6);
		items5.setProduct_Name("Jeans Pant");
		items5.setPrice(950);
		
		List<Items> listOfItems = Arrays.asList(items,items2,items3,items4,items5);
		cart.setItems(listOfItems);
		items.setCart(cart);
		items2.setCart(cart);
		items3.setCart(cart);
		items4.setCart(cart);
		items5.setCart(cart);
		
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("flipkart");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(cart);
		createEntityManager.persist(items);
		createEntityManager.persist(items2);
		createEntityManager.persist(items3);
		createEntityManager.persist(items4);
		createEntityManager.persist(items5);
		transaction.commit();
		
		
		
		
	}
}
