package com.itt.calculadora;


/**
 * <p>Clase est&aacutetica que realiza las operaciones b&aacutesicas de suma en una calculadora: <br>
 * &nbsp&nbsp- suma de dos n&uacutemeros reales<br>
 * &nbsp&nbsp- suma de dos n&uacutemeros enteros<br>
 * &nbsp&nbsp- suma de tres n&uacutemeros reales<br>
 * &nbsp&nbsp- suma con memoria<br>
 * No est&aacute permitido usar n&uacutemeros negativos en la suma. Su uso inducir&aacute a un error
 * en la aplicaci&oacuten</p>
 * <hr/>
 * <h3>Metodos que implementa:</h3>
 * <p>
 * 	<ol>
 * 			<li><h3><em>{@link #Suma()}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Constructor por defecto que no recibe argumentos.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #sumReales(double, double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						M&eacutetodo para la suma de dos n&uacutemeros reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #sumEntero(int, int)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						M&eacutetodo para la suma de dos n&uacutemeros enteros.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #sumTresReales(double, double, double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						M&eacutetodo para la suma de tres n&uacutemeros reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #sumAcumulado(double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						M&eacutetodo para la suma con memoria.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #getAcum()}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						M&eacutetodo para poder mostar el resultado de la suma acumulada
 * 					</li>
 *	 			</ul>
 * 			</li>
 *		</ol>
 *</p>
 *<hr/>
 *<h2>Casos especiales:</h2>
 *<ol>
 *	<li><p>Utilizaci&oacuten de n&uacutemeros negativos no permitidos:</p>
 * 		Si uno de los n&uacutemeros pasados es negativo se lanzar&aacute un aviso de que no est&aacute
 * 		permitido su uso, no realizando la operaci&oacute.
 * 	</li>
 * 	<li><p>Usar caracteres en vez de n&uacutemeros:
 * 		Si en vez de n&uacutemeros como argumentos se quiere pasar caracteres, puede suceder:<br> 
 * &nbsp&nbsp&nbsp- Por linea de comandos: el tipo de variable definido ya impide que se pasen caracteres<br>
 * &nbsp&nbsp&nbsp dando un error en tiempo de compilación.
 * &nbsp&nbsp&nbsp- Por consola mediante la clase Scanner: Al implementar la clase Scanner se puede controlar<br>
 * &nbsp&nbsp&nbsp que el usuario no pase nig&uacuten car&aacutecter controlandolo por condionales o usando la <br>
 * &nbsp&nbsp&nbsp InputMismatchException de la clase java.util.
 * 	</li>
 *</ol>
 *
 * @version 1.0
 * @since 20/01/2021
 * @author jass
 */
public class Suma {
	
	private static double acum = 0;
	
	/**
	 * Constructor por defecto que no recibe ning&uacuten par&aacutemetro.
	 */
	public Suma() {
		
	}
	
	/**
	 * M&eacutetodo est&aacutetico que recibe dos n&uacutemeros reales como argumentos y devuelve la suma de ambos.
	 * @param num1
	 * 		Sumando que recibe un n&uacutemero real
	 * @param num2
	 * 		Sumando que recibe un n&uacutemero real
	 * @return
	 * 		Un n&uacutemero real que es el resultado de la suma de num1 + num2.
	 * 
	 * Si uno de los valores es negativo no se realiar&aacute la operaci&oacuten, devolviendo 0.00;
	 */
	public static double sumReales(double num1, double num2) {
		if((num1<0 || num2 <0)) {
			return 0.00;
		}
		return num1+num2;
	}
	
	/**
	 * M&eacutetodo est&aacutetico que recibe dos n&uacutemero enteros como argumentos y 
	 * devuelve la suma de ambos.
	 * @param num1
	 * 		Sumando que recibe un n&uacutemero entero
	 * @param num2
	 * 		Sumando que recibe un n&uacutemero entero
	 * @return
	 * 		El resultado de la suma de num1 y num2.
	 * 
	 * Si uno de los valores es negativo no se realiar&aacute la operaci&oacuten, devolviendo 0;
	 */
	public static int sumEntero(int num1, int num2) {
		if(num1<0 || num2 <0) {
			return 0;
		}
		return num1+num2;
	}
	
	/**
	 * M&eacutetodo est&aacutetico que recibe tres n&uacutemeros reales como argumentos y devuelve la suma de ambos.
	 * @param num1
	 * 		Sumando que recibe un n&uacutemero real
	 * @param num2
	 * 		Sumando que recibe un n&uacutemero real
	 * @param num3
	 * 		Sumando que recibe un n&uacutemero real
	 * @return
	 * 		Un n&uacutemero real que es el resultado de la suma de num1, num2 y num3
	 * 
	 * Si uno de los valores es negativo no se realiar&aacute la operaci&oacuten, devolviendo 0.00;
	 */
	public static double sumTresReales(double num1, double num2, double num3) {
		if(num1<0 || num2 <0 || num3<0) {
			return 0.00;
		}
		return num1+num2+num3;
	}
	
	/**
	 * M&eacutetodo est&aacutetico que acumula el n&uacutemero que se vaya pasando 
	 * como par&aacutemetro, con el fin de realizar una suma acumulada.<br>
	 * Para consultar el valor acumulado de la suma usamos:
	 * {@link #getAcum()}
	 * @param num
	 * 		N&uacutemero de tipo real 
	 * 
	 * Si uno de los valores es negativo no se realiar&aacute la operaci&oacuten.<br>
	 * Se mostrar&aacute un aviso de que el n&uacutemero no ha sido tenido en cuenta.
	 */
	
	public static void sumAcumulado(double num) {
		if(num < 0) {
			System.out.println("El número introducido no se tiene en cuenta");
			System.out.println("Por favor introduce un número mayor que 0");
		}else {
			acum = acum + num;
		}
	}
	/**
	 * M&eacutetodo est&aacutetico que no recibe par&aacutemetros y devuelve el valor acumulado de la suma.
	 * @return
	 * 		Devuelve el acumulado de la suma que se ha ido acumulando.
	 * 		{@link #sumAcumulado(double)}
	 */
	public static double getAcum() {
		return acum;
	}
}
