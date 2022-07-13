/*7.	En el package actividad03.operaciones.geometricas  crea y programa Operaciones.java con las funciones: */

package actividad03.operaciones.geometricas;

import java.lang.Math;

/* Muestra diferentes operaciones según la función*/

public class Operaciones2 {



	/*7.1.	muestraSeno: que llame a pideDouble para obtener un n�mero con decimales y muestre su seno.*/
	
	public static double muestraSeno (double asr_valor) {
            
            /*Muestra el seno*/
            
		double asr_Resultado=Math.sin(asr_valor);
		

	System.out.println("El resultado del seno es  " + asr_Resultado);
	return asr_Resultado;
	}

	/* 7.2.	muestraCoseno: que llame a pideDouble para obtener un n�mero con decimales y muestre su coseno.*/
	
	public static double muestraCoseno (double asr_valor) {
            
                /*Muestra el coseno*/
                
		double asr_Resultado=Math.cos(asr_valor);
		
		
		System.out.println("El resultado del coseno es  " + asr_Resultado);
		return asr_Resultado;
	} 
	
}
