package reto_0;

public class resolucionReto_0 {

	/*
	 * RESOLVEMOS EN JAVA
	 * 
	 * ENUNCIADO
	 * 
	 * Escribe un programa que muestre por consola (con un print) los números de 1 a
	 * 100 (ambos incluidos y con un salto de línea entre cada impresión),
	 * sustituyendo los siguientes: - Múltiplos de 3 por la palabra "fizz". -
	 * Múltiplos de 5 por la palabra "buzz". - Múltiplos de 3 y de 5 a la vez por la
	 * palabra "fizzbuzz".
	 */

	/*
	 * LÓGICA:
	 * Recorremos con un bucle for los numeros que nos interesan
	 * Utilizamos operador mod (%) para sacar el resto
	 * Siempre que el resto sea == 0, será múltiplo.
	 * Para llegar a la última evaluación para múltiplo de 3 y 5 a la vez
	 * debemos filtrar primero que ambos no sean múltiplos
	 * así evaluaremos en el ultimo "else if" los múltiplos de 3 y 5.
	 * Por último evaluamos en "else" todos los números, ya que estos,
	 * no cumplirán ninguna condición anteriormente verificada.
	 */
	public static void main(String[] args) {

		for (int numero = 1; numero <= 100; numero++) {

			if (numero % 3 == 0 && numero % 5 != 0) {
				System.out.println("fizz" + "(" + numero + ")");
			} else if (numero % 5 == 0 && numero % 3 != 0) {
				System.out.println("buzz" + "(" + numero + ")");
			} else if (numero % 3 == 0 && numero % 5 == 0) {
				System.out.println("fizzbuzz" + "(" + numero + ")");
			} else {
				System.out.println(numero);
			}

		}
	}
}
