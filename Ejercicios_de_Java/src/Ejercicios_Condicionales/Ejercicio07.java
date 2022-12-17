//En un almacén se hace un 20% de descuento a 
//los clientes cuya compra supere los S/. 1000 
//¿Cuál será la cantidad que pagara una persona por su compra? 
//con descuento o sin descuento.
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

public class Ejercicio07 extends JFrame{
	double n1 = 0.0, n2,descu = 0.0, pago;
	JLabel v1,v2,aviso,resultado;
	JTextField valor1,valor2;
	JButton boton;
	
	public Ejercicio07(){
		v1 = new JLabel("Ingrese el monto de compra : ");
		v1.setBounds(50,25,210,70);
		valor1 = new JTextField(10);
		valor1.setBounds(220,45,80,25);
		
		v2 = new JLabel("Ingrese el % de descuento : ");
		v2.setBounds(50,65,210,70);
		valor2 = new JTextField(10);
		valor2.setBounds(220,85,80,25);
		
		boton = new JButton(" Calcular ");
		boton.setBounds(100,160,150,30);
		aviso = new JLabel();
		aviso.setBounds(20,195,320,100);
		aviso.setFont(new Font("Courier New", Font.ITALIC,16));
		aviso.setForeground(Color.BLUE);
		resultado = new JLabel();
		resultado.setBounds(100,235,300,100);
		resultado.setFont(new Font("Algerian", Font.BOLD,18));
		resultado.setForeground(Color.BLUE);
		
		Container panel = getContentPane();
		panel.setLayout(null);
		panel.add(v1);
		panel.add(v2);
		panel.add(aviso);
		panel.add(valor1);
		panel.add(valor2);
		panel.add(boton);
		panel.add(resultado);
		panel.setBackground(Color.GREEN);
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				n1 = Float.parseFloat(valor1.getText());
				n2 = Integer.parseInt(valor2.getText());
				descu = n1*0.20;
				pago = n1-descu;
			if(n1 > 1000){
				descu=n1*0.20;
				aviso.setText(" E descuento es : " + descu);
				resultado.setText("El pago total es :" + pago);
			} else{
				aviso.setText("El desucento es : ");
				resultado.setText(""+pago);
				
			}
				
			}
		});
	}
public static void main(String args[]){
	Ejercicio07 des= new Ejercicio07();
	des.setVisible(true);
	des.setBounds(450,100,450,400);
}

}
