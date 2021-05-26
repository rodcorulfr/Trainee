package Telas_Professor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.Laboratorio;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Laboratorio_P extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Laboratorio_P frame = new Laboratorio_P();
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
	public Laboratorio_P() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel voltar = new JLabel("");
		voltar.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BVoltar-Normal.png")));
		voltar.setBounds(10, 11, 49, 50);
		contentPane.add(voltar);

		JButton button = new JButton("1");
		button.setBounds(568, 379, 89, 23);
		contentPane.add(button);

		JLabel lab1 = new JLabel("");

		lab1.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL1-Verde.png")));
		lab1.setBounds(90, 89, 99, 99);
		contentPane.add(lab1);

		JLabel lab3 = new JLabel("");
		lab3.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL3-Verde.png")));
		lab3.setBounds(232, 89, 99, 99);
		contentPane.add(lab3);

		JLabel lab4 = new JLabel("");
		lab4.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL4-Verde.png")));
		lab4.setBounds(380, 89, 99, 99);
		contentPane.add(lab4);

		JLabel lab5 = new JLabel("");
		lab5.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL5-Verde.png")));
		lab5.setBounds(521, 89, 99, 99);
		contentPane.add(lab5);

		JLabel lab6 = new JLabel("");
		lab6.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL6-Verde.png")));
		lab6.setBounds(90, 237, 99, 99);
		contentPane.add(lab6);

		JLabel lab7 = new JLabel("");
		lab7.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL7-Verde.png")));
		lab7.setBounds(232, 237, 99, 99);
		contentPane.add(lab7);

		JLabel lab8 = new JLabel("");
		lab8.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL8-Verde.png")));
		lab8.setBounds(380, 237, 99, 99);
		contentPane.add(lab8);

		JLabel fundo = new JLabel("");
		fundo.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/Background30porcento.png")));
		fundo.setBounds(0, 0, 693, 456);
		contentPane.add(fundo);

		/*
		 * button.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent arg0) { Classes.BD bd = new Classes.BD();
		 * bd.conectar(); int lab=2;
		 * 
		 * if (cbLab.getSelectedItem() == "Laboratório - 1") { lab = 1; }else { lab +=
		 * cbLab.getSelectedIndex(); }
		 * 
		 * 
		 * String info = String.format("'%s','%s'", lab , 1); bd.inserir("laboratorios",
		 * info);
		 * 
		 * } });
		 */

		Classes.BD bd = new Classes.BD();
		bd.conectar();

		// ------------------------------------------------------------------------------------------------------------------------------------
		// LAB 1

		lab1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Laboratorio lab = new Laboratorio();
				bd.conectar();

				try {
					bd.trazerWH("laboratorios", "1");

					if (bd.result.next()) {

						lab.validar = true;
					}

					if (lab.validar == false) {
						lab1.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL1-Vermelho.png")));
						bd.inserir("laboratorios", "1");
					}
					if (lab.validar == true) {
						lab1.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL1-Vermelho.png")));
						JOptionPane.showMessageDialog(null,
								"Esse problema já foi informado\nPedimos desculpa pelo transtorno");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
		// ------------------------------------------------------------------------------------------------------------------------------------
		// LAB 3

		lab3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Laboratorio lab = new Laboratorio();
				bd.conectar();

				try {
					bd.trazerWH("laboratorios", "3");

					if (bd.result.next()) {

						lab.validar = true;
					}

					if (lab.validar == false) {
						lab3.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL3-Vermelho.png")));
						bd.inserir("laboratorios", "3");
					}
					if (lab.validar == true) {
						lab3.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL3-Vermelho.png")));
						JOptionPane.showMessageDialog(null,
								"Esse problema já foi informado\nPedimos desculpa pelo transtorno");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		// ------------------------------------------------------------------------------------------------------------------------------------
		// LAB 4

		lab4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Laboratorio lab = new Laboratorio();
				bd.conectar();

				try {
					bd.trazerWH("laboratorios", "4");

					if (bd.result.next()) {

						lab.validar = true;
					}

					if (lab.validar == false) {
						lab4.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL4-Vermelho.png")));
						bd.inserir("laboratorios", "4");
					}
					if (lab.validar == true) {
						lab4.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL4-Vermelho.png")));
						JOptionPane.showMessageDialog(null,
								"Esse problema já foi informado\nPedimos desculpa pelo transtorno");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		// ------------------------------------------------------------------------------------------------------------------------------------
		// LAB 5

		lab5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Laboratorio lab = new Laboratorio();
				bd.conectar();

				try {
					bd.trazerWH("laboratorios", "5");

					if (bd.result.next()) {

						lab.validar = true;
					}

					if (lab.validar == false) {
						lab5.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL5-Vermelho.png")));
						bd.inserir("laboratorios", "5");
					}
					if (lab.validar == true) {
						lab5.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL5-Vermelho.png")));
						JOptionPane.showMessageDialog(null,
								"Esse problema já foi informado\nPedimos desculpa pelo transtorno");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		// ------------------------------------------------------------------------------------------------------------------------------------
		// LAB 6

		lab6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Laboratorio lab = new Laboratorio();
				bd.conectar();

				try {
					bd.trazerWH("laboratorios", "6");

					if (bd.result.next()) {

						lab.validar = true;
					}

					if (lab.validar == false) {
						lab6.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL6-Vermelho.png")));
						bd.inserir("laboratorios", "6");
					}
					if (lab.validar == true) {
						lab6.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL6-Vermelho.png")));
						JOptionPane.showMessageDialog(null,
								"Esse problema já foi informado\nPedimos desculpa pelo transtorno");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		// ------------------------------------------------------------------------------------------------------------------------------------
		// LAB 7

		lab7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Laboratorio lab = new Laboratorio();
				bd.conectar();

				try {
					bd.trazerWH("laboratorios", "7");

					if (bd.result.next()) {

						lab.validar = true;
					}

					if (lab.validar == false) {
						lab7.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL7-Vermelho.png")));
						bd.inserir("laboratorios", "7");
					}
					if (lab.validar == true) {
						lab7.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL7-Vermelho.png")));
						JOptionPane.showMessageDialog(null,
								"Esse problema já foi informado\nPedimos desculpa pelo transtorno");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
		// ------------------------------------------------------------------------------------------------------------------------------------
		// LAB 8

		lab8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Laboratorio lab = new Laboratorio();
				bd.conectar();

				try {
					bd.trazerWH("laboratorios", "8");

					if (bd.result.next()) {

						lab.validar = true;
					}

					if (lab.validar == false) {
						lab8.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL8-Vermelho.png")));
						bd.inserir("laboratorios", "8");
					}
					if (lab.validar == true) {
						lab8.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BL8-Vermelho.png")));
						JOptionPane.showMessageDialog(null,
								"Esse problema já foi informado\nPedimos desculpa pelo transtorno");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		voltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				voltar.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BVoltar-Click.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				voltar.setIcon(new ImageIcon(Laboratorio_P.class.getResource("/Fotos/BVoltar-Normal.png")));
				Inicial_P inicial = new Inicial_P();
				inicial.setVisible(true);
				dispose();

			}
		});

	}
}
