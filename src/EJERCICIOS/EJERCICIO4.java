package EJERCICIOS;

import java.util.Scanner;

public class EJERCICIO4 {
	
	public static Scanner keyboard = new Scanner (System.in);

	public static void main(String[] args) {
		
		    int dia;

		    System.out.println("Seleccione un numero del 1-7 segun el dia de la semana :");
		    dia = keyboard.nextInt();
		    

		    switch (dia) {
		    case 1:
		      System.out.println("El día seleccionado es LUNES");
		      break;
		    case 2:
		      System.out.println("El día seleccionado es MARTES");
		      break;
		    case 3:
		      System.out.println("El día seleccionado es MIÉRCOLES");
		      break;
		    case 4:
		      System.out.println("El día seleccionado es JUEVES");
		      break;
		    case 5:
		      System.out.println("El día seleccionado es VIERNES");
		      break;
		    case 6:
		      System.out.println("El día seleccionado es SÁBADO");
		      break;
		    case 7:
		      System.out.println("El día seleccionado es DOMINGO");
		      break;
		    default:
			      System.out.println("ERROR: número incorrecto.");
		 }
	}
}
		




