package ejercicios;
import javax.swing.JOptionPane;
public class ejercicio20 {
	public static void main (String[] arg)
	{
	int monto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto"));
	double interes=Double.parseDouble(JOptionPane.showInputDialog("Ingrese interes"));
	int plazo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese plazo"));


	double rendimiento= (monto * interes * plazo)/360;


	System.out.println("El rendimiento: " + rendimiento);

	}
}
