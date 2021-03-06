package com.academia.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.academia.model.models.Personal;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class PersonalGUI extends JFrame {

	private static final long serialVersionUID = 2190619453341927627L;
	
	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldAge;
	private JTextField textFieldAdress;
	private JTextField textFieldNumber;
	private JTextField textFieldNeightbornhood;
	private JTextField textFieldCity;
	private JTextField textFieldTelephone;
	private JTextField textFieldCodePost;
	private JTextField textFieldGender;
	private JTextField textFieldPeriod;
	private JTextField textFieldCref;
	private JRadioButton rdbtnActivity;
	
	private JButton btnIncluir;
	private JButton btnAlterar;
	private JButton btnExcluir;
	private JButton btnSair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonalGUI frame = new PersonalGUI();
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
	public PersonalGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblName = new JLabel("Nome:");
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		
		JLabel lblAge = new JLabel("Idade:");
		
		textFieldAge = new JTextField();
		textFieldAge.setText("");
		textFieldAge.setColumns(10);
		
		JLabel lblAdress = new JLabel("Endereço:");
		
		textFieldAdress = new JTextField();
		textFieldAdress.setColumns(10);
		
		JLabel lblNumberl = new JLabel("Numero:");
		
		textFieldNumber = new JTextField();
		textFieldNumber.setColumns(10);
		
		JLabel lblNeightbornhood = new JLabel("Bairro:");
		
		textFieldNeightbornhood = new JTextField();
		textFieldNeightbornhood.setColumns(10);
		
		JLabel lblCity = new JLabel("Cidade:");
		
		textFieldCity = new JTextField();
		textFieldCity.setColumns(10);
		
		JLabel lblTelephone = new JLabel("Telefone:");
		
		textFieldTelephone = new JTextField();
		textFieldTelephone.setColumns(10);
		
		JLabel lblPostalCode = new JLabel("Codigo Postal:");
		
		textFieldCodePost = new JTextField();
		textFieldCodePost.setColumns(10);
		
		JLabel lblGender = new JLabel("Genero:");
		
		textFieldGender = new JTextField();
		textFieldGender.setColumns(10);
		
		JLabel lblPeriod = new JLabel("Periodo:");
		
		textFieldPeriod = new JTextField();
		textFieldPeriod.setText("");
		textFieldPeriod.setColumns(10);
		
		JLabel lblCref = new JLabel("CREF:");
		
		textFieldCref = new JTextField();
		textFieldCref.setText("");
		textFieldCref.setColumns(10);
		
		rdbtnActivity = new JRadioButton("Ativo");
		
		//-----------------------------------------------------------------//	
		btnIncluir = new JButton("Incluir");
		
		btnAlterar = new JButton("Alterar");
		
		btnExcluir = new JButton("Excluir");
		
		btnSair = new JButton("Sair");		
		//-----------------------------------------------------------------//	
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(45)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnActivity)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNeightbornhood)
								.addComponent(lblCity)
								.addComponent(lblPeriod)
								.addComponent(lblAdress)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblName, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblAge, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(btnIncluir))
							.addGap(17)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblCref)
												.addComponent(textFieldCity, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(1)
													.addComponent(btnAlterar)
													.addGap(18)
													.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
													.addGroup(gl_contentPane.createSequentialGroup()
														.addGap(47)
														.addComponent(lblPostalCode)
														.addGap(18)
														.addComponent(textFieldCodePost, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
													.addGroup(gl_contentPane.createSequentialGroup()
														.addGap(18)
														.addComponent(textFieldCref)))
												.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
											.addComponent(textFieldName)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(textFieldAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGap(35)
												.addComponent(lblTelephone)
												.addGap(18)
												.addComponent(textFieldTelephone, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
												.addGap(51)
												.addComponent(lblGender)
												.addGap(18)
												.addComponent(textFieldGender))
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
													.addComponent(textFieldNeightbornhood, Alignment.LEADING)
													.addComponent(textFieldAdress, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
												.addGap(29)
												.addComponent(lblNumberl)
												.addGap(18)
												.addComponent(textFieldNumber))))
									.addGap(43))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textFieldPeriod, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(31)
							.addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(34)
							.addComponent(lblName)))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAge)
						.addComponent(textFieldAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelephone)
						.addComponent(textFieldTelephone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGender)
						.addComponent(textFieldGender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAdress, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldAdress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumberl)
						.addComponent(textFieldNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNeightbornhood)
						.addComponent(textFieldNeightbornhood, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCity)
						.addComponent(textFieldCity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldCodePost, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPostalCode))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPeriod)
						.addComponent(textFieldPeriod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCref)
						.addComponent(textFieldCref, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(rdbtnActivity)
					.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSair)
						.addComponent(btnIncluir, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAlterar)
						.addComponent(btnExcluir))
					.addGap(54))
		);
		contentPane.setLayout(gl_contentPane);
		createEvents();
	}
	
	private void createEvents() {
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
	
	public Personal PegarDadosPersonal() {
		Personal personal = new Personal();
		
		personal.setName(textFieldName.getText());
		personal.setAge(textFieldAge.getColumns());
		personal.setAdress(textFieldAdress.getText());
		personal.setNumber(textFieldNumber.getColumns());
		personal.setNeighborhood(textFieldNeightbornhood.getText());		
		personal.setCity(textFieldCity.getText());		
		personal.setTelephone(textFieldTelephone.getColumns());		
		personal.setCodeposte(textFieldCodePost.getColumns());
		personal.setGender(textFieldGender.getText());		
		personal.setPeriod(textFieldPeriod.getText());
		personal.setCref(textFieldCref.getText());		
		
		if(rdbtnActivity.isSelected()) {
			personal.setActivity(true);
		} else{
			personal.setActivity(false);
		}
		
		return personal;
	}
}
