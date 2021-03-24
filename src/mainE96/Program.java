package mainE96;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesE96.Employees;


public class Program {
       public static void main(String[] args) {
       
    	   Locale.setDefault(Locale.US);
    	   Scanner sc = new Scanner(System.in);
    	   
    	   List<Employees> list = new ArrayList<>();
    	   
           System.out.println("How many employees will be registered? ");
    	   int n = sc.nextInt();
    	   
    	   for(int i=1; i<=n; i++) {
    		    System.out.println("Employee #" + i + ": ");
    		    System.out.println("Name: ");
    		    sc.nextLine();
    		    String name = sc.nextLine();
    		    System.out.println("Salary: ");
    		    double salary = sc.nextDouble();
    		    System.out.println("ID: ");
    		    int id = sc.nextInt();
    		    list.add(new Employees(name, salary, id));
    	     }
    	   
    	   System.out.println("Enter the employees id that will have salary increase: ");
    	   int id = sc.nextInt();
    	   Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    	   
    	   if(emp == null) {
    		    System.out.println("This id do not exisit!");
    	   }
    	   
    	   else {
    		      System.out.println("Enter the percentage: ");
    		      double percentage = sc.nextDouble();
    		      emp.increaseSalary(percentage);
    	   }
    	   System.out.println();
    	   System.out.println("List of employees: ");
    	   for(Employees pp : list) {
    		   System.out.println(pp.toString());
    	   }
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	  sc.close();
       }
}
