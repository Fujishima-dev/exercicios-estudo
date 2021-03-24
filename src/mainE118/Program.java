package mainE118;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.enumsE118.WorkerLevel;
import entitiesE118.Department;
import entitiesE118.HourContract;
import entitiesE118.Worker;

public class Program {
       public static void main(String [] args) throws ParseException {
    	      
    	   Scanner sc = new Scanner(System.in);
    	   Locale.setDefault(Locale.US);
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");    	   
    	   
           System.out.print("Enter department's name: ");
           String department = sc.nextLine();
           System.out.println("Enter worker data: ");
           System.out.print("Name: ");
           String name = sc.nextLine();
           System.out.print("Level: ");
           String level = sc.nextLine();
           System.out.print("Base salary: ");
           double baseSalary = sc.nextDouble();
           Worker worker = new Worker(new Department(department), name, WorkerLevel.valueOf(level), baseSalary);
           
           System.out.println();
           System.out.print("How many contracts to this worker? ");
           int n = sc.nextInt();
           for(int i=1; i<=n; i++) {
        	   System.out.println("Enter contract #" + i + " data: ");
               System.out.print("Date (DD/MM/YYYY): ");
               Date contractDate = sdf.parse(sc.next());
               System.out.print("Value per hour: ");
               double valuePerHour = sc.nextDouble();
               System.out.print("Duration (hours): ");
               int hours = sc.nextInt();
               HourContract contracts = new HourContract(contractDate, valuePerHour, hours);
               worker.addContract(contracts);
           }
       
           System.out.print("Enter the month and year to calculate the income (MM/YYYY): ");
           String monthAndYear = sc.next();
           int month = Integer.parseInt(monthAndYear.substring(0,2));
           int year = Integer.parseInt(monthAndYear.substring(3));      
           System.out.print("Name:" + worker.getName());
           System.out.print("Department: " + worker.getDepartment().getName());
           System.out.print("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
       
       
       sc.close();
       }
}
