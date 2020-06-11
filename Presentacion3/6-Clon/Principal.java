

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
		
    Paleta arregloPaletas[] = new Paleta[5];
    for (int i=0; i<5; i++){
      arregloPaletas[i] = (Paleta)objPaleta.clone();
    }
    for (int i=0; i<5; i++){
      System.out.println(arregloPaletas[i].getColor());
    }
	}

}
