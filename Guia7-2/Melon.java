import javax.swing.JOptionPane;

class Melon {
	public static void main( String[] a ) {
    try{
      int i=0, j=0, k;
      k = i/j; // Origina un error de division-by-zero
      System.out.println (k);
  }
  catch (java.lang.ArithmeticException error)
    {System.out.println("Error división por cero");}
  catch (Exception error){
    System.out.println("Error " + error.toString()); 
	  }
  }
}