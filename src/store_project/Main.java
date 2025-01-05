package store_project;

public class Main {
	public static void main(String[] args) {
		// Create Customers
		Customer customer1 = new Customer("Alice", "123 Main St", "alice@example.com");

		// Create Products
		Product product1 = new Product("Laptop", 1200.00, "High performance laptop");
		Product product2 = new Product("Mouse", 25.00, "Wireless mouse");
		Product product3 = new Product("Keyboard", 50.00, "Mechanical keyboard");

		// Create ShoppingCart and add items
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(product1, 1);
		cart.addItem(product2, 2);
		cart.addItem(product3, 1);

		// Display ShoppingCart items
		System.out.println("Shopping Cart:");
		for (ShoppingCartItem item : cart.getItems()) {
			System.out.println(item.getProduct().getName() + " x " + item.getQuantity());
		}

		// Calculate total
		System.out.println("Total: $" + cart.calculateTotal());

		// Create Order
		Order order = new Order(customer1, cart.getItems());

		// Display Order details
		System.out.println("\nOrder Summary:");
		System.out.println("Customer: " + order.getCustomer().getName());
		System.out.println("Shipping Address: " + order.getCustomer().getShippingAddress());
		System.out.println("Order Items:");
		for (ShoppingCartItem item : order.getItems()) {
			System.out.println(item.getProduct().getName() + " x " + item.getQuantity());
		}
		System.out.println("Total Cost: $" + order.getTotalCost());
	}
}
