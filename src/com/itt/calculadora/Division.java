package com.itt.calculadora;


/**
 * <p>Clase estática que realiza las operaciones básicas de división en una calculadora: <br>
 * &nbsp&nbsp- división de dos números reales <br>
 * &nbsp&nbsp- división de dos númeos enteros <br>
 * &nbsp&nbsp- inverso de un número real<br>
 * &nbsp&nbsp- raíz de un número<br>
 * No est&aacute permitido usar números negativos en la división. Su uso inducirá a un error
 * en la aplicación</p>
 * <hr/>
 * <h3>Metodos que implementa:</h3>
 * <p>
 * 	<ol>
 * 			<li><h3><em>{@link #Division()}:</em></h3>
 * 				<ul>
 * 					<li> 
 * 						Constructor por defecto que no recibe ningún parámetro.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #divReales(double, double)}:</em></h3>
 * 				<ul>
 * 					<li> 
 * 						Método para dividir dos números reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #divEnteros(int, int)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Método para dividir dos números enteros.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #inverso(int)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Método para calcular el inverso de un número.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #raiz(double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Método para calcular la raíz cuadrada de un número.
 * 					</li>
 * 				</ul>
 * 			</li>
 *		</ol>
 *</p>
 *<hr/>
 *<h2>Casos especiales:</h2>
 *<ol>
 *	<li><p>Utilización de números negativos no permitidos:</p>
 * 		Si uno de los números pasados es negativo se lanzara una excepción
 *		ya que realiza operaciones básicas de suma de números positivos.
 * 	</li>
 * 	<li><p>Usar caracteres en vez de números:</p>
 * 		Si en vez de números como argumentos se pasan caracteres, se lanzará
 * 		una excepción, ya que lo único que están permitidos son números.
 * 	</li>
 *</ol>
 *
 * @version 1.0
 * @since 20/01/2021
 * @author Miguel A. Lozano.
 */


public class Division {
	
	/**
	 * Constructor por defecto que no recibe ningún parámetro.
	 */
	public Division() {
		
	}
	
	/**
	  * Método para dividir dos números reales.
	  * @param num1
	  * 		Recoge el primer número real, que será el dividendo de la división.
	  * @param num2
	  * 		Recoge el segundo número real, que será el divisor de la división,
	  * 		este número deberá ser <b>distinto de cero</b>. 
	  * @return
	  * 		Nos devuelve (retorna) el resultado de la división entre los dos números.
	  * @exception
	  * 		IOException Si en uno de los parámetros en vez de un número se introduce un carácter, lanzará una excepción
	  * 		indicando el error
	  * @exception
	  * 		IOException Si en el segundo parámetros se introduce un cero, lanzará una excepción
	  * 		indicando el error.
	  * @exception
	  * 		IOException Comprobar que se realiza una división de números naturales, diferentes de cero. De no ser así
	  * 		lanzará una excepción indicando el error.
	  */
	
	public static double divReales(double num1, double num2) {
		
		return (num1/num2);
		 
	}
	
	/**
	  * Método para dividir dos números enteros.
	  * @param num1
	  * 		Recoge el primer número entero, que será el dividendo de la división.
	  * @param num2
	  * 		Recoge el segundo número entero, que será el divisor de la división,
	  * 		este número deberá ser <b>distinto de cero</b>. 
	  * @return
	  * 		Nos devuelve el resultado de la división entre los dos números, siendo el valor devuelto un número real.
	  * @exception
	  * 		IOException Si en uno de los parámetros en vez de un número se introduce un carácter, lanzará una excepción
	  * 		indicando el error
	  * @exception
	  * 		IOException Si en el segundo parámetros se introduce un cero, lanzará una excepción
	  * 		indicando el error.
	  * @exception
	  * 		IOException Comprobar que se realiza una división de números naturales, diferentes de cero. De no ser así
	  * 		lanzará una excepción indicando el error.
	  */	
	
	public static double divEnteros(int num1, int num2) {
		
		return num1/num2;
	}
		
	/**
	  * inversoMétodo para calcular el inverso de un número.
	  * @param num
	  * 		Recoge el número del cual queremos calcular su inverso.
	  * @return
	  * 		Nos devuelve el resultado de la operación.
	  * @exception
	  * 		IOException Si el parámetro en vez de un número se introduce un carácter, lanzará una excepción
	  * 		indicando el error
	  * @exception
	  * 		IOException Si el parámetro que se introduce es cero, lanzará una excepción
	  * 		indicando el error.
	  *  @exception
	  * 		IOException Si el número pasado es negativo se lanzara una excepción
	  *			ya que realiza operaciones básicas de suma de números positivos.
	  */	
	public static double inverso(int num) {
		
		return 1/num;
	}
	
	/**
	  * Método para calcular la raíz cuadrada de un número.
	  * @param num
	  * 		Recoge el número del cual queremos calcular su raíz.
	  * @return
	  * 		Nos devuelve la raíz cuadrada de num.<br>
	  * 		Si el parámetro que se introduce es menor o igual cero, nos devuelve cero
	  * @exception
	  * 		IOException Si el parámetro en vez de un número se introduce un carácter, lanzará una excepción
	  * 		indicando el error
	  * @exception
	  * 		IOException Si el parámetro que se introduce es menor o igual cero, lanzará una excepción
	  * 		indicando el error.
	  */
	public static double raiz(double num) {
	
		return (Math.sqrt(num));
	}
	

}