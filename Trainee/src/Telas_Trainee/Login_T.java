package Telas_Trainee;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.BD;
import Classes.Trainee;

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login_T extends JFrame {

	private JPanel contentPane;
	private JTextField tfLogin;
	private JLabel Cadastrar;
	private JPasswordField pfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_T frame = new Login_T();
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
	public Login_T() {
		setTitle("COLINF - Login");

		// Importes

		

		// Importes

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 495);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBox.highlight"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);//PRA DEIXAR A TELA CENTRALIZADA COM O MONITOR

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lblLogin.setBounds(199, 171, 153, 24);
		contentPane.add(lblLogin);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lblSenha.setBounds(201, 206, 92, 24);
		contentPane.add(lblSenha);

		pfSenha = new JPasswordField();
		pfSenha.setBounds(266, 211, 229, 19);
		contentPane.add(pfSenha);

		tfLogin = new JTextField();
		tfLogin.setBounds(266, 176, 229, 20);
		contentPane.add(tfLogin);
		tfLogin.setColumns(10);

		JLabel Entrar = new JLabel("");
		Entrar.setIcon(new ImageIcon(Login_T.class.getResource("/Fotos/BLogin-Normal.png")));
		Entrar.setBounds(260, 248, 81, 40);
		contentPane.add(Entrar);

		Cadastrar = new JLabel("");
		Cadastrar.setIcon(new ImageIcon(Login_T.class.getResource("/Fotos/BCadastrar-Normal.png")));
		Cadastrar.setBounds(351, 248, 141, 40);
		contentPane.add(Cadastrar);
		
		JLabel LoginErro = new JLabel("Login ou Senha incorretos.");
		LoginErro.setVisible(false);
		LoginErro.setFont(new Font("Tahoma", Font.BOLD, 11));
		LoginErro.setForeground(Color.RED);
		LoginErro.setBounds(290, 298, 153, 14);
		contentPane.add(LoginErro);

		JLabel fundo = new JLabel("\r\n");
		fundo.setIcon(new ImageIcon(Login_T.class.getResource("/Fotos/Background30porcento.png")));
		fundo.setBounds(0, 0, 693, 456);
		contentPane.add(fundo);
		
		tfLogin.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER){
					BD bd = new BD();
					bd.conectar();
					
					
					try {
						bd.Login_t("trainee",tfLogin.getText(), pfSenha.getText());
						
						if (bd.acesso == true) {
							Carregando carregando = new Carregando();
							carregando.setVisible(true);
							dispose();
						}else if (bd.acesso == false) {
							LoginErro.setVisible(true);
						}
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		pfSenha.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER){
					BD bd = new BD();
					bd.conectar();
					
					
					try {
						bd.Login_t("trainee",tfLogin.getText(), pfSenha.getText());
						
						if (bd.acesso == true) {
							Carregando carregando = new Carregando();
							carregando.setVisible(true);
							dispose();
						}else if (bd.acesso == false) {
							LoginErro.setVisible(true);
						}
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		

		Entrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Entrar.setIcon(new ImageIcon(Login_T.class.getResource("/Fotos/BLogin-Click.png")));

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				Entrar.setIcon(new ImageIcon(Login_T.class.getResource("/Fotos/BLogin-Normal.png")));
				// Metodos
				
				BD bd = new BD();
				bd.conectar();
				
				
				try {
					bd.Login_t("trainee",tfLogin.getText(), pfSenha.getText());
					
					if (bd.acesso == true) {
						Carregando carregando = new Carregando();
						carregando.setVisible(true);
						dispose();
					}else if (bd.acesso == false) {
						LoginErro.setVisible(true);
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				//

			}
		});

		Cadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Cadastrar.setIcon(new ImageIcon(Login_T.class.getResource("/Fotos/BCadastrar-Click.png")));

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				Cadastrar.setIcon(new ImageIcon(Login_T.class.getResource("/Fotos/BCadastrar-Normal.png")));
				Cadastrar cadastrar = new Cadastrar();
				cadastrar.setVisible(true);
				dispose();
			}
		});

	}
}
