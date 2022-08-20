package ejercicio1;

import javax.swing.JOptionPane;

public class ejercicio6 {
	public static void main (String[] arg)
	{
	
	int trabajadores=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de trabajadores"));
	int i=0;
	while (i < trabajadores) {
		System.out.println("trabajador: "+ (i+1));
		int salario=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));
	       double porcentaje=0.25;
	       
	       int porcentaje_2= (int)(salario*porcentaje);
	       
	       int s_final= salario + porcentaje_2;
	       
	       System.out.println("Salario con incremento del 25%: " + s_final + "\n" + "---------------------------------------------");
	       i++;
	}
}
}