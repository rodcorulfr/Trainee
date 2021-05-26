package Telas_Trainee;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import org.omg.CORBA.portable.IndirectionException;

import Classes.BD;

import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;

public class Cadastrar_P extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfCPF;
	private JTextField tfData_nasc;
	private JTextField tfRegistro;
	private JTextField tfTelefone;
	private JTextField tfSenha;
	private JTextField tfUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar_P frame = new Cadastrar_P();
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
	public Cadastrar_P() {

		Classes.Professor professor = new Classes.Professor();

		setTitle("COLINF - Cadastro "
				+ "Professor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);// PRA DEIXAR A TELA CENTRALIZADA COM O MONITOR

		JLabel lbNomeComp = new JLabel("Nome Comp.");
		lbNomeComp.setForeground(Color.WHITE);
		lbNomeComp.setFont(new Font("Roboto Condensed", Font.PLAIN, 17));
		lbNomeComp.setBounds(131, 79, 101, 23);
		contentPane.add(lbNomeComp);

		tfNome = new JTextField();
		tfNome.setColumns(10);
		tfNome.setBorder(new LineBorder(Color.BLACK));
		tfNome.setBounds(242, 83, 297, 20);
		contentPane.add(tfNome);

		JLabel lbEmail = new JLabel("E-mail");
		lbEmail.setForeground(Color.WHITE);
		lbEmail.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lbEmail.setBounds(131, 115, 46, 14);
		contentPane.add(lbEmail);

		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBorder(new LineBorder(Color.BLACK));
		tfEmail.setBounds(242, 114, 297, 20);
		contentPane.add(tfEmail);

		JLabel lbCPF = new JLabel("CPF");
		lbCPF.setForeground(Color.WHITE);
		lbCPF.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lbCPF.setBounds(131, 146, 46, 14);
		contentPane.add(lbCPF);

		tfCPF = new JTextField();
		tfCPF.setColumns(10);
		tfCPF.setBorder(new LineBorder(Color.BLACK));
		tfCPF.setBounds(242, 145, 152, 20);
		contentPane.add(tfCPF);

		JLabel lbData_Nasc = new JLabel("Data de Nasc.");
		lbData_Nasc.setForeground(Color.WHITE);
		lbData_Nasc.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lbData_Nasc.setBounds(420, 146, 90, 14);
		contentPane.add(lbData_Nasc);

		tfData_nasc = new JTextField();
		tfData_nasc.setColumns(10);
		tfData_nasc.setBorder(new LineBorder(Color.BLACK));
		tfData_nasc.setBounds(420, 176, 107, 20);
		contentPane.add(tfData_nasc);

		JLabel lblRegistro = new JLabel("Registro");
		lblRegistro.setForeground(Color.WHITE);
		lblRegistro.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblRegistro.setBounds(131, 177, 74, 14);
		contentPane.add(lblRegistro);

		tfRegistro = new JTextField();
		tfRegistro.setColumns(10);
		tfRegistro.setBorder(new LineBorder(Color.BLACK));
		tfRegistro.setBounds(242, 176, 152, 20);
		contentPane.add(tfRegistro);

		JLabel label_5 = new JLabel("Telefone");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		label_5.setBounds(131, 208, 90, 14);
		contentPane.add(label_5);

		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);
		tfTelefone.setBorder(new LineBorder(Color.BLACK));
		tfTelefone.setBounds(242, 207, 152, 20);
		contentPane.add(tfTelefone);

		tfSenha = new JTextField();
		tfSenha.setColumns(10);
		tfSenha.setBorder(new LineBorder(Color.BLACK));
		tfSenha.setBounds(291, 312, 166, 20);
		contentPane.add(tfSenha);

		tfUsuario = new JTextField();
		tfUsuario.setColumns(10);
		tfUsuario.setBorder(new LineBorder(Color.BLACK));
		tfUsuario.setBounds(291, 281, 166, 20);
		contentPane.add(tfUsuario);

		JLabel label_6 = new JLabel("Usu\u00E1rio");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		label_6.setBounds(211, 282, 59, 14);
		contentPane.add(label_6);

		JLabel label_7 = new JLabel("Senha");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		label_7.setBounds(211, 313, 46, 14);
		contentPane.add(label_7);

		JLabel lbCadastrar_P = new JLabel("");
		lbCadastrar_P.setIcon(new ImageIcon(Cadastrar_P.class.getResource("/Fotos/BCadastrar-Normal.png")));
		lbCadastrar_P.setBounds(495, 356, 130, 34);
		contentPane.add(lbCadastrar_P);

		JLabel lbVoltar = new JLabel("");

		lbVoltar.setIcon(new ImageIcon(Cadastrar_P.class.getResource("/Fotos/BVoltar-Normal.png")));
		lbVoltar.setBounds(10, 11, 49, 50);
		contentPane.add(lbVoltar);

		JLabel Fundo = new JLabel("");
		Fundo.setIcon(new ImageIcon(Cadastrar_P.class.getResource("/Fotos/Background30porcento.png")));
		Fundo.setBounds(0, 0, 693, 456);
		contentPane.add(Fundo);

		// -----------------------------------------------------------------------------------------------------------------------------------//

		lbCadastrar_P.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				lbCadastrar_P.setIcon(new ImageIcon(Cadastrar_P.class.getResource("/Fotos/BCadastrar-Click.png")));

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				lbCadastrar_P.setIcon(new ImageIcon(Cadastrar_P.class.getResource("/Fotos/BCadastrar-Normal.png")));

				BD bd = new BD();
				bd.conectar();

				String dia = tfData_nasc.getText().substring(0, 2);
				String mes = tfData_nasc.getText().substring(3, 5);
				String ano = tfData_nasc.getText().substring(6, 10);

				String ano_nasc = (ano + "/" + mes + "/" + dia);

				String info = String.format("'%s','%s','%s','%s','%s','%s','%s','%s'", tfNome.getText(),
						tfEmail.getText(), tfCPF.getText(), tfTelefone.getText(), ano_nasc, tfUsuario.getText(),
						tfSenha.getText(), tfRegistro.getText());

				professor.cadastrar_p(info);

				if (professor.status == true) {
					tfNome.setText("");
					tfEmail.setText("");
					tfCPF.setText("");
					tfTelefone.setText("");
					tfData_nasc.setText("");
					tfRegistro.setText("");
					tfUsuario.setText("");
					tfSenha.setText("");
					tfNome.requestFocus();
					JOptionPane.showMessageDialog(null, "Cadastro Efetuado!");

				}

			}
		});

		lbVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lbVoltar.setIcon(new ImageIcon(Cadastrar_P.class.getResource("/Fotos/BVoltar-Click.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				lbVoltar.setIcon(new ImageIcon(Cadastrar_P.class.getResource("/Fotos/BVoltar-Normal.png")));
				Inicial inicial = new Inicial();
				inicial.setVisible(true);
				dispose();

			}
		});

	}
}
