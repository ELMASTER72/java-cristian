package ejercicios;
import javax.swing.JOptionPane;

public class ejercicio8 {

	public static void main (String[] arg)
	{
	int a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a"));
	int b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b"));

	int x = a + (b*b)*a; 

	System.out.println("El valor de x es: " + x);
	}
}
