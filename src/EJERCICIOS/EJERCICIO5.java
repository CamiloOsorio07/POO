package EJERCICIOS;

import java.util.Scanner;

public class EJERCICIO5 {
	
	public static Scanner keyboard = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int a, b, c;
		
		System.out.println("Escriba el valor de a:");
		a = keyboard.nextInt();
		System.out.println("Escriba el valor de b:");
		b = keyboard.nextInt();
		System.out.println("Escriba el valor de c:");
		c = keyboard.nextInt();
		
		System.out.println("En desorden: "+a+", "+b+" y "+c);
		
		System.out.println("Los numeros odenados de menor a mayor son: ");
		if(a<b && b<c) 
		{
			System.out.println(a+", "+b+"y "+c);
		}
		else if(a<c && c<b) 
		{
			 System.out.println(a+", "+c+"y "+b);
		}
		else if(b<a && a<c) 
		{
			System.out.println(b+", "+a+"y "+c);
		}
		else if(b<c && c<a) 
		{
			System.out.println(b+", "+c+"y "+a);
		}
		else if(c<a && a<b) 
		{
			System.out.println(c+", "+a+"y "+b);
		}
		else 
		{
			System.out.println(a+", "+b+"y "+c);
		}
	}

}
