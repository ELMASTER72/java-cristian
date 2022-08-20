package ejercicios;
import javax.swing.JOptionPane;
public class ejercicio12 {
	public static void main (String[] arg)
	{
		String nombre=JOptionPane.showInputDialog("Ingrese su nombre");
		String documento= JOptionPane.showInputDialog("Ingrese su documento");
		String edad= JOptionPane.showInputDialog("Ingrese su edad");
		String profesion= JOptionPane.showInputDialog("Ingrese su profesion");
		
		
		System.out.println("Datos Ingresados :");
		System.out.println("nombre = " + nombre);
		System.out.println("documento = " + documento);
		System.out.println("edad = " + edad);
		System.out.println("profesion = " + profesion);
		System.out.println("BIENVENIDO!!!");
		  
	}
	}
