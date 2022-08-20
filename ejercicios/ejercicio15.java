package ejercicios;
import javax.swing.JOptionPane;
public class ejercicio15 {

	public static void main (String[] arg)
	{
	int horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de horas trabajadas"));
	int v_horas=2000;

	int pago= horas * v_horas;

	double descuento= pago*0.10;

	double p_final= pago - descuento;

	System.out.println("pago sin descuento)" + pago);
	System.out.println("pago final (descuento)" + p_final);

	}
}
