//Ingresar datos numericos en dos arreglos, y almacenarlos en un tercer arreglo
//la forma en que se almacenaran sera la siguiente:
//En el arreglo A y en el arreglo B, almacenaremos 12 numericos, en cada arreglo
//Los mostraremos en un tercer arreglo C de esta forma:
//3 numericos del arreglo A, 3 numericos del arreglo B.
//otros 3 numeros del arreglo A;otros 3 numeros del arreglo B.
package Ejercicios_Secuenciales;
import java.util.Scanner;
public class Ejercicio13 {
	
	public static void main(String[]args) 
	{
	int A[]= new int[12];
	int B[]= new int[12];
	int C[]= new int[24];
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Ingresar datos al arreglo A. ");
	for(int i=0;i<12;i++) 
	{
		System.out.println("Ingresar el numero"+(i+1));
        A[i]=sc.nextInt();
	     
	}
	System.out.println("Ingresar datos al arreglo B. ");
	for(int i=0;i<12;i++) 
	{
		System.out.println("Ingresar al numero "+(i+1));
		B[i]=sc.nextInt();
	}	
	int i=0;
	int j=0;
	while(i<12) 
	{
		for(int K=0;K<3;K++) 
		{
			C[j]=A[i+K];
			j++;
		}
		for(int K=0;K<3;K++) 
		{
			C[j]=B[i+K];
			j++;
		}
		i+=3;
		
	}
	   System.out.println("Arreglo C : ");
	   for(j=0;j<24;j++) 
	   {
		   System.out.println(C[j]);
	   }

}


}
