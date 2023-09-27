package exe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Discount extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Discount frame = new Discount();
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
	public Discount() {
		
		setTitle("Dicount");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\logo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 656);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 644, 617);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("a");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\rawaz\\eclipse-workspace\\FastFood\\src\\exe\\discound1.JPG"));
		lblNewLabel.setBounds(0, 0, 644, 617);
		panel.add(lblNewLabel);
	}

}
