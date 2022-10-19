package EJERCICIOS;

import java.util.Scanner;

public class EJERCICIO6 {
	
	public static Scanner keyboard = new Scanner (System.in);

	public static void main(String[] args) {
		
		int numero, cifra = 0;
	    
	    System.out.print("Introduzca un número entero positivo (5 cifras como máximo): ");
	    numero = keyboard.nextInt();
	    
	    if (numero < 10) {
	      cifra = numero;
	    }
	    
	    if ((numero >= 10) && (numero < 100)) {
	      cifra = numero / 10;
	    }
	    
	    if (( numero >= 100 ) && (numero < 1000)) {
	      cifra = numero / 100;
	    }
	    
	    if ((numero >= 1000) && (numero < 10000)) {
	      cifra = numero / 1000;
	    }
	    
	    if (numero >= 10000) {
	      cifra = numero / 10000;
	    }
	    
	    System.out.println("La primera cifra del número introducido es el " + cifra);
	  }
	}