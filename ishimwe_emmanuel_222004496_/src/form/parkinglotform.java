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

public class parkinglotform implements ActionListener{
	JFrame frame;
	JLabel idlb =new JLabel("parkinglot_id");
	JLabel namelb =new JLabel("name");
	JLabel addresslb =new JLabel("address");
	JLabel capacitylb =new JLabel("capacity");
	
	JTextField idTextField=new JTextField();
	
	JTextField nameTextField=new JTextField();
	JTextField addressTextField=new JTextField();
	JTextField capacityTextField=new JTextField();
	
	JButton insertButton=new JButton("INSERT");
	JButton updateButton=new JButton("UPDATE");
	JButton deleteButton=new JButton("DELETE");
	
	public parkinglotform() {
		createwindows ();
	}
	
	
	

	private void createwindows() {
		
	frame= new JFrame()	;
	frame.setTitle("parkinglotform");
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
		addresslb.setBounds(10,90,200,30);
	    capacitylb.setBounds(10,130,200,30);
		
		idTextField.setBounds(160,10,130,30);
		nameTextField.setBounds(160,50,130,30);
		addressTextField.setBounds(160,90,130,30);
		capacityTextField.setBounds(160,130,130,30);
		
		insertButton.setBounds(10,250,85,30);
		updateButton.setBounds(100,250,85,30);
		deleteButton.setBounds(190,250,85,30);
		
		addcomponenttoframe();}
	
			
		private void addcomponenttoframe() {
			frame.add(idlb);
			
			frame.add(namelb);
			frame.add(addresslb);
			frame.add(capacitylb);
			frame.add(idTextField);
			frame.add(nameTextField);
				
			frame.add(addressTextField);
			frame.add(capacityTextField);
			
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
					String query="INSERT INTO parkinglot VALUES(?,?,?,?)";
					PreparedStatement pStatement=connection.prepareStatement(query);
					pStatement.setString(1, idTextField.getText());
					pStatement.setString(2, nameTextField.getText());
					pStatement.setString(3, addressTextField.getText());
					pStatement.setString(4, capacityTextField.getText());
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
					String query="UPDATE parkinglot SET name=?,address=?,capacity=? WHERE parkinglot_id=?";
					PreparedStatement pStatement=connection.prepareStatement(query);
					pStatement.setString(1, nameTextField.getText());
					pStatement.setString(2, addressTextField.getText());
					pStatement.setString(3, capacityTextField.getText());
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
					String query="DELETE FROM parkinglot WHERE parkinglot_id=?";
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
		addresslb.setFont(fontii);
	    capacitylb.setFont(fontii);
		
		idTextField.setFont(fontii);
		nameTextField.setFont(fontii);
		addressTextField.setFont(fontii);
		capacityTextField.setFont(fontii);
		
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
			parkinglotform cf=new parkinglotform();
			// TODO Auto-generated method stub

		}}

	



	