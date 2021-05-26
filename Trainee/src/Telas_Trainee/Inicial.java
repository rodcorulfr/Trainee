package Telas_Trainee;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicial frame = new Inicial();
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
	public Inicial() {
		setTitle("COLINF - Trainee");

		// Importes

		// Importes

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);// PRA DEIXAR A TELA CENTRALIZADA COM O MONITOR

		JLabel logout = new JLabel("");
		logout.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/BMLogout128-Normal.png")));
		logout.setBounds(539, 153, 128, 128);
		contentPane.add(logout);

		JLabel email = new JLabel("");
		email.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/BMEmail-Normal.png")));
		email.setBounds(194, 153, 128, 128);
		contentPane.add(email);

		JLabel lab = new JLabel("");
		lab.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/BMLaboratorio-Normal.png")));
		lab.setBounds(20, 153, 128, 128);
		contentPane.add(lab);

		JLabel descriLogout = new JLabel("");
		descriLogout.setVisible(false);

		JLabel cadastroProff = new JLabel("");
		cadastroProff.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/BMCadastroProff2-Normal.png")));
		cadastroProff.setBounds(363, 153, 128, 128);
		contentPane.add(cadastroProff);
		descriLogout.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/DescriLogout.png")));
		descriLogout.setBounds(10, 366, 224, 79);
		contentPane.add(descriLogout);

		JLabel descriEmail = new JLabel("");
		descriEmail.setVisible(false);
		descriEmail.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/descriEmail.png")));
		descriEmail.setBounds(10, 366, 270, 79);
		contentPane.add(descriEmail);

		JLabel descriCalendario = new JLabel("");
		descriCalendario.setVisible(false);
		descriCalendario.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/DescriCalendario.png")));
		descriCalendario.setBounds(10, 366, 270, 79);
		contentPane.add(descriCalendario);
		descriCalendario.setVisible(false);

		JLabel descriLab = new JLabel("");
		descriLab.setVisible(false);
		descriLab.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/DescriLab.png")));
		descriLab.setBounds(10, 366, 228, 79);
		contentPane.add(descriLab);

		JLabel descriCadastroProff = new JLabel("");
		descriCadastroProff.setVisible(false);
		descriCadastroProff.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/descriCadastroProff.png")));
		descriCadastroProff.setBounds(10, 366, 270, 79);
		contentPane.add(descriCadastroProff);

		JLabel colinf = new JLabel("");
		colinf.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/COLINF2.png")));
		colinf.setBounds(522, 11, 161, 69);
		contentPane.add(colinf);

		JLabel perfil = new JLabel("");

		perfil.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/BMPerfil-Normal.png")));
		perfil.setBounds(600, 366, 50, 56);
		contentPane.add(perfil);

		JLabel chamado = new JLabel("");

		chamado.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/BMChamadoT-Normal.png")));
		chamado.setBounds(20, 11, 132, 32);
		contentPane.add(chamado);

		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/Background30porcento.png")));
		background.setBounds(0, 0, 693, 456);
		contentPane.add(background);

		// -------------------------------------------------------------------------------------------------------------------------

		logout.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				descriLogout.setVisible(true);
			}
		});

		cadastroProff.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				descriCadastroProff.setVisible(true);
			}
		});

		email.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				descriEmail.setVisible(true);
			}
		});

		lab.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				descriLab.setVisible(true);
			}
		});

		background.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				descriLogout.setVisible(false);
				descriEmail.setVisible(false);
				descriLab.setVisible(false);
				descriCalendario.setVisible(false);
				descriCadastroProff.setVisible(false);
			}
		});

		// -------------------------------------------------------------------------------------------------------------------------

		// -------------------------------------------------------------------------------------------------------------------------

		chamado.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				chamado.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/BMChamadoT-Click.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				chamado.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/BMChamadoT-Normal.png")));

				Classes.BD bd = new Classes.BD();

				bd.conectar();
				bd.verificar_chamado();
			}
		});

		lab.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lab.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/BMLaboratorio-Click.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				lab.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/BMLaboratorio-Normal.png")));
				Laboratorio laboratorio = new Laboratorio();
				laboratorio.setVisible(true);
				dispose();

			}
		});

		email.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				email.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/BMEmail-Click.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				email.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/BMEmail-Normal.png")));
				Chat chat = new Chat();
				chat.setVisible(true);
				dispose();
			}
		});

		logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				logout.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/BMLogout128-Click.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				logout.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/BMLogout128-Normal.png")));
				Classes.BD bd = new Classes.BD();
				bd.conectar();
				bd.apagar_atual("online_trainee");
				Login_T tela_login = new Login_T();
				tela_login.setVisible(true);
				dispose();
			}
		});

		cadastroProff.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				cadastroProff.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/BMCadastroProff2-Click.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				cadastroProff.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/BMCadastroProff2-Normal.png")));
				Cadastrar_P cadastrar_p = new Cadastrar_P();
				cadastrar_p.setVisible(true);
				dispose();

			}
		});

		perfil.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				perfil.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/BMPerfil-Click.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				perfil.setIcon(new ImageIcon(Inicial.class.getResource("/Fotos/BMPerfil-Normal.png")));
				Perfil perfil_t = new Perfil();
				perfil_t.setVisible(true);
				dispose();
			}
		});

	}
}
