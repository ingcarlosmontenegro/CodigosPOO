import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Saludo extends JApplet {

  public void paint (Graphics g) {
    g.drawString ("Hola", 50, 50);
  }

  public static void main (String[] args){
    JFrame frame = new JFrame ("Cargando JApplet");
    Saludo saludoApplet = new Saludo();
    saludoApplet.init();
    frame.getContentPane().add(saludoApplet);
    frame.setSize(200,200);
    frame.setVisible(true);
  }
}