package Ejercicios_Secuenciales;
import java.util.Scanner;

import javax.swing.JFrame;
public class Ejercicio07 {
	
	public static void main(String[]args)
	{
		
	double ventas [] = new double[30];
	Scanner sc = new Scanner (System.in);
	System.out.println("Ingrese las 30 ventas del mes : ");
	for(int i = 0; i<ventas.length; i++) //i=0
	{
        System.out.println("Venta "+(i + 1));
        ventas[i] = sc.nextDouble();
     
	}
	int K=0;
	int total=0;
	while(K<30)
	{
		  if(ventas[K]>=2000)
		  {
	         System.out.println("S/"+ventas[K]);
	      total++; //2
		  }
		    K++;
			  
	}
	System.out.println("El total de ventas mayores a 2000 es : "+total);
	
	
	}
	
	
}
