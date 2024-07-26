
import java.util.*;
import java.awt.event.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class Regular {

	private JFrame frame;
	private JTextField textField;
	private JTextField result;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public int money = 0;
	public String result1;
	public int n;
	public String s;
	public String s2;
	public int n2;
	private JTextField bill1;
	private JTextField bill2;
	private JTextField bill3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Regular window = new Regular();
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
	public Regular() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 937, 645);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1. IceCream In Cone - PHP10");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(61, 117, 243, 54);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblchocoSyrup = new JLabel("2.Choco Syrup - PHP20");
		lblchocoSyrup.setHorizontalAlignment(SwingConstants.CENTER);
		lblchocoSyrup.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblchocoSyrup.setBounds(39, 160, 243, 54);
		frame.getContentPane().add(lblchocoSyrup);
		
		JLabel lblvanillaPhp = new JLabel("3.Vanilla - PHP20");
		lblvanillaPhp.setHorizontalAlignment(SwingConstants.CENTER);
		lblvanillaPhp.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblvanillaPhp.setBounds(18, 202, 243, 54);
		frame.getContentPane().add(lblvanillaPhp);
		
		JLabel lblchoclatePhp = new JLabel("4.Choclate - PHP40");
		lblchoclatePhp.setHorizontalAlignment(SwingConstants.CENTER);
		lblchoclatePhp.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblchoclatePhp.setBounds(25, 252, 243, 54);
		frame.getContentPane().add(lblchoclatePhp);
		
		JLabel lblKitkat = new JLabel("5. Kitkat - PHP10");
		lblKitkat.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitkat.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblKitkat.setBounds(18, 304, 243, 54);
		frame.getContentPane().add(lblKitkat);
		
		JLabel lblCookie = new JLabel("6. Cookie - PHp50");
		lblCookie.setHorizontalAlignment(SwingConstants.CENTER);
		lblCookie.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCookie.setBounds(20, 348, 243, 54);
		frame.getContentPane().add(lblCookie);
		
		JLabel lblmmsphp = new JLabel("7.M&Ms -PHP30");
		lblmmsphp.setHorizontalAlignment(SwingConstants.CENTER);
		lblmmsphp.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblmmsphp.setBounds(13, 394, 243, 54);
		frame.getContentPane().add(lblmmsphp);
		
		JLabel lblCandy = new JLabel("8. Candy - PHP20");
		lblCandy.setHorizontalAlignment(SwingConstants.CENTER);
		lblCandy.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCandy.setBounds(18, 441, 243, 54);
		frame.getContentPane().add(lblCandy);
		
		JLabel lblEnterYourChoice = new JLabel("Enter your Choice");
		lblEnterYourChoice.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterYourChoice.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterYourChoice.setBounds(39, 506, 243, 54);
		frame.getContentPane().add(lblEnterYourChoice);
		
		textField = new JTextField();
		textField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(278, 515, 104, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = textField.getText();
				 n = Integer.parseInt(s); 
				if(n == 1) {
					result.setText("Price is 10PHP , Calories is 300");
				}
				else if(n == 2) {
					result.setText("Price is 20PHP , Calories is 100");
				}
				else if(n == 3) {
					result.setText("Price is 20PHP , Calories is 400");
				}
				else if(n == 4) {
					result.setText("Price is 40PHP , Calories is 350");
				}
				else if(n == 5) {
					result.setText("Price is 10PHP , Calories is 70");
				}
				else if(n == 6) {
					result.setText("Price is 50PHP , Calories is 50");
				}
				else if(n == 7) {
					result.setText("Price is 30PHP , Calories is 150");
				}
				else if(n == 8) {
					result.setText("Price is 20PHP , Calories is 50");
				}
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(409, 515, 115, 37);
		frame.getContentPane().add(btnNewButton);
		
		result = new JTextField();
		result.setEditable(false);
		result.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		result.setBackground(Color.LIGHT_GRAY);
		result.setFont(new Font("Tahoma", Font.BOLD, 16));
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setBounds(483, 145, 412, 49);
		frame.getContentPane().add(result);
		result.setColumns(10);
		
		JButton btnPurchase = new JButton("Purchase");
		btnPurchase.setBorderPainted(false);
		btnPurchase.setBackground(Color.GRAY);
		btnPurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
					money = Integer.parseInt(textField.getText());
					 String s1 = textField.getText();
					int n1 = Integer.parseInt(s1);
					String s2 = textField_1.getText();
					int n2 = Integer.parseInt(s2);
					if(n1 == 1) {
						if(n2 < 10) {
							JOptionPane.showMessageDialog(frame,"Insufficient balance.","Alert",JOptionPane.WARNING_MESSAGE);    
						}else {
							money = n2 - 10;
							String s=Integer.toString(money);
							textField_2.setText(s);		
							bill3.setText("Money Returned : " + s);
							bill2.setText("Money Entered :" + n2);
							bill1.setText("Item : IceCream" );
						}
					}
					
					if(n1 == 2) {
						if(n2 < 20) {
							JOptionPane.showMessageDialog(frame,"Insufficient balance.","Alert",JOptionPane.WARNING_MESSAGE);    
						}else {
							money = n2 - 20;
							String s=Integer.toString(money);
							textField_2.setText(s);		
							bill2.setText("Money Entered :" + n2);
							bill3.setText("Money Returned : " + s);
							bill1.setText("Item : Choco Syrup");
							
						}
					}
					
					if(n1 == 3) {
						if(n2 < 20) {
							JOptionPane.showMessageDialog(frame,"Insufficient balance.","Alert",JOptionPane.WARNING_MESSAGE);    
						}else {
							money = n2 - 20;
							String s=Integer.toString(money);
							textField_2.setText(s);		
							bill3.setText("Money Returned : " + s);
							bill2.setText("Money Entered :" + n2);
							bill1.setText("Item : Vanilla");
						}
					}
					
					if(n1 == 4) {
						if(n2 < 40) {
							JOptionPane.showMessageDialog(frame,"Insufficient balance.","Alert",JOptionPane.WARNING_MESSAGE);    
						}else {
							money = n2 - 40;
							String s=Integer.toString(money);
							textField_2.setText(s);		
							bill3.setText("Money Returned : " + s);
							bill2.setText("Money Entered :" + n2);
							bill1.setText("Item : Choclate");
						}
						
					}
					
					if(n1 == 5) {
						if(n2 < 10) {
							JOptionPane.showMessageDialog(frame,"Insufficient balance.","Alert",JOptionPane.WARNING_MESSAGE);    
						}else {
							money = n2 - 10;
							String s=Integer.toString(money);
							textField_2.setText(s);	
							bill3.setText("Money Returned : " + s);
							bill2.setText("Money Entered :" + n2);
							bill1.setText("Item : Kitkat");
						}
					}
					
					if(n1 == 6) {
						if(n2 < 50) {
							JOptionPane.showMessageDialog(frame,"Insufficient balance.","Alert",JOptionPane.WARNING_MESSAGE);    
						}else {
							money = n2 - 50;
							String s=Integer.toString(money);
							textField_2.setText(s);	
							bill3.setText("Money Returned : " + s);
							bill2.setText("Money Entered :" + n2);
							bill1.setText("Item : Cookie");
						}
					}
					
					if(n1 == 7) {
						if(n2 < 30) {
							JOptionPane.showMessageDialog(frame,"Insufficient balance.","Alert",JOptionPane.WARNING_MESSAGE);    
						}else {
							money = n2 - 30;
							String s=Integer.toString(money);
							textField_2.setText(s);		
							bill3.setText("Money Returned : " + s);
							bill2.setText("Money Entered :" + n2);
							bill1.setText("Item : M&Ms");
						}
					}
					
					if(n1 == 8) {
						if(n2 < 20) {
							JOptionPane.showMessageDialog(frame,"Insufficient balance.","Alert",JOptionPane.WARNING_MESSAGE);    
						}else {
							money = n2 - 20;
							String s=Integer.toString(money);
							textField_2.setText(s);
							bill3.setText("Money Returned : " + s);
							bill2.setText("Money Entered :" + n2);
							bill1.setText("Item : Candy");
						}
						
					}
					
					
					
					// Bill
					
				/*	if(n == 1) {
						bill1.setText("Item : IceCream" );
					}
					else if(n == 2) {
						bill1.setText("Item : Choco Syrup");
					}
					else if(n == 3) {
						bill1.setText("Item : Vanilla");
					}
					else if(n == 4) {
						bill1.setText("Item : Choclate");
					}
					else if(n == 5) {
						bill1.setText("Item : Kitkat");
					}
					else if(n == 6) {
						bill1.setText("Item : Cookie");
					}
					else if(n == 7) {
						bill1.setText("Item : M&Ms");
					}
					else if(n == 8) {
						bill1.setText("Item : Candy");
					}
					*/
					
					
					
			}
		});
		btnPurchase.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPurchase.setBounds(602, 343, 115, 37);
		frame.getContentPane().add(btnPurchase);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(757, 227, 138, 37);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(757, 285, 138, 37);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("Enter money");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(628, 228, 104, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Change");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(628, 286, 104, 34);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		bill1 = new JTextField();
		bill1.setFont(new Font("Tahoma", Font.BOLD, 15));
		bill1.setHorizontalAlignment(SwingConstants.CENTER);
		bill1.setBackground(Color.LIGHT_GRAY);
		bill1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		bill1.setBounds(699, 411, 182, 37);
		frame.getContentPane().add(bill1);
		bill1.setColumns(10);
		
		bill2 = new JTextField();
		bill2.setFont(new Font("Tahoma", Font.BOLD, 15));
		bill2.setHorizontalAlignment(SwingConstants.CENTER);
		bill2.setColumns(10);
		bill2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		bill2.setBackground(Color.LIGHT_GRAY);
		bill2.setBounds(699, 475, 182, 37);
		frame.getContentPane().add(bill2);
		
		bill3 = new JTextField();
		bill3.setFont(new Font("Tahoma", Font.BOLD, 15));
		bill3.setHorizontalAlignment(SwingConstants.CENTER);
		bill3.setColumns(10);
		bill3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		bill3.setBackground(Color.LIGHT_GRAY);
		bill3.setBounds(699, 538, 182, 37);
		frame.getContentPane().add(bill3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_2.setBounds(683, 396, 212, 201);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Bill >>");
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.BOLD, 30));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(525, 510, 148, 54);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBorderPainted(false);
		btnClear.setBackground(Color.GRAY);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(null);
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClear.setBounds(780, 343, 115, 37);
		frame.getContentPane().add(btnClear);
		
		JLabel lblNewLabel_4 = new JLabel("Regular Vending Machine");
		lblNewLabel_4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(175, 10, 600, 96);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("<<back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display d = new Display();
				d.setVisble(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(10, 703, 104, 34);
		frame.getContentPane().add(btnNewButton_1);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		
	}
}