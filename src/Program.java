import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.OrderStatus;

public class Program {
       public static void main(String[] args) {
    
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
       
       OrderStatus os1 = OrderStatus.PENDING_PAYMENT;
       
       OrderStatus os2;
       
      
      
    	  os2 = OrderStatus.valueOf("PENDING_PAYMENT");
       

       
       
       
       
       System.out.println(os1);
       
       System.out.println(os2);
       
       
       
       
       
       
       
       
       
       }
}