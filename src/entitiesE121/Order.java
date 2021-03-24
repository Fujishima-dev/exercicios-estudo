package entitiesE121;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enumsE121.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> oI = new ArrayList<>();
	
	public Order() {
		
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

	public List<OrderItem> getoI() {
		return oI;
	}
	
	public void addItem(OrderItem item) {
		   oI.add(item);
	}
	
	public void removeItem(OrderItem item) {
		   oI.remove(item);
	}
	
	public double total() {
		    double sum = 0;
		    for(OrderItem oo : oI) {
		    	sum += oo.subTotal();
		    }
	  return sum;
	}
	
	public String toString() {
	       StringBuilder sb = new StringBuilder();
	       sb.append("ORDER SUMMARY: \n");
	       sb.append("Order moment: " );
	       sb.append(moment + "\n");
	       sb.append("Order status: ");
	       sb.append(status + "\n");
	       sb.append("Client: ");
	       sb.append(client.getName());
	       sb.append(client.getBirthDate());
	       sb.append(" - ");
	       sb.append(client.getEmail() + "\n");
	       sb.append("Order items: ");
	       for(OrderItem oo : oI) {
	    	   sb.append("\n" + oo.getProduct().getProductName());
	    	   sb.append(", $");
	    	   sb.append(String.format("%.2f", oo.getProduct().getProductPrice()));
	    	   sb.append(", Quantity: ");
	    	   sb.append(oo.getQuantity()); 
	    	   sb.append(", Subtotal: $"); 
	    	   sb.append(String.format("%.2f", oo.subTotal()));
	       }
           sb.append("\nTotal price: $"); 
           sb.append(String.format("%.2f", total()));
	       return sb.toString();
	} 
	
}
