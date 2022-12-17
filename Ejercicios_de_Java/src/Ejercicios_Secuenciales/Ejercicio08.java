//Crear un programa que este pidiendo numeros enteros.
//Cuando un cero de haya introducido, finalizara la captura de taos.
//Sumar los numeros y mostrar la suma en pantalla.
package Ejercicios_Secuenciales;
import java.util.Scanner;
public class Ejercicio08 {
	
	public static void main(String [] args) 
	{
    int num = 0, suma=0;
    Scanner sc = new Scanner(System.in);
    do 
    {
     System.out.println("Introduce un numero : ");
     num = sc.nextInt();
     suma = suma+num;
    
    }while(num!= 0);
    System.out.println("La suma de todos los numeros es : "+suma);
    
	}
}

