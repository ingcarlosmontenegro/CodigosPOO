public class Prueba {
  public static void main (String args[]){
    int i=5;
    do{
      System.out.println(i);
      if (i == 3) continue;
      i --;
    }while ( i > 0 ); // En este ejemplo cuando i tenga el valor 3
    // se abandonará la iteración y por tanto el
    // bucle no tendrá fin puesto que no se
    // ejecutaría la sentencia de decremento.
  }
}