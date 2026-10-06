import javax.swing.*;
import java.awt.*;

class PanelGlobo extends JPanel {
    private Globo miGlobo;
    
    public void setGlobo(Globo globo) {
        this.miGlobo = globo;
        repaint();
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (miGlobo != null) {
            miGlobo.mostrar(g);
        }
    }
}