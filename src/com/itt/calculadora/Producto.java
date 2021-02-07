package com.itt.calculadora;

/**
 * <p>Clase est&aacutetica que realiza las operaciones b&aacutesicas de multiplicaci&oacuten en una calculadora: <br>
 * &nbsp&nbsp- Producto de dos n&uacutemeros reales<br>
 * &nbsp&nbsp- Producto de dos n&uacutemeros enteros<br>
 * &nbsp&nbsp- Producto de tres n&uacutemeros reales<br>
 * &nbsp&nbsp- Potencia<br>
 * No est&aacute permitido usar n&uacutemeros negativos en la multiplicaci&oacuten. Su uso inducir&aacute a un error
 * en la aplicaci&oacuten.</p>
 * <hr/>
 * <h3>M&eacutetodos que implementa:</h3>
 * <p>
 * 	<ol>
 * 			<li><h3><em>{@link #Producto()}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Constructor por defecto que no recibe argumentos.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #prodReales(double, double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						M&eacutetodo para el producto de dos n&uacutemeros reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #prodEnteros(int, int)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						M&eacutetodo para el producto de dos n&uacutemeros enteros.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #prodReales(double, double, double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						M&eacutetodo para el producto de tres n&uacutemeros reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #potencia(int, int)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						M&eacutetodo para la potencia.
 * 					</li>
 * 				</ul>
 * 			</li>	
 *		</ol>
 *</p>
 *<hr>
 *<h2>Casos especiales:</h2>
 *<ol>
 *	<li><p>Utilizaci&oacuten de n&uacutemeros negativos no permitidos:</p>
 * 		Si uno de los numeros pasados es negativo se imprimira un mensaje por consola
 * 		indicando que la calculadora solo realiza operaciones con numeros positivos.
 * 		Adicionalmente, el valor de retorno sera 0.
 * 	</li>
 * 	<li><p>Usar caracteres en vez de numeros:</p>
 * 		Si el usuario decide hacer uso de la clase Scanner para introducir caracteres
 * 		en vez de numeros, se controlara adecuadamente para impedir la operacion.
 * 	</li>
 *</ol>
 * 
 * @author Alvaro Quiles Pomares
 * @version 1.0
 * @since 20/01/2021
 */
public class Producto {

	/**
	 * Constructor por defecto que no recibe ning&uacuten par&aacutemetro.
	 */
	public Producto() {
		
	}
	
	/**
	 * <b>Producto de dos n&uacutemeros reales.</b>
	 * @param num1 Primer operando de tipo real.
	 * @param num2 Segundo operando de tipo real.
	 * @return Devuelve un double con el resultado de multiplicar 
	 * los dos n&uacutemeros reales pasados al m&eacutetodo como argumentos. 
	 * Si uno de los numeros pasados es negativo se imprimira un mensaje por consola
	 * indicando que la calculadora solo realiza operaciones con numeros positivos.
	 * Adicionalmente, el valor de retorno sera 0.
	 */
	public static double prodReales(double num1, double num2) {

		if(num1 < 0 || num2 < 0) {
			System.out.println("La calculadora solo admite numeros positivos.");
			return 0;
		} else {
			return num1 * num2;
		}
					
	}
	
	/**
	 * <b>Producto de dos n&uacutemeros enteros.</b>
	 * @param num1 Primer operando de tipo entero.
	 * @param num2 Segundo operando de tipo entero.
	 * @return Devuelve un int con el resultado de multiplicar 
	 * los dos n&uacutemeros enteros pasados al m&eacutetodo como argumentos. 
	 * Si uno de los numeros pasados es negativo se imprimira un mensaje por consola
	 * indicando que la calculadora solo realiza operaciones con numeros positivos.
	 * Adicionalmente, el valor de retorno sera 0.
	 */
	public static int prodEnteros(int num1, int num2) {
		
		if(num1 < 0 || num2 < 0) {
			System.out.println("La calculadora solo admite numeros positivos.");
			return 0;
		} else {
			return num1 * num2;
		}
		
	}
	
	/**
	 * <b>Producto de tres n&uacutemeros reales.</b>
	 * @param num1 Primer operando de tipo real.
	 * @param num2 Segundo operando de tipo real.
	 * @param num3 Tercer operando de tipo real.
	 * @return Devuelve un double con el resultado de multiplicar 
	 * los tres n&uacutemeros reales pasados al m&eacutetodo como argumentos. 
	 * Si uno de los numeros pasados es negativo se imprimira un mensaje por consola
	 * indicando que la calculadora solo realiza operaciones con numeros positivos.
	 * Adicionalmente, el valor de retorno sera 0.
	 */
	public static double prodReales(double num1, double num2, double num3) {
		
		if(num1 < 0 || num2 < 0 || num3 < 0) {
			System.out.println("La calculadora solo admite numeros positivos.");
			return 0;
		} else {
			return num1 * num2 * num3;
		}
		
	}
	
	/**
	 * <b>Potencia</b>
	 * @param base N&uacutemero entero que ser&aacute la base de la operaci&oacuten.
	 * @param expo N&uacutemero entero que ser&aacute el exponente de la operaci&oacuten.
	 * @return Devuelve un int con el resultado de elevar al argumento
	 * pasado como base el valor del argumento pasado como exponente.
	 * Si uno de los numeros pasados es negativo se imprimira un mensaje por consola
	 * indicando que la calculadora solo realiza operaciones con numeros positivos.
	 * Adicionalmente, el valor de retorno sera 0.
	 * <br>
	 * Si ambos valores (base y exponente) son 0, se mostrara un mensaje por consola
	 * indicando que ambos argumentos no pueden ser igual a 0.
	 * Adicionalmente, el valor de retorno en dicho caso sera 0.
	 * <br>
	 * Si los argumentos pasados provocasen un desbordamiento, se mostrara un mensaje
	 * por consola indicando que se ha producido un desbordamiento y el valor de
	 * retorno sera 0.
	 * <br>
	 * <p>
	 * <b>Casos especiales:</b>
	 * <br>
	 * <li>Si el primer argumento es 0 y el segundo argumento es cualquier n&uacutemero distinto de 0,
	 * 	 el resultado ser&aacute 0.</li>
	 * <li>Si el segundo argumento es 0, el resultado ser&aacute 1.</li>
	 * <li>Si el segundo argumento es 1, el resultado ser&aacute igual al primer argumento.</li>
	 */
	public static int potencia(int base, int expo) {
		int resultado = (int)(Math.pow(base, expo));
		if(base < 0 || expo < 0) {
			System.out.println("La calculadora solo admite numeros positivos.");
			return 0;
		} else if(base == 0 && expo == 0) {
			System.out.println("Ambos argumentos (base y exponente) no pueden ser igual a 0.");
			return 0;
		} else {
			return resultado;	
		}
	}
	

}
