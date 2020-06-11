/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pryflecha;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

/**
 *
 * @author alejo
 */
public class MiCanvas extends Canvas implements MouseListener, KeyListener{
    Flecha f;

    public MiCanvas(){
        f = new Flecha();
        f.setImagen("imagenes/flecha_down.png");
        f.setCoordenadaX(10);
        f.setCoordenadaY(23);
        addMouseListener(this);
        addKeyListener(this);
    }
    
    @Override
    public void paint(Graphics g) {
        g.drawString("una viada tan dura", 10, 10);
        g.drawImage((new ImageIcon(f.getImagen())).getImage(), f.getCoordenadaX(), f.getCoordenadaY(), this);
    }

    public void mouseClicked(MouseEvent me) {
        f.setCoordenadaX(me.getX()-100);
        f.setCoordenadaY(me.getY()-100);
        if(f.getImagen().equals("imagenes/flecha_up.png")){
            f.setImagen("imagenes/flecha_down.png");
        }else{
            f.setImagen("imagenes/flecha_up.png");
        }
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        System.out.println(me.getX());
    }

    public void mouseReleased(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseEntered(MouseEvent me) {
        
    }

    public void mouseExited(MouseEvent me) {
        //System.out.println(me.getX());
    }

    public void keyTyped(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void keyPressed(KeyEvent ke) {
        int k = ke.getKeyCode();
        switch(k){
            case 37:
                f.setImagen("imagenes/flecha_left.png");
                break;
            case 38:
                f.setImagen("imagenes/flecha_up.png");
                break;
            case 39:
                f.setImagen("imagenes/flecha_right.png");
                break;
            case 40:
                f.setImagen("imagenes/flecha_down.png");
                break;
        }
        repaint();
    }

    public void keyReleased(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }


}
