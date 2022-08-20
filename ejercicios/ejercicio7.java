package ejercicios;
import javax.swing.JOptionPane;
public class ejercicio7 {

	public static void main (String[] arg)
	{

	double altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura"));
	double base=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base"));

	double area= base * altura/2;

	System.out.println("El area es: " + area);

	}
}
