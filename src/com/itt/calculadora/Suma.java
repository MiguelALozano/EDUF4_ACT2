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
 * 		Si uno de los n&uacutemeros pasados es negativo se lanzara una excepci&oacuten
 *		ya que realiza operaciones b&aacutesicas de suma de n&uacutemeros positivos.
 * 	</li>
 * 	<li><p>Usar caracteres en vez de n&uacutemeros:
 * 		Si en vez de n&uacutemeros como argumentos se pasan caracteres, se lanzar&aacute
 * 		una excepci&oacuten ya que lo &uacutenico que est&aacuten permitidos son n&uacutemeros.
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
	 * @exception
	 * 		IOException Si en uno de los par&aacutemetros en vez de un n&uacutemero se pasa un car&aacutecter lanzar&aacute una excepci&oacuten
	 * 		indicando el error
	 * @exception
	 * 		IOException Si en uno de los par&aacutemetros en vez de un n&uacutemero negativo lanzar&aacute una excepci&oacuten
	 * 		indicando el error
	 */
	public static double sumReales(double num1, double num2) {
		
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
	 * @exception
	 * 		IOException Si en uno de los par&aacutemetros en vez de un n&uacutemero se pasa un car&aacutecter lanzar&aacute una excepci&oacuten
	 * 		indicando el error
	 * @exception
	 * 		IOException Si en uno de los par&aacutemetros en vez de un n&uacutemero negativo lanzar&aacute una excepci&oacuten
	 * 		indicando el error
	 */
	public static int sumEntero(int num1, int num2) {
		 
		return  num1+num2;
		
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
	 * @exception
	 * 		IOException Si en uno de los par&aacutemetros en vez de un n&uacutemero se pasa un car&aacutecter lanzar&aacute una excepci&oacuten
	 * 		indicando el error
	 * @exception
	 * 		IOException Si en uno de los par&aacutemetros en vez de un n&uacutemero negativo lanzar&aacute una excepci&oacuten
	 * 		indicando el error
	 */
	public static double sumTresReales(double num1, double num2, double num3) {
				
		return num1+num2+num3;
		
	}
	
	/**
	 * M&eacutetodo est&aacutetico que acumula el n&uacutemero que se vaya pasando 
	 * como par&aacutemetro, con el fin de realizar una suma acumulada.<br>
	 * Para consultar el valor acumulado de la suma usamos:
	 * {@link #getAcum()}
	 * @param num
	 * 		N&uacutemero de tipo real 
	 * @exception
	 * 		IOException Si en uno de los par&aacutemetros en vez de un n&uacutemero se pasa un car&aacutecter lanzar&aacute una excepci&oacuten
	 * 		indicando el error
	 * @exception
	 * 		IOException Si el n&uacutemero pasado como argumento es negativo lanzar&aacute una excepci&oacuten
	 * 		indicando el error
	 */
	
	//Esto es un comentario con acentos en la ó
	public static void sumAcumulado(double num) {

		//TODO Aqu&iacute el c&oacutedigo que tiene que ir acumulando la suma.
		
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
