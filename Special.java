
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Special {

	protected static final String NULL = null;
	private JFrame frame;
	private JTextField textField;
	private JTextField result;
	public int n;
	public int money;
	public String toppingInput;
	String s;
	String toppingFlavorInput;
	public boolean check;
	public int n2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Special window = new Special();
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
	public Special() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 939, 635);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("1. IceCream In Cone - PHP10 + 5Top");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(54, 129, 309, 54);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		JLabel lblchocoSyrup = new JLabel("2.Choco Syrup - PHP20 NFS");
		lblchocoSyrup.setHorizontalAlignment(SwingConstants.CENTER);
		lblchocoSyrup.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblchocoSyrup.setBounds(50, 173, 243, 54);
		frame.getContentPane().add(lblchocoSyrup);
		
		JLabel lblvanillaPhp = new JLabel("3.Vanilla - PHP20");
		lblvanillaPhp.setHorizontalAlignment(SwingConstants.CENTER);
		lblvanillaPhp.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblvanillaPhp.setBounds(11, 221, 243, 54);
		frame.getContentPane().add(lblvanillaPhp);
		
		JLabel lblchoclatePhp = new JLabel("4.Choclate - PHP40");
		lblchoclatePhp.setHorizontalAlignment(SwingConstants.CENTER);
		lblchoclatePhp.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblchoclatePhp.setBounds(20, 265, 243, 54);
		frame.getContentPane().add(lblchoclatePhp);
		
		JLabel lblKitkat = new JLabel("5. Kitkat - PHP10");
		lblKitkat.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitkat.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblKitkat.setBounds(12, 313, 243, 54);
		frame.getContentPane().add(lblKitkat);
		
		JLabel lblCookie = new JLabel("6. Cookie - PHp50");
		lblCookie.setHorizontalAlignment(SwingConstants.CENTER);
		lblCookie.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCookie.setBounds(16, 359, 243, 54);
		frame.getContentPane().add(lblCookie);
		
		JLabel lblmmsphp = new JLabel("7.M&Ms -PHP30");
		lblmmsphp.setHorizontalAlignment(SwingConstants.CENTER);
		lblmmsphp.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblmmsphp.setBounds(10, 400, 243, 54);
		frame.getContentPane().add(lblmmsphp);
		
		JLabel lblCandy = new JLabel("8. Candy - PHP20");
		lblCandy.setHorizontalAlignment(SwingConstants.CENTER);
		lblCandy.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCandy.setBounds(18, 441, 243, 54);
		frame.getContentPane().add(lblCandy);
		
		JLabel lblEnterYourChoice = new JLabel("Enter your Choice");
		lblEnterYourChoice.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterYourChoice.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterYourChoice.setBounds(38, 506, 243, 54);
		frame.getContentPane().add(lblEnterYourChoice);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(269, 513, 111, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				String s = textField.getText();
				 n = Integer.parseInt(s); 
				if(n == 1) {
					String input = JOptionPane.showInputDialog("Choose Flavour you like , Vanila or Choclate ");
					if(input.equalsIgnoreCase("Vanila")) {
						 String toppingInput = JOptionPane.showInputDialog("Do you want to add toppings? (Yes/No)");
						 if (toppingInput.equalsIgnoreCase("Yes")) {
				                String toppingFlavorInput = JOptionPane.showInputDialog("Enter a topping for Vanilla: Choco syrup , M&Ms , Candy");
				                if(toppingFlavorInput.equalsIgnoreCase("Choco syrup")) {
				                	result.setText("Vanilla IceCream with choco topping PHP20+20,Calories 500");
				                }else if(toppingFlavorInput.equalsIgnoreCase("M&Ms")){
				                	result.setText("Vanilla IceCream with M&Ms topping PHP20+30,Calories 550");
				                	
				                }else if(toppingFlavorInput.equalsIgnoreCase("Candy")) {
				                	result.setText("Vanilla IceCream with Candy topping PHP20+20,Calories 450");
				                }
						 }else if(toppingInput.equalsIgnoreCase("No")){
							 result.setText("Vanilla icecream PHP10,Calories300");
						 }
					}
														
					else if(input.equalsIgnoreCase("Choclate")) {
						String toppingInput = JOptionPane.showInputDialog("Do you want to add toppings? (Yes/No)");
						 if (toppingInput.equalsIgnoreCase("Yes")) {
				                String toppingFlavorInput = JOptionPane.showInputDialog("Enter a topping for Vanilla: Choco syrup , M&Ms , Candy");
				                if(toppingFlavorInput.equalsIgnoreCase("Choco syrup")) {
				                	result.setText("Choclate IceCream with choco topping PHP40+20,Calories 320");
				                }else if(toppingFlavorInput.equalsIgnoreCase("M&Ms")){
				                	result.setText("Choclate IceCream with M&Ms topping PHP40+30,Calories 320");
				                }else if(toppingFlavorInput.equalsIgnoreCase("Candy")) {
				                	result.setText("Choclate IceCream with Candy topping PHP40+20,Calories 320");
				                }
						 }else if( toppingInput.equalsIgnoreCase("No")){
							 result.setText("Choclate icecream PHP10,Calories300");
						 }
						 
						 
					}
				}
				else if(n == 2) {
					JOptionPane.showMessageDialog(frame,"Can't buy saperately","Alert",JOptionPane.WARNING_MESSAGE);
					textField.setText(null);
				}
				else if(n == 3) {
					JOptionPane.showMessageDialog(frame,"Only use with icecream","Alert",JOptionPane.WARNING_MESSAGE);
					textField.setText(null);
				}
				else if(n == 4) {
					JOptionPane.showMessageDialog(frame,"Only use with icecream","Alert",JOptionPane.WARNING_MESSAGE);
					textField.setText(null);
					
				}
				else if(n == 5) {
					result.setText("Price is 10PHP , Calories is 70");
				}
				else if(n == 6) {
					result.setText("Price is 50PHP , Calories is 50");
				}
				else if(n == 7) {
					JOptionPane.showMessageDialog(frame,"Can't buy saperately.","Alert",JOptionPane.WARNING_MESSAGE);
					textField.setText(null);
				}
				else if(n == 8) {
					JOptionPane.showMessageDialog(frame,"Can't buy saperately.","Alert",JOptionPane.WARNING_MESSAGE);
					textField.setText(null);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(410, 513, 96, 41);
		frame.getContentPane().add(btnNewButton);
		
		result = new JTextField();
		result.setEditable(false);
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setFont(new Font("Tahoma", Font.BOLD, 14));
		result.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		result.setBackground(Color.LIGHT_GRAY);
		result.setBounds(454, 133, 453, 48);
		frame.getContentPane().add(result);
		result.setColumns(10);
		
		final JTextField textField_1 = new JTextField();
		textField_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(757, 209, 138, 37);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		final JTextField textField_2 = new JTextField();
		textField_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(757, 265, 138, 37);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Money");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(618, 210, 104, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Change");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(628, 265, 104, 34);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		
		final JTextField bill1 = new JTextField();
		bill1.setFont(new Font("Tahoma", Font.BOLD, 15));
		bill1.setHorizontalAlignment(SwingConstants.CENTER);
		bill1.setBackground(Color.LIGHT_GRAY);
		bill1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		bill1.setBounds(696, 409, 182, 37);
		frame.getContentPane().add(bill1);
		bill1.setColumns(10);
		
		final JTextField bill2 = new JTextField();
		bill2.setFont(new Font("Tahoma", Font.BOLD, 15));
		bill2.setHorizontalAlignment(SwingConstants.CENTER);
		bill2.setColumns(10);
		bill2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		bill2.setBackground(Color.LIGHT_GRAY);
		bill2.setBounds(696, 475, 182, 37);
		frame.getContentPane().add(bill2);
		
		final JTextField bill3 = new JTextField();
		bill3.setFont(new Font("Tahoma", Font.BOLD, 15));
		bill3.setHorizontalAlignment(SwingConstants.CENTER);
		bill3.setColumns(10);
		bill3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		bill3.setBackground(Color.LIGHT_GRAY);
		bill3.setBounds(696, 540, 182, 37);
		frame.getContentPane().add(bill3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_2.setBounds(683, 389, 212, 201);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Bill >>");
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.BOLD, 30));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(525, 510, 148, 54);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Purchase");
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				
				
				money = Integer.parseInt(textField.getText());
				 String s1 = textField.getText();
				int n1 = Integer.parseInt(s1);
				String s2 = textField_1.getText();
				int n2 = Integer.parseInt(s2);
				
				if(n1 == 1) {
					
					
					 if(n2 < 50) {
						JOptionPane.showMessageDialog(frame,"Insufficient balance.","Alert",JOptionPane.WARNING_MESSAGE);    
					}
					 if(check) {
							money = n2 - 50;
							String s=Integer.toString(money);
							textField_2.setText(s);		
							bill3.setText("Money Returned : " + s);
							bill2.setText("Money Entered :" + n2);
							bill1.setText("Item : IceCream" );
						} else {
						money = n2 - 40;
						String s=Integer.toString(money);
						textField_2.setText(s);		
						bill3.setText("Money Returned : " + s);
						bill2.setText("Money Entered :" + n2);
						bill1.setText("Item : IceCream" );
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
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(611, 326, 111, 41);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Clear");
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(Color.GRAY);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(NULL);
				textField_1.setText(NULL);
				textField_2.setText(NULL);
				bill1.setText(NULL);
				bill2.setText(NULL);
				bill3.setText(NULL);
				result.setText(NULL);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_1.setBounds(784, 326, 111, 41);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("Special Vending Machine");
		lblNewLabel_4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(201, 10, 531, 102);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_2 = new JButton("<<back");
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(Color.GRAY);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display d = new Display();
				d.setVisble(true);
				frame.dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(10, 706, 111, 32);
		frame.getContentPane().add(btnNewButton_2);
		

	}

	public void setVisible1(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}
	
	
}