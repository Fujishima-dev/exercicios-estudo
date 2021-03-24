package mainE131;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesE131.ImportedProduct;
import entitiesE131.Product;
import entitiesE131.UsedProduct;


public class ProgramE131 {
       public static void main(String[] args) {
    	
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
   
       List<Product> list = new ArrayList<>();
       char ch;
       
       System.out.println("Enter the number of products: ");
       int n = sc.nextInt();
       
       for(int i=1; i<=n; i++) {
    	   System.out.println("Prduct #" + i + " data: ");
           do {
    	   System.out.println("Common, used or imported (c/u/i)? ");
             ch = sc.next().charAt(0);
           }while(ch != 'c' & ch != 'u'  & ch != 'i');
           System.out.println("Name: ");
    	   sc.nextLine();
           String name = sc.nextLine();
           System.out.println("Price: ");
           double price = sc.nextDouble();
           
           if(ch == 'i') {
        	     System.out.println("Customs fee: ");
        	     double customsFee = sc.nextDouble();
        	     list.add(new ImportedProduct(name, price, customsFee));
           }
           
           else if(ch == 'u') {
        	       System.out.println("Manufacture date (DD/MM/YYYY): ");
                   sc.nextLine();
        	       String date = sc.nextLine();
                   list.add(new UsedProduct(name, price, date));
           
           }
           
           else if(ch == 'c'){
        	     list.add(new Product(name, price));
           }
           
           else {
        	    System.out.println("Opção inválida!");
           }
           
       }
           System.out.println("PRICE TAGS: ");
           for(Product pro : list) {
        	   System.out.println(pro.priceTag());
           }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       sc.close();
       }
}
