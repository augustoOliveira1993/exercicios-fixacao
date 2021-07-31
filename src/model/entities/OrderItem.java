package model.entities;

public class OrderItem {
	
	private Integer quatity;
	private Double price;
	
	private Product product;
	
	public OrderItem() {
		// TODO Auto-generated constructor stub
	}

	public OrderItem(Integer quatity, Double price, Product product) {
		this.quatity = quatity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuatity() {
		return quatity;
	}

	public void setQuatity(Integer quatity) {
		this.quatity = quatity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subTotal() {
		return this.quatity * this.price;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.product.getName());
		sb.append(", $");
		sb.append(String.format("%.2f", this.price));
		sb.append(", Quantity: ");
		sb.append(this.quatity);
		sb.append(", Subtotal: $");
		sb.append(String.format("%.2f", this.subTotal()));
		return sb.toString();
	}
}
