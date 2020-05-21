public class Prueba {
  public static void main (String args[]){
  int i=5;
  do{
    i --;
    if (i == 3) break;
    System.out.println(i);
  } while ( i > 0 );
  // En este ejemplo cuando i tenga el valor 3
  // se abandonará el bucle.
  }
}