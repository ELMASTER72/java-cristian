package ejercicios;

public class ejercicio4 {
	public static void main (String[] arg)
	{
	int salario= 2000000;
	double porcentaje= 0.25;

	 int nuevo= (int) (porcentaje * salario);
	 
	 int s_final= nuevo + salario; 
	 System.out.println("salario sin incremento = "+ salario);
	System.out.println("salario con incremento del 25% = " + s_final);

	}
}
