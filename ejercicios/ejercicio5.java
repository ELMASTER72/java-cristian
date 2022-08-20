package ejercicios;
import javax.swing.JOptionPane;
public class ejercicio5 {
	public static void main (String[] arg)
	{
		        int sueldo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));
		        int horas= Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus horas extras realizadas"));
		        int retroactivo= 3000;
		        
		        int salario_f= horas * retroactivo + sueldo;
		        
		        System.out.println("su salario sin horas extras: " + sueldo);
		        System.out.println("su salario con horas extras: " + salario_f);
	}
}
