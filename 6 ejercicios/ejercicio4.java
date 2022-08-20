package ejercicio1;

import javax.swing.JOptionPane;

public class ejercicio4 {
	public static void main (String[] arg)
	{
		int datos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de datos a ingresar"));
		int i=0;
		do {
			System.out.println("Usuariowffqqedsdsdffffffdsdffds"
					+ "f "+(i+1));
			
			String nombre=JOptionPane.showInputDialog("Ingrese su nombre");
			String documento= JOptionPane.showInputDialog("Ingrese su documento");
			String edad= JOptionPane.showInputDialog("Ingrese su edad");
			String profesion= JOptionPane.showInputDialog("Ingrese su profesion");
			String telefono= JOptionPane.showInputDialog("ingrese su telefono");
			
			System.out.println("Datos ingresados" + "\n" + "Nombre completo: " + nombre + "\n" + "Documento: " + documento + "\n" + "Edad: " + edad + "\n"+ "Profesion: " + profesion + "\n" + "Telefono: " + telefono );
			System.out.println("------------------------------------------------");
			i++;
		}
		while(i < datos);
		
		
	}
}
