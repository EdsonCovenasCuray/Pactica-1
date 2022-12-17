//Programa que lee por teclado el valor del radio de una 
//circunferencia y calcula y muestra por pantalla 
//la longitud y el área de la circunferencia. 
package Ejercicios_Secuenciales;
import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) 

{
		Scanner sc = new Scanner(System.in);
		double radio;
		double longitud;
		double area;
		
		System.out.println("Introduce el radio de la circunferencia : ");
		radio = sc.nextDouble();
		area = calculaArea(radio);
		System.out.println("Area de la circunferencia : "+area);
		longitud = calculaLongitud(radio);
		System.out.println("La longitud de la circunferencia es : "+longitud);
	}
	public static double calculaArea(double r)
	{
		double a;
		
		a= Math.PI * Math.pow(r, 2);
		
		return a;
	}
	public static double calculaLongitud(double r)
	{
	double l;
	
	l = 2 * Math.PI * r;
	
	return l; 
	
	}
	}


