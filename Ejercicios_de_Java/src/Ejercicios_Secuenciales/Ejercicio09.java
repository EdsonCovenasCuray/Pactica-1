//Crear programa que muestra el producto de los primeros 10 numeros impares.
//Primero 10 numeros impares: 1,3,5,7,9,11,13,15,17,19.
package Ejercicios_Secuenciales;
import java.util.Scanner;
public class Ejercicio09 {
       
	public static void main(String[]args) 
	{
    long productoImpares = 1;
    for(int i=1;i<20;i+=2)
    {
	      productoImpares = productoImpares*i;
    }
           System.out.println("El resultado de multiplicar los primeros 10 numeros impares es : "+productoImpares);
	
	
	
	}
}
