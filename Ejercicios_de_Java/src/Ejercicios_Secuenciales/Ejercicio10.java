//Guardar 5 numeros en un arreglo, y mostrarlos en orden inverso.
package Ejercicios_Secuenciales;
import java.util.Scanner;
public class Ejercicio10 {
	
	public static void main(String[]args) 
	{
         int arr[] = new int[5];
         Scanner sc=new Scanner(System.in);
         for(int i=0;i<arr.length;i++) 
         {
		
		        System.out.println("Introduzca un numero :");
		        arr[i] = sc.nextInt();
		  
         }
         System.out.println("Los numero en orden inverso son : ");
         int j = 4;
         while (j>=0) 
         {
        	 System.out.print("|"+arr[j]+"|");
        	 j--; //j=-1
         }
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
