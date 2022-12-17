//Una distribuidora de motocicletas tiene una promoción de fin de año que consiste en lo siguiente. 
//Las motos marca Honda tienen un descuento del 5%, 
//las marcas Yamaha del 8% y las Suzuki del 10%, las otras marcas 2%.
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

public class Ejercicio12 extends JFrame {
	String c1,c2,c3,c4,promedio;
	double p =0, desc =0, pago;
	JLabel infor1,infor2,infor3,resultado,aviso;
	JTextField pre,marca,des;
	JButton boton;
	
	public Ejercicio12(){
		infor1 = new JLabel("Ingrese el precio del carro : ");
		infor1.setBounds(50,25,210,70);
		pre = new JTextField(10);
		pre.setBounds(250,45,80,25);
		
		infor2 = new JLabel("Ingrese la marca del carro : ");
		infor2.setBounds(50,65,210,70);
		marca = new JTextField(10);
		marca.setBounds(250,85,80,25);
		
		infor3 = new JLabel("Ingrese el descuento del carro : ");
		infor3.setBounds(50,105,210,70);
		des = new JTextField(10);
		des.setBounds(250,125,80,25);
		
		boton = new JButton("Calcular");
		boton.setBounds(100,200,100,30);
		
		resultado = new JLabel();
		resultado.setBounds(100,195,300,100);
		resultado.setFont(new Font("Courier New",Font.ITALIC,16));
		resultado.setForeground(Color.WHITE);
		aviso = new JLabel();
		aviso.setBounds(120,235,300,100);
		
		Container panel = getContentPane();
		panel.setLayout(null);
		panel.add(infor1);
		panel.add(infor2);
		panel.add(infor3);
		panel.add(aviso);
		panel.add(pre);
		panel.add(marca);
		panel.add(des);
		panel.add(boton);
		panel.add(resultado);
		panel.setBackground(Color.PINK);
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				c1 = "BMW";
				c2 = "TOYOTA";
				c3 = "NISSAN";
				c4 = "Otros";
				p = Integer.parseInt(pre.getText());
				String modelo = new String(marca.getText());
			if(c1.equals(modelo)){
				desc = p * 0.05;
				pago = p - desc;
				resultado.setText("El desuento es :"+desc);
				resultado.setForeground(Color.BLUE);
				aviso.setText("El costo del carro es : "+pago);
			
			} else if(c2.equals(modelo)){
				desc = p * 0.08;
				pago = p - desc;
				resultado.setText("El descuento es : "+desc);
				resultado.setForeground(Color.BLUE);
				aviso.setText("Elcosto del carro es : "+pago);
				
			} else if(c3.equals(modelo)){
				desc = p * 0.08;
				desc = p * 0.10;
				pago = p - desc;
				resultado.setText("El descuento es : "+desc);
				resultado.setForeground(Color.BLUE);
				aviso.setText("El costo del carro es : "+pago);
			} else if(c4.equals(modelo)){
				
				
			}
				
			}
		});
	}

	public static void main(String args[]){
		Ejercicio12 carro = new Ejercicio12();
		carro.setVisible(true);
		carro.setSize(450,400);
		carro.setLocation(250,100);
	}

}
