import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JugarGlobo extends Applet implements ActionListener {
  
 private Button agrandar, reducir;
 private Globo miGlobo;

 public void init() {
 agrandar = new Button ("Agrandar");
 add (agrandar);
 agrandar.addActionListener(this);

 reducir = new Button ("Reducir");
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

    public static void main (String[] args){
    JFrame frame = new JFrame ("Cargando JApplet");
    JugarGlobo jugarGlobo = new JugarGlobo();
    jugarGlobo.init();
    frame.getContentPane().add(jugarGlobo);
    //frame.setSize(500,600);
    frame.pack();
    frame.setVisible(true);
  }
}