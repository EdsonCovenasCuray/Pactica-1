//Programa que pase una velocidad en Km/h a m/s. 
//La velocidad se lee por teclado.
package Ejercicios_Secuenciales;
import static java.lang.System.out;
import java.util.Scanner;


public class Ejercicio05 {
	public static void main(String[]args){

		double velocidad1,velocidad2;
		Scanner x = new Scanner(System.in);
		out.println("ingrese la velocidad en Km/h");
		velocidad1 = x.nextDouble();
		out.println("convirtiendo a metros.....");
		velocidad2 = velocidad1*1000;
		out.println(velocidad2);

		}

}
