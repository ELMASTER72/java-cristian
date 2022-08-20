package ejercicios;
import javax.swing.JOptionPane;
public class ejercicio17 {

	public static void main (String[] arg)
	{
		       int salario=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));
		       double porcentaje=Integer.parseInt(JOptionPane.showInputDialog("Ingrese porcentaje jefe inmediato"));
		       
		       
		       double porcent= porcentaje/100;
		       int porcentaje_2= (int)(salario*porcent);
		       
		       int s_final= salario + porcentaje_2;
		       
		       System.out.println("Salario con incremento del jefe inmediato: " + s_final);
	}
}
