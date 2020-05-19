package paquete;

//calcular área de rectángulo -versión 1
import javax.swing.*;
import java.awt.*;
import java.applet.Applet;
//Paquete para el manejo de lo

import javax.swing.JOptionPane;
  

public class Calculo extends Applet {
  
  private float longitudFloat;

  public void paint(Graphics g) {
    int longitud; //declaraciones
    int anchura;
    int area;
    //Conversion explicita de String a entero empleando la clase Integer
    // el metodo empleado es parseInt y convierte un String a entero.
    //El metodo showInputDialog retorna un String digitado en el cuadro de dialogo
    longitud = Integer.parseInt( JOptionPane.showInputDialog("Ingrese la Longitud: "));//asignaciones
    anchura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la anchura: "));
    area = longitud * anchura; //* indica multiplicar
    //El metodo showMessageDialog recibe como parametros de entrada un null y un
    //String a imprimir dentro del cuadro de dialogo.
    JOptionPane.showMessageDialog(null, "El area es: "+area);
    g.drawString("El área es " + area, 100, 100);
    //mostrar respuesta en pantalla
    longitudFloat = area;
    JOptionPane.showMessageDialog(null, "El area es: "+longitudFloat);
    g.drawString("El área en flotante es: " + longitudFloat, 100, 90); //mostrar respuesta en pantalla
    JOptionPane.showMessageDialog(null, "El area es: "+longitudFloat);
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