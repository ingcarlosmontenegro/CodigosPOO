package CFile;

// Demostración de la clase File.
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class PruebaFile extends JFrame
   implements ActionListener {

   private JTextField campoEntrada;
   private JTextArea areaSalida;
   
   // configurar GUI
   public PruebaFile()
   {
      super( "Prueba de la clase File" );

      campoEntrada = new JTextField( "Escriba aquí el nombre del archivo o directorio" );
      campoEntrada.addActionListener( this );
      areaSalida = new JTextArea();

      ScrollPane panelDesplazable = new ScrollPane();
      panelDesplazable.add( areaSalida );

      Container contenedor = getContentPane();
      contenedor.add( campoEntrada, BorderLayout.NORTH );
      contenedor.add( panelDesplazable, BorderLayout.CENTER );

      setSize( 400, 400 );
      setVisible( true );

   } // fin del constructor

   // mostrar información acerca del archivo especificado por el usuario
   public void actionPerformed( ActionEvent eventoAccion )
   {
      File nombre = new File( eventoAccion.getActionCommand() );

      // si nombre existe, mostrar información sobre él
      if ( nombre.exists() ) {
         areaSalida.setText( nombre.getName() + " existe\n" + 
            ( nombre.isFile() ? "es un archivo\n" : "no es un archivo\n" ) +
            ( nombre.isDirectory() ? "es un directorio\n" :
               "no es un directorio\n" ) +
            ( nombre.isAbsolute() ? "es una ruta absoluta\n" : 
               "no es una ruta absoluta\n" ) + "Última modificación: " + 
            nombre.lastModified() + "\nLongitud: " + nombre.length() +
            "\nRuta: " + nombre.getPath() + "\nRuta absoluta: " + 
            nombre.getAbsolutePath() + "\nPadre: " + nombre.getParent() );
         
         // mostrar información si nombre es un archivo
         if ( nombre.isFile() ) {

            // anexar el contenido del archivo a areaSalida
            try {
               BufferedReader entrada = new BufferedReader(
                  new FileReader( nombre ) );
               StringBuffer bufer = new StringBuffer();
               String texto;
               areaSalida.append( "\n\n" );
   
               while ( ( texto = entrada.readLine() ) != null ) 
                  bufer.append( texto + "\n" );
   
               areaSalida.append( bufer.toString() );
            }

            // procesar los problemas en el procesamiento del archivo
            catch( IOException excepcionES ) {
               JOptionPane.showMessageDialog( this, "ERROR EN ARCHIVO",
                  "ERROR EN ARCHIVO", JOptionPane.ERROR_MESSAGE );
            }

         } // fin de instrucción if

         // mostrar listado de directorio
         else if ( nombre.isDirectory() ) {
            String directorio[] = nombre.list();
   
            areaSalida.append( "\n\nContenido del directorio:\n");
   
            for ( int i = 0; i < directorio.length; i++ )
               areaSalida.append( directorio[ i ] + "\n" );
         }

      } // fin de instrucción if externa

      // no es archivo ni directorio, mostrar mensaje de error
      else {
         JOptionPane.showMessageDialog( this,
            eventoAccion.getActionCommand() + " no existe",
            "ERROR", JOptionPane.ERROR_MESSAGE );
      }       

   } // fin del método actionPerformed

   public static void main( String args[] )
   {
      PruebaFile aplicacion = new PruebaFile();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase PruebaFile

