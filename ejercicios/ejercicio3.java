package ejercicios;
import javax.swing.JOptionPane;
public class ejercicio3 {


	public static void main (String[] arg)
	{
		       int valor=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
		       double porcentaje=0.15;
		       
		       int porcentaje_2= (int)(valor*porcentaje);
		       
		       System.out.println(porcentaje_2);
	}
}
