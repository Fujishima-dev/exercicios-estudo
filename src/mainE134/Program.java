package mainE134;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesE134.Pessoa;
import entitiesE134.PessoaFisica;
import entitiesE134.PessoaJuridica;

public class Program {
       public static void main(String[] args) {
    	
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
    
       List<Pessoa> list = new ArrayList<>();
       
       System.out.println("Enter the number of tax payers: ");
       int n = sc.nextInt();
    	   
       for(int i=1; i<=n; i++) {
    	   System.out.println("Tax payer #" + i + " data:");
    	   System.out.println("Individual or company (i/c)? ");
           char ch = sc.next().charAt(0);
           System.out.println("Name: ");
           sc.nextLine();
           String nome = sc.nextLine();
           System.out.println("Anual income: ");
           double rendaAnual = sc.nextDouble();
           
           if(ch == 'i') {
        	    System.out.println("Health expenditures: ");
        	    double gastoSaude = sc.nextDouble();
        	    list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
           }
           else if(ch == 'c') {
        	    System.out.println("Number of employers: ");
                int nFuncionarios = sc.nextInt();
                list.add(new PessoaJuridica(nome, rendaAnual, nFuncionarios));
           }
       }    
        
           double total = 0;
           System.out.println("TAXES PAID: ");
           for(Pessoa pp : list) {
        	    double tax = pp.pagImposto();
        	    System.out.println(pp.results());
        	    total += tax;
           }
           
           System.out.println();
    	   System.out.println("TOTAL TAXES: " + String.format("%.2f", total));
    	   
    	   
    	   
    	   
    	   
    	   
    sc.close();	   
       }
}
