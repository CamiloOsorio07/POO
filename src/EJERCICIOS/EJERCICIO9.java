package EJERCICIOS;

import java.util.Scanner;

public class EJERCICIO9 {
	
	public static Scanner keyboard = new Scanner (System.in);

	public static void main(String[] args) {
		
		int numeros = 0;
		int negativos = 0;
	    int positivos = 0;
	    
	    System.out.println("Introduzca 10 números enteros: ");	    
	    for (int i = 0; i < 10; i++) {
	    	numeros = keyboard.nextInt();
	      if (numeros < 0) {
	        negativos++;
	      } else {
	        positivos++;
	      }
	    }  
	    System.out.println("Se introducieron " + positivos + " positivos y " + negativos + " negativos.");
	}
}