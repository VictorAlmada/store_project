package store_project;

//ShoppingCart.java
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<ShoppingCartItem> items;

	// Constructor
	public ShoppingCart() {
		this.items = new ArrayList<>();
	}

	// Methods to add/remove items
	public void addItem(Product product, int quantity) {
		items.add(new ShoppingCartItem(product, quantity));
	}

	public void removeItem(Product product) {
		items.removeIf(item -> item.getProduct().equals(product));
	}

	public List<ShoppingCartItem> getItems() {
		return items;
	}

	public double calculateTotal() {
		return items.stream().mapToDouble(item -> item.getProduct().getPrice() * item.getQuantity()).sum();
	}
}
