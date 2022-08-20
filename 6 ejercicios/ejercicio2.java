package ejercicio1;
import javax.swing.JOptionPane;
public class ejercicio2 {
	public static void main(String[] args) {
		for(int i = 0;i<2;i++) {
		int sueldo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));
        int horas= Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus horas extras realizadas"));
        int retroactivo= 3000;
        
        int salario_f= horas * retroactivo + sueldo;
        
        System.out.println("SALARIO"+ "\n"+ "Su salario sin horas extras: " + sueldo + "\n" + "su salario con horas extras: " + salario_f);
        System.out.println("-------------------------------------------");
	}
}
}