package reto_1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Reto_1 {

	/*
	 * Escribe un programa que reciba un texto y transforme lenguaje natural a
	 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje se
	 * caracteriza por sustituir caracteres alfanuméricos. - Utiliza esta tabla
	 * (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/) con el alfabeto y
	 * los números en "leet". (Usa la primera opción de cada transformación. Por
	 * ejemplo "4" para la "a")
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la frase a transformar a lenguaje leet");
		String frase = sc.nextLine();
		
		String fraseConvertidaALeet = convertToLeet(frase);
		
		String fraseConvertANatural = convertFromLeet(fraseConvertidaALeet);
		
		System.out.println(
				"el resultado de convertir " + "'" + frase + "'" + " a lenguaje leet es: " + fraseConvertidaALeet);
		System.out.println("el resultado de convertir " + "'" + fraseConvertidaALeet + "'" + " a lenguaje natural es: "
				+ fraseConvertANatural);
	}

	/**
	 * Convierte una cadena en lenguaje "leet" de vuelta a lenguaje natural.
	 *
	 * @param fraseConvertida La cadena en lenguaje "leet" que se desea convertir.
	 * @return La cadena en lenguaje natural.
	 */
	public static String convertFromLeet(String fraseConvertida) {
	    // Crear un mapa que mapea caracteres en lenguaje "leet" a caracteres en lenguaje natural.
	    Map<Character, Character> leetMap = createLeetMapping();
	    // Crear un StringBuilder para construir la cadena en lenguaje natural.
	    StringBuilder naturalText = new StringBuilder();
	    
	    // Iterar a través de cada carácter en la cadena en lenguaje "leet".
	    for (char c : fraseConvertida.toCharArray()) {
	        // Utilizar el mapa leetMap para encontrar el carácter en lenguaje natural correspondiente.
	        char naturalChar = createReverseLeetMapping(leetMap, c);
	        // Agregar el carácter en lenguaje natural al StringBuilder.
	        naturalText.append(naturalChar);
	    }
	    
	    // Devolver la cadena en lenguaje natural.
	    return naturalText.toString();
	}
	
	/**
	 * Busca un carácter en lenguaje natural correspondiente a un carácter en lenguaje "leet"
	 * utilizando un mapa de mapeo.
	 *
	 * @param leetMap El mapa que contiene las conversiones de caracteres en lenguaje "leet" a lenguaje natural.
	 * @param leetChar El carácter en lenguaje "leet" que se desea convertir.
	 * @return El carácter en lenguaje natural correspondiente o el mismo carácter si no se encuentra en el mapa.
	 */
	public static char createReverseLeetMapping(Map<Character, Character> leetMap, char leetChar) {
	    // Iterar a través de las entradas del mapa leetMap.
	    for (Map.Entry<Character, Character> entry : leetMap.entrySet()) {
	        // Si se encuentra una entrada que coincide con el carácter en lenguaje "leet", devolver el carácter en lenguaje natural.
	        if (entry.getValue() == leetChar) {
	            return entry.getKey();
	        }
	    }
	    // Si no se encuentra en el mapa, devolver el mismo carácter en lenguaje "leet".
	    return leetChar;
	}

	/**
	 * Convierte una cadena en lenguaje natural a lenguaje "leet".
	 *
	 * @param frase La cadena en lenguaje natural que se desea convertir.
	 * @return La cadena en lenguaje "leet" resultante.
	 */
	public static String convertToLeet(String frase) {
	    // Crear un mapa que recibe los valores de mi método createLeetMapping.
	    Map<Character, Character> leetMap = createLeetMapping();
	    // Crear un StringBuilder para construir la cadena en lenguaje "leet".
	    StringBuilder leetText = new StringBuilder();

	    // Iterar a través de cada carácter en la cadena en lenguaje natural.
	    for (char c : frase.toCharArray()) {
	        // Convertir el carácter a minúscula para asegurar que las conversiones funcionen sin importar el caso.
	        char lowercaseChar = Character.toLowerCase(c);
	        // Utilizar el mapa leetMap para encontrar el carácter en lenguaje "leet" correspondiente.
	        char leetChar = leetMap.getOrDefault(lowercaseChar, c);
	        // Agregar el carácter en lenguaje "leet" al StringBuilder.
	        leetText.append(leetChar);
	    }
	    
	    // Devolver la cadena en lenguaje "leet" resultante.
	    return leetText.toString();
	}


	public static Map<Character, Character> createLeetMapping() {
		Map<Character, Character> leetMap = new HashMap<>();

		leetMap.put('a', '4');
		leetMap.put('b', (char) ('l' + '3'));
		leetMap.put('c', '[');
		leetMap.put('d', '(');
		leetMap.put('e', '3');
		leetMap.put('f', (char) ('|' + '='));
		leetMap.put('g', '&');
		leetMap.put('h', '#');
		leetMap.put('i', '1');
		leetMap.put('j', (char) (',' + '_' + '|'));
		leetMap.put('k', (char) ('>' + '|'));
		leetMap.put('l', '1');
		leetMap.put('m', (char) ('/' + '\'' + '/' + '\''));
		leetMap.put('n', (char) ('^' + '/'));
		leetMap.put('o', '0');
		leetMap.put('p', (char) ('|' + '*'));
		leetMap.put('q', (char) ('(' + '_' + ',' + ')'));
		leetMap.put('r', (char) ('l' + '2'));
		leetMap.put('s', '$');
		leetMap.put('t', '7');
		leetMap.put('u', (char) ('(' + '_' + ')'));
		leetMap.put('v', (char) ('\'' + '/'));
		leetMap.put('w', (char) ('\'' + '/' + '\'' + '/'));
		leetMap.put('x', (char) ('>' + '<'));
		leetMap.put('y', 'j');
		leetMap.put('z', '2');

		return leetMap;
	}
}
