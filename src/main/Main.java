package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;	
import java.util.Scanner;

import entitiess.Employees;
import entitiess.OutSourcedEmployees;

public class Main {
	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    List<Employees> list = new ArrayList<>();
    
    System.out.println("Enter the number of employees: ");
    int n = sc.nextInt();
    
    for(int i=1; i<=n; i++) {
    	System.out.println("Employee #" + i + ": ");
        System.out.println("Outsourced employee (y/n)? ");
        char r = sc.next().charAt(0);
        System.out.println("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Hours: ");
        double horasTrabalhadas = sc.nextDouble();
        System.out.println("Value per Hour: ");
        double valorHora = sc.nextDouble();
        
        if(r == 'y') {
        	 System.out.println("Additional charge: ");
        	 double despesaAdd = sc.nextDouble();
        	 list.add(new OutSourcedEmployees(name, valorHora, horasTrabalhadas, despesaAdd));
        }
        else {
        	 list.add(new Employees(name, valorHora, horasTrabalhadas));
        }
    }
         System.out.println("PAYMENTS: ");
        for(Employees emp : list) {
        	System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.pagamento()));
        }
    
    
    
    
	
	}
  }