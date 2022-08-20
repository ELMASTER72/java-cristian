package ejercicios;
import javax.swing.JOptionPane;
public class ejercicio16 {

	public static void main (String[] arg)
	{
		       int salario=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));
		       double porcentaje=0.25;
		       
		       int porcentaje_2= (int)(salario*porcentaje);
		       
		       int s_final= salario + porcentaje_2;
		       
		       System.out.println("Salario con incremento del 25%: " + s_final);
	}

}
