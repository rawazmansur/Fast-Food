package exe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dialog;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;

public class Homepage extends JFrame {
	JFrame homepageFrame;
	private JPanel menuPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage frame = new Homepage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Homepage() {
		setTitle("Fast Food");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\logo.jpg"));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1059, 717);
		menuPanel = new JPanel();
		menuPanel.setBackground(new Color(70, 99, 200));
		menuPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(menuPanel);
		menuPanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1043, 678);
		menuPanel.add(panel);
		panel.setLayout(null);

		JButton discount = new JButton("DISCOUNT");
		discount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Discount d = new Discount();
				d.setVisible(true);

			}
		});
		discount.setContentAreaFilled(false);
		discount.setBorderPainted(false);
		discount.setFocusPainted(false); // Remove the focus border
		discount.setBorder(null);
		discount.setBackground(new Color(0, 0, 0, 0));
		discount.setOpaque(false);
		discount.setForeground(Color.WHITE);

		discount.setForeground(Color.WHITE);
		discount.setFont(new Font("DrAbdulWahidMT", Font.PLAIN, 33));
		discount.setBounds(52, 357, 183, 104);
		panel.add(discount);

		JButton exit = new JButton("EXIT");
		exit.setBorderPainted(false); // Remove the button border
		exit.setContentAreaFilled(false); // Make the button transparent
		exit.setFocusPainted(false); // Remove the focus border
		exit.setBorder(null);
		exit.setBackground(new Color(0, 0, 0, 0));
		exit.setOpaque(false);
		exit.setForeground(Color.WHITE);
		exit.setFont(new Font("DrAbdulWahidMT", Font.PLAIN, 33));
		exit.setBounds(12, 418, 162, 104);

		panel.add(exit);
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Close the program when the "Exit" button is clicked
				System.exit(0);
			}
		});

		JLabel lblNewLabel = new JLabel(".");
		lblNewLabel.setBorder(null);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\new.JPG"));
		lblNewLabel.setBounds(0, 0, 1043, 678);
		panel.add(lblNewLabel);
	}
}
