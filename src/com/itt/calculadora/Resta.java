package com.itt.calculadora;

/**
 * <p>Clase est&aacutetica que realiza las operaciones b&aacutesicas de resta o sustracci&oacuten en una calculadora,
 * adicionalmente proporciona m&eacutetodos para guardar y consultar el acumulado de las restas: <br>
 * &nbsp&nbsp- resta de dos n&uacutemeros reales <br>
 * &nbsp&nbsp- resta de dos n&uacutemeros enteros<br>
 * &nbsp&nbsp- resta de tres n&uacutemeros reales<br>
 * &nbsp&nbsp- resta con memoria</br>
 * No est&aacute permitido usar n&uacutemeros negativos en la resta.</p>
 * <hr/>
 * <h3>M&eacutetodos que implementa:</h3>
 * <p>
 * 	<ol>
 * 			<li><h3><em>{@link #Resta()}</em></h3>
 * 				<ul>
 * 					<li>
 * 						Constructor por defecto que no recibe argumentos.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #resReales(double, double)}</em></h3>
 * 				<ul>
 * 					<li>
 * 						M&eacutetodo para la resta de dos n&uacutemeros reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #resEnteros(int, int)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						M&eacutetodo para la resta de dos n&uacutemeros enteros.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #resTresReales(double, double, double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						M&eacutetodo para la resta de tres n&uacutemeros reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #resAcumulado(double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						M&eacutetodo para la resta con memoria.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #getAcum()}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						M&eacutetodo para poder mostar el resultado de la resta acumulada
 * 					</li>
 *	 			</ul>
 * 			</li>
 *		</ol>
 *</p>
 *<hr/>
 *<h2>Casos especiales:</h2>
 *<ol>
 *	<li><p>Utilizaci&oacuten de n&uacutemeros negativos no permitidos:</p>
 * 		Si uno de los n&uacutemeros pasados es negativo se lanzar&aacute una excepci&oacuten
 *		ya que realiza operaciones b&aacutesicas de resta de n&uacutemeros positivos.
 * 	</li>
 * 	<li><p>Usar caracteres en vez de n&uacutemeros:</p>
 * 		Si en vez de n&uacutemeros como argumentos se pasan caracteres, se lanzar&aacute
 * 		una excepci&oacuten ya que lo &uacutenico que est&aacute permitido son n&uacutemeros.
 * 	</li>
 *</ol>
 *
 * @version 1.0
 * @since 20/01/2021
 * @author Ra&uacutel Ruiz Sanz
 */
public class Resta {

	/**
	 * acum: acumula resultado de diferentes restas
	 */
	private static double acum = 0;

	/**
	 * Constructor de la clase Resta por defecto, no recibe par&aacutemetros
	 */
	public Resta() {
	}

	/**
	 * Realiza la resta de dos n&uacutemeros reales que recibe como argumentos
	 * 
	 * @param num1 este es el minuendo de la resta
	 * @param num2 este es el sustraendo de la resta
	 * @return devuelve la resta de num1 menos num2
	 * @exception IOException Si en uno de los par&aacutemetros en vez de un n&uacutemero se pasa un car&aacutecter 
	 * lanzar&aacute una excepci&oacuten indicando el error 
	 * @exception IOException Si en uno de los par&aacutemetros en vez de un n&uacutemero se pasa un n&uacutemero negativo 
	 * lanzar&aacute una excepci&oacuten indicando el error
	 */
	public static double resReales(double num1, double num2) {

		return (num1 - num2);
	}

	/**
	 * Realiza la resta de dos n&uacutemeros enteros que recibe como argumentos
	 * 
	 * @param num1 este es el minuendo de la resta
	 * @param num2 este es el sustraendo de la resta
	 * @return devuelve la resta de num1 menos num2
	 * @exception IOException Si en uno de los par&aacutemetros en vez de un n&uacutemero se pasa un car&aacutecter 
	 * lanzar&aacute una excepci&oacuten indicando el error 
	 * @exception IOException Si en uno de los par&aacutemetros en vez de un n&uacutemero se pasa un n&uacutemero negativo 
	 * lanzar&aacute una excepci&oacuten indicando el error
	 */
	public static int resEnteros(int num1, int num2) {

		return (num1 - num2);

	}

	/**
	 * Realiza la resta del de tres n&uacutemeros reales que recibe como argumentos
	 * 
	 * @param num1 este es el minuendo de la resta
	 * @param num2 este es el primer sustraendo de la resta
	 * @param num3 este es el segundo sustraendo de la resta
	 * @return devuelve el resultado de la resta de (num1 menos num2) menos num3
	 * @exception IOException Si en uno de los par&aacutemetros en vez de un n&uacutemero se pasa un car&aacutecter 
	 * lanzar&aacute una excepci&oacuten indicando el error 
	 * @exception IOException Si en uno de los par&aacutemetros en vez de un n&uacutemero se pasa un n&uacutemero negativo 
	 * lanzar&aacute una excepci&oacuten indicando el error
	 */
	public static double resTresReales(double num1, double num2, double num3) {

		return (num1 - num2 - num3);
	}

	/**
	 * Acumula el valor que pasamos como argumento, de esta forma podemos guardar el valor acumulado 
	 * de varias restas  <br>
	 * Para consultar el valor acumulado de las restas usamos: 
	 * {@link Resta#getAcum()}
	 * 
	 * @param num resultado de las restas que queremos ir acumulando
	 */
	public static void resAcumulado(double num) {

		acum = acum + num;

	}

	/**
	 * Devuelve el valor de las restas que hemos ido acumulando con el m&eacutetodo
	 * {@link #resAcumulado(double)}
	 * 
	 * @return Devuelve valor acumulado
	 */
	public static double getAcum() {
		return acum;
	}

}