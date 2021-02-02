

import java.io.*;

public class RegistroCuentasAccesoAleatorio extends RegistroCuentas {
  
    public static final int TAMANIO = 72;

   // el constructor sin argumentos llama al otro constructor con los valores predeterminados
   public RegistroCuentasAccesoAleatorio()
   {
      this( 0, "", "", 0.0 );
   }

   // inicializar un objeto RegistroCuentasAccesoAleatorio
   public RegistroCuentasAccesoAleatorio( int cuenta, String primerNombre, 
      String apellidoPaterno, double saldo )
   {
      super( cuenta, primerNombre, apellidoPaterno, saldo );
   }

   // leer un registro del objeto RandomAccecssFile especificado
   public void leer( RandomAccessFile archivo ) throws IOException
   {
      establecerCuenta( archivo.readInt() );
      establecerPrimerNombre( leerNombre( archivo ) );
      establecerApellidoPaterno( leerNombre( archivo ) );
      establecerSaldo( archivo.readDouble() );
   }

   // asegurarse que el nombre sea de la longitud apropiada
   private String leerNombre( RandomAccessFile archivo ) throws IOException
   {
      char nombre[] = new char[ 15 ], temp;

      for ( int cuenta = 0; cuenta < nombre.length; cuenta++ ) {
         temp = archivo.readChar();
         nombre[ cuenta ] = temp;
      }     
      
      return new String( nombre ).replace( '\0', ' ' );
   }

   // escribir un registro en el objeto RandomAccessFile especificado
   public void escribir( RandomAccessFile archivo ) throws IOException
   {
      archivo.writeInt( obtenerCuenta() );
      escribirNombre( archivo, obtenerPrimerNombre() );
      escribirNombre( archivo, obtenerApellidoPaterno() );
      archivo.writeDouble( obtenerSaldo() );
   }

   // escribir un nombre en el archivo; máximo 15 caracteres
   private void escribirNombre( RandomAccessFile archivo, String nombre )
      throws IOException
   {
      StringBuffer bufer = null;

      if ( nombre != null ) 
         bufer = new StringBuffer( nombre );
      else 
         bufer = new StringBuffer( 15 );

      bufer.setLength( 15 );
      archivo.writeChars( bufer.toString() );
   }

} // fin de la clase RegistroCuentasAccesoAleatorio