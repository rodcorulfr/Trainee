package Telas_Trainee;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class Chat extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chat frame = new Chat();
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
	public Chat() {

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

		JLabel voltar = new JLabel("");
		voltar.setIcon(new ImageIcon(Chat.class.getResource("/Fotos/BVoltar-Normal.png")));
		voltar.setBounds(10, 11, 49, 50);
		contentPane.add(voltar);

		JLabel Logo = new JLabel("");
		Logo.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/COLINF2.png")));
		Logo.setBounds(522, 360, 161, 85);
		contentPane.add(Logo);

		JTextArea taDescricao = new JTextArea();
		taDescricao.setEditable(false);
		taDescricao.setSelectionColor(new Color(60, 179, 113));
		taDescricao.setRows(1);
		taDescricao.setForeground(Color.WHITE);
		taDescricao.setDisabledTextColor(Color.WHITE);
		taDescricao.setColumns(1);
		taDescricao.setCaretColor(Color.WHITE);
		taDescricao.setBackground(Color.DARK_GRAY);
		taDescricao.setBounds(21, 149, 513, 246);
		contentPane.add(taDescricao);

		JComboBox cbTitulos = new JComboBox();
		DefaultComboBoxModel model = new DefaultComboBoxModel(email_.trazerEmail());
		cbTitulos.setModel(model);
		cbTitulos.setBounds(129, 11, 405, 20);
		contentPane.add(cbTitulos);

		JLabel label = new JLabel("Descri\u00E7\u00E3o");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Roboto Cn", Font.BOLD, 16));
		label.setBounds(20, 124, 508, 14);
		contentPane.add(label);

		JTextArea taTitulo = new JTextArea();
		taTitulo.setEditable(false);
		taTitulo.setSelectionColor(new Color(60, 179, 113));
		taTitulo.setRows(1);
		taTitulo.setForeground(Color.WHITE);
		taTitulo.setDisabledTextColor(Color.WHITE);
		taTitulo.setColumns(1);
		taTitulo.setCaretColor(Color.WHITE);
		taTitulo.setBackground(Color.DARK_GRAY);
		taTitulo.setBounds(21, 93, 513, 23);
		contentPane.add(taTitulo);

		JLabel label_1 = new JLabel("T\u00EDtulo");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Roboto Cn", Font.BOLD, 16));
		label_1.setBounds(21, 68, 508, 14);
		contentPane.add(label_1);

		JRadioButton rbPrioridade = new JRadioButton("Prioridade");
		buttonGroup.add(rbPrioridade);
		rbPrioridade.setForeground(Color.WHITE);
		rbPrioridade.setFont(new Font("Roboto Cn", Font.PLAIN, 13));
		rbPrioridade.setBorder(new LineBorder(Color.BLACK));
		rbPrioridade.setBackground(Color.DARK_GRAY);
		rbPrioridade.setBounds(212, 413, 109, 23);
		contentPane.add(rbPrioridade);

		JRadioButton rbComum = new JRadioButton("Comum");
		buttonGroup.add(rbComum);
		rbComum.setSelected(true);
		rbComum.setForeground(Color.WHITE);
		rbComum.setFont(new Font("Roboto Cn", Font.PLAIN, 13));
		rbComum.setBackground(Color.DARK_GRAY);
		rbComum.setBounds(129, 413, 79, 23);
		contentPane.add(rbComum);

		JLabel label_3 = new JLabel("Prioridade");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Roboto Cn", Font.BOLD, 16));
		label_3.setBounds(44, 418, 79, 14);
		contentPane.add(label_3);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Chat.class.getResource("/Fotos/fundoCinzaEscuro.png")));
		label_2.setBackground(Color.DARK_GRAY);
		label_2.setBounds(21, 406, 338, 39);
		contentPane.add(label_2);

		JLabel atualizar = new JLabel("");
		atualizar.setIcon(new ImageIcon(Chat.class.getResource("/Fotos/BRefresh-Normal.png")));

		atualizar.setBounds(646, 11, 37, 42);
		contentPane.add(atualizar);

		JLabel Fundo = new JLabel("");
		Fundo.setIcon(new ImageIcon(Laboratorio.class.getResource("/Fotos/Background30porcento.png")));
		Fundo.setBounds(0, 0, 693, 456);
		contentPane.add(Fundo);

		// --------------------------------------------------------------------------------------------------------------

		atualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				atualizar.setIcon(new ImageIcon(Chat.class.getResource("/Fotos/BRefresh-Click.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				atualizar.setIcon(new ImageIcon(Chat.class.getResource("/Fotos/BRefresh-Normal.png")));
				try {
					String tit = (String) cbTitulos.getSelectedItem();
					System.out.println(tit);
					bd.conectar();
					bd.inserir_dados_email(tit.trim());

					taTitulo.setText(bd.result.getString("titulo"));
					taDescricao.setText(bd.result.getString("corpo"));

					switch (bd.result.getInt("prioridade")) {
					case 0:
						rbComum.setSelected(true);
						break;
					case 1:
						rbPrioridade.setSelected(true);
						break;

					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
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
