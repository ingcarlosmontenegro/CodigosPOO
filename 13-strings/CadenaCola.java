/**
 * 
 */
package strings;

/**
 * @author Carlos
 *Los metodos no utilziados tienen el mismo funcionamiento que en la calse String
 */
public class CadenaCola {
	
	// constructor por defecto de capacidad 16
	StringBuffer cadenaDina1 = new StringBuffer();
	//constructor sobrecargado que recibe un string y la capcidad la determina el
	StringBuffer cadenaDina2 = new StringBuffer("Universidad Distrital ");
	//constructor sobrecargado definiendole la capacidad inicial
	StringBuffer cadenaDina3 = new StringBuffer(2);
		
	public void llamar(){
		//retorna la capacidad del stringBuffer
		System.out.println(cadenaDina1.capacity());
		System.out.println(cadenaDina2.capacity());
		System.out.println(cadenaDina3.capacity());
		
		char arregloChar[] = {'F','r','a','n','c','i','s','c','o',' '};
		//Agrega al stringBuffer un arreglo de caracteres
		//modificando el original
		cadenaDina3.append(arregloChar);
		
		//Agrega al stringBuffer un String
		//modificando el original
		cadenaDina1.append("Jose de Caldas");
		
		//Imprime el contenido del StringBuffer
		System.out.println(cadenaDina3);
		System.out.println(cadenaDina2);
		System.out.println(cadenaDina1);
		
		//retorna la capacidad del stringBuffer
		// cuando esta se excede la capacidad incrementa lo necesario 
		System.out.println(cadenaDina1.capacity());
		System.out.println(cadenaDina2.capacity());
		System.out.println(cadenaDina3.capacity());
		
		cadenaDina2.append(cadenaDina1);
		System.out.println(cadenaDina2);
		
		//Inserta diferentes tipos de atributos en el indice dado
		//modificando el original
		cadenaDina2.insert(22, cadenaDina3);
		System.out.println(cadenaDina2);
		
		//Elimina los caracteres comprendidos entre los dos indices
		//modificando el original
		cadenaDina2.delete(22, 31);
		System.out.println(cadenaDina2);

		//Elimina el caracter del indice dado
		//modificando el original
		cadenaDina2.deleteCharAt(22);
		System.out.println(cadenaDina2);

		//Invierte el string
		//Modificando el original
		cadenaDina2.reverse();
		System.out.println(cadenaDina2);		
		
	}

}
