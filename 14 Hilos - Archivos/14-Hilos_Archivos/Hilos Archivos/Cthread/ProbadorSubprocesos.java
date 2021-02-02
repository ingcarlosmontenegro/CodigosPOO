package Cthread;

// Varios subprocesos imprimiendo en distintos intervalos.

public class ProbadorSubprocesos {

   public static void main( String [] args )
   {
      // crear y nombrar a cada subproceso
      ImprimirSubproceso subproceso1 = new ImprimirSubproceso( "subproceso1" );
      ImprimirSubproceso subproceso2 = new ImprimirSubproceso( "subproceso2" );
      ImprimirSubproceso subproceso3 = new ImprimirSubproceso( "subproceso3" );
        
      System.err.println( "Iniciando subprocesos" );
      
      subproceso1.start(); // iniciar subproceso1 y colocarlo en estado listo
      subproceso2.start(); // iniciar subproceso2 y colocarlo en estado listo
      subproceso3.start(); // iniciar subproceso3 y colocarlo en estado listo
 
      System.err.println( "Subprocesos iniciados, termina main\n" );
        
   } // fin de main
    
} // fin de la clase ProbadorSubprocesos