package Telas_Trainee;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.ButtonGroup;

public class Laboratorio extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Laboratorio frame = new Laboratorio();
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
	public Laboratorio() {
		setTitle("COLINF - Laborat\u00F3rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);// PRA DEIXAR A TELA CENTRALIZADA COM O MONITOR

		JLabel lab1 = new JLabel("");

		lab1.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL1-Verde.png")));
		lab1.setBounds(93, 77, 99, 99);
		contentPane.add(lab1);

		JLabel lab3 = new JLabel("");
		lab3.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL3-Verde.png")));
		lab3.setBounds(235, 77, 99, 99);
		contentPane.add(lab3);

		JLabel lab4 = new JLabel("");
		lab4.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL4-Verde.png")));
		lab4.setBounds(383, 77, 99, 99);
		contentPane.add(lab4);

		JLabel lab5 = new JLabel("");
		lab5.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL5-Verde.png")));
		lab5.setBounds(524, 77, 99, 99);
		contentPane.add(lab5);

		JLabel lab6 = new JLabel("");
		lab6.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL6-Verde.png")));
		lab6.setBounds(93, 225, 99, 99);
		contentPane.add(lab6);

		JLabel lab7 = new JLabel("");
		lab7.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL7-Verde.png")));
		lab7.setBounds(235, 225, 99, 99);
		contentPane.add(lab7);

		JLabel lab8 = new JLabel("");
		lab8.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL8-Verde.png")));
		lab8.setBounds(383, 225, 99, 99);
		contentPane.add(lab8);

		JLabel voltar = new JLabel("");
		voltar.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BVoltar-Normal.png")));
		voltar.setBounds(10, 11, 49, 50);
		contentPane.add(voltar);

		JLabel Logo = new JLabel("");
		Logo.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/COLINF2.png")));
		Logo.setBounds(522, 360, 161, 85);
		contentPane.add(Logo);

		JLabel atualizar = new JLabel("");

		atualizar.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BRefresh-Normal.png")));
		atualizar.setBounds(634, 19, 37, 42);
		contentPane.add(atualizar);

		JLabel Fundo = new JLabel("");
		Fundo.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/Background30porcento.png")));
		Fundo.setBounds(0, 0, 693, 456);
		contentPane.add(Fundo);

		// --------------------------------------------------------------------------------------------------------------

		Classes.Laboratorio lab = new Classes.Laboratorio();

		lab.tratar_dados();

		lab1.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL1-Verde.png")));
		lab3.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL3-Verde.png")));
		lab4.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL4-Verde.png")));
		lab5.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL5-Verde.png")));
		lab6.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL6-Verde.png")));
		lab7.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL7-Verde.png")));
		lab8.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL8-Verde.png")));

		lab.tratar_dados();

		for (int i = 0; i < lab.array.size(); i++) {
			String verf = (String) lab.array.get(i);
			switch (verf) {
			case "1":
				lab1.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL1-Vermelho.png")));
				break;
			case "3":
				lab3.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL3-Vermelho.png")));
				break;
			case "4":
				lab4.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL4-Vermelho.png")));
				break;
			case "5":
				lab5.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL5-Vermelho.png")));
				break;
			case "6":
				lab6.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL6-Vermelho.png")));
				break;
			case "7":
				lab7.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL7-Vermelho.png")));
				break;
			case "8":
				lab8.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL8-Vermelho.png")));
				break;
			default:
				JOptionPane.showMessageDialog(null, "Nenhum dos laboratório está com problema");
			}
		}

		// ----------------------------------------------------------------------------------------------------------------
		atualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				atualizar.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BRefresh-Click.png")));
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				atualizar.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BRefresh-Normal.png")));
				lab1.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL1-Verde.png")));
				lab3.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL3-Verde.png")));
				lab4.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL4-Verde.png")));
				lab5.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL5-Verde.png")));
				lab6.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL6-Verde.png")));
				lab7.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL7-Verde.png")));
				lab8.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL8-Verde.png")));

				lab.tratar_dados();

				for (int i = 0; i < lab.array.size(); i++) {
					String verf = (String) lab.array.get(i);
					switch (verf) {
					case "1":
						lab1.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL1-Vermelho.png")));
						break;
					case "3":
						lab3.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL3-Vermelho.png")));
						break;
					case "4":
						lab4.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL4-Vermelho.png")));
						break;
					case "5":
						lab5.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL5-Vermelho.png")));
						break;
					case "6":
						lab6.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL6-Vermelho.png")));
						break;
					case "7":
						lab7.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL7-Vermelho.png")));
						break;
					case "8":
						lab8.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL8-Vermelho.png")));
						break;
					default:
						JOptionPane.showMessageDialog(null, "Nenhum dos laboratório está com problema");
					}
				}

			}
		});

		// -----------------------------------------------------------------------------------------------------------------------//

		lab1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lab1.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL1-Vermelho.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				lab1.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL1-Vermelho.png")));

				int resposta = JOptionPane.showConfirmDialog(null, "Laboratório já foi vistoriado ?");
				if (resposta == JOptionPane.YES_OPTION) {
					lab.excluirlab("1");
				}

			}
		});

		lab3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lab3.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL3-Vermelho.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				lab3.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL3-Vermelho.png")));

				int resposta = JOptionPane.showConfirmDialog(null, "Laboratório já foi vistoriado ?");
				if (resposta == JOptionPane.YES_OPTION) {
					lab.excluirlab("3");
				}

			}
		});

		lab4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lab4.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL4-Vermelho.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				lab4.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL4-Vermelho.png")));

				int resposta = JOptionPane.showConfirmDialog(null, "Laboratório já foi vistoriado ?");
				if (resposta == JOptionPane.YES_OPTION) {
					lab.excluirlab("4");
				}

			}
		});

		lab5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lab5.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL5-Vermelho.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				lab5.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL5-Vermelho.png")));

				int resposta = JOptionPane.showConfirmDialog(null, "Laboratório já foi vistoriado ?");
				if (resposta == JOptionPane.YES_OPTION) {
					lab.excluirlab("5");
				}

			}
		});

		lab6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lab6.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL6-Vermelho.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				lab6.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL6-Vermelho.png")));

				int resposta = JOptionPane.showConfirmDialog(null, "Laboratório já foi vistoriado ?");
				if (resposta == JOptionPane.YES_OPTION) {
					lab.excluirlab("6");
				}

			}
		});

		lab7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lab7.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL7-Vermelho.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				lab7.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL7-Vermelho.png")));

				int resposta = JOptionPane.showConfirmDialog(null, "Laboratório já foi vistoriado ?");
				if (resposta == JOptionPane.YES_OPTION) {
					lab.excluirlab("7");
				}

			}
		});

		lab8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lab8.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL8-Vermelho.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				lab8.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/BL8-Vermelho.png")));

				int resposta = JOptionPane.showConfirmDialog(null, "Laboratório já foi vistoriado ?");
				if (resposta == JOptionPane.YES_OPTION) {
					lab.excluirlab("8");
				}

			}
		});

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
