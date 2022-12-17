//Elabore un programa que calcule la edad exacta 
//de una persona, considere día , mes y año.
package Ejercicios_Secuenciales;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio02 extends JFrame{
	Calendar now = Calendar.getInstance();
	int t1,t2,t3,d,m,a;
	JLabel p1,p2,p3,p4,dma;
	JTextField dia,mes,año;
	JButton boton;
	
	public Ejercicio02(){
		p1 = new JLabel("Ingrese el dia de su nacimiento");
		p1.setBounds(50,25,210,70);
		dia = new JTextField(10);
		dia.setBounds(280,45,80,25);
		
		p2 = new JLabel("Ingrese el mes de su nacimiento");
		p2.setBounds(50,65,210,70);
		mes = new JTextField(10);
		mes.setBounds(280,85,80,25);
		
		p3 = new JLabel("Ingres el año de su nacimiento");
		p3.setBounds(50,105,210,70);
		año = new JTextField(10);
		año.setBounds(280,125,80,25);
		
		boton = new JButton("Calcular");
		boton.setBounds(100,170,100,30);
		
		p4 = new JLabel("Su edad es : ");
		p4.setBounds(50,200,200,100);
		dma = new JLabel();
		dma.setBounds(140,200,280,100);
		dma.setForeground(Color.blue);
		
		Container panel = getContentPane();
		panel.setLayout(null);
		panel.add(p1);
		panel.add(p2);
		panel.add(p3);
		panel.add(p4);
		panel.add(dia);
		panel.add(mes);
		panel.add(año);
		panel.add(boton);
		panel.add(dma);
		panel.setBackground(Color.MAGENTA);
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t1 = Integer.parseInt(dia.getText());
				t2 = Integer.parseInt(mes.getText());
				t3 = Integer.parseInt(año.getText());
				d = (now.get(Calendar.DATE))-t1;
				m = (now.get(Calendar.MONTH)+1)-t2;
				a = (now.get(Calendar.YEAR))-t3;
				dma.setText(a + " años con " + m + " mese y " + d + " dias de nacido");
				
			
				
			}
		});
	}
public static void main(String args[]){
	Ejercicio02 edad = new Ejercicio02();
	edad.setVisible(true);
	edad.setBounds(450,100,450,400);
}
}
