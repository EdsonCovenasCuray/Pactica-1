//Se ingresa 3 números, de ser todos impares, 
//muestre como primer resultado 
//la suma de los tres números y como ultimo resultado muestre 
//el ultimo dígito del valor impreso anteriormente.
package Ejercicios_Condicionales;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio06 extends JFrame{
	int n1,n2,n3,suma;
	JLabel v1,v2,v3,aviso,resultado;
	JTextField valor1,valor2,valor3;
	JButton boton;
	
	public Ejercicio06(){
		v1 = new JLabel("Ingresa el primer numero : ");
		v1.setBounds(50,25,210,70);
		valor1 = new JTextField(10);
		valor1.setBounds(220,45,80,25);
		
		v2 = new JLabel("Ingrese el segundo numero : ");
		v2.setBounds(50,65,210,70);
		valor2 = new JTextField(10);
		valor2.setBounds(220,85,80,25);
		
		v3 = new JLabel("Ingrese el tercer numero : ");
		v3.setBounds(50,105,210,70);
		valor3 = new JTextField(10);
		valor3.setBounds(220,125,80,25);
		
		boton = new JButton(" EVALUAR ");
		boton.setBounds(100,160,100,30);
		aviso = new JLabel();
		aviso.setBounds(20,195,320,100);
		aviso.setFont(new Font("Courier New", Font.ITALIC,16));
		aviso.setForeground(Color.blue);
		resultado = new JLabel();
		resultado.setBounds(330,195,300,100);
		resultado.setFont(new Font("Algerian", Font.BOLD,18));
		resultado.setForeground(Color.BLUE);
		
		Container panel = getContentPane();
		panel.setLayout(null);
		panel.add(v1);
		panel.add(v2);
		panel.add(v3);
		panel.add(aviso);
		panel.add(valor1);
		panel.add(valor2);
		panel.add(valor3);
		panel.add(boton);
		panel.add(resultado);
		panel.setBackground(Color.ORANGE);
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				n1 = Integer.parseInt(valor1.getText());
				n2 = Integer.parseInt(valor2.getText());
				n3 = Integer.parseInt(valor3.getText());
				suma = n1 + n2 + n3;
			
			if(n1 % 2 == 1 && n2 % 2 == 1 && n3 % 2 ==1){
				aviso.setText("La suma de los 3 numeros es : ");
				resultado.setText("" + suma);
			} else{
				aviso.setText("El ultimo digito ingresado es : ");
				resultado.setText("" + n3);
			}
				
			}
		});
	
	
	}
public static void main(String args[]) {
	Ejercicio06 impar = new Ejercicio06();
	impar.setVisible(true);
	impar.setSize(450,400);
	impar.setLocation(250,100);
}

}
