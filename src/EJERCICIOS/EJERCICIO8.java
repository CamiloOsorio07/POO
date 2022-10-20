package EJERCICIOS;

import java.util.Scanner;

public class EJERCICIO8 {
	
	public static Scanner keyboard = new Scanner (System.in);

	public static void main(String[] args) {
	    double cont = 0;
	    double numeros = 0;
	    double suma = 0;

	    System.out.println("1.Nota: El programa calcula el promedio de los números positivos introducidos");
	    System.out.println("2.Nota: El programa se detendra si introduce un numero negativo");
	    System.out.println("Introduzca los numeros: ");

	    while (numeros >= 0) {
	      numeros = keyboard.nextInt();
	      cont++;
	      suma += numeros;
	    }
	    
	    System.out.print("El promedio de los numeros positivos introducidos es de: ");
	    System.out.println((suma - numeros) / (cont - 1));
   }
}
