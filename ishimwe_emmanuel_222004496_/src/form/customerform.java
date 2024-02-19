package form;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class customerform implements ActionListener {
	
	JFrame frame;
	JLabel idlb =new JLabel("customer_id");
	JLabel namelb =new JLabel("name");
	JLabel emaillb =new JLabel("email");
	JLabel phonelb =new JLabel("phone");
	
	JTextField idTextField=new JTextField();
	
	JTextField nameTextField=new JTextField();
	JTextField emailTextField=new JTextField();
	JTextField phoneTextField=new JTextField();
	
	JButton insertButton=new JButton("INSERT");
	JButton updateButton=new JButton("UPDATE");
	JButton deleteButton=new JButton("DELETE");
	
	public customerform() {
		createwindows ();
	}
	
	
	

	private void createwindows() {
		
	frame= new JFrame()	;
	frame.setTitle("customerform");
	frame.setBounds(20,20,500,400);
	frame.getContentPane().setBackground(Color.gray);
	frame.getContentPane().setLayout(null);
	frame.setResizable(true);
	frame.setVisible(true);
	setsizeandlocation();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	





	private void setsizeandlocation() {
		idlb.setBounds(10,10,200,30);
		namelb.setBounds(10,50,200,30);
		emaillb.setBounds(10,90,200,30);
		phonelb.setBounds(10,130,200,30);
		
		idTextField.setBounds(160,10,130,30);
		nameTextField.setBounds(160,50,130,30);
		emailTextField.setBounds(160,90,130,30);
		phoneTextField.setBounds(160,130,130,30);
		
		insertButton.setBounds(10,250,85,30);
		updateButton.setBounds(100,250,85,30);
		deleteButton.setBounds(190,250,85,30);
		
		addcomponenttoframe();}
	
			
		private void addcomponenttoframe() {
			frame.add(idlb);
			
			frame.add(namelb);
			frame.add(emaillb);
			frame.add(phonelb);
			frame.add(idTextField);
			frame.add(nameTextField);
				
			frame.add(emailTextField);
			frame.add(phoneTextField);
			
			frame.add(insertButton);
			frame.add(updateButton);
			frame.add(deleteButton);
			
			ActionEvent();
			
			
		
		
	}




	private void ActionEvent() {
		
		insertButton.addActionListener(this);
		insertButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(java.awt.event.ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");	
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/car_parking_reservation_system","root","");
					String query="INSERT INTO customer VALUES(?,?,?,?)";
					PreparedStatement pStatement=connection.prepareStatement(query);
					pStatement.setInt(1,Integer.parseInt(idTextField.getText()));
					pStatement.setString(2, nameTextField.getText());
					pStatement.setString(3, emailTextField.getText());
					pStatement.setString(4, phoneTextField.getText());
					pStatement.executeUpdate();
					JOptionPane.showMessageDialog(insertButton, "data inserted well");
					pStatement.close();
					connection.close();	
				} 
			catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
				
			}
		});
		updateButton.addActionListener(this);
		updateButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(java.awt.event.ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");	
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/car_parking_reservation_system","root","");
					String query="UPDATE customer SET name=?,email=?,phone=? WHERE customer_id=?";
					PreparedStatement pStatement=connection.prepareStatement(query);
					pStatement.setString(1, nameTextField.getText());
					pStatement.setString(2, emailTextField.getText());
					pStatement.setString(3, phoneTextField.getText());
					pStatement.setInt(4,Integer.parseInt(idTextField.getText()));
					pStatement.executeUpdate();
					JOptionPane.showMessageDialog(updateButton, " data changed well");
					pStatement.close();
					connection.close();	
				} 
			catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
				
			}
		});
		deleteButton.addActionListener(this);
deleteButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(java.awt.event.ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");	
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/car_parking_reservation_system","root","");
					String query="DELETE FROM customer WHERE customer_id=?";
					 int utxf=Integer.parseInt(JOptionPane.showInputDialog("enter id to delete"));
					PreparedStatement pStatement=connection.prepareStatement(query);
					pStatement.setInt(1,utxf);
					JOptionPane.showMessageDialog(deleteButton, "delete successfully");
					Component delete;
					pStatement.executeUpdate();
					pStatement.close();
					connection.close();	
				} 
			catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
				
			}
		});
		
		
	}
		
		private void setallfont() {
			
		Font fontii=new Font("georgia",Font.ITALIC,18);
		idlb.setFont(fontii);
		namelb.setFont(fontii);
		emaillb.setFont(fontii);
		phonelb.setFont(fontii);
		
		idTextField.setFont(fontii);
		nameTextField.setFont(fontii);
		emailTextField.setFont(fontii);
		phoneTextField.setFont(fontii);
		
		Font fii=new Font("courierNew",Font.BOLD,12);
		
		insertButton.setFont(fontii);
		updateButton.setFont(fontii);
		deleteButton.setFont(fontii);
		
		}




	




	@Override
	public void actionPerformed(ActionEvent e) {
	}
		
		// TODO Auto-generated method stub

		public static void main(String[] args) {
			customerform cf=new customerform();
			// TODO Auto-generated method stub

		}}

	

