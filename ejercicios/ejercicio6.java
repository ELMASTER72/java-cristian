package ejercicios;
import javax.swing.JOptionPane;
public class ejercicio6 {
		public static void main (String[] arg)
		{
		int tratamiento= Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor del tratamiento"));
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias de hospitalizacion"));
		int medicamentos= Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor de los medicamentos"));
		int valor_dia= 100000;

		int total= (dias * valor_dia) + medicamentos + tratamiento;
		System.out.println("valor total a pagar es de : " + total);
		}
}
