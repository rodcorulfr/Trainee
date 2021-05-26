package Testes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teste_Trazer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste_Trazer frame = new Teste_Trazer();
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
	public Teste_Trazer() {
		
		Classes.BD bd = new Classes.BD();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(31, 48, 46, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(87, 45, 246, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(31, 78, 46, 14);
		contentPane.add(lblMatricula);
		
		textField_1 = new JTextField();
		textField_1.setBounds(87, 76, 246, 17);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnTrazer = new JButton("Trazer");
		btnTrazer.setBounds(156, 171, 89, 23);
		contentPane.add(btnTrazer);
		
		
		//---------------------------------------------------------------------------------------------------------//
		
		btnTrazer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
				
			}
		});
		
		
		
	}
}
