//Guardar 10 numeros en un arreglo, y al final, mostrarlos en pantalla
//en  el siguiente orde: el primero, el ultimo, el segundo, el penultimo...
//el tercero...etc

package Ejercicios_Secuenciales;
import java.util.Scanner;
public class Ejercicio11 {
     
	
	public static void main(String[]args) 
	{
		int j;
		int arr[]=new int [10];
		Scanner sc=new Scanner(System.in);
		//Rellenar el arreglo
		for(j=0;j<arr.length;j++) 
		{
			System.out.println("Introduce el numero"+(j+1));
			arr[j]=sc.nextInt();
			
		}
		   System.out.println("Mostrar los numeros : ");
		  //Imprimir el arreglo
		   for(j=0;j<5;j++) 
		   
		 {
			   System.out.println(arr[j]);
			   System.out.println(arr[9-j]);
		 }
		
	}
	
}
