/*2.	En el package actividad03.introduceDatos crea y programa Pregunta.java: crea las funciones 
 *  int pideEntero(String pregunta)  y double pideDouble (String pregunta) encargadas de mostrar por 
 *  consola la pregunta pasada como par�metro, pedir un n�mero por consola (si el usuario no introduce un valor
 *   correcto ha de volver a pedir el valor hasta que el usuario introduzca
 * un valor correcto) y retornar el n�mero introducido como un int o double. */

package actividad03.introduceDatos;

import java.util.Scanner;

/*Gestiona la petición de números al usuario, tanto enteros como decimales*/
public class Pregunta {

	/* Pide un valor entero al usuario por consola*/
	
	public static int pideEntero(String pregunta) {
	boolean asr_Bandera=true; 
	int asr_eleccionUsuarioent = 0;
	
	while (asr_Bandera) {
	System.out.println(pregunta);
	
	try {
	Scanner asr_eleccionUsuario= new Scanner(System.in) ; 
	asr_eleccionUsuarioent = Integer.parseInt(asr_eleccionUsuario.nextLine());
	asr_Bandera=false; 
	System.out.println("El valor elegido es "+asr_eleccionUsuarioent); 
		
	} 
	catch (NumberFormatException ex){
    	System.out.println("Por favor introduzca un n�mero entero"); 
        //ex.printStackTrace();
	
	}
	
}
	
	return asr_eleccionUsuarioent; 
	
 }

        /* Pide un valor decimal al usuario por consola*/
        
        public static double pideDouble(String pregunta) {
	boolean asr_Bandera=true; 
	double asr_eleccionUsuariodec = 0.0;
	
	while (asr_Bandera) {
	System.out.println(pregunta);
	
	try {
	Scanner asr_eleccionUsuario= new Scanner(System.in); 
	asr_eleccionUsuariodec = Double.parseDouble(asr_eleccionUsuario.nextLine());
	asr_Bandera=false; 
	System.out.println("El valor elegido es "+asr_eleccionUsuariodec); 
		
	} 
	catch (NumberFormatException ex){
    	System.out.println("Por favor introduzca un n�mero decimal"); 
        // ex.printStackTrace();
	
	}
	
}
	
	return asr_eleccionUsuariodec; 
	
 }



}
