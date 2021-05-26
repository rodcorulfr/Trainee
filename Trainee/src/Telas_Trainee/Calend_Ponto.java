package Telas_Trainee;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Calend_Ponto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calend_Ponto frame = new Calend_Ponto();
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
	public Calend_Ponto() {
		setTitle("COLINF - Calend\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);// PRA DEIXAR A TELA CENTRALIZADA COM O MONITOR
		
		JLabel voltar = new JLabel("");
		voltar.setIcon(new ImageIcon(Calend_Ponto.class.getResource("/Fotos/BVoltar-Normal.png")));
		voltar.setBounds(10, 11, 49, 50);
		contentPane.add(voltar);
		
		JLabel Logo = new JLabel("");
		Logo.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/COLINF2.png")));
		Logo.setBounds(522, 360, 161, 85);
		contentPane.add(Logo);
		
		JLabel Fundo = new JLabel("");
		Fundo.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/Background30porcento.png")));
		Fundo.setBounds(0, 0, 693, 456);
		contentPane.add(Fundo);
		
		
		//--------------------------------------------------------------------------------------------------------------
		
		voltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				voltar.setIcon(new ImageIcon(Chat.class.getResource("/Fotos/BVoltar-Click.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				voltar.setIcon(new ImageIcon(Chat.class.getResource("/Fotos/BVoltar-Normal.png")));
				Telas_Trainee.Inicial inicial = new Telas_Trainee.Inicial();
				inicial.setVisible(true);
				dispose();
				
			}
		});
	}

}
