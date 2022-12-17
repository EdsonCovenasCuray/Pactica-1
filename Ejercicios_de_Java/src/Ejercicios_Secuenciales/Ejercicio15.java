//Introducir 5 numeros enteros en un arreglo; de forma creciente, y ordenados.
//Por ejemplo: 2, 4, 6, 8, 10.
//Estos numeros se almacenaran en un arreglo de tamaño 10.
//Posteriormente introduciremos un numero entero n
//Y se insertara en el lugar correspondiente
//Sin alterar el orden de la tabal
package Ejercicios_Secuenciales;
import java.util.Scanner;
public class Ejercicio15 {
	
	public static void main(String[]args) 
	{
	int arr[]=new int[10];
	int num, pos_num,j;
	Scanner sc=new Scanner(System.in);
	
	        System.out.println("Introduce los 5 numeros(ordenados de forma creciente");
	        for(int i=0;i<5;i++) 
	        {
	        	arr[i]=sc.nextInt();
	        }
	        System.out.println("Ingrese un numero entero: ");
	        num=sc.nextInt();
	        pos_num=0;
	        j=0;
	        while(arr[j]<num &&j<=4) 
	        {
	        	pos_num++;
	        	j++;
	        }
	for(int i=4;i>=pos_num;i--) 
	{
		arr[i+1]=arr[i];
	}
	arr[pos_num]=num;
	System.out.println("Nuevo arreglo ordenado: ");
	for(int i=0;i<5;i++) 
	{
		System.out.println(arr[i]);
	}
	}

}
