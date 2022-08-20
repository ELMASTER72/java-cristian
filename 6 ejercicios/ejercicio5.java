package ejercicio1;
import javax.swing.JOptionPane;
public class ejercicio5 {
	
			public static void main (String[] arg)
			{
		int pago= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de pagos"));
		int i = 0;	
		while(i < pago) {
			System.out.print("PAGO: " + (i+1) + "\n");
			int tratamiento= Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor del tratamiento"));
			int dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias de hospitalizacion"));
			int medicamentos= Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor de los medicamentos"));
	int valor_dia= 100000;

			int total= (dias * valor_dia) + medicamentos + tratamiento;
			System.out.println("valor total a pagar es de : " + total + "\n" + "-----------------------------");
			
			i++;
			}
	}
}

