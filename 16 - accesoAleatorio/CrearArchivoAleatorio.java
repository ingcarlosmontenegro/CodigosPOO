
// Crea un archivo de acceso aleatorio, escribiendo 100 registros vacíos en el disco.
import java.io.*;
import javax.swing.*;


public class CrearArchivoAleatorio {
    
    private static final int NUMERO_REGISTROS = 100;

   // permitir al usuario seleccionar el archivo a abrir
   private void crearArchivo()
   {
      // mostrar cuadro de diálogo para que el usuario pueda seleccionar el archivo
      JFileChooser selectorArchivo = new JFileChooser();
      selectorArchivo.setFileSelectionMode( JFileChooser.FILES_ONLY );

      int resultado = selectorArchivo.showSaveDialog( null );
   
      // si el usuario hizo clic en el botón Cancelar del cuadro de diálogo, regresar
      if ( resultado == JFileChooser.CANCEL_OPTION )
         return;

      // obtener el archivo seleccionado
      File nombreArchivo = selectorArchivo.getSelectedFile(); 

      // mostrar error si el nombre del archivo es inválido
      if ( nombreArchivo == null || nombreArchivo.getName().equals( "" ) )
         JOptionPane.showMessageDialog( null, "Nombre de archivo incorrecto", 
            "Nombre de archivo incorrecto", JOptionPane.ERROR_MESSAGE );

      else {

         // abrir el archivo
         try {           
            RandomAccessFile archivo = 
               new RandomAccessFile( nombreArchivo, "rw" );

            RegistroCuentasAccesoAleatorio registroEnBlanco = 
               new RegistroCuentasAccesoAleatorio();

            // escribir 100 registros en blanco
            for ( int cuenta = 0; cuenta < NUMERO_REGISTROS; cuenta++ )
               registroEnBlanco.escribir( archivo );

            archivo.close(); // cerrar el archivo

            // mostrar mensaje indicando que el archivo se creó
            JOptionPane.showMessageDialog( null, "Se creó el archivo " + 
               nombreArchivo, "Estado", JOptionPane.INFORMATION_MESSAGE );

            System.exit( 0 );  // terminar el programa

         } // fin del bloque try

         // procesar excepciones durante operaciones de apertura, escritura o cierre del archivo
         catch ( IOException excepcionES ) {
            JOptionPane.showMessageDialog( null, "Error al procesar el archivo",
               "Error al procesar el archivo", JOptionPane.ERROR_MESSAGE );

            System.exit( 1 );
         }

      } // fin de instrucción else

   } // fin del método crearArchivo

   public static void main( String args[] )
   {
      CrearArchivoAleatorio aplicacion = new CrearArchivoAleatorio();
      aplicacion.crearArchivo();
   }   

} // fin de la clase CrearArchivoAleatorio