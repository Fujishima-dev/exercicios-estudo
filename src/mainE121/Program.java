package mainE121;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.enumsE121.OrderStatus;
import entitiesE121.Client;
import entitiesE121.Order;
import entitiesE121.OrderItem;
import entitiesE121.Product;

public class Program {
       public static void main(String [] args) throws ParseException {
    	   
       Scanner sc = new Scanner(System.in);
       Locale.setDefault(Locale.US);
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");      
       SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");	

       
       System.out.println("Enter client data: ");
       System.out.print("Name: ");	   
       String name = sc.nextLine();
       System.out.print("Email: ");
       String email = sc.next();	   
       System.out.print("Birth date (DD/MM/YYYY): ");	   
       Date birthDate = sdf2.parse(sc.next());	   
       Client client = new Client(name, email, birthDate);
       
       Date moment = new Date();
       sdf.format(moment);	   
       System.out.println();
       System.out.println("Enter order data: ");
       System.out.print("Status: ");
       OrderStatus status = OrderStatus.valueOf(sc.next());
       Order order = new Order(moment, status, client);

       
       System.out.println("How many items to this order? ");
       int n = sc.nextInt();
    	
       	for(int i=1; i<=n; i++) {
       		System.out.println("Enter #" + i + " item data: ");
       		System.out.print("Product name: ");
       		String productName = sc.next();
       		System.out.print("Product price: ");
       		double productPrice = sc.nextDouble();
       		double productPriceO = productPrice;
       		
       		Product product = new Product(productName, productPrice);

       		
       		System.out.print("Quantity: ");
       		int quantity = sc.nextInt();
       		OrderItem oI= new OrderItem(quantity, productPriceO, product);
       		order.addItem(oI);
       	}
    	   
    	   System.out.println(order);
    	    
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	sc.close();   
       }
}
