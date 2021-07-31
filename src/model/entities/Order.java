package model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public List<OrderItem> getItems() {
		return items;
	}
	
	public void addItem(OrderItem orderItem) {
		this.items.add(orderItem);
	}
	
	public void removerItem(OrderItem orderItem) {
		this.items.remove(orderItem);
	}

	public double total() {
		double sum = 0;
		for(OrderItem oi : this.items) {
			sum += oi.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(this.moment) + "\n");
		sb.append("Order status: ");
		sb.append(this.status + "\n");
		sb.append("Client: ");
		sb.append(this.client);
		sb.append("\nOrder Items: \n");
		for(OrderItem oi : this.items) {
			sb.append(oi + "\n");
		}
		sb.append("Total price: ");
		sb.append(String.format("%.2f", this.total()));
		return sb.toString();
	}
}
