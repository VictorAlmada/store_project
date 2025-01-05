package store_project;

//Order.java
import java.util.List;

public class Order {
	private Customer customer;
	private List<ShoppingCartItem> items;
	private double totalCost;

	// Constructor
	public Order(Customer customer, List<ShoppingCartItem> items) {
		this.customer = customer;
		this.items = items;
		this.totalCost = items.stream().mapToDouble(item -> item.getProduct().getPrice() * item.getQuantity()).sum();
	}

	// Getters
	public Customer getCustomer() {
		return customer;
	}

	public List<ShoppingCartItem> getItems() {
		return items;
	}

	public double getTotalCost() {
		return totalCost;
	}
}
