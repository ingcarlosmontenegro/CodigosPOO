/**
 * 
 */
package strings;

import java.util.StringTokenizer;

/**
 * @author Carlos
 *
 */
public class CadenaToken {

	// tokeniza con el delimitador espacio por defecto
	private StringTokenizer cadenaPalabra= new StringTokenizer("Universidad Distrital Francisco Jose de Caldas");
	// tokeniza con el delimitar determinado
	private StringTokenizer cadenaPalabra1= new StringTokenizer("Universidad,Distrital,Francisco,Jose,de,Caldas", ",");
	// tokeniza con el delimitador determinado y lo toma como token
	private StringTokenizer cadenaPalabra2= new StringTokenizer("Universidad,Distrital,Francisco,Jose,de,Caldas", ",", true);
	
	public void llamar(){
		
		//Cuneta la cantidad de Tokens
		System.out.println(cadenaPalabra.countTokens());
		System.out.println(cadenaPalabra1.countTokens());
		System.out.println(cadenaPalabra2.countTokens());
		
		// pregunta se hay mas tokens, retorna un boolean
		while(cadenaPalabra.hasMoreTokens())
			// obtiene el siguiente token y lo retornma como string
			System.out.print(cadenaPalabra.nextToken());
		
		System.out.println("");
		
		//pregunta se hay mas tokens, retorna un boolean
		while(cadenaPalabra1.hasMoreTokens())
			// obtiene el siguiente token y lo retornma como string
			System.out.print(cadenaPalabra1.nextToken());
		
		System.out.println("");
		
		//pregunta se hay mas tokens, retorna un boolean
		while(cadenaPalabra2.hasMoreTokens())
			// obtiene el siguiente token y lo retornma como string
			System.out.print(cadenaPalabra2.nextToken());

		
		
			
	}
	

}
