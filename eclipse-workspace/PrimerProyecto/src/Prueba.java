/**
 * Está es la primer aplicación de java en el bootcamp
 * Generation México
 * 2024/09/09
 */
//el nombre que tiene aquí debe ser el mismo del archivo
public class Prueba {
 
	public static void main(String[] args) {
		 //[tipo de dato] [variable]=[valor];
		System.out.println("Hola CH45!!!");
		//conversiones
		byte edad =127;
		short suma = edad;
		int resultado = 96;
		byte otro= (byte) resultado;
		
		long enteroLargo = 567;
		short enteroCorto = (short) enteroLargo;
		
//en este caso el IVA solo lo declara con double porque es decimal, entonces si lo reconoce así, puedo poner f		
		//floa IVA=(float) 0.16;
		float IVA=0.16f;
//por default cualquier número entero escrito en el código es un int
		long km = 13164984654L; //La L hace la conversión a Long
		
//character unicode en un código hexadecimal 
		
		char letraInicial='\u0010';
		
		boolean flag = false; // o true
		flag = (enteroLargo == enteroCorto) && (resultado==otro);
		
		
		
//System.out poniendo el mouse sobre el me dice para que sirve, es una propiedad static y final solo existe una salida estandar, también una salida estándar
		System.out.println(flag);
		
		System.out.println("Hola CH45!!!");
		
//Clase Scanner está en el paquete Java Util, es el que puede convertir tipos primitivos y string utilizando delimitadores, el delimitador por default es el enter
 		
	}//main

}//class Prueba
