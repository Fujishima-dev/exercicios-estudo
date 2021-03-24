package entitiesE100;

import java.util.Scanner;

public class Program {
       public static void main(String[] args) {
    	   
       Scanner sc = new Scanner(System.in);   
    	   
       System.out.println("Qual numero de linhas: ");
       int n = sc.nextInt();
       
       System.out.println("Qual numero de colunas: ");
       int m = sc.nextInt();
       
       int[][] matriz = new int[n][m];
       
       for(int i=0; i<n; i++) {
    	   for(int j=0; j<m; j++) {
    		   matriz[i][j] = sc.nextInt();
    	   }
       }
       
       System.out.println("Numero da matriz para refer�ncia: ");
       int ref = sc.nextInt();	 
      
       for(int i=0; i<matriz.length; i++) {
    	   for(int j=0; j<matriz[i].length; j++) {
    		   
    		   if(matriz[i][j] == ref) {
    			     System.out.println("Position " + i + ", " + j);
    		   }    		   
    		      if(j > 0) {
    		    	    System.out.println("Left: " + matriz[i][j - 1]);
    		      }
    		      if(i > 0) {
    		    	    System.out.println("Up: " +matriz[i - 1][j]);
    		      }
    	          if(j < matriz[i].length - 1) {
    	        	    System.out.println("Right: " + matriz[i][j + 1]);
    	          }
    		      
    	          if(i < matriz.length - 1) {
    	        	   System.out.println("Down: " + matriz[i + 1][j]);
    	          }
    		      
    	   }
       }
      
       
       
      
    
       
    	sc.close();   
       }
	
}
