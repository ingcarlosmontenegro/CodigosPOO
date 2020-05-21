public class Prueba{
  public static void main(String[] args) {
    System.out.print(funcionEjemplo());
  }

  static int funcionEjemplo(){
    int i=0;
    while (i < 100){
      i++;
      System.out.println (i);
    return i;
    // Cunado encuatra un return retorna este valor y termina el metodo
    //este absurdo metodo nos devuelve 1 como puedes comprobar
    }
  //Nunca se llega a este punto ya que al encontrar el 1er return
  //el metodo termina
  imprimir();
  //Siempre que un metodo devuelva algo, la ultima sentecia en la
  //declaracion debe ser el return, de lo contrario marca error.
  return i;
}

 static void imprimir (){
 System.out.println("esto no se imprime");
 }
}