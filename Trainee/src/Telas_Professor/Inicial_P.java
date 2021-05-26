package Telas_Professor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Inicial_P extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicial_P frame = new Inicial_P();
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
	public Inicial_P() {
		setTitle("COLINF - Professor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);//PRA DEIXAR A TELA CENTRALIZADA COM O MONITOR
		
		JLabel chat = new JLabel("");
		chat.setIcon(new ImageIcon(Inicial_P.class.getResource("/Fotos/BMEmail151-Normal.png")));
		chat.setBounds(20, 154, 151, 151);
		contentPane.add(chat);
		
		JLabel chamar = new JLabel("");
		chamar.setIcon(new ImageIcon(Inicial_P.class.getResource("/Fotos/BMChamar-Normal.png")));
		chamar.setBounds(272, 154, 151, 151);
		contentPane.add(chamar);
		
		JLabel logout = new JLabel("");
		logout.setIcon(new ImageIcon(Inicial_P.class.getResource("/Fotos/BMLogout-Normal.png")));
		logout.setBounds(522, 154, 151, 151);
		contentPane.add(logout);
		
		JLabel COLINF = new JLabel("");
		COLINF.setIcon(new ImageIcon(Inicial_P.class.getResource("/Fotos/COLINF2.png")));
		COLINF.setBounds(512, 376, 161, 69);
		contentPane.add(COLINF);
		
		JLabel ChamarD = new JLabel("");
		ChamarD.setVisible(false);
		ChamarD.setIcon(new ImageIcon(Inicial_P.class.getResource("/Fotos/DescriChamar.png")));
		ChamarD.setBounds(10, 366, 251, 79);
		contentPane.add(ChamarD);
		
		JLabel LogoutD = new JLabel("");
		LogoutD.setVisible(false);
		LogoutD.setIcon(new ImageIcon(Inicial_P.class.getResource("/Fotos/DescriLogout.png")));
		LogoutD.setBounds(10, 366, 224, 79);
		contentPane.add(LogoutD);
		
		JLabel EmailD = new JLabel("");
		EmailD.setVisible(false);
		EmailD.setIcon(new ImageIcon(Inicial_P.class.getResource("/Fotos/descriEmailProff.png")));
		EmailD.setBounds(10, 366, 270, 79);
		contentPane.add(EmailD);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(Inicial_P.class.getResource("/Fotos/Background30porcento.png")));
		background.setBounds(0, 0, 693, 456);
		contentPane.add(background);
	
	//------------------------------------------------------------------------------------------------------Mouse em cima
		
		chat.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				EmailD.setVisible(true);
			}
		});
		
		chamar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				ChamarD.setVisible(true);
			}
		});
		
		logout.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				LogoutD.setVisible(true);
			}
		});
		
		background.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				EmailD.setVisible(false);
				ChamarD.setVisible(false);
				LogoutD.setVisible(false);
			}
		});
		
		
	//-----------------------------------------------------------------------------------------------------Click	
		chat.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				chat.setIcon(new ImageIcon(Inicial_P.class.getResource("/Fotos/BMEmail151-Click.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				chat.setIcon(new ImageIcon(Inicial_P.class.getResource("/Fotos/BMEmail151-Normal.png")));
				Chat_P tela_chat_p = new Chat_P();
				tela_chat_p.setVisible(true);
				dispose();
			}
		});
		
		chamar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				chamar.setIcon(new ImageIcon(Inicial_P.class.getResource("/Fotos/BMChamar-Click.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				chamar.setIcon(new ImageIcon(Inicial_P.class.getResource("/Fotos/BMChamar-Normal.png")));
				
				Classes.BD bd = new Classes.BD();
				bd.conectar();
				
				chamar.setIcon(new ImageIcon(Inicial_P.class.getResource("/Fotos/BMChamar-Bloqueado.png")));
				chamar.setEnabled(false);
				
				int id_lab_chamar = Integer.parseInt(JOptionPane.showInputDialog("Qual laboratório estas?"));
				
				System.out.println(id_lab_chamar);
				
				bd.gravar_chamado(id_lab_chamar);
				
				
			}
		});
		
		logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				logout.setIcon(new ImageIcon(Inicial_P.class.getResource("/Fotos/BMLogout-Click.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				logout.setIcon(new ImageIcon(Inicial_P.class.getResource("/Fotos/BMLogout-Normal.png")));
				Classes.BD bd = new Classes.BD();
				bd.conectar();
				bd.apagar_atual("online_prof");
				Login_P tela_login = new Login_P();
				tela_login.setVisible(true);
				dispose();
			}
		});
	
	
	}
}
