package ejercicios;
import javax.swing.JOptionPane;
public class ejercicio11 {
	public static void main (String[] arg)
	{
		float nota_1= Float.parseFloat(JOptionPane.showInputDialog("Ingrese nota 1"));
		float nota_2= Float.parseFloat(JOptionPane.showInputDialog("Ingrese nota 2"));
		float nota_3= Float.parseFloat(JOptionPane.showInputDialog("Ingrese nota 3"));
		
		float nota_final = (nota_1+nota_2+nota_3)/3;
		System.out.println("Su nota final es = " + nota_final);
	}

}
