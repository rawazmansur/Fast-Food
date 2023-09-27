package exe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import javax.swing.JCheckBox;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;
import java.awt.event.KeyAdapter;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Drustkrdni_hazhmar extends JFrame {

	private JPanel contentPane;
	private JTextField NametextField;
	private JTextField emailTextField;
	private JTextField phonetext;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Drustkrdni_hazhmar frame = new Drustkrdni_hazhmar();
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
	public Drustkrdni_hazhmar() {
		setTitle("Fast Food");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\logo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 998, 664);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 99, 200));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 491, 627);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("چوونەژوورەوە");
		btnNewButton.setBorderPainted(false); // Remove the button border
		btnNewButton.setContentAreaFilled(false); // Make the button transparent
		btnNewButton.setFocusPainted(false); // Remove the focus border
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 0, 0, 0));
		btnNewButton.setHideActionText(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setMnemonic(KeyEvent.VK_BEGIN);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("DrAbdulWahidMT", Font.BOLD, 15));
	
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rawaz rawazFrame = new Rawaz();
				if (rawazFrame == null) {
					rawazFrame = new Rawaz();
				}
				rawazFrame.frmFastFood.setVisible(true);
				setVisible(false); // Hide the current frame
			}
		});
		// ... (rest of your code)

		btnNewButton.setBounds(154, 336, 182, 34);
		panel.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIgnoreRepaint(true);
		lblNewLabel.setIconTextGap(1);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\newwas.JPG"));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(255, 128, 0));

		lblNewLabel.setBounds(0, 0, 491, 627);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(70, 99, 200));
		panel_1.setBounds(491, 0, 491, 627);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setIcon(new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\avca.PNG"));
		chckbxNewCheckBox_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		chckbxNewCheckBox_1.setMnemonic(KeyEvent.VK_ENTER);
		chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_1.setForeground(Color.WHITE);
		chckbxNewCheckBox_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_1.isSelected()) {

					passwordField.setEchoChar((char) 0); // Show password
					chckbxNewCheckBox_1.setIcon(
							new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\aaac.PNG"));
				} else {
					passwordField.setEchoChar('*'); // Hide password with asterisk (you can change it)
					chckbxNewCheckBox_1.setIcon(
							new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\avca.PNG"));
				}
				if (chckbxNewCheckBox_1.isSelected()) {

					passwordField_1.setEchoChar((char) 0); // Show password
					chckbxNewCheckBox_1.setIcon(
							new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\aaac.PNG"));
				} else {
					passwordField_1.setEchoChar('*'); // Hide password with asterisk (you can change it)
					chckbxNewCheckBox_1.setIcon(
							new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\avca.PNG"));
				}
			}

		});
		
		JButton btnNewButton_1 = new JButton("دروستکردنی هەژمار");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBorderPainted(false); // Remove the button border
		btnNewButton_1.setContentAreaFilled(false); // Make the button transparent
		btnNewButton_1.setFocusPainted(false); // Remove the focus border
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(0, 0, 0, 0));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setMnemonic(KeyEvent.VK_BEGIN);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("DrAbdulWahidMT", Font.PLAIN, 20));
		btnNewButton_1.setBackground(new Color(0, 59, 189));
		btnNewButton_1.setBounds(124, 531, 237, 38);
		panel_1.add(btnNewButton_1);

		passwordField_1 = new JPasswordField();
		passwordField_1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField_1.setSelectionColor(new Color(0, 128, 255));
		passwordField_1.setForeground(Color.BLACK);
		passwordField_1.setDisabledTextColor(new Color(0, 128, 255));
		passwordField_1.setCaretColor(new Color(0, 128, 255));
		passwordField_1.setBorder(null);
		passwordField_1.setBackground(Color.WHITE);
		passwordField_1.setBounds(121, 462, 275, 28);
		panel_1.add(passwordField_1);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		passwordField.setSelectionColor(new Color(0, 128, 255));
		passwordField.setForeground(Color.BLACK);
		passwordField.setDisabledTextColor(new Color(0, 128, 255));
		passwordField.setCaretColor(new Color(0, 128, 255));
		passwordField.setBorder(null);
		passwordField.setBackground(Color.WHITE);
		passwordField.setBounds(121, 391, 275, 28);
		panel_1.add(passwordField);

		NametextField = new JTextField();
		NametextField.setSelectedTextColor(new Color(0, 128, 255));
		NametextField.setForeground(Color.DARK_GRAY);
		NametextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		NametextField.setDisabledTextColor(new Color(0, 128, 255));
		NametextField.setColumns(10);
		NametextField.setCaretColor(new Color(0, 128, 255));
		NametextField.setBorder(null);
		NametextField.setBackground(Color.WHITE);
		NametextField.setBounds(121, 197, 275, 28);
		panel_1.add(NametextField);
		NametextField.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();

		        // Allow only characters (letters) and backspace
		        if (!(Character.isLetter(c) || (c == KeyEvent.VK_BACK_SPACE))) {
		            e.consume(); // Consume the event, i.e., don't allow the character
		        }
		    }
		});
		emailTextField = new JTextField();
		emailTextField.setSelectedTextColor(new Color(0, 128, 255));
		emailTextField.setForeground(Color.BLACK);
		emailTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		emailTextField.setDisabledTextColor(new Color(0, 128, 255));
		emailTextField.setColumns(10);
		emailTextField.setCaretColor(new Color(0, 128, 255));
		emailTextField.setBorder(null);
		emailTextField.setBackground(Color.WHITE);
		emailTextField.setBounds(121, 259, 275, 28);
		panel_1.add(emailTextField);

		phonetext = new JTextField();
		phonetext.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 char c = e.getKeyChar();

			        // Allow digits and backspace
			        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE))) {
			            e.consume(); // Consume the event, i.e., don't allow the character
			        }

			        SwingUtilities.invokeLater(() -> {
			            validatePhoneNumber(); // Call the method to update text color
			        });
			    
			}

			private void validatePhoneNumber() {
				String phone = phonetext.getText();
				int digitCount = phone.replaceAll("[^0-9]", "").length();

				if (digitCount <8) {
					phonetext.setForeground(Color.RED); // Change text color to red when 5 numbers are entered
				} else if (digitCount == 9) {
					phonetext.setForeground(Color.BLACK); // Reset text color to black when 9 numbers are entered
				}
			}

		});

		phonetext.setSelectedTextColor(new Color(0, 128, 255));
		phonetext.setForeground(Color.BLACK);
		phonetext.setFont(new Font("Tahoma", Font.PLAIN, 15));
		phonetext.setDisabledTextColor(new Color(0, 128, 255));
		phonetext.setColumns(10);
		phonetext.setCaretColor(new Color(0, 128, 255));
		phonetext.setBorder(null);
		phonetext.setBackground(Color.WHITE);
		phonetext.setBounds(121, 329, 275, 28);
		panel_1.add(phonetext);

		// Rename the validate method to avoid conflicts

		chckbxNewCheckBox_1.setBounds(413, 462, 35, 23);
		panel_1.add(chckbxNewCheckBox_1);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(UIManager.getFont("Button.font"));
		lblNewLabel_1.setBounds(0, 0, 491, 627);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\updaeewefted.JPG"));
		panel_1.add(lblNewLabel_1);

		// Add a FocusListener to check email validity when the field loses focus
		emailTextField.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				validateEmail();
			}
		});

		panel_1.add(emailTextField);

	}

	private void validateEmail() {
		String email = emailTextField.getText();

		if (!email.contains("@")) {
			emailTextField.setForeground(Color.RED); // Change text color to red
		} else {
			emailTextField.setForeground(Color.BLACK); // Reset text color to black
		}
	}
}
