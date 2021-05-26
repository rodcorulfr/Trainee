package Telas_Trainee;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Perfil extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfCpf;
	private JTextField tfData;
	private JTextField tfTelefone;
	private JTextField tfMatricula;
	private JTextField tfUsuario;
	private JTextField tfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Perfil frame = new Perfil();
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
	public Perfil() {
		setTitle("Trainee - Perfil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblNome.setBounds(347, 27, 56, 14);
		contentPane.add(lblNome);

		tfNome = new JTextField();
		tfNome.setBorder(new LineBorder(Color.BLACK));
		tfNome.setBounds(347, 51, 300, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblEmail.setBounds(347, 82, 46, 14);
		contentPane.add(lblEmail);

		tfEmail = new JTextField();
		tfEmail.setBorder(new LineBorder(Color.BLACK));
		tfEmail.setBounds(347, 107, 300, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblCpf.setBounds(347, 138, 46, 14);
		contentPane.add(lblCpf);

		tfCpf = new JTextField();
		tfCpf.setBorder(new LineBorder(Color.BLACK));
		tfCpf.setBounds(347, 163, 117, 20);
		contentPane.add(tfCpf);
		tfCpf.setColumns(10);

		tfData = new JTextField();
		tfData.setBorder(new LineBorder(Color.BLACK));
		tfData.setBounds(493, 163, 154, 20);
		contentPane.add(tfData);
		tfData.setColumns(10);

		JLabel lblData = new JLabel("Data");
		lblData.setForeground(Color.WHITE);
		lblData.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblData.setBounds(493, 138, 46, 14);
		contentPane.add(lblData);

		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setForeground(Color.WHITE);
		lblTelefone.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblTelefone.setBounds(347, 194, 69, 14);
		contentPane.add(lblTelefone);

		tfTelefone = new JTextField();
		tfTelefone.setBorder(new LineBorder(Color.BLACK));
		tfTelefone.setBounds(347, 221, 129, 20);
		contentPane.add(tfTelefone);
		tfTelefone.setColumns(10);

		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setForeground(Color.WHITE);
		lblMatricula.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblMatricula.setBounds(493, 196, 89, 14);
		contentPane.add(lblMatricula);

		tfMatricula = new JTextField();
		tfMatricula.setBorder(new LineBorder(Color.BLACK));
		tfMatricula.setBounds(493, 221, 154, 20);
		contentPane.add(tfMatricula);
		tfMatricula.setColumns(10);

		JLabel lblDiaDeServio = new JLabel("Dia de Servi\u00E7o");
		lblDiaDeServio.setForeground(Color.WHITE);
		lblDiaDeServio.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblDiaDeServio.setBounds(347, 271, 117, 14);
		contentPane.add(lblDiaDeServio);

		JComboBox cbDiaServico = new JComboBox();
		cbDiaServico.setModel(new DefaultComboBoxModel(
				new String[] { "Segunda-feira", "Ter\u00E7a-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira" }));
		cbDiaServico.setBounds(474, 270, 170, 20);
		contentPane.add(cbDiaServico);

		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setForeground(Color.WHITE);
		lblUsurio.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblUsurio.setBounds(347, 318, 69, 14);
		contentPane.add(lblUsurio);

		tfUsuario = new JTextField();
		tfUsuario.setBorder(new LineBorder(Color.BLACK));
		tfUsuario.setColumns(10);
		tfUsuario.setBounds(426, 317, 154, 20);
		contentPane.add(tfUsuario);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblSenha.setBounds(347, 353, 69, 14);
		contentPane.add(lblSenha);

		tfSenha = new JTextField();
		tfSenha.setBorder(new LineBorder(Color.BLACK));
		tfSenha.setColumns(10);
		tfSenha.setBounds(426, 352, 154, 20);
		contentPane.add(tfSenha);

		JLabel atualizar = new JLabel("");

		atualizar.setIcon(new ImageIcon(Perfil.class.getResource("/Fotos/BRefresh-Normal.png")));
		atualizar.setBounds(632, 390, 37, 42);
		contentPane.add(atualizar);

		JButton btnAtualizar = new JButton("Atualizar");

		btnAtualizar.setBounds(347, 409, 89, 23);
		contentPane.add(btnAtualizar);
		
		JLabel voltar = new JLabel("");

		voltar.setIcon(new ImageIcon(Perfil.class.getResource("/Fotos/BVoltar-Normal.png")));
		voltar.setBounds(10, 11, 49, 50);
		contentPane.add(voltar);

		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(Perfil.class.getResource("/Fotos/Background30porcento.png")));
		background.setBounds(0, 0, 693, 456);
		contentPane.add(background);
		this.setLocationRelativeTo(null);// PRA DEIXAR A TELA CENTRALIZADA COM O MONITOR

		// ----------------------------------------------------------------------------------------------------------------------------------------------------//
		Classes.BD bd = new Classes.BD();
		bd.conectar();
		bd.perfil();
		try {
			tfNome.setText(bd.result.getString("nome"));
			tfEmail.setText(bd.result.getString("email"));
			tfCpf.setText(bd.result.getString("cpf"));
			tfData.setText(bd.result.getString("data"));
			tfTelefone.setText(bd.result.getString("telefone"));
			tfMatricula.setText(bd.result.getString("matricula"));
			tfMatricula.setEditable(false);

			int dia = 0;

			switch (bd.result.getString("dia_servico")) {
			case "Segunda-feira":
				dia = 0;
				break;
			case "Terça-feira":
				dia = 1;
				break;
			case "Quarta-feira":
				dia = 2;
				break;
			case "Quinta-feira":
				dia = 3;
				break;
			case "Sexta-feira":
				dia = 4;
				break;
			}
			cbDiaServico.setSelectedIndex(dia);
			tfUsuario.setText(bd.result.getString("usuario"));
			tfSenha.setText(bd.result.getString("senha"));

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// ----------------------------------------------------------------------------------------------------------------------------------------------------//

		atualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				atualizar.setIcon(new ImageIcon(Perfil.class.getResource("/Fotos/BRefresh-Click.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				atualizar.setIcon(new ImageIcon(Perfil.class.getResource("/Fotos/BRefresh-Normal.png")));

				Classes.BD bd = new Classes.BD();
				bd.conectar();
				bd.perfil();
				try {
					tfNome.setText(bd.result.getString("nome"));
					tfEmail.setText(bd.result.getString("email"));
					tfCpf.setText(bd.result.getString("cpf"));
					tfData.setText(bd.result.getString("data"));
					tfTelefone.setText(bd.result.getString("telefone"));
					tfMatricula.setText(bd.result.getString("matricula"));
					tfMatricula.setEditable(false);


					int dia = 0;

					switch (bd.result.getString("dia_servico")) {
					case "Segunda-feira":
						dia = 0;
						break;
					case "Terça-feira":
						dia = 1;
						break;
					case "Quarta-feira":
						dia = 2;
						break;
					case "Quinta-feira":
						dia = 3;
						break;
					case "Sexta-feira":
						dia = 4;
						break;
					}

					cbDiaServico.setSelectedIndex(dia);
					tfUsuario.setText(bd.result.getString("usuario"));
					tfSenha.setText(bd.result.getString("senha"));

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bd.conectar();
				String alterar = String.format(
						"nome = '%s', email = '%s', cpf = '%s', telefone = '%s',data = '%s', usuario = '%s', senha = '%s', matricula = '%s', dia_servico = '%s'",
						tfNome.getText(), tfEmail.getText(), tfCpf.getText(), tfTelefone.getText(), tfData.getText(),
						tfUsuario.getText(), tfSenha.getText(), tfMatricula.getText(), cbDiaServico.getSelectedItem());

				
				
				String condicao = "matricula = "+tfMatricula.getText();

				
				bd.editar("trainee", alterar, condicao);
				bd.desconectar();
			}
		});
		
		voltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				voltar.setIcon(new ImageIcon(Perfil.class.getResource("/Fotos/BVoltar-Click.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				voltar.setIcon(new ImageIcon(Perfil.class.getResource("/Fotos/BVoltar-Normal.png")));
				Telas_Trainee.Inicial inicial = new Telas_Trainee.Inicial();
				inicial.setVisible(true);
				dispose();
			}
		});

	}
}
