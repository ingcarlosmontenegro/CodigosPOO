
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseStatic objStatic = new ClaseStatic();
		objStatic.radio=4;
		objStatic.coodenadax=1;
		System.out.println("coordenada X de objStatic: "+objStatic.coodenadax);
		objStatic.imprimir();
		ClaseStatic.imprimir();
		
		ClaseStatic objStatic2 = new ClaseStatic();
		objStatic2.radio=8;
		objStatic2.coodenadax=11;
		System.out.println("coordenada X de objStatic2: "+objStatic2.coodenadax);
		objStatic2.imprimir();
		ClaseStatic.imprimir();
		objStatic.imprimir();

		ClaseStatic.radio=10;
		ClaseStatic.imprimir();
    objStatic2.imprimir();
    objStatic.imprimir();
	}

}
