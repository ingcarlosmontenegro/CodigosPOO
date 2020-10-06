/**
 * 
 */
package strings;

/**
 * @author Carlos
 *
 */
public class Principal {
	
	private static Cadena pCadena = new Cadena();
	private static CadenaCola pCadenaCola= new CadenaCola();
	private static CadenaToken pCadenaToken = new CadenaToken(); 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("********Metodos de la Clase String***********");
		pCadena.llamar("Universidad Distrital ");
		System.out.println("\n********Metodos de la Clase StringBuffer***********");
		pCadenaCola.llamar();
		System.out.println("\n********Metodos de la Clase StringTokenizer***********");
		pCadenaToken.llamar();

	}

}
