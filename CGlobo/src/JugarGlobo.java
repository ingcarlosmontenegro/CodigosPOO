import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JugarGlobo extends JFrame implements ActionListener {
    private JButton agrandar, reducir;
    private Globo miGlobo;
    private PanelGlobo panelDibujo;

    public void init() {
        // Configurar el panel de dibujo
        panelDibujo = new PanelGlobo();
        panelDibujo.setBackground(Color.WHITE);
        add(panelDibujo, BorderLayout.CENTER);

        // Panel para botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());

        agrandar = new JButton("Agrandar");
        panelBotones.add(agrandar);
        agrandar.addActionListener(this);

        reducir = new JButton("Reducir");
        panelBotones.add(reducir);
        reducir.addActionListener(this);

        add(panelBotones, BorderLayout.SOUTH);

        miGlobo = new Globo(20, 50, 50);
        panelDibujo.setGlobo(miGlobo);  // Pasar el globo al panel
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == agrandar) {
            miGlobo.cambiarTamaño(10);
        } else if (event.getSource() == reducir) {
            miGlobo.cambiarTamaño(-10);
        }
        panelDibujo.repaint();  // Repintar el panel
    }

    public static void main(String args[]) {
        JugarGlobo principal = new JugarGlobo();
        principal.init();
        principal.setSize(400, 400);
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setVisible(true);
    }
}