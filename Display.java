
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Display {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display window = new Display();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Display() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 700, 634);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Special ");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setBounds(251, 191, 181, 52);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Special s = new Special();
				s.setVisible(true);
				frame.dispose();
			}
		});
		frame.getContentPane().setLayout(null);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnRegular = new JButton("Regular");
		btnRegular.setBorderPainted(false);
		btnRegular.setBackground(Color.GRAY);
		btnRegular.setBounds(251, 286, 181, 52);
		btnRegular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Regular r = new Regular();
				r.setVisible(true);
				frame.dispose();
				
			}
		});
		btnRegular.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnRegular);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBorderPainted(false);
		btnBack.setBackground(Color.GRAY);
		btnBack.setBounds(251, 385, 181, 52);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display1 d = new Display1();
				d.setVisible(true);
				frame.dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel = new JLabel("Vending Machine");
		lblNewLabel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(72, 10, 524, 118);
		frame.getContentPane().add(lblNewLabel);
	}

	public void setVisble(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		
	}
}