
import java.io.Serializable;

public class RegistroCuentas implements Serializable {
   private int cuenta;
   private String primerNombre;
   private String apellidoPaterno;
   private double saldo;
   
   // el constructor sin argumentos llama al otro constructor con valores predeterminados
   public RegistroCuentas() 
   {
      this( 0, "", "", 0.0 );
   }
  
   // inicializar un registro
   public RegistroCuentas( int cta, String nombre, String apellido, double sald )
   {
      establecerCuenta( cta );
      establecerPrimerNombre( nombre );
      establecerApellidoPaterno( apellido );
      establecerSaldo( sald );
   }

   // establecer número de cuenta   
   public void establecerCuenta( int cta )
   {
      cuenta = cta;
   }

   // obtener número de cuenta
   public int obtenerCuenta() 
   { 
      return cuenta; 
   }
   
   // establecer primer nombre   
   public void establecerPrimerNombre( String nombre )
   {
      primerNombre = nombre;
   }

   // obtener primer nombre 
   public String obtenerPrimerNombre() 
   { 
      return primerNombre; 
   }
   
   // establecer apellido paterno
   public void establecerApellidoPaterno( String apellido )
   {
      apellidoPaterno = apellido;
   }

   // obtener apellido paterno
   public String obtenerApellidoPaterno() 
   {
      return apellidoPaterno; 
   }
   
   // establecer saldo  
   public void establecerSaldo( double sald )
   {
      saldo = sald;
   }

   // obtener saldo   
   public double obtenerSaldo() 
   { 
      return saldo; 
   }

} // fin de la clase RegistroCuentas