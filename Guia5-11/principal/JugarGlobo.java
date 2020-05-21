//Paquete principal que contiene la clase
package principal;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import objeto.Globo;

public class JugarGlobo extends JApplet implements ActionListener {

 private JButton agrandar, reducir;
 private Globo miGlobo;

 public void init() {
 getContentPane().setLayout(new FlowLayout ());  
 agrandar = new JButton ("Agrandar");
 add (agrandar);
 agrandar.addActionListener(this);

 reducir = new JButton ("Reducir");
 add (reducir);
 reducir.addActionListener(this);

 miGlobo = new Globo (20, 50, 50);
 }
 public void actionPerformed(ActionEvent event) {
 if (event.getSource() == agrandar)
 miGlobo.cambiarTamaño(10);
 if (event.getSource() == reducir)
 miGlobo.cambiarTamaño(-10);
 repaint();
 }
 public void paint (Graphics g) {
 miGlobo.mostrar(g);
 }

 public static void main (String Args[]){
 JFrame f = new JFrame("Applet desde Consola");
 //crear una instancia de
 JugarGlobo start = new JugarGlobo();
 //Agregar la instancia del applet al marco
 f.add(start);
 //inicializar las variables al ancho y el alto de la
 int width = 400;
 int height = 400;
 f.setSize(width, height);
 //llamar a init() y a start() si es necesario
 start.init();
 //hacer visible el marco
 f.show();

 }
}