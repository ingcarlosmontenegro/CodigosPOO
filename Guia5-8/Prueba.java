public class Prueba {
  public static void main (String args[]){
  bucle1:
    for (int i=0; i<10; i++){
    bucle2:{
      System.out.println("i="+i+" Bucle 2");
      for (int j=0; j<10; j++){
        System.out.println("j="+j+" Bucle 2");
        if (j==5) {
          System.out.println("si j=5 del Bucle 2");
          break bucle2;
          //break bucle1;
        }//cierra if
      }//cierra for del j
    }//cierra bucle2
  } // cuando j llega a 5 el bucle2 deja de
  // ejecutarse hasta la siguiente iteracion
  // del bloque1
  }
}