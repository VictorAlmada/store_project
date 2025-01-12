package store_project;

//ShoppingCartItem.java
public class ShoppingCartItem {
	private Product product;
	private int quantity;

	// Constructors
	public ShoppingCartItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	// Getters and Setters
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}