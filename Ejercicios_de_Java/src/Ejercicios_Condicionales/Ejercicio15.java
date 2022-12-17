//Se tiene que evaluar cuatro notas de un alumno, como resultado se visualiza el 
//promedio del alumno junto con su condición de APROBADO o DESAPROBADO, si esta aprobado y con 13 o mas, 
//saldrá el siguiente mensaje «Certificado de Estudios».
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

public class Ejercicio15 extends JFrame {
	float nota1, nota2, nota3, nota4, promedio;
	JLabel infor1,infor2,infor3,infor4,infor5,resultado,aviso;
	JTextField d1,d2,d3,d4;
	JButton boton;
	
	public Ejercicio15(){
		infor1 = new JLabel("Ingrese la primera nota: ");
		infor1.setBounds(50,25,210,70);
		d1 = new JTextField(10);
		d1.setBounds(220,45,80,25);
		
		infor2 = new JLabel("Ingrese la segunda nota : ");
		infor2.setBounds(50,65,210,70);
		d2 = new JTextField(10);
		d2.setBounds(220,85,80,25);
		
		infor3 = new JLabel("Ingrese la tercera nota : ");
		infor3.setBounds(50,105,210,70);
		d3 = new JTextField(10);
		d3.setBounds(220,125,80,25);
		
		infor4 = new JLabel("Ingresa la cuarta nota :");
		infor4.setBounds(50,145,210,70);
		d4 = new JTextField(10);
		d4.setBounds(220,165,80,25);
		
		boton = new JButton("Promediar");
		boton.setBounds(100,200,100,30);
		
		infor5 = new JLabel("Condicion :");
		infor5.setBounds(50,195,200,100);
		infor5.setFont(new Font("Courier New", Font.ITALIC,16));
		infor5.setForeground(Color.WHITE);
		
		resultado = new JLabel();
		resultado.setBounds(200,195,300,100);
		resultado.setFont(new Font("Courier New", Font.ITALIC,16));
		resultado.setForeground(Color.WHITE);
		
		aviso = new JLabel();
		aviso.setBounds(120,235,200,100);
		
		Container panel = getContentPane();
		panel.setLayout(null);
		panel.add(infor1);
		panel.add(infor2);
		panel.add(infor3);
		panel.add(infor4);
		panel.add(infor5);
		panel.add(aviso);
		panel.add(d1);
		panel.add(d2);
		panel.add(d3);
		panel.add(d4);
		panel.add(boton);
		panel.add(resultado);
		panel.setBackground(Color.GREEN);
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				nota1 = Integer.parseInt(d1.getText());
				nota2 = Integer.parseInt(d2.getText());
				nota3 = Integer.parseInt(d3.getText());
				nota4 = Integer.parseInt(d4.getText());
				promedio = (nota1 + nota2 + nota3 + nota4) / 4;
				
			if(promedio >= 16){
				resultado.setText(promedio + " APROBADO ");
				resultado.setForeground(Color.BLUE);
				aviso.setText("Certificado de Estudios");

			} else{
				resultado.setText(promedio + " DESAPROBADO ");
				resultado.setForeground(Color.red);
				aviso.setText("");
				
			}
				
			}
		});
	
		
		
	}
public static void main(String args[]){
	Ejercicio05 certifica = new Ejercicio05();
	certifica.setVisible(true);
	certifica.setSize(450,400);
	certifica.setLocation(250,100);
}

	
}

