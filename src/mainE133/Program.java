package mainE133;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.Color;
import entitiesE133.Rectangle;
import entitiesE133.Shape;
import entitiesE133.Circle;

public class Program {
       public static void main(String[] args) {
    	   
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
    
       List<Shape> list = new ArrayList<>();
       
       System.out.println("Enter the number of shapes: ");
       int n = sc.nextInt();

       for(int i=1; i<=n; i++) {
    	   System.out.println("Shape #" + i + " data:");
           System.out.println("Rectangle or circle (r/c)? ");
           char ch = sc.next().charAt(0);
           System.out.println("Color (Black/Blue/Red): ");
           Color color = Color.valueOf(sc.next());
           if(ch == 'r') {
        	    System.out.println("Width: ");
        	    double width = sc.nextDouble();
        	    System.out.println("Hight: ");	
        	    double height = sc.nextDouble();
                list.add(new Rectangle(color, height, width));
           }
           if(ch == 'c') {
        	   System.out.println("Radius: ");
        	   double radius = sc.nextDouble();
        	   list.add(new Circle(color, radius));
           }
       }
           System.out.println("SHAPES AREAS: ");
           
           for(Shape forms : list) {
        	   System.out.println(String.format("%.2f", forms.area()));
           }
           
           
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       sc.close();
       }
}
