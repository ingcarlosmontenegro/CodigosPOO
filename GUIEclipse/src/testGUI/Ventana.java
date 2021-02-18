package testGUI;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private Matriz juego = new Matriz();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(57, 52, 259, 187);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(2,3, 10, 0));

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.print(btnNewButton.getLabel());
				JOptionPane.showMessageDialog(null,btnNewButton.getLabel());
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("New button");
		panel.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("New button");
		panel.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("New button");
		panel.add(btnNewButton_5);

		llenado(panel);

		JButton btnOk = new JButton("New button");
		btnOk.setIcon(new ImageIcon(Ventana.class.getResource("/testGUI/0.png")));
		btnOk.setBounds(328, 116, 116, 35);
		contentPane.add(btnOk);

	}

	private void llenado (JPanel panel) {	
		int x=0;
		int y=0;
		
		Component[] componentes = panel.getComponents();
		for (int i = 0; i<componentes.length; i++) {

			if(componentes[i] instanceof JButton) {
						if ((juego.matriz()[x][y]) == 1){
							try {
								Image img0 = ImageIO.read(getClass().getResource("0.png"));
								((JButton)componentes[i]).setIcon(new ImageIcon(img0));
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}	
						else{
							ImageIcon img1 = new ImageIcon(getClass().getResource("1.png"));							
							((JButton)componentes[i]).setIcon(img1);
						}
						y++;
						if (y==3) {
							x++;
							y=0;
						}


			}
		}
	}	
}
