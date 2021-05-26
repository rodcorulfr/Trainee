package Telas_Professor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

import Classes.Email;
import Telas_Trainee.Chat;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class Chat_P extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chat_P frame = new Chat_P();
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
	public Chat_P() {

		Classes.Email email_ = new Classes.Email();
		Classes.BD bd = new Classes.BD();

		setTitle("COLINF - Email");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);// PRA DEIXAR A TELA CENTRALIZADA COM O MONITOR

		JLabel lblTtulo = new JLabel("T\u00EDtulo");
		lblTtulo.setForeground(Color.WHITE);
		lblTtulo.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblTtulo.setBounds(105, 41, 60, 14);
		contentPane.add(lblTtulo);

		JTextArea taTitulo = new JTextArea();
		taTitulo.setSelectionColor(new Color(60, 179, 113));
		taTitulo.setRows(1);
		taTitulo.setForeground(Color.WHITE);
		taTitulo.setDisabledTextColor(Color.WHITE);
		taTitulo.setColumns(1);
		taTitulo.setCaretColor(Color.WHITE);
		taTitulo.setBackground(Color.DARK_GRAY);
		taTitulo.setBounds(88, 76, 552, 23);
		contentPane.add(taTitulo);

		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setForeground(Color.WHITE);
		lblDescrio.setFont(new Font("Roboto Condensed", Font.BOLD, 16));
		lblDescrio.setBounds(105, 107, 79, 14);
		contentPane.add(lblDescrio);

		JLabel lblNomeDoTrainee = new JLabel("Nome do Trainee");
		lblNomeDoTrainee.setFont(new Font("Roboto Condensed", Font.BOLD, 16));
		lblNomeDoTrainee.setForeground(Color.WHITE);
		lblNomeDoTrainee.setBounds(105, 378, 151, 14);
		contentPane.add(lblNomeDoTrainee);

		JComboBox cbTrainee = new JComboBox();
		bd.conectar();
		DefaultComboBoxModel model = new DefaultComboBoxModel(bd.trazer_nome_trainee());
		cbTrainee.setModel(model);
		
		cbTrainee.setBounds(242, 377, 217, 20);
		contentPane.add(cbTrainee);

		JLabel lblPrioridade = new JLabel("Prioridade");
		lblPrioridade.setForeground(Color.WHITE);
		lblPrioridade.setFont(new Font("Roboto Condensed", Font.BOLD, 16));
		lblPrioridade.setBounds(105, 412, 79, 14);
		contentPane.add(lblPrioridade);

		JRadioButton rbPrioridade = new JRadioButton("Prioridade");
		buttonGroup.add(rbPrioridade);
		rbPrioridade.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		rbPrioridade.setForeground(Color.WHITE);
		rbPrioridade.setBorder(new LineBorder(Color.BLACK));
		rbPrioridade.setBackground(Color.DARK_GRAY);
		rbPrioridade.setBounds(273, 407, 109, 23);
		contentPane.add(rbPrioridade);

		JRadioButton rbComum = new JRadioButton("Comum");
		buttonGroup.add(rbComum);
		rbComum.setSelected(true);
		rbComum.setBackground(Color.DARK_GRAY);
		rbComum.setForeground(Color.WHITE);
		rbComum.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		rbComum.setBounds(190, 407, 79, 23);
		contentPane.add(rbComum);

		JTextArea taDescricao = new JTextArea();
		taDescricao.setDisabledTextColor(Color.WHITE);
		taDescricao.setRows(1);
		taDescricao.setColumns(1);
		taDescricao.setForeground(new Color(255, 255, 255));
		taDescricao.setSelectionColor(new Color(60, 179, 113));
		taDescricao.setCaretColor(Color.WHITE);
		taDescricao.setBackground(Color.DARK_GRAY);
		taDescricao.setBounds(88, 132, 552, 195);
		contentPane.add(taDescricao);

		JLabel voltar = new JLabel();
		voltar.setIcon(new ImageIcon(Chat_P.class.getResource("/Fotos/BVoltar-Normal.png")));
		voltar.setBounds(12, 30, 49, 50);
		contentPane.add(voltar);

		voltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				voltar.setIcon(new ImageIcon(Chat_P.class.getResource("/Fotos/BVoltar-Click.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				voltar.setIcon(new ImageIcon(Chat_P.class.getResource("/Fotos/BVoltar-Normal.png")));
				Inicial_P tela_inicio = new Inicial_P();
				tela_inicio.setVisible(true);
				dispose();
			}
		});

		JLabel enviar = new JLabel("");
		enviar.setIcon(new ImageIcon(Chat_P.class.getResource("/Fotos/BCEnviar-Normal.png")));
		enviar.setBounds(547, 359, 79, 79);
		contentPane.add(enviar);

		// -------------------------------------------------------------------------------------------------

		enviar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				enviar.setIcon(new ImageIcon(Chat_P.class.getResource("/Fotos/BCEnviar-Click.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				enviar.setIcon(new ImageIcon(Chat_P.class.getResource("/Fotos/BCEnviar-Normal.png")));

				String priod = "0";

				if (rbComum.isSelected()) {
					priod = "0";
				}
				if (rbPrioridade.isSelected()) {
					priod = "1";
				}

				// java.util.Date d = new Date();
				Date data = new Date();
				String fdata = new SimpleDateFormat("yyyy-MM-dd").format(data);
				String fhora = new SimpleDateFormat("HH:mm").format(data);

				System.out.println(fdata);
				System.out.println(fhora);
				email_.pegarRemetente();

				String info = String.format("'%s','%s','%s','%s','%s','%s','%s','%s'", email_.getNome_remt(),cbTrainee.getSelectedItem(),taTitulo.getText(),
						taDescricao.getText(),fdata,fhora,"Fechado",priod
						);
				email_.enviarEmail(info);
				
				taTitulo.setText("");
				taDescricao.setText("");
				cbTrainee.setSelectedIndex(0);
				rbComum.setSelected(true);
				
				JOptionPane.showMessageDialog(null, "Email Enviado!");

			}
		});

		JLabel lbFundo = new JLabel("");
		lbFundo.setIcon(new ImageIcon(Chat_P.class.getResource("/Fotos/fundoCinzaEscuro.png")));
		lbFundo.setBackground(Color.DARK_GRAY);
		lbFundo.setBounds(88, 353, 415, 85);
		contentPane.add(lbFundo);

		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(Chat_P.class.getResource("/Fotos/Background30porcento.png")));
		background.setBounds(0, 0, 693, 456);
		contentPane.add(background);

	}
}
