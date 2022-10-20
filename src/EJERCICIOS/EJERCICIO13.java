package EJERCICIOS;

import java.util.Scanner;

public class EJERCICIO13 {
	
	public static Scanner keyboard = new Scanner (System.in);

	public static void main(String[] args) {
		
		 int[] numero = new int[8];
		    int i;
		    
		    System.out.println("Introduzca 8 números enteros: ");

		    for (i = 0; i < 8; i++) {
		      numero[i] = keyboard.nextInt();
		    }

		    System.out.println();
		    
		    for (i = 0; i < 8; i++) {
		      if (numero[i] % 2 == 0) {
		        System.out.println(numero[i] + " par");
		      } else {
		        System.out.println(numero[i] + " impar");
		      }
		  }
	}

}
