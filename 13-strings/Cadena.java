/**
 * 
 */
package strings;


/**
 * @author Carlos
 *
 */
public class Cadena {
	
	private char[] arregloChar2 = new char[14];
	private char[] arregloChar = {'F','r','a','n','c','i','s','c','o'};
	private String sCadena = new String(arregloChar);  
	
	public void llamar (String cad){
		
		/**
		 * Retorna el caracter dado el indice especifico
		 */
		System.out.println(cad.charAt(6));
		
		/**
		 * Retorna el codigo Unicode dado el indice especifico
		 */
		System.out.println(cad.codePointAt(6));

		/**
		 * Retorna el codigo Unicode anterior dado el indice especifico
		 */
		System.out.println(cad.codePointBefore(6));

		/**
		 * Retorna la cantidad de caracteres comprendidos entre los indices dados
		 */
		System.out.println(cad.codePointCount(6,10));
		
		/**
		 * Retorna la diferencia de caracteres entre el string y otro dado
		 */
		System.out.println(cad.compareTo(sCadena));
		
		/**
		 * Concatena el string con otro dado, no altera el original
		 */
		System.out.println(cad.concat(sCadena));
		
		/**
		 * Verifica si el string contiene a otro, retorna boolean 
		 */
		System.out.println(cad.contains(sCadena));
		System.out.println(cad.contains("Distri"));
		

		/**
		 * Verifica si el string es igual al dado, retorna boolean 
		 */
		System.out.println(cad.contentEquals(sCadena));
		System.out.println(cad.contentEquals("Universidad Distrital "));
		
		/**
		 * Metodo static que convierte un arreglo de caracteres a String
		 */
		System.out.println(String.copyValueOf(arregloChar));
		
		/**
		 * Metodo static que convierte un arreglo de caracteres a String
		 * desde un indice dado y la catidad de carates que requiere convertir.
		 */
		System.out.println(String.copyValueOf(arregloChar, 5, 4));
		
		/**
		 *Verifica si el string termina en otro dado, retorna boolean 
		 */
		System.out.println(cad.endsWith("tal "));

		/**
		 * Compara el String con otro, retorna un boolean
		 */
		System.out.println(cad.equals("Universidad Distrital "));
		
		/**
		 * Compara el String con otro ignorando minusculas y mayusculas
		 * retorna un boolean
		 */
		System.out.println(cad.equalsIgnoreCase("universidad distrital "));

		/**
		 * Convierte un String en arreglo de Bytes
		 */
		byte arregloByte[] = "Francisco Jose De Caldas".getBytes();
		System.out.println(arregloByte[6]);
		
		/**
		 * Convierte un String en arreglo de caracteres eviandole
		 * comienzo del string, fin del string a copiar,
		 * el arrglo de caracteres y el indice desde donde comenzar a copiar.
		 */
		"Francisco Jose De Caldas".getChars(10, 24, arregloChar2, 0);
		for (int i=0; i<14; i++)
			System.out.print(arregloChar2[i]);
		System.out.println("");
		
		/**
		 * Retorna el indice en donde esta el caracter a buscar
		 * Tambien funciona enviandole Strings
		 */
		System.out.println(cad.indexOf('i'));
		
		/**
		 * Retorna el indice en donde esta el caracter a buscar
		 * partiendo desde el numero del indice dado
		 * Tambien funciona enviandole Strings
		 */
		System.out.println(cad.indexOf('i',3));
		
		/**
		 * Retorna el indice en donde esta el caracter a buscar
		 * de atras hacia adelante
		 * Tambien funciona enviandole Strings
		 */
		System.out.println(cad.lastIndexOf('i'));
		
		/**
		 * Retorna el indice en donde esta el caracter a buscar
		 * de atras hacia adelante partiendo desde el numero del indice dado
		 * Tambien funciona enviandole Strings
		 */
		System.out.println(cad);
		System.out.println(cad.lastIndexOf('i',16));		
		
		/**
		 * Retorna el tamaño del string
		 */
		System.out.println(cad.length());
		
		/**
		 * Reeplaza en el string la cadena dada por otra.
		 * sin modificar la original.
		 */
		System.out.println(cad.replace("i","I"));

		/**
		 * Reeplaza en el string la primera cadena dada por otra.
		 * sin modificar la original.
		 */
		System.out.println(cad.replaceFirst("i","I"));
		
		/**
		 *Verifica si el string comienza en otro dado, retorna boolean 
		 */
		System.out.println(cad.startsWith("Uni"));
		
		/**
		 *Retorna el string comprendido desde el indice dado hasta el final. 
		 */
		System.out.println(cad.substring(12));
		
		/**
		 *Retorna el string comprendido entre los dos indices dados.
		 */
		System.out.println(cad.substring(12,18));
		
		/**
		 *Convierte un String en arreglo de caracteres
		 */
		arregloChar2 = "Jose de Caldas".toCharArray();
		System.out.println(arregloChar[0]);

		
		/**
		 *Convierte un String a minusculas sin modificar el original
		 */
		System.out.println(cad.toLowerCase());

		/**
		 *Convierte un String a mayusculas sin modificar el original
		 */
		System.out.println(cad.toUpperCase());
		
		/**
		 *Elimina los espacios en blanco al principio o al final del string
		 *No modifica el original
		 */
		System.out.println(cad.length());
		System.out.println(cad.trim().length());
		
		/**
		 *Convierte primitivas a string
		 */
		System.out.println(String.valueOf(false)+String.valueOf(12.786));
		
		
	}
	
}
