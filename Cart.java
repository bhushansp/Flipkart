package com.te.pro;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {
	@Id
	private int pid;
	
	private int quantity;
	
	@OneToMany(mappedBy = "cart")
	private List<Items> items;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Cart [pid=" + pid + ", quantity=" + quantity + ", items=" + items + "]";
	}

	
	
	
}
