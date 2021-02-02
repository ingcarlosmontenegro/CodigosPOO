// Una GUI reutilizable para los ejemplos de este capítulo.

import java.awt.*;
import javax.swing.*;

public class IUBanco extends JPanel {

   // texto de las etiquetas para la GUI
   protected final static String nombres[] = { "Número de cuenta",
      "Primer nombre", "Apellido", "Saldo", "Monto de la transacción" };

   // componentes de GUI; protegidos para el acceso futuro de las subclases
   protected JLabel etiquetas[];
   protected JTextField campos[];
   protected JButton hacerTarea1, hacerTarea2;
   protected JPanel panelInternoCentro, panelInternoSur;

   protected int tamanio; // número de campos de texto en la GUI

   // constantes que representan a los campos de texto en la GUI
   public static final int CUENTA = 0, PRIMERNOMBRE = 1, APELLIDO = 2, 
      SALDO = 3, TRANSACCION = 4;

   // Configurar GUI. El argumento miTamanio del constructor determina el número de
   // filas de componentes de GUI.
   public IUBanco( int miTamanio )
   {
      tamanio = miTamanio;
      etiquetas = new JLabel[ tamanio ];
      campos = new JTextField[ tamanio ];

      // crear etiquetas
      for ( int cuenta = 0; cuenta < etiquetas.length; cuenta++ )
         etiquetas[ cuenta ] = new JLabel( nombres[ cuenta ] );
            
      // crear campos de texto
      for ( int cuenta = 0; cuenta < campos.length; cuenta++ )
         campos[ cuenta ] = new JTextField();

      // crear panel para distribuir etiquetas y campos
      panelInternoCentro = new JPanel();
      panelInternoCentro.setLayout( new GridLayout( tamanio, 2 ) );

      // adjuntar etiquetas y campos a panelInternoCentro
      for ( int cuenta = 0; cuenta < tamanio; cuenta++ ) {
         panelInternoCentro.add( etiquetas[ cuenta ] );
         panelInternoCentro.add( campos[ cuenta ] );
      }
      
      // crear botones genéricos; sin etiquetas ni manejadores de eventos
      hacerTarea1 = new JButton();
      hacerTarea2 = new JButton(); 

      // crear panel para distribuir los botones y adjuntarlos
      panelInternoSur = new JPanel();      
      panelInternoSur.add( hacerTarea1 );
      panelInternoSur.add( hacerTarea2 );

      // establecer esquema de este contenedor y adjuntarle los paneles
      setLayout( new BorderLayout() );
      add( panelInternoCentro, BorderLayout.CENTER );
      add( panelInternoSur, BorderLayout.SOUTH );

      validate(); // validar esquema 

   } // fin del constructor

   // devolver referencia al botón de tarea genérico hacerTarea1
   public JButton obtenerBotonHacerTarea1() 
   { 
      return hacerTarea1; 
   }

   // devolver referencia al botón de tarea genérico hacerTarea2
   public JButton obtenerBotonHacerTarea2() 
   { 
      return hacerTarea2; 
   }

   // devolver referencia al arreglo campos de objetos JTextField
   public JTextField[] obtenerCampos() 
   { 
      return campos; 
   }

   // borrar el contenido de los campos de texto
   public void borrarCampos()
   {
      for ( int cuenta = 0; cuenta < tamanio; cuenta++ )
         campos[ cuenta ].setText( "" );
   }

   // establecer valores de los campos de texto; lanzar IllegalArgumentException si
   // hay un número incorrecto de objetos String en el argumento
   public void establecerValoresCampos( String cadenas[] )
      throws IllegalArgumentException
   {
      if ( cadenas.length != tamanio )
         throw new IllegalArgumentException( "Debe haber " +
            tamanio + " objetos String en el arreglo" );

      for ( int cuenta = 0; cuenta < tamanio; cuenta++ )
         campos[ cuenta ].setText( cadenas[ cuenta ] );
   }

   // obtener arreglo de objetos String con el contenido actual de los campos de texto
   public String[] obtenerValoresCampos()
   { 
      String valores[] = new String[ tamanio ];

      for ( int cuenta = 0; cuenta < tamanio; cuenta++ ) 
         valores[ cuenta ] = campos[ cuenta ].getText();

      return valores;
   }

} // fin de la clase IUBanco
