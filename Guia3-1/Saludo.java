import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Saludo extends JApplet {

  public void paint (Graphics g) {
    g.drawString("Hola Mundo", 50, 50);
  }

  public static void main (String[] args){
    JFrame frame = new JFrame ("Mostrando JApplet");
    Saludo saludoApplet = new Saludo();
    saludoApplet.init();
    frame.getContentPane().add(saludoApplet);
    frame.setSize(300,300);
    frame.setVisible(true);
  }
}
