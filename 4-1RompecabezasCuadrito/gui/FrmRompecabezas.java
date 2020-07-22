
package gui;
import logica.Cuadrito;
import persistencia.Archivo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author chamo
 */
public class FrmRompecabezas extends JFrame implements KeyListener{
    Container panel;
    JButton btnGuardar, btnCargar;
    Pantalla pantalla;
    Cuadrito cuadro;
    int movimientos =0;
    public FrmRompecabezas() {
        panel = getContentPane();
        pantalla = new Pantalla();
        panel.setLayout(null);
        pantalla.setBounds(5,5,170,170);
        panel.add(pantalla);
        cuadro = new Cuadrito();
        cuadro.iniciarCuadrito();
        
        addKeyListener(this);
        pack();
        setBounds(50,50,170,250);
        pantalla.setA(cuadro.getCuadrito());
        pantalla.repaint();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        FrmRompecabezas f = new FrmRompecabezas();
    }

    public void keyPressed(KeyEvent k) {
        System.out.println(k.getKeyCode());
        movimientos++;
        switch(k.getKeyCode()){
            case 37://izquierda
                cuadro.mover('b');
                break;
            case 38://arriba
                cuadro.mover('i');
                break;
            case 39://derecha
                cuadro.mover('a');
                break;
            case 40://abajo
                cuadro.mover('d');
                break;
            case 71://guardar
                cuadro.guardarCuadrito();
                break;
            case 65://cargar
                cuadro.cargarCuadrito();
                break;
        }
        pantalla.setA(cuadro.getCuadrito());
        pantalla.repaint();
        if(cuadro.verificarOrden()){
            JOptionPane.showMessageDialog(null, "Triunfo en "+movimientos+" movimientos ");
        }
    }

    public void keyReleased(KeyEvent arg0) {
        
    }

    public void keyTyped(KeyEvent arg0) {
        
    }
    

}
