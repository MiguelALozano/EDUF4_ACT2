/**
 * Para poder usar las clases tenemos que importar el paquete com.itt.calculadora.
 */
import com.itt.calculadora.*;

/**
 * Clase principal donde se ponen a prueba los metodos creados de las clases<br>
 * Divisi&oacuten, Producto, Reesta y Suma.
 * 
 * @author Jose A. Santos, &Aacutelvaro Quiles, Miguel A. Lozano, Ra&uacutel Ru&iacutez
 * @version 1.0
 * @since 04/02/2021
 */
public class Principal {
	
	
	public static void main(String[] args) {
		
		double result;
		
		// Zona para División
		
		// Zona para Producto
		
		// Zona para Resta
		
		// Zona para Suma
		//Suma de dos reales:
		double a = 8.75;
		double b = 11.87;
		double c = 8.45;
		double d = -11.75;
		
		result = Suma.sumReales(a, b);
		System.out.printf("La suma de a y b = %.2f", result);
		System.out.println();
		result = Suma.sumEntero((int)a,(int)b);
		System.out.printf("La suma de a y b = %.0f", result);
		result = Suma.sumTresReales(a, b, c);
		System.out.println();
		System.out.printf("La suma de a, b y c = %.2f", result);
		result = Suma.sumTresReales(a, b, d);
		System.out.println();
		System.out.printf("La suma de a, b y d = %.2f", result);
		System.out.println();
		System.out.println("Esto es una suma acumulada: ");
		Suma.sumAcumulado(a);
		result = Suma.getAcum();
		System.out.printf("El acumulado es: %.2f", result);
		System.out.println();
		Suma.sumAcumulado(b);
		result = Suma.getAcum();
		System.out.printf("El acumulado es: %.2f", result);
		System.out.println();
		Suma.sumAcumulado(d);
		result = Suma.getAcum();
		System.out.printf("El acumulado es: %.2f", result);
		System.out.println();
		Suma.sumAcumulado(c);
		result = Suma.getAcum();
		System.out.printf("El acumulado es: %.2f", result);
	
		
		
	}

}
