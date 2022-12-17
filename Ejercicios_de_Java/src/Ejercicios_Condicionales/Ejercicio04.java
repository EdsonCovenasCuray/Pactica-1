//Calcular el promedio de 3 notas, 
//si el promedio es mayor que 10.5 mostrar APROBADO, 
//caso contrario DESAPROBADO.  Pero si la nota es mayor que 18, 
//saldrá también la palabra «EXCELENTE«
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

public class Ejercicio04 extends JFrame{
	float nota1, nota2 , nota3, promedio;
	JLabel p1,p2,p3,p4,resultado;
	JTextField v1,v2,v3;
	JButton boton;
	
	public Ejercicio04(){
		p1 = new JLabel("Ingresa la primera nota : ");
		p1.setBounds(50,25,210,70);
		v1 = new JTextField(10);
		v1.setBounds(220,45,80,25);
		
		p2 = new JLabel("Ingrese la segunda nota : ");
		p2.setBounds(50,65,210,70);
		v2 = new JTextField(10);
		v2.setBounds(220,85,80,25);
		
		p3 = new JLabel("Ingre la tercera nota : ");
		p3.setBounds(50,105,210,70);
		v3 = new JTextField(10);
		v3.setBounds(220,125,80,25);
		boton = new JButton("Promediar");
		boton.setBounds(100,160,100,30);
		
		p4 = new JLabel("Su promedio es : ");
		p4.setBounds(30,195,200,100);
		p4.setFont(new Font("Courier New", Font.ITALIC,16));
		p4.setForeground(Color.WHITE);
		resultado = new JLabel();
		resultado.setBounds(200,195,300,100);
		resultado.setFont(new Font("Courier New", Font.ITALIC,16));
		resultado.setForeground(Color.WHITE);
		
		Container panel = getContentPane();
		panel.setLayout(null);
		panel.add(p1);
		panel.add(p2);
		panel.add(p3);
		panel.add(p4);
		panel.add(v1);
		panel.add(v2);
		panel.add(v3);
		panel.add(boton);
		panel.add(resultado);
		panel.setBackground(Color.BLUE);
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				nota1 = Integer.parseInt(v1.getText());
				nota2 = Integer.parseInt(v2.getText());
				nota3 = Integer.parseInt(v3.getText());
				promedio = ( nota1 + nota2 + nota3) / 3;
			
			if(promedio > 18){
				resultado.setText(promedio + "!EXCELENTE!!");
			} else if(promedio > 10.5 && promedio < 18){
				resultado.setText(promedio + " !APROVADO!! ");
			} else{
				resultado.setText(promedio + " !DESAPROBRADO!! ");
				

			
			
			}
				
			}
		});
	}
	
	public static void main(String args[]){
		Ejercicio04 apro = new Ejercicio04();
		apro.setVisible(true);
		apro.setSize(450,400);
		apro.setLocation(250,100);
	}

}
