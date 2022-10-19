package EJERCICIOS;

import java.util.Scanner;

public class EJERCICIO12 {
	
	public static Scanner keyboard = new Scanner (System.in);

	public static void main(String[] args) {
		
		int[] n = new int[10];
	    int i;
	    
	    System.out.println("Introduzca 10 números enteros.");

	    for (i = 0; i < 10; i++) {
	      n[i] = keyboard.nextInt();
	    }
	    
	    System.out.println("\nEl orden inverso es el siguiente: ");
	    for (i = 9; i >= 0; i--) {
	      System.out.println(n[i]);
	    }
	}
}