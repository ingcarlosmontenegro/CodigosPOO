/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pryflecha;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author alejo
 */
public class GuiJuego extends JFrame{
    MiCanvas canvas;

    public GuiJuego(){
        canvas = new MiCanvas();
        canvas.setBounds(0, 0, 300, 600);
        getContentPane().add(canvas,BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        canvas.repaint();
        pack();
        setVisible(true);
    }
}
