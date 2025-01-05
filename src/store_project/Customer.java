package store_project;

//Customer.java
public class Customer {
	private String name;
	private String shippingAddress;
	private String email;

	// Constructors
	public Customer(String name, String shippingAddress, String email) {
		this.name = name;
		this.shippingAddress = shippingAddress;
		this.email = email;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
