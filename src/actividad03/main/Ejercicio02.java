/*  3.	En el package actividad03.main crea Ejercicio02.java: a�ade el c�digo que muestre por
 *  consola un  men� para ejecutar cualquiera de las funciones definidas en el resto del documento. 
 *  Ten en cuenta que se debe pedir al usuario el n�mero de funci�n a ejecutar mediante la funci�n pideEntero 
 *  creada anteriormente. El programa solo debe finalizar cuando el usuario indique que no quiere realizar 
 *  ninguna otra operaci�n.*/

package actividad03.main;

import java.util.Scanner;
import actividad03.introduceDatos.Pregunta;
import actividad03.operaciones.*;
import actividad03.operaciones.aritmeticas.Operaciones;
import actividad03.operaciones.geometricas.Operaciones2;

/*Inicia el programa*/

public class Ejercicio02 {

	public static void main(String[] args) {
		int asr_seleccion = 0;

		do {
			System.out.println("Introduzca la operaci�n a realizar del siguiente men� de opciones: \n"
					+ "1- Mostrar Linkia Coins.  \n" 
					+ "2- Muestra el valor de Pi. \n"
					+ "3- Muestra el valor absoluto. \n"
					+ "4- Muestra un valor aleatorio entre 0 y el n�mero escogido. \n"
					+ "5- Mostrar logaritmo en base E. \n" + "6- Mostrar potencia \n" 
					+ "7- Mostrar seno \n"
					+ "8- Mostrar coseno \n"
					+ "0- Finalizar");

			try {
				asr_seleccion = Pregunta.pideEntero("Elige una opci�n");
			} catch (NumberFormatException ex) {
				System.out.println("Introduzca �nicamente valores entre 0 y 8");
				ex.printStackTrace();
			}

			switch (asr_seleccion) {

			case 1:
				
				OperacionesLinkia.convertirLinkiaCoins();

				break;

			case 2:
				
				double asr_pi = Valores.muestraPI();
				System.out.println("El valor de pi es: " + asr_pi);

				break;

			case 3:
				
				Valores.muestraValorAbsoluto();
			
				break;

			case 4:
				
				Valores.muestraValorAleatorio();
				
				break;

			case 5:

				Operaciones.muestraLogaritmo(3);

				break;

			case 6:
				
				Operaciones.calculaPotencia(2, 3);

				break;

			case 7:

				Operaciones2.muestraSeno(1);

				break;

			case 8:

				Operaciones2.muestraCoseno(1);

				break;
			}

		} while (asr_seleccion != 0);

		System.out.println("El programa ha finalizado");
	}

	
}