

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paleta objPaleta = new Paleta();
		objPaleta.setColor("amarillo");
		
		Paleta objPaleta2 = (Paleta)objPaleta.clone();
		System.out.println(objPaleta2.getColor());
		
	}

}
