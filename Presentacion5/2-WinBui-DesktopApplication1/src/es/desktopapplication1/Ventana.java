package es.desktopapplication1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana {

	private JFrame frame;
	private JTextField txtIngresarInformacn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		txtIngresarInformacn = new JTextField();
		txtIngresarInformacn.setBounds(29, 25, 202, 20);
		txtIngresarInformacn.setText("Ingresar informac\u00F3n");
		panel.add(txtIngresarInformacn);
		txtIngresarInformacn.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 101, 131, 132);
		panel.add(scrollPane);
		
		final JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(142, 52, 89, 23);
		btnAceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				JOptionPane.showMessageDialog(null, txtIngresarInformacn.getText());
				textArea.setText(txtIngresarInformacn.getText());
			}
		});
		panel.add(btnAceptar);
	}
}
