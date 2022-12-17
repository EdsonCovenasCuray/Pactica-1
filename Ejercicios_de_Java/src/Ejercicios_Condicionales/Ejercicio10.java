// Elabore un programa que lea dos (2) números enteros positivos 
// que muestre la resta y division de estos. 
package Ejercicios_Condicionales;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio10 extends JFrame {
	int valor1 =0, valor2 = 0;
	JLabel titulo,n1,n2,res;
	JTextField num1,num2;
	JButton boton;
	protected String div;
	protected String re;
	public Ejercicio10() {
		titulo = new JLabel("Resta y Division");
		titulo.setBounds(30,5,400,100);
		titulo.setFont(new Font("Courir New",Font.ITALIC,16));
		
		n1 = new JLabel("Ingrese el primer numero");
		n1.setBounds(50,50,200,100);
		num1 = new JTextField(10);
		num1.setBounds(220,80,80,30);
		
		n2 = new JLabel("Ingre el segundo numero");
		n2.setBounds(50,120,200,50);
		num2 = new JTextField(10);
		num2.setBounds(220,130,80,30);
		boton = new JButton("Calcular");
		boton.setBounds(100,170,100,30);
		res = new JLabel();
		res.setBounds(50,185,300,100);
		
		Container panel = getContentPane();
		panel.setLayout(null);
		panel.add(titulo);
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
				int re = valor1 - valor2;
				int div = valor1 / valor2;
				if (valor1 > 0 && valor2 > 0){
					res.setText("La RESTA ES : "+ re + " Y LA DIVISION : "+div);
				} else {
					res.setText("Los valores deben ser mayor a 0");
				}
				}
						
				
				
			});
				
				
		
	}
	
	public static void main(String args[]){
		Ejercicio10 rd=new Ejercicio10();
		rd.setVisible(true);
		rd.setBounds(400,100,500,450);
	}

	
}
