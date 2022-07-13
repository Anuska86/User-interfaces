/* 5.	En el package actividad03.operaciones crea y programa Valores.java con las funciones:*/

package actividad03.operaciones;

import java.util.Arrays;
import java.util.Scanner;
import actividad03.introduceDatos.*;
import java.util.Random;

/*Muestra diferentes valores según la función*/

public class Valores {
	
	/* 5.1.	muestraPI : que simplemente muestre por consola el valor del n�mero PI definido en la clase Math*/
	
	public static double muestraPI() {
            
            /* Muestra el valor de PI */
		
		return Math.PI;
		
	} 

	/* 5.2.	muestraValorAbsoluto: que pida un n�mero mediante pideDouble y muestre por consola su valor absoluto.*/
	
    public static double muestraValorAbsoluto() {
        
        /* Muestra el valor absoluto del número introducido por el usuario*/
        
    	double asr_doubleUsuario=Pregunta.pideDouble("Introduzca un n�mero decimal");
    	double asr_valorAbsoluto=Math.abs(asr_doubleUsuario);
    	
    	System.out.println("El valor absoluto es: "+ asr_valorAbsoluto); 
		return Math.abs(asr_valorAbsoluto);
		
	} 

    /*5.3.	muestraValorAleatorio : que pida un n�mero mediante pideEntero
     *  y muestre por consola un n�mero aleatorio entre 0 y el n�mero introducido.*/
    
public static int muestraValorAleatorio() {
    
    /*Muestra un valor aleatorio entre 0 y el número introducido por el usuario*/
    
	int asr_enteroUsuario=Pregunta.pideEntero("Introduzca un n�mero entero");
	Random asr_rand = new Random();
	int asr_n = asr_rand.nextInt(asr_enteroUsuario +1);
	System.out.println("El valor aleatorio es: "+ asr_n); 
	
	return asr_n;
}


}

