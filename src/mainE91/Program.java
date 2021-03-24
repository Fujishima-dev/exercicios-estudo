package mainE91;

import java.util.Locale;
import java.util.Scanner;

import entitiesE91.Student;

public class Program {
       public static void main(String[] args) {
    
    	   Locale.setDefault(Locale.US);
    	   Scanner sc = new Scanner(System.in);
    	   
    	   System.out.println("Hoy many rooms will be rented? ");
    	   int n = sc.nextInt(); 
    	   
    	   Student[] vect = new Student[n];
    	   
    	   for(int i=0; i<n; i++) {
    		   System.out.println("Rent #" + i + ": ");
    		   System.out.println("Name: ");
    		   sc.nextLine();
    		   String name = sc.nextLine();
    		   System.out.println("Email: ");
    		   String email = sc.nextLine();
    		   System.out.println("Room: ");
    		   int room = sc.nextInt();
    		   vect[i] = new Student(name, email, room);
    	   }
    	   
    	       for(Student hotel : vect) {
    	    	   System.out.println(hotel.toString());
    	       }
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   sc.close();
       }
}
