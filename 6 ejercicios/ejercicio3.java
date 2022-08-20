package ejercicio1;
import javax.swing.JOptionPane;
public class ejercicio3 {
	   public static void main(String arg[]) {
int estudiantes=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estudiantes"));
int i = 0;
do {
	System.out.println("Estudiante "+(i+1));
	
	double nota_1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota"));
	double nota_2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segundo nota"));
	double nota_taller=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de talleres"));
	double nota_examen=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de examenes"));


	double n_1=nota_1*0.20;
	double n_2=nota_2*0.20;
	double n_t=nota_taller*0.30;
	double n_e=nota_examen*0.30;

	double nota_f= n_1 + n_2 + n_t + n_e;


	System.out.println("nota definitiva: " + nota_f);
	System.out.println("---------------------------------");
i++;
}
while(i < estudiantes);
}
}

