/* 4.	En el package actividad03.operaciones crea y programa OperacionesLinkia.java con las funciones:
4.1.	convertirLinkiaCoins() que pida mediante pideDouble un valor num�rico con decimales y muestre  el valor 
num�rico introducido multiplicado por 1,5.
 */

package actividad03.operaciones;

import java.util.Scanner;

import actividad03.introduceDatos.Pregunta;

/* Gestiona la conversiçon de valores a LinkiaCoins*/

public class OperacionesLinkia {
    
    /* Convierte el valor decimal introducido por el usuario a LinkiaCoins */

	public static double convertirLinkiaCoins() {
		double asr_LinkiaCoins = 0.0;
		double asr_valorUsuario = Pregunta.pideDouble("Inserta un valor decimal");

		asr_LinkiaCoins = asr_valorUsuario * 1.5;

		System.out.println("Tus Linkia Coins son " + asr_LinkiaCoins);

		return asr_LinkiaCoins;
	}
}