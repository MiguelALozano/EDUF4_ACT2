/**
 * Para poder usar las clases tenemos que importar el paquete com.itt.calculadora.
 */
import java.text.DecimalFormat;

import com.itt.calculadora.*;

/**
 * Clase principal donde se ponen a prueba los metodos creados de las clases<br>
 * Division, Producto, Resta y Suma.
 * 
 * @author Jose A. Santos, Alvaro Quiles, Miguel A. Lozano, Raul Ruiz
 * @version 1.1
 * @since 04/02/2021
 */
public class Principal {
	
	
	public static void main(String[] args) {
		
		double num1 = 124.544544;
		double num2 = 0;
		double num3 = 4.23;
		int numEntero1 = 2;
		int numEntero2 = 6;
		int numEntero = 20;

		DecimalFormat df = new DecimalFormat("#0.00");
		
		// Zona para Division		
		System.out.println("\n***************** DIVISION *****************");		
		System.out.println("Metodo para dividir 2 numeros reales:");
		System.out.println(num1 + " / " + num2 + " = " + df.format(Division.divReales(num1, num2)));
		System.out.println("=======================");
		System.out.println("Metodo para dividir dos numeros enteros:");
		System.out.println(numEntero1 + " / " + numEntero2 + " = " + df.format(Division.divEnteros(numEntero1, numEntero2)));
		System.out.println("=======================");
		System.out.println("Metodo para calcular el inverso de un numero:");
		System.out.println("El inverso de " + num2 + " = " + df.format(Division.inverso(num2)));
		System.out.println("=======================");
		System.out.println("Metodo para calcular la raiz cuadrada de un numero:");
		System.out.println("La raiz cuadrada de " + num1 + " = " + df.format(Division.raiz(num1)));
				
		System.out.println("\n\n");

		// Zona para Producto
		System.out.println("\n***************** PRODUCTO *****************");		
		System.out.println("Operacion valida de 2 numeros reales:");
		System.out.println(num1 + " x " + num2 + " = " + Producto.prodReales(num1, num2));
		System.out.println("=======================");
		System.out.println("Operacion no valida de 2 numeros reales:");
		System.out.println(Producto.prodReales(num1, num2));
		System.out.println("=======================");
		System.out.println("Operacion valida de 2 numeros enteros:");
		System.out.println(num1 + " x " + num2 + " = " + Producto.prodEnteros(20, 4));
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

		System.out.println("\n\n");
		
		// Zona para Resta
		System.out.println("\n***************** RESTA *****************");
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

		System.out.println("\n\n");

		// Zona para Suma	
		System.out.println("***************** SUMA *****************");
		System.out.println("Operacion valida de 2 numeros reales:");
		System.out.println("8.75 + 11.87 = " + Suma.sumReales(8.75, 11.87));
		//guardo el valor de la suma anterior para llevar un acumulado de resultados
		Suma.sumAcumulado(Suma.sumReales(8.75, 11.87)); 
		System.out.println("=======================");
		System.out.println("Operacion no valida de 2 numeros reales:");
		System.out.println("8.45 + (-11.75) = " + Suma.sumReales(8.45, -11.75));
		System.out.println("=======================");
		System.out.println("Operacion valida de 2 numeros enteros:");
		System.out.println("20 + 4 = " + Suma.sumEntero(20, 4));
		//guardo el valor de la suma anterior para llevar un acumulado de resultados
		Suma.sumAcumulado(Suma.sumEntero(20, 4));
		System.out.println("=======================");
		System.out.println("Operacion no valida de 2 numeros enteros:");
		System.out.println("20 + (-4) = " + Suma.sumEntero(20, -4)); 
		System.out.println("=======================");
		System.out.println("Operacion valida de 3 numeros reales:");
		System.out.println("8.75 + 11.87 + 8.45 = " + Suma.sumTresReales(8.75, 11.87, 8.45));
		//guardo el valor de la suma anterior para llevar un acumulado de resultados
		Suma.sumAcumulado(Suma.sumTresReales(8.75, 11.87, 8.45));
		System.out.println("=======================");
		System.out.println("Operacion no valida de 3 numeros reales:");
		System.out.println("4.3 + (-7.2) + 2 = " + Suma.sumTresReales(4.3, -7.2, 2));
		System.out.println("=======================");
		System.out.println("Valor acumulado de las sumas: " +Suma.getAcum());
		System.out.println("=======================");
	}

}

