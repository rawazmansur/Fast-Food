package exe;

import java.awt.EventQueue;import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Component;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;



import javax.swing.border.SoftBevelBorder;
import java.awt.ComponentOrientation;
import javax.swing.JTree;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.KeyEvent;
import java.awt.Cursor;
import javax.swing.DropMode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.UIManager;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class Rawaz {

	JFrame frmFastFood;
	JTextField email;
	JPasswordField aapass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rawaz window = new Rawaz();
					window.frmFastFood.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Rawaz() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFastFood = new JFrame();
		frmFastFood.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFastFood.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frmFastFood.setResizable(false);
		frmFastFood.setTitle("Fast Food");
		frmFastFood.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\logo.jpg"));
		frmFastFood.getContentPane().setBackground(new Color(70, 99, 200));
		frmFastFood.setBounds(100, 100, 1095, 666);
		frmFastFood.getContentPane().setLayout(null);
		
				JButton btnNewButton_1 = new JButton("بە گووگڵ بەردەوام بە");
				btnNewButton_1.setBorderPainted(false); // Remove the button border
				btnNewButton_1.setContentAreaFilled(false); // Make the button transparent
				btnNewButton_1.setFocusPainted(false); // Remove the focus border
				btnNewButton_1.setBorder(null);
				btnNewButton_1.setBackground(new Color(0, 0, 0, 0));
				btnNewButton_1.setPreferredSize(new Dimension(0, 0));
				btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
				btnNewButton_1.setBorderPainted(false);
				btnNewButton_1.setOpaque(false);
				btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
				btnNewButton_1.setHorizontalAlignment(SwingConstants.RIGHT);
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						   try {
					            // Specify the URL to the Google login page
					            URI googleLoginURI = new URI("https://accounts.google.com");

					            // Open the default web browser and navigate to the URL
					            Desktop.getDesktop().browse(googleLoginURI);
					        } catch (Exception e1) {
					          
					        }
					}
				});
				btnNewButton_1.setActionCommand("");
				btnNewButton_1.setForeground(new Color(255, 150, 30));
				btnNewButton_1.setFont(new Font("DrAbdulWahidMT", Font.PLAIN, 17));
				btnNewButton_1.setBorder(null);
				btnNewButton_1.setBackground(new Color(70, 99, 200));
				btnNewButton_1.setAlignmentY(0.0f);
				btnNewButton_1.setBounds(705, 123, 171, 40);
				frmFastFood.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\newww2.PNG"));
		lblNewLabel_1.setBounds(661, 123, 293, 40);
		frmFastFood.getContentPane().add(lblNewLabel_1);
		
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setIcon(new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\acacccc.PNG"));
		chckbxNewCheckBox.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		chckbxNewCheckBox.setMnemonic(KeyEvent.VK_ENTER);
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.setBackground(new Color(70, 99, 200));
		
				chckbxNewCheckBox.setFont(new Font("DrAbdulWahidMT", Font.PLAIN, 15));
				chckbxNewCheckBox.setBounds(988, 354, 42, 51);
				frmFastFood.getContentPane().add(chckbxNewCheckBox);
				chckbxNewCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (chckbxNewCheckBox.isSelected()) {
                	
                    aapass.setEchoChar((char) 0); // Show password
                    chckbxNewCheckBox.setIcon(new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\eye_hide.png"));
                } else {
                    aapass.setEchoChar('*'); // Hide password with asterisk (you can change it)
                    chckbxNewCheckBox.setIcon(new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\acacccc.PNG"));
                }
            }
        });

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 520, 627);
		frmFastFood.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(255, 128, 64));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\aaaaaa.JPG"));
		lblNewLabel_2.setBounds(0, 0, 520, 627);
		panel.add(lblNewLabel_2);

		JButton btnNewButton = new JButton("چوونەژوورەوە");
		btnNewButton.setBorderPainted(false); // Remove the button border
		btnNewButton.setContentAreaFilled(false); // Make the button transparent
		btnNewButton.setFocusPainted(false); // Remove the focus border
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 0, 0, 0));
		btnNewButton.setOpaque(false);
		btnNewButton.setBackground(new Color(70, 99, 200));
		btnNewButton.setBounds(705, 450, 192, 40);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setAlignmentY(0.0f);
		btnNewButton.setForeground(Color.WHITE);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Homepage homepage = new Homepage();
				homepage.setVisible(true);
				frmFastFood.dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 128, 0));

		btnNewButton.setFont(new Font("DrAbdulWahidMT", Font.PLAIN, 17));
		frmFastFood.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_3 = new JLabel("خۆتۆمارکردن");
		lblNewLabel_3.setBounds(679, 47, 246, 55);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("DrAbdulWahidMT", Font.PLAIN, 35));
		frmFastFood.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_6 = new JLabel("a");
		lblNewLabel_6.setBounds(515, 194, 564, 40);
		lblNewLabel_6.setDisplayedMnemonic(KeyEvent.VK_MINUS);
		lblNewLabel_6.setDisplayedMnemonicIndex(0);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Rockwell Nova Cond Light", Font.PLAIN, 5));
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\اساس.PNG"));
		frmFastFood.getContentPane().add(lblNewLabel_6);

		JLabel lblNewLabel_6_1 = new JLabel("a");
		lblNewLabel_6_1.setBounds(545, 518, 503, 22);
		lblNewLabel_6_1.setIcon(new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\AAAA.PNG"));
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setFont(new Font("Rockwell Nova Cond Light", Font.PLAIN, 5));
		lblNewLabel_6_1.setDisplayedMnemonicIndex(0);
		lblNewLabel_6_1.setDisplayedMnemonic(KeyEvent.VK_MINUS);
		frmFastFood.getContentPane().add(lblNewLabel_6_1);

		JButton btnNewButton_2 = new JButton("هەژمار دروست بکە");
		btnNewButton_2.setBorderPainted(false); // Remove the button border
		btnNewButton_2.setContentAreaFilled(false); // Make the button transparent
		btnNewButton_2.setFocusPainted(false); // Remove the focus border
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(new Color(0, 0, 0, 0));
		btnNewButton_2.setHorizontalTextPosition(SwingConstants.LEFT);
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2
				.setSelectedIcon(new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\eye.png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Drustkrdni_hazhmar drustkrdni_hazhmar = new Drustkrdni_hazhmar();
				drustkrdni_hazhmar.setVisible(true);

				frmFastFood.dispose();

			}
		});

		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("DrAbdulWahidMT", Font.PLAIN, 14));
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(new Color(70, 99, 200));
		btnNewButton_2.setAlignmentY(0.0f);
		btnNewButton_2.setBounds(545, 574, 129, 22);
		frmFastFood.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_2_1 = new JButton("وشەی نهێنیت لە بیر کرددوە؟");
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("DrAbdulWahidMT", Font.PLAIN, 14));
		btnNewButton_2_1.setBorderPainted(false);
		btnNewButton_2_1.setBorder(null);
		btnNewButton_2_1.setBackground(new Color(70, 99, 200));
		btnNewButton_2_1.setAlignmentY(0.0f);
		btnNewButton_2_1.setBounds(877, 565, 192, 40);
		frmFastFood.getContentPane().add(btnNewButton_2_1);

		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 7));
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\aaaaaaaa.PNG"));
		lblNewLabel_4.setBounds(658, 570, 49, 22);
		frmFastFood.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\cac.JPG"));
		lblNewLabel_5.setBounds(525, 232, 554, 183);
		frmFastFood.getContentPane().add(lblNewLabel_5);

		email = new JTextField();
		email.setBounds(640, 257, 343, 31);
		frmFastFood.getContentPane().add(email);
		email.setFont(new Font("Tahoma", Font.PLAIN, 15));
		email.setBorder(null);
		email.setSelectedTextColor(new Color(0, 128, 255));
		email.setCaretColor(new Color(0, 128, 255));
		email.setDisabledTextColor(new Color(0, 128, 255));
		email.setForeground(Color.WHITE);
		email.setBackground(new Color(70, 99, 200));
		email.setColumns(10);
	
			    
		  email.addFocusListener(new FocusListener() {
	            @Override
	            public void focusGained(FocusEvent e) {
	                // User is editing the email field, keep it white.
	                email.setForeground(Color.WHITE);
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                // User has left the email field, check for "@" and change color accordingly.
	                String text = email.getText();
	                if (text.contains("@")) {
	                    email.setForeground(Color.WHITE);
	                } else {
	                    email.setForeground(Color.RED);
	                }
	            }
	        });

	        frmFastFood.setVisible(true);
	

		aapass = new JPasswordField();
		aapass.setBounds(639, 367, 343, 28);
		frmFastFood.getContentPane().add(aapass);
		aapass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		aapass.setSelectionColor(Color.WHITE);
		aapass.setDisabledTextColor(Color.WHITE);
		aapass.setForeground(Color.WHITE);
		aapass.setCaretColor(Color.WHITE);
		aapass.setBorder(null);
		aapass.setBackground(new Color(70, 99, 200));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\button1.PNG"));
		lblNewLabel.setBounds(705, 450, 212, 40);
		frmFastFood.getContentPane().add(lblNewLabel);

	}
}
