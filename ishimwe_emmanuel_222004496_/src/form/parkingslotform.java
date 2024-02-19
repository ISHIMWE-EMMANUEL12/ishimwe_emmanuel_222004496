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

public class parkingslotform implements ActionListener {
	JFrame frame;
	JLabel parkingslot_idlb =new JLabel("parkingslot_id");
	JLabel slot_numberlb =new JLabel("slot_number");
	JLabel sizelb =new JLabel("size");
	JLabel statuslb =new JLabel("status");
	
	JTextField parkingslot_idTextField=new JTextField();
	
	JTextField slot_numberTextField=new JTextField();
	JTextField sizeTextField=new JTextField();
	JTextField statusTextField=new JTextField();
	
	JButton insertButton=new JButton("INSERT");
	JButton updateButton=new JButton("UPDATE");
	JButton deleteButton=new JButton("DELETE");
	
	public parkingslotform() {
		createwindows ();
	}
	
	
	

	private void createwindows() {
		
	frame= new JFrame()	;
	frame.setTitle("parkingslotform");
	frame.setBounds(20,20,500,400);
	frame.getContentPane().setBackground(Color.gray);
	frame.getContentPane().setLayout(null);
	frame.setResizable(true);
	frame.setVisible(true);
	setsizeandlocation();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	





	private void setsizeandlocation() {
		parkingslot_idlb.setBounds(10,10,200,30);
		slot_numberlb.setBounds(10,50,200,30);
		sizelb.setBounds(10,90,200,30);
		statuslb.setBounds(10,130,200,30);
		
		parkingslot_idTextField.setBounds(160,10,130,30);
		slot_numberTextField.setBounds(160,50,130,30);
		sizeTextField.setBounds(160,90,130,30);
		statusTextField.setBounds(160,130,130,30);
		
		insertButton.setBounds(10,250,85,30);
		updateButton.setBounds(100,250,85,30);
		deleteButton.setBounds(190,250,85,30);
		
		addcomponenttoframe();}
	
			
		private void addcomponenttoframe() {
			frame.add(parkingslot_idlb);
			
			frame.add(slot_numberlb);
			frame.add(sizelb);
			frame.add(statuslb);
			frame.add(parkingslot_idTextField);
			frame.add(slot_numberTextField);
				
			frame.add(sizeTextField);
			frame.add(statusTextField);
			
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
					String query="INSERT INTO parkingslot VALUES(?,?,?,?)";
					PreparedStatement pStatement=connection.prepareStatement(query);
					pStatement.setString(1, parkingslot_idTextField.getText());
					pStatement.setString(2, slot_numberTextField.getText());
					pStatement.setString(3, sizeTextField.getText());
					pStatement.setString(4, statusTextField.getText());
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
					String query="UPDATE parkingslot SET slot_number=?,size=?,status=? WHERE parkingslot_id=?";
					PreparedStatement pStatement=connection.prepareStatement(query);
					pStatement.setString(1, slot_numberTextField.getText());
					pStatement.setString(2, sizeTextField.getText());
					pStatement.setString(3, statusTextField.getText());
					pStatement.setInt(4,Integer.parseInt(parkingslot_idTextField.getText()));
					pStatement.executeUpdate();
					JOptionPane.showMessageDialog(updateButton, " data changed completely");
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
					String query="DELETE FROM parkingslot WHERE parkingslot_id=?";
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
		parkingslot_idlb.setFont(fontii);
		slot_numberlb.setFont(fontii);
		sizelb.setFont(fontii);
		statuslb.setFont(fontii);
		
		parkingslot_idTextField.setFont(fontii);
		slot_numberTextField.setFont(fontii);
		sizeTextField.setFont(fontii);
		statusTextField.setFont(fontii);
		
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
			parkingslotform cf=new parkingslotform();
			// TODO Auto-generated method stub

		}}

	

