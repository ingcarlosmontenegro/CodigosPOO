package es.holamundoswing;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Programa implements ActionListener {

    public int contador = 0;
    public JLabel label = new JLabel("Hola mundo");

    public static void main(String[] args) {
        Programa programa = new Programa();
        programa.mostrarPanel();
    }

    public void mostrarPanel()
    {
        JFrame frame = new JFrame("Prueba");
        JButton boton = new JButton("Aceptar");
        boton.addActionListener(this);
        frame.setLayout(new FlowLayout());
        frame.getContentPane().add(label);
        frame.getContentPane().add(boton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        contador++;
        label.setText(String.valueOf(contador));
    }



}
