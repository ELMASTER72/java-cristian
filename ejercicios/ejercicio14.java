package ejercicios;
import javax.swing.JOptionPane;
public class ejercicio14 {
	public static void main (String[] arg)
	{
		String nombre=JOptionPane.showInputDialog("Ingrese su nombre");
		String documento= JOptionPane.showInputDialog("Ingrese su documento");
		String edad= JOptionPane.showInputDialog("Ingrese su edad");
		String profesion= JOptionPane.showInputDialog("Ingrese su profesion");
		String telefono= JOptionPane.showInputDialog("ingrese su telefono");
		
		System.out.println("Datos ingresados" + "\n" + "Nombre completo: " + nombre + "\n" + "Documento: " + documento + "\n" + "Edad: " + edad + "\n"+ "Profesion: " + profesion + "\n" + "Telefono: " + telefono );
		
	}
}
