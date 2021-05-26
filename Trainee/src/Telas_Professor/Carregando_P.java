package Telas_Professor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.Font;

public class Carregando_P extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carregando_P frame = new Carregando_P();
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
	public Carregando_P() {
		
		//Importes

		Inicial_P inicial = new Inicial_P();
		
		final long time = 1000; // a cada X ms milissegundo
		Timer timer = new Timer();
		
		//Importes
		
		setTitle("Carregando");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 495);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);//PRA DEIXAR A TELA CENTRALIZADA COM O MONITOR
		
		JLabel lblCarregado = new JLabel("Carregando...\r\n");
		lblCarregado.setFont(new Font("Roboto Condensed", Font.PLAIN, 60));
		lblCarregado.setForeground(Color.WHITE);
		lblCarregado.setBounds(207, 312, 414, 100);
		contentPane.add(lblCarregado);
		
		JLabel Fantasminha = new JLabel("");
		Fantasminha.setIcon(new ImageIcon(Carregando_P.class.getResource("/GIf/Fantasminha.gif")));
		Fantasminha.setBounds(583, 345, 100, 100);
		contentPane.add(Fantasminha);
		
		JLabel GIF_Loading = new JLabel("");
		GIF_Loading.setBounds(238, 70, 220, 220);
		GIF_Loading.setIcon(new ImageIcon(Carregando_P.class.getResource("/GIf/Loading-220.gif")));
		contentPane.add(GIF_Loading);
		
		TimerTask tarefa = new TimerTask() {

			int i = 0;

			public void run() {
				// método

				try {
					i++;

					if (i == 3) {
						inicial.setVisible(true);
						timer.cancel();
						dispose();

					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		timer.scheduleAtFixedRate(tarefa, time, time);
	}
}
