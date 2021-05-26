package Telas_Trainee;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import Classes.BD;
import Classes.Trainee;

import javax.swing.UIManager;
import java.awt.Cursor;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;

public class Cadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfCPF;
	private JTextField tfUsuario;
	private JTextField tfSenha;
	private JTextField tfData_nasc;
	private JTextField tfMatricula;
	private JTextField tfTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar frame = new Cadastrar();
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
	public Cadastrar() {
		setTitle("COLINF - Cadastro");

		// Importes

		Login_T login = new Login_T();
		Classes.Trainee traine = new Classes.Trainee();
		

		// Importes

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 495);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);// PRA DEIXAR A TELA CENTRALIZADA COM O MONITOR

		JLabel lblNomeComp = new JLabel("Nome Comp.");
		lblNomeComp.setForeground(Color.WHITE);
		lblNomeComp.setFont(new Font("Roboto Condensed", Font.PLAIN, 17));
		lblNomeComp.setBounds(124, 113, 101, 23);
		contentPane.add(lblNomeComp);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblEmail.setBounds(124, 149, 46, 14);
		contentPane.add(lblEmail);

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblCpf.setBounds(124, 180, 46, 14);
		contentPane.add(lblCpf);

		JLabel lblDataDeNasc = new JLabel("Data de Nasc.");
		lblDataDeNasc.setForeground(Color.WHITE);
		lblDataDeNasc.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblDataDeNasc.setBounds(124, 211, 90, 14);
		contentPane.add(lblDataDeNasc);

		JLabel lblDiaDeServio = new JLabel("Dia de Servi\u00E7o");
		lblDiaDeServio.setForeground(Color.WHITE);
		lblDiaDeServio.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblDiaDeServio.setBounds(404, 180, 107, 14);
		contentPane.add(lblDiaDeServio);

		JLabel lblMatrcula = new JLabel("Matr\u00EDcula");
		lblMatrcula.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblMatrcula.setForeground(Color.WHITE);
		lblMatrcula.setBounds(124, 242, 74, 14);
		contentPane.add(lblMatrcula);

		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblTelefone.setForeground(Color.WHITE);
		lblTelefone.setBounds(124, 273, 90, 14);
		contentPane.add(lblTelefone);

		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setForeground(Color.WHITE);
		lblUsurio.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblUsurio.setBounds(180, 333, 59, 14);
		contentPane.add(lblUsurio);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblSenha.setBounds(180, 364, 46, 14);
		contentPane.add(lblSenha);

		tfNome = new JTextField();
		tfNome.setBorder(new LineBorder(Color.BLACK));
		tfNome.setBounds(235, 117, 297, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);

		tfEmail = new JTextField();
		tfEmail.setBorder(new LineBorder(Color.BLACK));
		tfEmail.setColumns(10);
		tfEmail.setBounds(235, 148, 297, 20);
		contentPane.add(tfEmail);

		tfCPF = new JTextField();
		tfCPF.setBorder(new LineBorder(Color.BLACK));
		tfCPF.setColumns(10);
		tfCPF.setBounds(235, 179, 152, 20);
		contentPane.add(tfCPF);

		tfData_nasc = new JTextField();
		tfData_nasc.setBorder(new LineBorder(Color.BLACK));
		tfData_nasc.setBounds(235, 210, 107, 20);
		contentPane.add(tfData_nasc);
		tfData_nasc.setColumns(10);

		JComboBox cbDia_serv = new JComboBox();
		cbDia_serv.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		cbDia_serv.setBorder(new LineBorder(Color.BLACK));
		cbDia_serv.setModel(new DefaultComboBoxModel(
				new String[] { "Segunda-feira", "Ter\u00E7a-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira" }));
		cbDia_serv.setBounds(397, 209, 107, 23);
		contentPane.add(cbDia_serv);

		tfMatricula = new JTextField();
		tfMatricula.setBorder(new LineBorder(Color.BLACK));
		tfMatricula.setBounds(235, 241, 152, 20);
		contentPane.add(tfMatricula);
		tfMatricula.setColumns(10);

		tfTelefone = new JTextField();
		tfTelefone.setBorder(new LineBorder(Color.BLACK));
		tfTelefone.setBounds(235, 272, 152, 20);
		contentPane.add(tfTelefone);
		tfTelefone.setColumns(10);

		tfUsuario = new JTextField();
		tfUsuario.setBorder(new LineBorder(Color.BLACK));
		tfUsuario.setColumns(10);
		tfUsuario.setBounds(260, 332, 166, 20);
		contentPane.add(tfUsuario);

		tfSenha = new JTextField();
		tfSenha.setBorder(new LineBorder(Color.BLACK));
		tfSenha.setColumns(10);
		tfSenha.setBounds(260, 363, 166, 20);
		contentPane.add(tfSenha);

		JLabel Cadastrar = new JLabel("");
		Cadastrar.setIcon(new ImageIcon(Cadastrar.class.getResource("/Fotos/BCadastrar-Normal.png")));
		Cadastrar.setBounds(527, 391, 130, 34);
		contentPane.add(Cadastrar);

		JLabel Logo = new JLabel("");
		Logo.setIcon(new ImageIcon(Cadastrar.class.getResource("/Fotos/COLINF2.png")));
		Logo.setBounds(260, 11, 166, 91);
		contentPane.add(Logo);

		JLabel Voltar = new JLabel("");
		Voltar.setIcon(new ImageIcon(Cadastrar.class.getResource("/Fotos/BVoltar-Normal.png")));
		Voltar.setBounds(41, 375, 49, 50);
		contentPane.add(Voltar);
		
		JLabel asterisco = new JLabel("*");
		asterisco.setFont(new Font("Tahoma", Font.BOLD, 17));
		asterisco.setForeground(Color.RED);
		asterisco.setBounds(393, 244, 13, 16);
		contentPane.add(asterisco);
		
		JLabel label = new JLabel("*");
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(436, 335, 13, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("*");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_1.setBounds(436, 366, 13, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("*");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_2.setBounds(352, 213, 13, 16);
		contentPane.add(label_2);

		JLabel Fundo = new JLabel("");
		Fundo.setIcon(new ImageIcon(Cadastrar.class.getResource("/Fotos/Background30porcento.png")));
		Fundo.setBounds(0, 0, 693, 456);
		contentPane.add(Fundo);

		Cadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Cadastrar.setIcon(new ImageIcon(Login_T.class.getResource("/Fotos/BCadastrar-Click.png")));

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				Cadastrar.setIcon(new ImageIcon(Login_T.class.getResource("/Fotos/BCadastrar-Normal.png")));
				// Metodos
				BD bd = new BD();
				bd.conectar();

				String dia = tfData_nasc.getText().substring(0, 2);
				String mes = tfData_nasc.getText().substring(3, 5);
				String ano = tfData_nasc.getText().substring(6, 10);

				String ano_nasc = (ano + "/" + mes + "/" + dia);

				String info = String.format("'%s','%s','%s','%s','%s','%s','%s','%s','%s'", tfNome.getText(),
						tfEmail.getText(), tfCPF.getText(), tfTelefone.getText(), ano_nasc,
						tfUsuario.getText(), tfSenha.getText(), tfMatricula.getText(), cbDia_serv.getSelectedItem());

				traine.Cadastrar(info);
				
				if (traine.status == true) {
					tfNome.setText("");
					tfEmail.setText("");
					tfCPF.setText("");
					tfTelefone.setText("");
					tfData_nasc.setText("");
					tfMatricula.setText("");
					cbDia_serv.setSelectedIndex(1);
					tfUsuario.setText("");
					tfSenha.setText("");
					tfNome.requestFocus();
					JOptionPane.showMessageDialog(null, "Cadastro Efetuado!");
				}

			}
		});

		Voltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Voltar.setIcon(new ImageIcon(Login_T.class.getResource("/Fotos/BVoltar-Click.png")));

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				Voltar.setIcon(new ImageIcon(Login_T.class.getResource("/Fotos/BVoltar-Normal.png")));
				// Metodos
				login.setVisible(true);
				dispose();

			}
		});
	}
}
