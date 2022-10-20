package EJERCICIOS;

import java.util.Scanner;

public class EJERCICIO3 {
	
	public static Scanner keyboard = new Scanner (System.in);

	public static void main(String[] args) {
		
		double base, total, ivaporc, ivaT;
		
		System.out.print("Introduzca la cantidad base: ");                                          
        base = keyboard.nextDouble();

        System.out.print("Introduzca %IVA: ");
        ivaporc = keyboard.nextDouble();

        ivaT = base * ivaporc / 100;
        
        total = base+ivaT;

        System.out.println("El precio base sin IVA es: " +base+", El IVA es de: "+ivaT+" y el total es: "+total); 
	 
	
	    }
	 
	}

