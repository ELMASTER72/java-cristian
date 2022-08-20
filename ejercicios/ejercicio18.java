package ejercicios;
import javax.swing.JOptionPane;
public class ejercicio18 {

	public static void main (String[] arg)
	{
	int numero_n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero natural"));

	int formula= numero_n*(numero_n+1)/2;

	System.out.println("suma= " + formula);

	}
}
