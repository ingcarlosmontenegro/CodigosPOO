import java.applet.Applet;
import java.awt.Graphics;

public class HolaIte extends Applet {
	private int i = 0;
	private String Saludos[] = {
			"Hola Mundo!",
			"HOLA Mundo!",
			"HOLA MUNDO!!"
	};
	
	public void paint( Graphics g ) {
		try {
			g.drawString( Saludos[i],25,25 );
		} catch( ArrayIndexOutOfBoundsException e ) {
			g.drawString( "Saludos desbordado",25,25 );
		} catch( Exception e ) {
			// Cualquier otra excepción
			System.out.println( e.toString() );
		} finally {
			System.out.println( "Esto se imprime siempre!" );
		}
		i++;
	}

}
