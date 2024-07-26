
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class First {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First window = new First();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public First() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().getContentPane().setBackground(Color.LIGHT_GRAY);
		getFrame().setBounds(100, 100, 831, 554);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vending Machine");
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(158, 10, 533, 114);
		getFrame().getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Create Vending Machine");
		lblNewLabel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(115, 161, 244, 45);
		getFrame().getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Test Vending Machine");
		lblNewLabel_1_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(115, 241, 244, 45);
		getFrame().getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Display Item Details");
		lblNewLabel_1_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(115, 332, 244, 45);
		getFrame().getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Exit Program");
		lblNewLabel_1_3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(115, 414, 244, 45);
		getFrame().getContentPane().add(lblNewLabel_1_3);
		
		JButton btnNewButton = new JButton("Test");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Create machine first.","Alert",JOptionPane.WARNING_MESSAGE);    
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(446, 252, 135, 45);
		getFrame().getContentPane().add(btnNewButton);
		
		JButton btnTest = new JButton("Create");
		btnTest.setBorderPainted(false);
		btnTest.setBackground(Color.GRAY);
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object message = null;
				int option = JOptionPane.showConfirmDialog(null, "Do you want to create a new vending machine?", "Confirmation", JOptionPane.YES_NO_OPTION);
				if (option == JOptionPane.YES_OPTION) {
		            // If the user clicked "yes", create a new frame
		            Display1 d = new Display1();
		            d.setVisible(true);
		            frame.dispose();
		            
		        } else {
		            
		        }
				
			}
		});
		btnTest.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTest.setBounds(446, 162, 135, 45);
		getFrame().getContentPane().add(btnTest);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.setBorderPainted(false);
		btnDisplay.setBackground(Color.GRAY);
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Create machine first","Alert",JOptionPane.WARNING_MESSAGE);    
			}
		});
		btnDisplay.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDisplay.setBounds(446, 332, 135, 45);
		getFrame().getContentPane().add(btnDisplay);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBorderPainted(false);
		btnExit.setBackground(Color.GRAY);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(getFrame(), "Do you want to exit the program?", "Confirmation", JOptionPane.YES_NO_OPTION);
				if (choice == JOptionPane.YES_OPTION) {
	                // User clicked "Yes," so close the frame
	                getFrame().dispose(); // Close the frame and release its resources
	            } else {
	                // User clicked "No" or closed the dialog, so keep the frame open
	                getFrame().setVisible(true);
	                getFrame().dispose();
	            }

			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExit.setBounds(446, 414, 135, 45);
		getFrame().getContentPane().add(btnExit);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		getFrame().setVisible(true);
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}