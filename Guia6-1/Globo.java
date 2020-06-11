import java.awt.*;

class Globo{

 private int diametro;
 private int xCoord, yCoord;

 public Globo (int diametroInicial, int xInicial, int yInicial) {
 diametro = diametroInicial;
 xCoord = xInicial;
 yCoord = yInicial;
 }

 public void cambiarTamaño (int cambio) {
 diametro = diametro + cambio;
 }

 public void mostrar (Graphics g) {
 g.drawOval (xCoord, yCoord, diametro, diametro);
 }
 
}