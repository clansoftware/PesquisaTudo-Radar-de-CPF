package br.com.pesquisatudo.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JTextPane;
import java.awt.TextArea;
import java.awt.Button;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

public class DashBoard {

	private JFrame frmPesquisatudoRadar;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard window = new DashBoard();
					window.frmPesquisatudoRadar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DashBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPesquisatudoRadar = new JFrame();
		frmPesquisatudoRadar.setTitle("PesquisaTudo - Radar de CPF");
		frmPesquisatudoRadar.setBounds(100, 100, 645, 500);
		frmPesquisatudoRadar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPesquisatudoRadar.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(503, 433, 117, 25);
		frmPesquisatudoRadar.getContentPane().add(btnNewButton);
		
		Choice choice = new Choice();
		choice.add("PR");
		choice.add("SC");
		choice.add("RS");
		choice.setBounds(552, 44, 68, 25);
		frmPesquisatudoRadar.getContentPane().add(choice);
		
		Label label = new Label("Estado:");
		label.setBounds(490, 44, 56, 21);
		frmPesquisatudoRadar.getContentPane().add(label);
		
		Label label_1 = new Label("Data Nascimento:");
		label_1.setBounds(206, 48, 113, 21);
		frmPesquisatudoRadar.getContentPane().add(label_1);
		
		Label label_2 = new Label("Token:");
		label_2.setBounds(10, 9, 44, 21);
		frmPesquisatudoRadar.getContentPane().add(label_2);
		
		Label label_3 = new Label("JWT:");
		label_3.setBounds(208, 9, 36, 21);
		frmPesquisatudoRadar.getContentPane().add(label_3);
		
		Label label_1_1 = new Label("CPF:");
		label_1_1.setBounds(10, 48, 36, 21);
		frmPesquisatudoRadar.getContentPane().add(label_1_1);
		
		Button button = new Button("Salvar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(534, 9, 86, 23);
		frmPesquisatudoRadar.getContentPane().add(button);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(60, 10, 132, 19);
		frmPesquisatudoRadar.getContentPane().add(passwordField);
		
		JButton btnSuporte = new JButton("Suporte");
		btnSuporte.setBounds(12, 433, 117, 25);
		frmPesquisatudoRadar.getContentPane().add(btnSuporte);
		
		textField = new JTextField();
		textField.setBounds(245, 10, 283, 19);
		frmPesquisatudoRadar.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(60, 48, 132, 19);
		frmPesquisatudoRadar.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(325, 44, 159, 19);
		frmPesquisatudoRadar.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
