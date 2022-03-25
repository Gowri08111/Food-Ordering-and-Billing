package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.SystemColor;
public class MiniProject extends JFrame {

	private JPanel contentPane;
	JLayeredPane layeredPane,layeredPane_1;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JTable table;
	DefaultTableModel model,model1;
	int Amount=0;
	private JTable table_1;
	String name1;
	private JTextField textField_5;
	private JTextField textField_6;
	private JPasswordField textField_7;
	private JPasswordField textField_8;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniProject frame = new MiniProject();
					frame.setVisible(true);
					frame.setResizable(false); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void switchPanels(JPanel panel)
	{
		
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
     		
	}
	public void switchPanels1(JPanel panel)
	{
		
		layeredPane_1.removeAll();
		layeredPane_1.add(panel);
		layeredPane_1.repaint();
		layeredPane_1.revalidate();
     		
	}
	/*private void add(String name)
	{
		dm=
	}*/

	/**
	 * Create the frame.
	 */
	public MiniProject() {
		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1164, 762);
		JPanel panel = new JPanel();
		JPanel panel_1 = new JPanel();

		
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(150, 37, 20));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(203, 10, 937, 693);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		JPanel panel_cart = new JPanel();
		
		panel.setBackground(new Color(251, 203, 201));
		layeredPane.add(panel, "name_5718759047500");
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO TASTY FOODS");
		lblNewLabel.setForeground(new Color(51, 51, 102));
		lblNewLabel.setFont(new Font("Imprint MT Shadow", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel.setBounds(266, 34, 486, 90);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("There is one inexhaustible aspect of everyday life that never dulls,  \r\n");
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(150, 182, 777, 48);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("namely the simple Pleasure of EATING and DRINKING !!!");
		lblNewLabel_2.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(197, 240, 619, 31);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("LET THE FEAST BEGIN !!!");
		lblNewLabel_3.setForeground(new Color(153, 51, 0));
		lblNewLabel_3.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3.setBounds(346, 369, 351, 48);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Order your most favorite food and get it delivered at your door step");
		lblNewLabel_4.setForeground(new Color(50, 37, 20));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		lblNewLabel_4.setBounds(168, 539, 682, 67);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(30, 313, 260, 200);
		ImageIcon img=new ImageIcon(this.getClass().getResource("/icon.jpg"));
		lblNewLabel_5.setIcon(img);
		panel.add(lblNewLabel_5);
		
		layeredPane.add(panel_1, "name_5731080536500");
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		layeredPane.add(panel_2, "name_5747997940700");
		panel_2.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 937, 693);
		panel_2.add(tabbedPane_1);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 248, 220));
		tabbedPane_1.addTab("MENU", null, panel_9, null);
		panel_9.setLayout(null);
		
		
		Icon icon = new ImageIcon("F:\\AJP\\Project\\src\\vegstarter.jpg");
		JButton btnNewButton_7 = new JButton(icon);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane_1.setSelectedIndex(1);
			}
		});
		btnNewButton_7.setBounds(51, 26, 240, 206);
		panel_9.add(btnNewButton_7);
		
		Icon icon1 = new ImageIcon("F:\\AJP\\Project\\src\\lolipop.jpg");
		JButton btnNewButton_8 = new JButton(icon1);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_1.setSelectedIndex(2);
			}
		});
		btnNewButton_8.setBounds(342, 26, 255, 206);
		panel_9.add(btnNewButton_8);
		
		
		Icon icon2 = new ImageIcon("F:\\AJP\\Project\\src\\biriyani2.jpg");
		JButton btnNewButton_9 = new JButton(icon2);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_9.setBounds(653, 26, 255, 206);
		panel_9.add(btnNewButton_9);
		
		
		Icon icon3 = new ImageIcon("F:\\AJP\\Project\\src\\brownie.png");
		JButton btnNewButton_10 = new JButton(icon3);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.setBounds(160, 317, 255, 217);
		panel_9.add(btnNewButton_10);
		
		
		Icon icon4 = new ImageIcon("F:\\AJP\\Project\\src\\pizza1.jpg");
		JButton btnNewButton_11 = new JButton(icon4);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_11.setBounds(511, 317, 255, 217);
		panel_9.add(btnNewButton_11);
		
		JLabel lblNewLabel_7 = new JLabel("VEG-STARTERS");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_7.setBounds(117, 243, 134, 33);
		panel_9.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("NON-VEG");
		lblNewLabel_7_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_7_1.setBounds(400, 242, 154, 33);
		panel_9.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("BIRIYANI");
		lblNewLabel_7_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_7_2.setBounds(757, 242, 113, 33);
		panel_9.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_3 = new JLabel("HOT DRINKS ");
		lblNewLabel_7_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_7_3.setBounds(242, 554, 134, 18);
		panel_9.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_7_4 = new JLabel("AND DESSERTS");
		lblNewLabel_7_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_7_4.setBounds(232, 579, 134, 18);
		panel_9.add(lblNewLabel_7_4);
		
		JLabel lblNewLabel_7_5 = new JLabel("PIZZA , BURGERS ,");
		lblNewLabel_7_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_7_5.setBounds(565, 544, 144, 23);
		panel_9.add(lblNewLabel_7_5);
		
		JLabel lblNewLabel_7_6 = new JLabel("SHAWARMAS");
		lblNewLabel_7_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_7_6.setBounds(575, 572, 134, 25);
		panel_9.add(lblNewLabel_7_6);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 255, 240));
		tabbedPane_1.addTab("VEG-STARTERS", null, panel_10, null);
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_19 = new JLabel("VEG STARTERS");
		lblNewLabel_19.setForeground(new Color(0, 0, 128));
		lblNewLabel_19.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_19.setBounds(394, 10, 305, 59);
		panel_10.add(lblNewLabel_19);
		
		JButton btnNewButton_13 = new JButton("ADD TO CART");
		
		ImageIcon image2=new ImageIcon(this.getClass().getResource("/cart.png"));
		btnNewButton_13.setIcon(image2);
		btnNewButton_13.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		btnNewButton_13.setBounds(394, 530, 183, 43);
		panel_10.add(btnNewButton_13);
		
		JLabel lblNewLabel_20 = new JLabel("SOUPS");
		lblNewLabel_20.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_20.setBounds(219, 122, 163, 36);
		panel_10.add(lblNewLabel_20);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 250, 240));
		comboBox.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose", "Hot And Sour Veg Soup       -Rs 100", "Milagu Rasam Soup             -Rs 80", "Mushroom Milagu Soup      -Rs 110", "Tomato Soup                        -Rs 90"}));
		comboBox.setBounds(373, 123, 305, 36);
		panel_10.add(comboBox);
		
		JLabel lblNewLabel_21 = new JLabel("STARTERS");
		lblNewLabel_21.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_21.setBounds(219, 250, 163, 36);
		panel_10.add(lblNewLabel_21);
		
		JList list = new JList();
		list.setBackground(new Color(255, 240, 245));
		list.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Mushroom Pepper Fry    -Rs 180", "", "Tandoori Mushroom       -Rs 220", "", "Paneer Tikka                    -Rs 190", "", "Veg Sheek Kabab            -Rs 200", "", "Gobi Manchurian             -Rs 170"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(373, 257, 283, 139);
		panel_10.add(list);
		//ImageIcon image4=new ImageIcon(this.getClass().getResource("/veg.jpg"));
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 255, 224));
		tabbedPane_1.addTab("NON-VEG STARTERS", null, panel_11, null);
		panel_11.setLayout(null);
		
		JLabel lblNewLabel_22 = new JLabel("NON-VEG STARTERS");
		lblNewLabel_22.setForeground(new Color(0, 0, 128));
		lblNewLabel_22.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_22.setBounds(381, 32, 310, 58);
		panel_11.add(lblNewLabel_22);
		
		JLabel lblNewLabel_18 = new JLabel("NON-VEG STARTERS");
		lblNewLabel_18.setFont(new Font("Georgia", Font.BOLD, 18));
		lblNewLabel_18.setBounds(169, 156, 236, 36);
		panel_11.add(lblNewLabel_18);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Choose", "Chicken 65               - Rs 180", "Pepper Chicken       - Rs 190", "Prawn Fry                - Rs 210", "Fish Fry                    - Rs 150"}));
		comboBox_1.setBounds(464, 155, 310, 41);
		panel_11.add(comboBox_1);
		
		JLabel lblNewLabel_23 = new JLabel("NON-VEG MAIN COURSE");
		lblNewLabel_23.setFont(new Font("Georgia", Font.BOLD, 18));
		lblNewLabel_23.setBounds(153, 304, 252, 36);
		panel_11.add(lblNewLabel_23);
		
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"Chicken Chettinadu      -Rs 200", "Mutton Gravy               - Rs 250", "Chicken Pallipalayam  - Rs 230", "Butter Chicken             - Rs 280", "Chicken Gravy              - Rs 190"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		list_1.setBackground(new Color(255, 250, 240));
		list_1.setBounds(464, 311, 298, 135);
		panel_11.add(list_1);
		
		JButton btnNewButton_14 = new JButton("ADD TO CART");
		
		ImageIcon image3=new ImageIcon(this.getClass().getResource("/cart.png"));
		btnNewButton_14.setIcon(image3);
		btnNewButton_14.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		btnNewButton_14.setBounds(374, 544, 196, 41);
		panel_11.add(btnNewButton_14);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 937, 693);
		panel_1.add(tabbedPane);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(204, 204, 153));
		tabbedPane.addTab("LOGIN", null, panel_5, null);
		panel_5.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 204));
		panel_7.setBounds(227, 177, 487, 341);
		panel_5.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("USERNAME :");
		lblNewLabel_9.setFont(new Font("Georgia", Font.PLAIN, 17));
		lblNewLabel_9.setBounds(77, 70, 117, 33);
		panel_7.add(lblNewLabel_9);
		
		textField = new JTextField();
		textField.setFont(new Font("Dubai", Font.PLAIN, 17));
		textField.setBounds(227, 70, 211, 33);
		panel_7.add(textField);
		textField.setColumns(10);
		
		textField.setToolTipText("ENTER NAME");
		
		JLabel lblNewLabel_9_1 = new JLabel("PASSWORD :");
		lblNewLabel_9_1.setFont(new Font("Georgia", Font.PLAIN, 17));
		lblNewLabel_9_1.setBounds(77, 134, 117, 33);
		panel_7.add(lblNewLabel_9_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Dubai", Font.PLAIN, 17));
		passwordField.setBounds(227, 134, 211, 33);
		panel_7.add(passwordField);
		JPanel panel_12 = new JPanel();
		JButton btnNewButton_2 = new JButton("MENU");
		JButton btnNewButton_4 = new JButton("LOGIN");
		JButton btnNewButton_3 = new JButton("CART");
		btnNewButton_2.setVisible(false);
		btnNewButton_3.setVisible(false);
		
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().length()==0)
				  {
					JOptionPane.showMessageDialog(null, "Enter Username");
				  }
				if (passwordField.getText().length()==0)
				  {
					JOptionPane.showMessageDialog(null, "Enter Password");
				  }
				else
				{
					try {
						String url="jdbc:mysql://localhost:3306/project";
						String uname="root";
						String pass="dhivakar";
						Class.forName("com.mysql.cj.jdbc.Driver");
						name1=textField.getText();
						Connection con=DriverManager.getConnection(url,uname,pass);
						String Nme=textField.getText();
						String pass1=passwordField.getText();
						String q3="SELECT Name,Password from signup ";
						Statement st2=con.createStatement();
						ResultSet r1=st2.executeQuery(q3);
						int count=0;
						while(r1.next())
						{
							String n1=r1.getString("Name");
							if(Nme.equals(n1))
							{
							count = 1;	
							break;
							}
						}
						if(count==1)
						{
					    r1=st2.executeQuery(q3);
						while(r1.next())
						{
							String n1=r1.getString("Name");
							String p1=r1.getString("Password");
							if(Nme.equals(n1))
							{
								if(pass1.equals(p1))
								{
								String s="WELCOME " + textField.getText()+ "  YOU HAVE SUCCESSFULLY LOGGED IN";
								textField.setText("");
								passwordField.setText("");
								JOptionPane.showMessageDialog(null, s);
								switchPanels(panel_2);
								btnNewButton_2.setVisible(true);
								btnNewButton_3.setVisible(true);
								//btnNewButton_12.setVisible(true);
								//btnNewButton_15.setVisible(true);
								//btnNewButton_1.setEnabled(false);
								
								}
								else
								{
									String s="Incorrect Password ";
									JOptionPane.showMessageDialog(null, s);
									
								}
							}
						}
						}
						else
						{
							String s="User Not Found!! Please Enter your name correctly or sign-up";
							JOptionPane.showMessageDialog(null, s);
							textField.setText("");
							passwordField.setText("");
						}
						
					}
					catch(Exception e1)
					{
						System.out.println(e1);
					}
					
				}
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_4.setBounds(190, 218, 95, 25);
		panel_7.add(btnNewButton_4);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(389, 56, 136, 121);
		ImageIcon image=new ImageIcon(this.getClass().getResource("/LOGIN.png"));
		lblNewLabel_6.setIcon(image);
		panel_5.add(lblNewLabel_6);
		
		JLabel lblNewLabel_10 = new JLabel("Doesn't have an Account ?? ");
		lblNewLabel_10.setForeground(new Color(204, 153, 51));
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_10.setBounds(316, 544, 233, 48);
		panel_5.add(lblNewLabel_10);
		
		JButton btnNewButton_5 = new JButton("Sign-Up");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_5.setBounds(548, 559, 100, 21);
		panel_5.add(btnNewButton_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(204, 204, 153));
		tabbedPane.addTab("SIGN-UP", null, panel_6, null);
		panel_6.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 255, 204));
		panel_8.setBounds(213, 22, 524, 634);
		panel_6.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("NAME   ");
		lblNewLabel_11.setFont(new Font("Georgia", Font.PLAIN, 17));
		lblNewLabel_11.setBounds(56, 54, 139, 26);
		panel_8.add(lblNewLabel_11);
		
		textField_1 = new JTextField();
		textField_1.setBounds(238, 54, 189, 32);
		panel_8.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("MOBILE NUMBER");
		lblNewLabel_12.setFont(new Font("Georgia", Font.PLAIN, 17));
		lblNewLabel_12.setBounds(56, 110, 168, 20);
		panel_8.add(lblNewLabel_12);
		
		textField_2 = new JTextField();
		textField_2.setBounds(238, 107, 189, 32);
		panel_8.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("EMAIL");
		lblNewLabel_13.setFont(new Font("Georgia", Font.PLAIN, 17));
		lblNewLabel_13.setBounds(56, 164, 149, 26);
		panel_8.add(lblNewLabel_13);
		
		textField_3 = new JTextField();
		textField_3.setBounds(238, 164, 189, 32);
		panel_8.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("PASSWORD");
		lblNewLabel_14.setFont(new Font("Georgia", Font.PLAIN, 17));
		lblNewLabel_14.setBounds(56, 223, 139, 26);
		panel_8.add(lblNewLabel_14);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(238, 223, 189, 32);
		panel_8.add(passwordField_1);
		
		JLabel lblNewLabel_14_1 = new JLabel("CONFIRM PASSWORD");
		lblNewLabel_14_1.setFont(new Font("Georgia", Font.PLAIN, 16));
		lblNewLabel_14_1.setBounds(56, 286, 183, 26);
		panel_8.add(lblNewLabel_14_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(238, 286, 189, 32);
		panel_8.add(passwordField_2);
		
		JLabel lblNewLabel_15 = new JLabel("ADDRESS");
		lblNewLabel_15.setFont(new Font("Georgia", Font.PLAIN, 17));
		lblNewLabel_15.setBounds(56, 343, 168, 26);
		panel_8.add(lblNewLabel_15);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(238, 346, 194, 107);
		panel_8.add(textArea);
		
		JLabel lblNewLabel_16 = new JLabel("GENDER");
		lblNewLabel_16.setFont(new Font("Georgia", Font.PLAIN, 17));
		lblNewLabel_16.setBounds(56, 492, 168, 26);
		panel_8.add(lblNewLabel_16);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("MALE");
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 204));
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbtnNewRadioButton.setBounds(241, 497, 77, 21);
		panel_8.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("FEMALE");
		rdbtnNewRadioButton_1.setBackground(new Color(255, 255, 204));
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbtnNewRadioButton_1.setBounds(324, 497, 103, 21);
		panel_8.add(rdbtnNewRadioButton_1);
		
		ButtonGroup bg=new ButtonGroup();    
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton);
		
		JButton btnNewButton_6 = new JButton("SIGN-UP");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//char[] s2=passwordField_2.getPassword();
				
				if (textField_1.getText().length()==0)
				  {
					JOptionPane.showMessageDialog(null, "Enter Name");
				  }
				else if (textField_2.getText().length()==0)
				  {
					JOptionPane.showMessageDialog(null, "Enter Mobile number");
				  }
				else if (textField_3.getText().length()==0)
				  {
					JOptionPane.showMessageDialog(null, "Enter Email");
				  }
				else if (passwordField_1.getText().length()==0)
				  {
					JOptionPane.showMessageDialog(null, "Enter Password");
				  }
				else if (passwordField_2.getText().length()==0)
				  {
					JOptionPane.showMessageDialog(null, "Enter Password");
				  }
				else if (textArea.getText().length()==0)
				  {
					JOptionPane.showMessageDialog(null, "Enter Address");
				  }
				else if (!(new String(passwordField_1.getPassword())).equals(new String(passwordField_2.getPassword())))
				  {
					JOptionPane.showMessageDialog(null, "Enter Password correctly");
				  }
				else
				{
					try
					{
					String url="jdbc:mysql://localhost:3306/project";
					String uname="root";
					String pass="dhivakar";
					Class.forName("com.mysql.cj.jdbc.Driver");
					name1=textField_1.getText();
					Connection con=DriverManager.getConnection(url,uname,pass);
					String Name=textField_1.getText();
					String q2="SELECT Name from signup ";
					Statement st=con.createStatement();
					ResultSet r=st.executeQuery(q2);
					int c=0;
					while(r.next())
					{
						String n=r.getString("Name");
						if(Name.equals(n))
						{
							String s2="!!!!Username Already exists!!!! Enter a Different name...";
							JOptionPane.showMessageDialog(null, s2);
							c=1;
							break;
							
						}
				    }
					if(c==0)
					{
						btnNewButton_2.setVisible(true);
						btnNewButton_3.setVisible(true);
						//btnNewButton_12.setVisible(true);
						//btnNewButton_15.setVisible(true);
						//btnNewButton_1.setEnabled(false);
					String Mobile=textField_2.getText();
					String email=textField_3.getText();
					String password=passwordField_1.getText();
					String addr=textArea.getText();
					String gender=rdbtnNewRadioButton.isSelected()?"Male":"Female";
					String q1="INSERT INTO signup (Name, Mobile_no,Email,Password,Gender,Address) VALUES ("
							+ "'" + Name + "', '" + Mobile + "', '" + email + "', '" + password + "', '" + gender + "', '" + addr + "');";
					PreparedStatement st1=con.prepareStatement(q1);
					st1.executeUpdate(q1);
					String si="REGISTRATION SUCCESSFULL ..!! YOU HAVE LOGGED IN ";
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					passwordField_1.setText("");
					textArea.setText("");
					bg.clearSelection();
					JOptionPane.showMessageDialog(null, si);
					switchPanels(panel_2);
					}
					
					}
					catch(Exception e1)
					{
						System.out.println(e1);
					}
					
				}
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_6.setBounds(189, 555, 111, 26);
		panel_8.add(btnNewButton_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 204));
		layeredPane.add(panel_3, "name_5750619641800");
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("CART");
		ImageIcon image12=new ImageIcon(this.getClass().getResource("/cart.png"));
		lblNewLabel_8.setIcon(image12);
		lblNewLabel_8.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_8.setBounds(405, 25, 136, 70);
		panel_3.add(lblNewLabel_8);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(257, 105, 421, 376);
		panel_3.add(scrollPane_1);
		
		table = new JTable();
		table.setRowHeight(21);
		table.setFont(new Font("Times New Roman",   Font.ITALIC, 20));
		model=new DefaultTableModel();
		Object[] column = {"ITEMS AND PRICE","QUANTITY"};
		final Object[] row=new Object[2];
		final Object[] row1=new Object[2];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane_1.setViewportView(table);
		
		JLabel lblNewLabel_25 = new JLabel("0");
		JButton btnNewButton_16 = new JButton("DELETE");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String url="jdbc:mysql://localhost:3306/project";
					String uname="root";
					String pass="dhivakar"; 
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,uname,pass);
					Statement st=con.createStatement();
					
					int row = table.getSelectedRow();
			        int column = table.getSelectedColumn();
			        String valueInCell = (String)table.getValueAt(row, column);
			        String query= "select * from cart";
			        ResultSet r=st.executeQuery(query);
			        while(r.next())
			        {
			        	String item=r.getString("item");
			        	if(valueInCell.equals(item))
			        	{
			        		int amt = Integer.parseInt(r.getString("amount"));
			        		int x= Integer.parseInt(r.getString("quantity"));
			        		Amount = Amount-(amt*x);
			        		lblNewLabel_25.setText(String.valueOf(Amount));
			        		break;
			        	}
			        }
			        String query1 = "delete from cart where item= " + "'" + valueInCell + "'";
			        st.executeUpdate(query1);
					int delete=table.getSelectedRow();
					model.removeRow(delete);
					JOptionPane.showMessageDialog(null, "Deleted successfully");
				}
				catch(Exception a1)
				{
					System.out.println(a1);
				}
			}
		});
		btnNewButton_16.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		btnNewButton_16.setBounds(756, 279, 102, 29);
		panel_3.add(btnNewButton_16);
		
		JLabel lblNewLabel_27_6 = new JLabel("-");
		JLabel lblNewLabel_27_6_1 = new JLabel("-");
		JLabel lblNewLabel_27_6_2 = new JLabel("-");
		JLabel lblNewLabel_27_5 = new JLabel("0");
		
		JButton btnNewButton_17 = new JButton("Place your Order");
		
		btnNewButton_17.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		btnNewButton_17.setBounds(350, 619, 213, 38);
		panel_3.add(btnNewButton_17);
		
		JLabel lblNewLabel_24 = new JLabel("TOTAL AMOUNT : ");
		ImageIcon dollar=new ImageIcon(this.getClass().getResource("/Dollar.png"));
		lblNewLabel_24.setIcon(dollar);
		
		lblNewLabel_24.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_24.setBounds(342, 523, 199, 50);
		panel_3.add(lblNewLabel_24);
		
		
		lblNewLabel_25.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_25.setBounds(554, 523, 92, 50);
		panel_3.add(lblNewLabel_25);
		
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String url="jdbc:mysql://localhost:3306/project";
					String uname="root";
					String pass="dhivakar"; 
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,uname,pass);
					Statement st=con.createStatement();
					if(list.isSelectionEmpty()&&(comboBox.getSelectedItem() == "Choose"))
					{
						JOptionPane.showMessageDialog(null, "!!!Please Select an item to add it to the caart!!!");
					}
					if(!list.isSelectionEmpty())
					{
						row1[0]=list.getSelectedValue();
						String listitem = (String)list.getSelectedValue();
						String query = "select * from veg_starters_1";
						ResultSet r=st.executeQuery(query);
						while(r.next())
						{
							String listitem_1 = r.getString("Items");
							if(listitem.equals(listitem_1))
							{
								String name = JOptionPane.showInputDialog(null, "Enter the quantity of "+listitem);
								row1[1]=name;
								int x=Integer.parseInt(name);
								int amt=Integer.parseInt(r.getString("Amount"));
								Amount=Amount+(amt*x);
								lblNewLabel_25.setText(String.valueOf(Amount));
								
								model.addRow(row1);
								String c="INSERT INTO cart (item,totalamount,quantity,amount) VALUES ("+ "'" + listitem + "', '" + amt*x + "', '"+name+"','"+amt+"');";
								
								PreparedStatement st1=con.prepareStatement(c);
								st1.executeUpdate(c);
								
								JOptionPane.showMessageDialog(null, "ADDED TO CART");
							}
						}
					}
					if(!(comboBox.getSelectedItem() == "Choose"))
					{
					row[0]=comboBox.getSelectedItem();
					String comboitem = (String)comboBox.getSelectedItem();
					String query1="select * from veg_starters";
					ResultSet r=st.executeQuery(query1);
					while(r.next())
					{
						String comboitem_1 = r.getString("Items");
						if(comboitem.equals(comboitem_1))
						{
							String name = JOptionPane.showInputDialog(null, "Enter the quantity of "+comboitem);
							row[1]=name;
							int x=Integer.parseInt(name);
							int amt=Integer.parseInt(r.getString("Amount"));
							Amount=Amount+(amt*x);
							
							model.addRow(row);
							lblNewLabel_25.setText(String.valueOf(Amount));
							String c="INSERT INTO cart (item,totalamount,quantity,amount) VALUES ("+ "'" + comboitem + "', '" + amt*x + "', '"+name+"','"+amt+"');";
							PreparedStatement st1=con.prepareStatement(c);
							st1.executeUpdate(c);
							
							JOptionPane.showMessageDialog(null, "ADDED TO CART");

						}

					}
					
					}
					list. clearSelection();
					comboBox.setSelectedItem("Choose");
					
				}
				catch(Exception e1) {
					System.out.println(e1);
				}
				
			}
		});
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String url="jdbc:mysql://localhost:3306/project";
					String uname="root";
					String pass="dhivakar"; 
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,uname,pass);
					Statement st=con.createStatement();
					if(list_1.isSelectionEmpty()&&(comboBox_1.getSelectedItem() == "Choose"))
					{
						JOptionPane.showMessageDialog(null, "!!!Please Select an item to add it to the caart!!!");
						//list. clearSelection();
					}
					if(!list_1.isSelectionEmpty())
					{
						row1[0]=list_1.getSelectedValue();
						String listitem = (String)list_1.getSelectedValue();
						String query = "select * from non_starters_1";
						ResultSet r=st.executeQuery(query);
						while(r.next())
						{
							String listitem_1 = r.getString("Items");
							if(listitem.equals(listitem_1))
							{
								String name = JOptionPane.showInputDialog(null, "Enter the quantity of "+listitem);
								row1[1]=name;
								int x=Integer.parseInt(name);
								int amt=Integer.parseInt(r.getString("Amount"));
								Amount=Amount+(amt*x);
						
									model.addRow(row1);
									lblNewLabel_25.setText(String.valueOf(Amount));
									String c="INSERT INTO cart (item,totalamount,quantity,amount) VALUES ("+ "'" + listitem + "', '" + amt*x + "', '"+name+"','"+amt+"');";
								PreparedStatement st1=con.prepareStatement(c);
								st1.executeUpdate(c);
								
								JOptionPane.showMessageDialog(null, "ADDED TO CART");
							}
						}
					}
					if(!(comboBox_1.getSelectedItem() == "Choose"))
					{
					row[0]=comboBox_1.getSelectedItem();
					
					String comboitem = (String)comboBox_1.getSelectedItem();
					String query1="select * from non_starters";
					ResultSet r=st.executeQuery(query1);
					while(r.next())
					{
						String comboitem_1 = r.getString("Items");
						if(comboitem.equals(comboitem_1))
						{
							String name = JOptionPane.showInputDialog(null, "Enter the quantity of "+comboitem);
							row[1]=name;
							int x=Integer.parseInt(name);
							int amt=Integer.parseInt(r.getString("Amount"));
							Amount=Amount+(amt*x);
							
							lblNewLabel_25.setText(String.valueOf(Amount));
							
								model.addRow(row);
								String c="INSERT INTO cart (item,totalamount,quantity,amount) VALUES ("+ "'" + comboitem + "', '" + amt*x + "', '"+name+"','"+amt+"');";
							PreparedStatement st1=con.prepareStatement(c);
							st1.executeUpdate(c);
							
							JOptionPane.showMessageDialog(null, "ADDED TO CART");

						}
					}
					}
				//	JOptionPane.showMessageDialog(null, "ADDED TO CART");
					list_1. clearSelection();
					comboBox_1.setSelectedItem("Choose");
					
					
				
					String Name=textField_1.getText();
					String q2="SELECT Name from signup ";
					ResultSet r=st.executeQuery(q2);
					
				}
				catch(Exception a)
				{
					System.out.println(a);
				}
			}
		});
	
		layeredPane.add(panel_12, "name_116130073490500");
		panel_12.setLayout(null);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(255, 255, 204));
		panel_13.setBounds(0, 0, 208, 693);
		panel_12.add(panel_13);
		panel_13.setLayout(null);
		JPanel panel_17 = new JPanel();
		JPanel panel_16 = new JPanel();
		JPanel panel_15 = new JPanel();
		JPanel panel_14 = new JPanel();
		
		JLabel lblNewLabel_30 = new JLabel("-");
		JLabel lblNewLabel_30_1 = new JLabel("-");
		JLabel lblNewLabel_30_2 = new JLabel("-");
		JLabel lblNewLabel_30_3 = new JLabel("-");


		
		JTree tree = new JTree();
		tree.setBackground(new Color(255, 255, 204));
		tree.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("PROFILE") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("VIEW");
						node_1.add(new DefaultMutableTreeNode("Profile"));
						
						
						add(node_1); node_1 = new DefaultMutableTreeNode("CHANGE");
						  node_1.add(new DefaultMutableTreeNode("Name")); node_1.add(new
						  DefaultMutableTreeNode("Password")); node_1.add(new
						  DefaultMutableTreeNode("Address")); 
						  
		add(node_1);
						 
						 
				}
			}
		));
		tree.setBounds(50, 195, 150, 216);
		
			
		panel_13.add(tree);
		
		
		panel_cart.setBackground(new Color(255, 250, 205));
		layeredPane.add(panel_cart, "name_12738917850400");
		panel_cart.setLayout(null);
		
		
		JLabel lblNewLabel_26 = new JLabel("ORDER SUMMARY");
		lblNewLabel_26.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel_26.setBounds(399, 10, 243, 37);
		panel_cart.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("Name :\r\n");
		lblNewLabel_27.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_27.setBounds(262, 68, 152, 37);
		panel_cart.add(lblNewLabel_27);
		
		JLabel lblNewLabel_27_1 = new JLabel("Phone Number :");
		lblNewLabel_27_1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_27_1.setBounds(262, 124, 152, 37);
		panel_cart.add(lblNewLabel_27_1);
		
		JLabel lblNewLabel_27_2 = new JLabel("Address :");
		lblNewLabel_27_2.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_27_2.setBounds(262, 171, 152, 37);
		panel_cart.add(lblNewLabel_27_2);
		
		JLabel lblNewLabel_27_3 = new JLabel("Order:\r\n");
		lblNewLabel_27_3.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_27_3.setBounds(262, 238, 152, 37);
		panel_cart.add(lblNewLabel_27_3);
		
		JButton btnNewButton_18 = new JButton("PROCEED");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Your Order has been Successfully Received and will be Delivered Soon !!!");
				switchPanels(panel);
			}
		});
		btnNewButton_18.setForeground(Color.WHITE);
		btnNewButton_18.setBackground(new Color(154, 205, 50));
		btnNewButton_18.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		btnNewButton_18.setBounds(367, 628, 211, 37);
		panel_cart.add(btnNewButton_18);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(476, 250, 437, 282);
		panel_cart.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setRowHeight(21);
		model1=new DefaultTableModel();
		table_1.setFont(new Font("Times New Roman",  Font.ITALIC, 15));
		Object[] column1= {"Items","Quantity","Amount"};
		final Object[] ro=new Object[3];
		//final Object[] row1=new Object[2];
		model1.setColumnIdentifiers(column1);
		table_1.setModel(model1);
		
		scrollPane.setViewportView(table_1);
		
		JLabel lblNewLabel_27_4 = new JLabel("Total :");
		lblNewLabel_27_4.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_27_4.setBounds(262, 542, 152, 37);
		panel_cart.add(lblNewLabel_27_4);
		
		
		lblNewLabel_27_5.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		lblNewLabel_27_5.setBounds(486, 542, 152, 37);
		panel_cart.add(lblNewLabel_27_5);
		
	
		lblNewLabel_27_6.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		lblNewLabel_27_6.setBounds(476, 68, 152, 37);
		panel_cart.add(lblNewLabel_27_6);
		
		
		lblNewLabel_27_6_1.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		lblNewLabel_27_6_1.setBounds(476, 124, 152, 37);
		panel_cart.add(lblNewLabel_27_6_1);
		

		lblNewLabel_27_6_2.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		lblNewLabel_27_6_2.setBounds(476, 171, 383, 47);
		panel_cart.add(lblNewLabel_27_6_2);
		
		 layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(207, 0, 730, 693);
		panel_12.add(layeredPane_1);
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		panel_14.setBackground(new Color(255, 228, 181));
		layeredPane_1.add(panel_14, "name_181886600685900");
		panel_14.setLayout(null);
		
		JLabel profile = new JLabel("New label");
		profile.setBounds(307, 26, 136, 121);
		ImageIcon imag1=new ImageIcon(this.getClass().getResource("/profile.png"));
		profile.setIcon(imag1);
		panel_14.add(profile);
		
		JLabel lblNewLabel_29 = new JLabel("Name : ");
		lblNewLabel_29.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_29.setBounds(149, 214, 163, 30);
		panel_14.add(lblNewLabel_29);
		
		JLabel lblNewLabel_29_1 = new JLabel("Mobile Number :");
		lblNewLabel_29_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_29_1.setBounds(149, 291, 163, 30);
		panel_14.add(lblNewLabel_29_1);
		
		JLabel lblNewLabel_29_2 = new JLabel("Email-Id  :");
		lblNewLabel_29_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_29_2.setBounds(149, 374, 163, 30);
		panel_14.add(lblNewLabel_29_2);
		
		JLabel lblNewLabel_29_3 = new JLabel("Address :");
		lblNewLabel_29_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_29_3.setBounds(149, 442, 163, 30);
		panel_14.add(lblNewLabel_29_3);
		
		lblNewLabel_30.setFont(new Font("Georgia", Font.ITALIC, 18));
		lblNewLabel_30.setBounds(340, 205, 176, 39);
		panel_14.add(lblNewLabel_30);
		
		lblNewLabel_30_1.setFont(new Font("Georgia", Font.ITALIC, 18));
		lblNewLabel_30_1.setBounds(340, 286, 176, 39);
		panel_14.add(lblNewLabel_30_1);
		
		lblNewLabel_30_2.setFont(new Font("Georgia", Font.ITALIC, 18));
		lblNewLabel_30_2.setBounds(340, 369, 271, 39);
		panel_14.add(lblNewLabel_30_2);
		
		lblNewLabel_30_3.setFont(new Font("Georgia", Font.ITALIC, 18));
		lblNewLabel_30_3.setBounds(340, 437, 303, 39);
		panel_14.add(lblNewLabel_30_3);
		
		panel_15.setBackground(new Color(255, 228, 181));
		layeredPane_1.add(panel_15, "name_181923738840500");
		panel_15.setLayout(null);
		
		JLabel lblNewLabel_31 = new JLabel("CHANGE USERNAME");
		lblNewLabel_31.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_31.setBounds(270, 43, 234, 46);
		panel_15.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("Current Username :");
		lblNewLabel_32.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_32.setBounds(159, 230, 198, 37);
		panel_15.add(lblNewLabel_32);
		
		JLabel lblNewLabel_32_1 = new JLabel("New Username :");
		lblNewLabel_32_1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_32_1.setBounds(159, 319, 198, 37);
		panel_15.add(lblNewLabel_32_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		textField_5.setBounds(393, 230, 211, 37);
		panel_15.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		textField_6.setColumns(10);
		textField_6.setBounds(393, 319, 211, 37);
		panel_15.add(textField_6);
		
		JButton btnNewButton_20 = new JButton("CHANGE");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					String url="jdbc:mysql://localhost:3306/project";
					String uname="root";
					String pass="dhivakar"; 
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,uname,pass);
					Statement st=con.createStatement();
					//String current=textField_5.getText();
					String new1=textField_6.getText();
					
					String q="Select * from signup";
					String q1="update signup set Name ='"+new1+"' where Name='"+name1+"';";
					ResultSet r=st.executeQuery(q);
					int c=0;
					while(r.next())
					{
						String n=r.getString("Name");
						if(new1.equals(n))
						{
							String s2="!!!!Username Already exists!!!! Enter a Different name...";
							JOptionPane.showMessageDialog(null, s2);
							c=1;
							break;
							
						}
						
				    }
					if(c==0)
					{
						st.executeUpdate(q1);
						textField_6.setText("");
						textField_5.setText("");
						String s2="!!!!Username changed successfully!!!!";
						JOptionPane.showMessageDialog(null, s2);

					}
					else
					{
						textField_6.setText("");
					}
					
					switchPanels1(panel_15);
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
			}
		});
		btnNewButton_20.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_20.setBounds(329, 475, 126, 37);
		panel_15.add(btnNewButton_20);
		
		panel_16.setBackground(new Color(255, 228, 181));
		layeredPane_1.add(panel_16, "name_181928811595400");
		panel_16.setLayout(null);
		
		
		JLabel pass = new JLabel("");
		pass.setBounds(501, 25, 136, 121);
		ImageIcon imag2=new ImageIcon(this.getClass().getResource("/pass.png"));
		pass.setIcon(imag2);
		panel_16.add(pass);
		
		JLabel lblNewLabel_31_1 = new JLabel("CHANGE PASSWORD");
		lblNewLabel_31_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_31_1.setBounds(244, 78, 234, 46);
		panel_16.add(lblNewLabel_31_1);
		
		JLabel lblNewLabel_32_2 = new JLabel("Current Password:");
		lblNewLabel_32_2.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_32_2.setBounds(158, 219, 198, 37);
		panel_16.add(lblNewLabel_32_2);
		
		textField_7 = new JPasswordField();
		textField_7.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		textField_7.setColumns(10);
		textField_7.setBounds(392, 220, 211, 37);
		panel_16.add(textField_7);
		
		JLabel lblNewLabel_32_1_1 = new JLabel("New Password :");
		lblNewLabel_32_1_1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_32_1_1.setBounds(158, 308, 198, 37);
		panel_16.add(lblNewLabel_32_1_1);
		
		textField_8 = new JPasswordField();
		textField_8.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		textField_8.setColumns(10);
		textField_8.setBounds(392, 309, 211, 37);
		panel_16.add(textField_8);
		
		JButton btnNewButton_20_1 = new JButton("CHANGE");
		btnNewButton_20_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					String url="jdbc:mysql://localhost:3306/project";
					String uname="root";
					String pass="dhivakar"; 
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,uname,pass);
					Statement st=con.createStatement();
					//String current=textField_5.getText();
					String new1=textField_8.getText();
					String new2=textField_7.getText();
					
					String q="Select Password from signup where Name='"+name1+"'";
					String q1="update signup set Password ='"+new1+"' where Name='"+name1+"';";
					ResultSet r=st.executeQuery(q);
					r.next();
					String pass1=r.getString("Password");
					if(pass1.equals(new2))
					{
						st.executeUpdate(q1);
						String s2="!!!!Password changed successfully!!!!";
						JOptionPane.showMessageDialog(null, s2);
						textField_7.setText("");
						textField_8.setText("");
					}
					else
					{
						String s2="Enter Correct Password";
						JOptionPane.showMessageDialog(null, s2);
						textField_7.setText("");
						textField_8.setText("");
					}
					
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
			}
		});
		btnNewButton_20_1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_20_1.setBounds(314, 436, 126, 37);
		panel_16.add(btnNewButton_20_1);
		
		panel_17.setBackground(new Color(255, 228, 181));
		layeredPane_1.add(panel_17, "name_185014504357000");
		panel_17.setLayout(null);
		
		JLabel lblNewLabel_32_2_1 = new JLabel("New Address");
		lblNewLabel_32_2_1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_32_2_1.setBounds(145, 239, 198, 37);
		panel_17.add(lblNewLabel_32_2_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textArea_1.setBounds(376, 239, 285, 111);
		panel_17.add(textArea_1);
		
		JLabel lblNewLabel_31_1_1 = new JLabel("CHANGE ADDRESS");
		lblNewLabel_31_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_31_1_1.setBounds(245, 78, 234, 46);
		panel_17.add(lblNewLabel_31_1_1);
		
		JLabel pass_1 = new JLabel("");
		pass_1.setBounds(489, 35, 136, 121);
		panel_17.add(pass_1);
		
		ImageIcon ima2=new ImageIcon(this.getClass().getResource("/book.png"));
		pass_1.setIcon(ima2);
		
		JButton btnNewButton_20_1_1 = new JButton("CHANGE");
		btnNewButton_20_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					String url="jdbc:mysql://localhost:3306/project";
					String uname="root";
					String pass="dhivakar"; 
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,uname,pass);
					Statement st=con.createStatement();
					//String current=textField_5.getText();
					String new1=textArea_1.getText();
					
					String q1="update signup set Address ='"+new1+"' where Name='"+name1+"';";
					st.executeUpdate(q1);
					String s2="!!!!Address changed successfully!!!!";
					JOptionPane.showMessageDialog(null, s2);
					textArea_1.setText("");
					
					
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
			}
		});
		btnNewButton_20_1_1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_20_1_1.setBounds(312, 448, 126, 37);
		panel_17.add(btnNewButton_20_1_1);
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(190, 21, 88));
		panel_4.setBounds(10, 10, 189, 692);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
	

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel_2);
			}
		});
		btnNewButton_2.setFont(new Font("Rockwell", Font.ITALIC, 19));
		btnNewButton_2.setBounds(10, 217, 164, 39);
		panel_4.add(btnNewButton_2);
		
		
	
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(panel_3);
			}
		});
		btnNewButton_3.setFont(new Font("Rockwell", Font.ITALIC, 19));
		btnNewButton_3.setBounds(10, 281, 164, 39);
		panel_4.add(btnNewButton_3);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setBounds(20, 466, 154, 159);
		ImageIcon image1=new ImageIcon(this.getClass().getResource("/BAR.png"));
		lblNewLabel_17.setIcon(image1);
		panel_4.add(lblNewLabel_17);
		
		JLabel lblNewLabel_28 = new JLabel("Enter Quantity:");
		JTextField textField_4 = new JTextField();

		JButton btnNewButton_19 = new JButton("Edit quantity");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnNewButton_19.getText().equals("Edit quantity"))
				{
					if(table.getSelectedRow()>=0)
				{
					lblNewLabel_28.setVisible(true);
					textField_4.setVisible(true);
					btnNewButton_19.setText("Update");
				}
				else
				{
				    JOptionPane.showMessageDialog(null, "Please select a row to edit!!");
				}}
				else
				{
					try
					{
						String url="jdbc:mysql://localhost:3306/project";
						String uname="root";
						String pass="dhivakar"; 
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection(url,uname,pass);
						Statement st=con.createStatement();
						int neew=Integer.parseInt(textField_4.getText());
						int r=table.getSelectedRow();
						int old=Integer.parseInt((String)table.getValueAt(r,1));
						String itemn=(String)table.getValueAt(r,0);
						String query="Select amount from cart where item='"+itemn+"';";
						ResultSet r1=st.executeQuery(query);
						r1.next();
						int amt=r1.getInt("amount");
						Amount=Amount-(amt*old);
						Amount=Amount+(amt*neew);
						lblNewLabel_25.setText(String.valueOf(Amount));
						model.setValueAt(textField_4.getText(),r,1);
						lblNewLabel_28.setVisible(false);
						textField_4.setVisible(false);
						int totamt=amt*neew;
						String q="update cart set quantity ='"+neew+"',totalamount='"+totamt+"' where item='"+itemn+"';";
						st.executeUpdate(q);
						btnNewButton_19.setText("Edit quantity");
						JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");

					}
					catch(Exception eqq)
					{
						System.out.println(eqq);
					}
				}
			}
		});
		btnNewButton_19.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		btnNewButton_19.setBounds(756, 424, 139, 29);
		panel_3.add(btnNewButton_19);
		
		lblNewLabel_28.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblNewLabel_28.setBounds(756, 334, 157, 29);
		panel_3.add(lblNewLabel_28);
		lblNewLabel_28.setVisible(false);
		
		textField_4.setBounds(755, 373, 112, 29);
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setVisible(false);
		
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String url="jdbc:mysql://localhost:3306/project";
					String uname="root";
					String pass="dhivakar"; 
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,uname,pass);
					PreparedStatement stmt=con.prepareStatement("select * from signup where Name=?");  
					stmt.setString(1,name1);  
					ResultSet r=stmt.executeQuery();
					while(r.next())
					{
					String n=r.getString("Name");
					String p=r.getString("Mobile_no");
					String a=r.getString("Address");
					lblNewLabel_27_6.setText(n);
					lblNewLabel_27_6_1.setText(p);
					lblNewLabel_27_6_2.setText(a);
					lblNewLabel_27_5.setText(String.valueOf(Amount));
					
					}
 
					Statement st = con.createStatement();
					String q="select * from cart";
					r=st.executeQuery(q);
					while(r.next())
					{
						String item=r.getString("item");
						String quan=r.getString("quantity");
						String tot=r.getString("totalamount");
						ro[0]=item;
						ro[1]=quan;
						ro[2]=tot;
						model1.addRow(ro);
					}
 
					switchPanels(panel_cart);
				}
				catch(Exception e4)
				{
					System.out.print(e4);
				}
				
			}
		});
		tree.addTreeSelectionListener((TreeSelectionListener) new TreeSelectionListener() {

			public void valueChanged(TreeSelectionEvent e)
				{
					DefaultMutableTreeNode selected=(DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
					String selected_node=selected.toString();
					if(selected_node.equals("Profile"))
					{
						try
						{
							String url="jdbc:mysql://localhost:3306/project";
							String uname="root";
							String pass="dhivakar"; 
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con=DriverManager.getConnection(url,uname,pass);
							Statement st=con.createStatement();
							String q="Select * from signup where name='"+name1+"';";
							ResultSet r=st.executeQuery(q);
							r.next();
							String mob=r.getString("Mobile_no");
							String maill=r.getString("Email");
							String addr=r.getString("Address");
							lblNewLabel_30.setText(name1);
							lblNewLabel_30_1.setText(mob);
							lblNewLabel_30_2.setText(maill);
							lblNewLabel_30_3.setText(addr);

							switchPanels1(panel_14);
						}
						catch(Exception e1)
						{
							System.out.println(e1);
						}
					}
					else if(selected_node.equals("Name"))
					{
	
						switchPanels1(panel_15);

					}
					else if(selected_node.equals("Password"))
					{
						switchPanels1(panel_16);
					}
					else if(selected_node.equals("Address"))
					{
						switchPanels1(panel_17);
					}
				}
	});
		
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.menu);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("About");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnNewMenu.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Info");
		mnNewMenu.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel);
			}
		});
		
		JMenu mnNewMenu_1 = new JMenu("Login");
		mnNewMenu_1.setForeground(Color.BLACK);
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Signup");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel_1);
				tabbedPane.setSelectedIndex(1);
				
			}
		});
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Login");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel_1);
				tabbedPane.setSelectedIndex(0);
				
			}
		});
		
		JMenu mnNewMenu_2 = new JMenu("Edit");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnNewMenu_2.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Settings");
		mnNewMenu_2.add(mntmNewMenuItem_3);
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				switchPanels(panel_12);
				
			}
		});
		
		JMenu mnNewMenu_3 = new JMenu("Quit");
		mnNewMenu_3.setForeground(Color.BLACK);
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Logout");
		mnNewMenu_3.add(mntmNewMenuItem_4);
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel);
			}
		});
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Exit");
		mnNewMenu_3.add(mntmNewMenuItem_5);
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}
}