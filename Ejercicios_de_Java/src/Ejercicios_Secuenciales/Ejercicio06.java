package Ejercicios_Secuenciales;
import javax.swing.JOptionPane;

public class Ejercicio06 {
	public static void main(String[] args) {
		int nota=0;
		String nombre;

		nombre=(JOptionPane.showInputDialog("Introduce el nombre del alumno"));
		nota=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota"));

		JOptionPane.showMessageDialog(null, nombre);

		if(nota>=4){
		JOptionPane.showMessageDialog(null, "Aprobado");
		}else{
		JOptionPane.showMessageDialog(null, "Reprobado");
		}

		}

}
