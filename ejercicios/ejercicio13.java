package ejercicios;
import javax.swing.JOptionPane;
public class ejercicio13 {


	public static void main (String[] arg)
	{
		        double precio = 0,cuenta=0,devuelta=0,valorPagado=0;
		        int cantidad=0;
		        int codigo=0;
		       
		       
		        String menu="MENU OPCIONES\n\n";
		        menu+="1. Balon valor 5000\n";
		        menu+="2. Muñeco valor 10000\n";
		        menu+="3. Gorra valor 20000\n";
		        menu+="4. Tennis valor 50000\n";
		        menu+="5. Salir\n\n";
		        menu+="Ingrese una opción\n";
		       
		        int i=0;
		        do {
		            ///
		            int noExiste=0;
		            codigo=Integer.parseInt(JOptionPane.
		                    showInputDialog(menu));
		           
		            switch (codigo) {
		            case 1:System.out.println("Balon");
		                precio=5000;
		                break;
		            case 2:System.out.println("Muñeco");
		                precio=10000;
		                break;
		            case 3:System.out.println("Gorra");
		                precio=20000;
		                break;
		            case 4:System.out.println("Tennis");
		                precio=50000;
		                break;
		            case 5:System.out.println("Salir");
		                noExiste=1;
		                break;
		            default:System.out.println("No existe el producto");
		                noExiste=1;
		                break;
		            }
		           
		            if(noExiste==0) {
		                cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de articulos"));
		                cuenta=cantidad*precio;
		               
		                valorPagado=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a pagar"));
		                devuelta=valorPagado-cuenta;
		               
		                System.out.println("Cuenta: "+cuenta);
		                System.out.println("Valor pagado: "+valorPagado);
		               
		                if (devuelta<0) {
		                    System.out.println("Hace falta $"+(devuelta*-1));
		                }else {
		                    System.out.println("Devuelta: "+devuelta);
		                }
		               
		            }
		           
		            ///            
		           
		            i++;
		        }while(codigo!=5);
		       
	}
}
