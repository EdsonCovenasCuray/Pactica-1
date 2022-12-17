//Elabore un programa que lea tres (3) 
//números enteros positivos y que 
//muestre la suma, la resta  y la multiplicación de todos. 
//el resultado debe ser siempre positivo.
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

public class Ejercicio03 extends JFrame{
	int valor1 =0, valor2 =0, valor3;
	JLabel titulo,n1,n2,n3,res;
	JTextField num1,num2,num3;
	JButton boton;
	
	public Ejercicio03(){
		titulo= new JLabel("Suma,Resta y Multiplicación de 3 numeros");
		titulo.setBounds(30,5,480,100);
		titulo.setFont(new Font("Courier New", Font.ITALIC, 18));
		titulo.setForeground(Color.BLUE);
		n1=new JLabel("Ingrese el primer numero");
		n1.setBounds(50,50,200,100);
		n1.setForeground(Color.white);
		n1.setFont(new Font("Arial", Font.ITALIC,14));
		num1 = new JTextField(10);
		num1.setBounds(220,80,80,30);
		
		n2 = new JLabel("Ingrese el segundo numero");
		n2.setBounds(50,120,200,50);
		n2.setForeground(Color.WHITE);
		num2 = new JTextField(10);
		num2.setBounds(220,130,80,30);
		
		n3 = new JLabel("Ingrese el tercer numero");
		n3.setBounds(50,170,200,50);
		n3.setForeground(Color.WHITE);
		num3 = new JTextField(10);
		num3.setBounds(220,180,80,30);
		boton = new JButton("Calcular");
		boton.setBounds(100,220,100,30);
		res = new JLabel();
		res.setBounds(50,220,500,100);
		
		res.setFont(new Font("Courier New",Font.ITALIC,12));
		Container panel = getContentPane();
		panel.setLayout(null);
		panel.add(titulo);
		panel.add(n1);
		panel.add(n2);
		panel.add(n3);
		panel.add(num1);
		panel.add(num2);
		panel.add(num3);
		panel.add(boton);
		panel.add(res);
		panel.setBackground(Color.red);
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				valor1 = Integer.parseInt(num1.getText());
				valor2 = Integer.parseInt(num2.getText());
				valor3= Integer.parseInt(num3.getText());
				int su = valor1 + valor2 + valor3;
				int re = valor1 - valor2 - valor3;
				int mul = valor1 * valor2 * valor3;
			if (valor1 > 0 && valor2 > 0){
				res.setText("LA SUMA ES: " + su + " ,LA RESTA : " + re+" Y LA MULTIPLICACION : "+ mul);
			} else{
				res.setText("Los valores deben ser mayor a 0");
				
			}
				
			}
		});
			
		}
	public static void main(String args[]){
		Ejercicio03 srm = new Ejercicio03();
		srm.setVisible(true);
		srm.setBounds(400,100,550,400);
	
	}

}
