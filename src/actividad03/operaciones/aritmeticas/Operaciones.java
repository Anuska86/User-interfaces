/*6.	En el package actividad03.operaciones.aritmeticas  crea y programa Operaciones.java con las funciones:*/

package actividad03.operaciones.aritmeticas;

import java.lang.Math;

/* Muestra diferentes operaciones según la función*/
public class Operaciones {

	/*
	 * 6.1. muestraLogaritmo(double) : que muestre el logaritmo en base E del
	 * par�metro.
	 */

	public static double muestraLogaritmo(double asr_valor) {
            
            /* Muestra el logatirmo en base E*/
            
		double asr_Resultado = Math.log(asr_valor);

		System.out.println("El resultado del logaritmo es  " + asr_Resultado);
		return asr_Resultado;
	}

	/*
	 * 6.2. calculaPotencia(double,double) que muestre el resultado de elevar el
	 * primer par�metro al segundo utilizando la funci�n pow de la clase Math.
	 */

	public static double calculaPotencia(double asr_valor1, double asr_valor2) {
            
             /*Muestra la potencia de un número elevado a otro */
             
		double asr_Resultado = Math.pow(asr_valor1, asr_valor2);

		System.out.println("El resultado de elevar el primer par�mtro al segundo es " + asr_Resultado);
		return asr_Resultado;

	}

}
