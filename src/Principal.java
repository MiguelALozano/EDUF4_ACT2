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
		System.out.println("Operacion valida de 2 numeros reales:");
		System.out.println("4.5 x 2 = " + Producto.prodReales(4.5, 2));
		System.out.println("=======================");
		System.out.println("Operacion no valida de 2 numeros reales:");
		System.out.println(Producto.prodReales(4.5, -2));
		System.out.println("=======================");
		System.out.println("Operacion valida de 2 numeros enteros:");
		System.out.println("20 x 4 = " + Producto.prodEnteros(20, 4));
		System.out.println("=======================");
		System.out.println("Operacion no valida de 2 numeros enteros:");
		System.out.println(Producto.prodEnteros(20, -4));
		System.out.println("=======================");
		System.out.println("Operacion valida de 3 numeros reales:");
		System.out.println("4.3 * 7.2 * 2 = " + Producto.prodReales(4.3, 7.2, 2));
		System.out.println("=======================");
		System.out.println("Operacion no valida de 3 numeros reales:");
		System.out.println(Producto.prodReales(4.3, -7.2, 2));
		System.out.println("=======================");
		System.out.println("Operacion valida de potencia:");
		System.out.println("4^7 = " + Producto.potencia(4, 7));
		System.out.println("=======================");
		System.out.println("Operacion no valida de potencia:");
		System.out.println("0^0 = " + Producto.potencia(0, 0));
		System.out.println("=======================");
		System.out.println("Ejemplo de desbordamiento:");
		System.out.println("1000^1000 = " + Producto.potencia(1000, 1000));
		System.out.println("=======================");
		
		// Zona para Resta
		System.out.println("***************** RESTA *****************");
		System.out.println("Operacion valida de 2 numeros reales:");
		System.out.println("4.5 - 2 = " + Resta.resReales(4.5, 2));
		//guardo el valor de la resta anterior para llevar un acumulado de resultados
		Resta.resAcumulado(Resta.resReales(4.5, 2)); 
		System.out.println("=======================");
		System.out.println("Operacion no valida de 2 numeros reales:");
		System.out.println("4.5 - (-2) = " + Resta.resReales(4.5, -2));
		System.out.println("=======================");
		System.out.println("Operacion valida de 2 numeros enteros:");
		System.out.println("20 - 4 = " + Resta.resEnteros(20, 4));
		//guardo el valor de la resta anterior para llevar un acumulado de resultados
		Resta.resAcumulado(Resta.resEnteros(20, 4));
		System.out.println("=======================");
		System.out.println("Operacion no valida de 2 numeros enteros:");
		System.out.println("20 - (-4) = " + Resta.resEnteros(20, -4)); 
		System.out.println("=======================");
		System.out.println("Operacion valida de 3 numeros reales:");
		System.out.println("4.3 - 7.2 - 2 = " + Resta.resTresReales(4.3, 7.2, 2));
		//guardo el valor de la resta anterior para llevar un acumulado de resultados
				Resta.resAcumulado(Resta.resTresReales(4.3, 7.2, 2));
		System.out.println("=======================");
		System.out.println("Operacion no valida de 3 numeros reales:");
		System.out.println("4.3- (-7.2) - 2 = " + Resta.resTresReales(4.3, -7.2, 2));
		System.out.println("=======================");
		System.out.println("Valor acumulado de las restas: " +Resta.getAcum());
		System.out.println("=======================");
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
