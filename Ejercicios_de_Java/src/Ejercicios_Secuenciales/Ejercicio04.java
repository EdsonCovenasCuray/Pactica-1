package Ejercicios_Secuenciales;
import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int eleccion = 0;
	
	System.out.println("1.- Convertir Km/h a m/s");
	System.out.println("2.- Convertir m/s a Km/h");
	eleccion = sc.nextInt();
	if(eleccion == 1 || eleccion == 2)
	{
	if(eleccion == 1)
	{
	conversor1();
	}
	if(eleccion == 2)
	{
	conversor2();
	}
	}else
	{
	System.out.println("Opcion erronea, se escogera por defecto la opcion 1");
	conversor1();
	}
	}
	public static void conversor1()
	{
	Scanner sc = new Scanner(System.in);
	double velocidad;

	System.out.println("Introduzca una velocidad en Km/h: ");
	velocidad = sc.nextDouble();
	System.out.println(velocidad + "Km/h = " + velocidad * 1000 / 3600 + "m/s");
	}
	public static void conversor2()
	{
	Scanner sc = new Scanner(System.in);
	double velocidad;

	System.out.println("Introduzca una velocidad en m/s: ");
	velocidad = sc.nextDouble();
	System.out.println(velocidad + "m/s = " + velocidad * 3600 / 1000 + "Km/h");
	}
	}

