package Telas_Professor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.BD;
import Telas_Trainee.Carregando;

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
import javax.swing.border.LineBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login_P extends JFrame {

	private JPanel contentPane;
	private JTextField tfLogin_P;
	private JPasswordField pfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_P frame = new Login_P();
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
	public Login_P() {
		setTitle("Login_P - Professor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 495);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBox.highlight"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);//PRA DEIXAR A TELA CENTRALIZADA COM O MONITOR
		
		JLabel lblLogin_P = new JLabel("Login");
		lblLogin_P.setForeground(Color.WHITE);
		lblLogin_P.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lblLogin_P.setBounds(180, 169, 153, 24);
		contentPane.add(lblLogin_P);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lblSenha.setBounds(180, 204, 92, 24);
		contentPane.add(lblSenha);
		
		tfLogin_P = new JTextField();
		tfLogin_P.setBorder(new LineBorder(Color.BLACK));
		tfLogin_P.setBounds(245, 174, 229, 20);
		contentPane.add(tfLogin_P);
		tfLogin_P.setColumns(10);
		
		pfSenha = new JPasswordField();
		pfSenha.setBorder(new LineBorder(Color.BLACK));
		pfSenha.setBounds(245, 209, 229, 20);
		contentPane.add(pfSenha);
		
		JLabel Entrar =new JLabel("");
		Entrar.setIcon(new ImageIcon(Login_P.class.getResource("/Fotos/BLogin-Normal.png")));
		Entrar.setBounds(307, 240, 81, 31);
		contentPane.add(Entrar);
		
		JLabel LoginErro = new JLabel("Login ou Senha incorretos.");
		LoginErro.setForeground(Color.RED);
		LoginErro.setFont(new Font("Tahoma", Font.BOLD, 11));
		LoginErro.setBounds(268, 293, 153, 14);
		contentPane.add(LoginErro);
		LoginErro.setVisible(false);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		rigidArea.setBounds(0, 0, 693, 456);
		contentPane.add(rigidArea);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Login_P.class.getResource("/Fotos/Background30porcento.png")));
		label.setBounds(0, 0, 693, 456);
		contentPane.add(label);
		
		tfLogin_P.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER){
					BD bd = new BD();
					bd.conectar();
					
					
					try {
						bd.Login_p("professor",tfLogin_P.getText(), pfSenha.getText());
						
						if (bd.acesso == true) {
							Carregando_P carregando_p = new Carregando_P();
							carregando_p.setVisible(true);
							dispose();
						}
						if (bd.acesso == false) {
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
						bd.Login_p("professor",tfLogin_P.getText(), pfSenha.getText());
						
						if (bd.acesso == true) {
							Carregando_P carregando_p = new Carregando_P();
							carregando_p.setVisible(true);
							dispose();
						}
						if (bd.acesso == false) {
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
				Entrar.setIcon(new ImageIcon(Login_P.class.getResource("/Fotos/BLogin-Click.png")));
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Entrar.setIcon(new ImageIcon(Login_P.class.getResource("/Fotos/BLogin-Normal.png")));
				
				BD bd = new BD();
				bd.conectar();
				
				
				try {
					bd.Login_p("professor",tfLogin_P.getText(), pfSenha.getText());
					
					if (bd.acesso == true) {
						Carregando_P carregando_p = new Carregando_P();
						carregando_p.setVisible(true);
						dispose();
					}
					if (bd.acesso == false) {
						LoginErro.setVisible(true);
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				
				
			}
		});
		
		
	}
}
