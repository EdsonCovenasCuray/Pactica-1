//Se evalúa 2 números. y se visualiza 
//como resultado el mayor de los 2 números.
package Ejercicios_Condicionales;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ListDataListener;

public class Ejercicio1 extends JFrame {
	private static final String Color = null;
	int valor1 = 0, valor2 = 0;
	JLabel n1,n2,res;
	JTextField num1,num2;
	JButton boton;
	public Ejercicio1(){
		n1 = new JLabel("Ingrese el primer numero");
		n1.setBounds(50,15,200,100);
		num1 = new JTextField(10);
		num1.setBounds(220,45,80,30);
		boton = new JButton("Calcular");
		boton.setBounds(100,150,100,30);
		res = new JLabel();
		res.setBounds(50,185,200,100);
	
	
		n2 = new JLabel("Ingres el segundo numero");
		n2.setBounds(50,75,200,50);
		num2 = new JTextField(10);
		num2.setBounds(220,85,80,30);
		boton = new JButton("Calcular");
		boton.setBounds(100,150,100,30);
		res = new JLabel();
		res.setBounds(50,185,200,100);
		
		Container panel = getContentPane();
		panel.setLayout(null);
		panel.add(n1);
		panel.add(n2);
		panel.add(num1);
		panel.add(num2);
		panel.add(boton);
		panel.add(res);
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				valor1 = Integer.parseInt(num1.getText());
				valor2 = Integer.parseInt(num2.getText());
				
				if(valor1 < valor2){
					res.setText("" + valor1);
				} else{
					res.setText("" + valor2);
				}
				
				
				
				
			}
		});
			
			
		}
	public static void main(String args[]) {
		Ejercicio1 b = new Ejercicio1();
		b.setVisible(true);
		b.setSize(400,400);
		b.setLocation(450,500);
		

		

		
	}
	
	
	
	

}
