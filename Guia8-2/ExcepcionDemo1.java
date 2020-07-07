package exeptions;
import java.awt.*;
import java.applet.Applet;
import java.util.*;
import java.awt.event.*;

public class ExcepcionDemo1 extends Applet

implements ActionListener {
	private TextField cadenaCampo;
	private TextField resultadoCampo;
	private Label resultadoEtiqueta, cadenaEtiqueta;
	
	public void init() {
		cadenaEtiqueta = new Label("Introduzca un entero: ");
		resultadoEtiqueta = new Label("Respuesta: ");
		cadenaCampo = new TextField(30);
		resultadoCampo = new TextField(30);
		resultadoCampo.setEditable(false);
		add(cadenaEtiqueta);
		add(cadenaCampo);
		cadenaCampo.addActionListener(this);
		add(resultadoEtiqueta);
		add(resultadoCampo);
	}
	
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == cadenaCampo) {
			try {
				int numero = Integer.parseInt(cadenaCampo.getText());
				resultadoCampo.setText("El valor duplicado es"+(2*numero));
			}
			catch (NumberFormatException e) {
				resultadoCampo.setText("Error en el número: vuelva a escribir ");
			}
		}
	}
}