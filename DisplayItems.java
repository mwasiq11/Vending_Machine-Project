
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DisplayItems {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayItems window = new DisplayItems();
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
	public DisplayItems() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 882, 607);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1. IceCream In Cone - PHP10 - Calories 300. ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(168, 127, 412, 54);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblchocoSyrup = new JLabel("2.Choco Syrup - PHP20 - Calories 100.");
		lblchocoSyrup.setHorizontalAlignment(SwingConstants.CENTER);
		lblchocoSyrup.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblchocoSyrup.setBounds(140, 172, 412, 54);
		frame.getContentPane().add(lblchocoSyrup);
		
		JLabel lblvanillaPhp = new JLabel("3.Vanilla - PHP20 - Calories 400.");
		lblvanillaPhp.setHorizontalAlignment(SwingConstants.CENTER);
		lblvanillaPhp.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblvanillaPhp.setBounds(167, 217, 312, 54);
		frame.getContentPane().add(lblvanillaPhp);
		
		JLabel lblchoclatePhp = new JLabel("4.Choclate - PHP40 - Calories  350.");
		lblchoclatePhp.setHorizontalAlignment(SwingConstants.CENTER);
		lblchoclatePhp.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblchoclatePhp.setBounds(190, 262, 289, 54);
		frame.getContentPane().add(lblchoclatePhp);
		
		JLabel lblKitkat = new JLabel("5. Kitkat - PHP10 - Calories 70.");
		lblKitkat.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitkat.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblKitkat.setBounds(185, 307, 272, 54);
		frame.getContentPane().add(lblKitkat);
		
		JLabel lblCookie = new JLabel("6. Cookie - PHP50 - Calories 50.");
		lblCookie.setHorizontalAlignment(SwingConstants.CENTER);
		lblCookie.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCookie.setBounds(178, 352, 289, 54);
		frame.getContentPane().add(lblCookie);
		
		JLabel lblmmsphp = new JLabel("7.M&Ms -PHP30 -  Calories 150.");
		lblmmsphp.setHorizontalAlignment(SwingConstants.CENTER);
		lblmmsphp.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblmmsphp.setBounds(172, 397, 302, 54);
		frame.getContentPane().add(lblmmsphp);
		
		JLabel lblCandy = new JLabel("8. Candy - PHP20 - Calories 50.");
		lblCandy.setHorizontalAlignment(SwingConstants.CENTER);
		lblCandy.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCandy.setBounds(185, 442, 283, 54);
		frame.getContentPane().add(lblCandy);
		
		JLabel lblNewLabel_1 = new JLabel("Available Items");
		lblNewLabel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(171, 0, 529, 108);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("<<Back");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display1 d = new Display1();
				d.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(10, 522, 143, 38);
		frame.getContentPane().add(btnNewButton);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	
		
	}
}