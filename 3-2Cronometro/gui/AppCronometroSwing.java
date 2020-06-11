package gui;
//clases para los componentes graficos
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//clases para la programacion del timer
import java.util.Timer;
import java.util.TimerTask;

import logic.*;

public class AppCronometroSwing implements ActionListener{
    //componentes graficos
    //JTextField texto;
    JFrame frame;
    JPanel panel;
    JLabel lblTiempo;
    JButton btnIniciar, btnParar, btnBorrar, btnRetroceder;
    //para el Timer
    Timer timer;
    //banderas de estado
    boolean parado;
    boolean avanzando;
    //para crear una fuente personalizada
    Font font;
    //clase que maneja la logica
    Cronometro crn;
    
    public AppCronometroSwing() {
        crn = new Cronometro();
        
        font = new Font("Arial",font.BOLD,50);
        frame = new JFrame("Cronometro");
        panel = new JPanel(new GridLayout(1,4));
        btnIniciar = new JButton("Iniciar");
        btnIniciar.addActionListener(this);
        btnRetroceder = new JButton("Retroceder");
        btnRetroceder.addActionListener(this);
        btnParar = new JButton("Parar");
        btnParar.addActionListener(this);
        btnBorrar = new JButton("Reset");
        btnBorrar.addActionListener(this);
        //texto = new JFormattedTextField(2);
        lblTiempo = new JLabel("0 : 0 : 0",SwingConstants.CENTER);
        lblTiempo.setFont(font);
        lblTiempo.setForeground(new Color(255,255,255));
        lblTiempo.setBackground(new Color(0,0,0));
        lblTiempo.setOpaque(true);
        
        panel.add(btnIniciar);
        panel.add(btnRetroceder);
        panel.add(btnParar);
        panel.add(btnBorrar);
        
        frame.getContentPane().add(lblTiempo, BorderLayout.NORTH);
        //frame.getContentPane().add(texto, BorderLayout.CENTER);
        frame.getContentPane().add(panel, BorderLayout.SOUTH);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        frame.pack();
        frame.setVisible(true);
        
        parado = true;
        avanzando = false;
        
    }
    
    public static void main(String[] args) {
        AppCronometroSwing a=new AppCronometroSwing();
    }
    
    public void actionPerformed(ActionEvent a){
        System.out.println(a.getActionCommand());
        if(a.getActionCommand().equals("Iniciar")){
            parado = false;
            avanzando = true;
            timer = new Timer();
            timer.schedule(new Tarea(),0, 1*1000);
            btnRetroceder.setEnabled(false);
        }
        if(a.getActionCommand().equals("Retroceder")){
            parado = false;
            avanzando = false;
            timer = new Timer();
            timer.schedule(new Tarea(),0, 1*1000);
            btnIniciar.setEnabled(false);
        }
        if(a.getActionCommand().equals("Parar")){
            parado = true;
            btnIniciar.setEnabled(true);
            btnRetroceder.setEnabled(true);
        }
        if(a.getActionCommand().equals("Reset")){
            parado = true;
            lblTiempo.setText(crn.reset());
            btnIniciar.setEnabled(true);
            btnRetroceder.setEnabled(true);
        }
    }
    
    class Tarea extends TimerTask {
        public void run() {
            if(parado){
                System.out.println("Terminamos la ejecucion del timer");
                timer.cancel();
            }else{
                if(avanzando){
                    lblTiempo.setText(crn.forward());
                }else{
                    lblTiempo.setText(crn.back());
                }
            }
        }
    }

}
