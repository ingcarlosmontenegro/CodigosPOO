/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectocanvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author apdaza
 */
public class MiCanvas extends Canvas {
    int xo;
    int xf;
    int yo;
    int yf;

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(xo, yo, xf, yf);
    }



}
