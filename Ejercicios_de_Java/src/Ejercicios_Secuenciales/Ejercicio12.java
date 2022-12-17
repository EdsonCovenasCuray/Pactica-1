//Crear 2 arreglos, e introducir en cada uno, 10 numero enteros,
//Y mezclarlos en un tercer arreglo. De la siguiente forma:
//El 1° de a, el 1° de b, el 2° de a, el 2° de b, el 3° de a, el 3° de b,.....etc
package Ejercicios_Secuenciales;
import java.util.Scanner;
public class Ejercicio12 {
	
	public static void main(String[]args) 
	{
		int a[]=new int[10];
		int b[]=new int[10];
		int c[]=new int[20];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce datos en el array'a' : ");
		for(i=0;i<a.length;i++) 
		{
			System.out.println("Posicio"+(i+1)+" : ");
			a[i]=sc.nextInt();
			
		}
		    System.out.println("Introducir datos en el array 'b' : ");
		    for(i=0;i<b.length;i++) 
		    
		{
		    	System.out.println("Posicion "+(i+1)+" : ");
		    	b[i]=sc.nextInt();
		    	
		}
		    System.out.println("Pasar los numeros al array 'c':");
		  j=0;
		  for(i=0;i<c.length;i++) 
		  
		{
			  c[j]=a[i];
			  System.out.println(c[j]);
			  j++;
			  c[j]=b[i];
			  System.out.println(c[j]);
			  j++;
		}
	}
	

}
