//Crear un programa que nos permite introducir 10 numeros enteros
//en un arreglo, y al momento de mostrarlos en pantalla
//desplazar esos numeros una posicion hacia abajo.
//El primero estara en la posicion del segundo.
//El segundo estara en la posicion del tercero.
//Etc.
package Ejercicios_Secuenciales;
import java.util.Scanner;
public class Ejercicio14 {
	
	public static void main(String[]args) 
	{
		int arr[]=new int[10];
		int ultimo;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<10;i++) 
		{
			System.out.println("Introduce un numerico entero: ");
			arr[i]=sc.nextInt();
			
		}
		ultimo=arr[9];
		for(int i=8;i>=0;i--) 
		{
			arr[i+1]=arr[i];
			arr[0]=ultimo;
		}
		
		System.out.println("Mostrar arreglo desplazado una posicion: ");
		for(int i=0;i<10;i++) 
		{
			System.out.println(arr[i]);
		}
	}

}
