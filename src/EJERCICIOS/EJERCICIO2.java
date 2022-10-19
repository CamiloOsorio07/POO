package EJERCICIOS;

import java.util.Scanner;

public class EJERCICIO2 {
	
	public static Scanner keyboard = new Scanner (System.in);

	public static void main(String[] args) {
		
		double peso, dolar;
		
		System.out.println("Escriba el valor en pesos");
		peso = keyboard.nextDouble();
		dolar=peso/3895;
		
		System.out.println("El valor en dolares es: " + dolar);

	}

}
