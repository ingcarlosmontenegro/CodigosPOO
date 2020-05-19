import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Calculo extends JApplet {

  private float longitudFloat;
    
    public void paint(Graphics g) {
      int longitud; //declaraciones
      int anchura;
      int area;
      longitud = 20; //asignaciones
      anchura = 10;
      area = longitud * anchura; //* indica multiplicar
      g.drawString("El área es " + area, 100, 100); //mostrar respuesta en pantalla
      longitudFloat = area;
      g.drawString("El área en flotante es: " + longitudFloat, 100, 90);
      //mostrar respuesta en pantalla
      g.drawString("Y el área en enteros nuevamente seria: " + (int) longitudFloat, 100, 80); //mostrar respuesta en pantalla
    }

  public static void main (String[] args){
    JFrame frame = new JFrame ("Cargando JApplet");
    Calculo primerasFiguras = new Calculo();
    primerasFiguras.init();
    frame.getContentPane().add(primerasFiguras);
    frame.setSize(500,600);
    frame.setVisible(true);
  }
}