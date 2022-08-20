package ejercicio1;
import javax.swing.JOptionPane;
public class ejercicio1 {
	public static void main(String[] args) {
	       
	        double salario=0;
	        double Total=0;
	        int hora_v=2000;
	        int Horas=0;
	        double descuento=0;
	        
	        for (int i = 0; i < 4; i++) {
	            Horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas"));
	           
	            salario=Horas*hora_v;
	            descuento=salario*0.1;
	            Total=salario-descuento;
	           
	           
	            System.out.println("SALARIO"+ "\n" + "Su salario base es:" + salario + "\n" + "Su salario total con descuento es: "+Total);
	            System.out.println("---------------------------------------");
	           
	        }
	       
	       
	    }

	}

