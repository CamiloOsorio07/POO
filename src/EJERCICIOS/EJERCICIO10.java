package EJERCICIOS;

import java.util.Scanner;

public class EJERCICIO10 {
	
	public static Scanner keyboard = new Scanner (System.in);

	public static void main(String[] args) {
		
	    System.out.print("Introduzca la altura de la pirámide: ");
	    int altusuario = keyboard.nextInt();

	    int altura = 1;
	    int i = 0;
	    int espacios = altusuario - 1;
	    
	    while (altura <= altusuario) {
	      
	      for (i = 1; i <= espacios; i++) {
	        System.out.print(" ");
	      }
	      
	      for (i = 1; i < altura; i++) {
	        System.out.print(i);
	      }
	      
	      for (i = altura; i > 0; i--) {
	        System.out.print(i);
	      }
	      
	      System.out.println();
	      
	      altura++;
	      espacios--;
	    } 
		
	}

}
