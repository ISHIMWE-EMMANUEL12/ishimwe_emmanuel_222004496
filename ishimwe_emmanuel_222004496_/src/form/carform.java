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

public class carform implements ActionListener {
	JFrame frame;
	JLabel namelb =new JLabel("name");
	JLabel agelb =new JLabel("age");
	JLabel modellb =new JLabel("model");
	JLabel manufacturerlb =new JLabel("manufacturer");
	
	
	
	JTextField nameTextField=new JTextField();
	JTextField ageTextField=new JTextField();
	JTextField modelTextField=new JTextField();
	JTextField manufacturerTextField=new JTextField();
	
	
	JButton insertButton=new JButton("INSERT");
	JButton deleteButton=new JButton("DELETE");
	
	public carform() {
		createwindows ();
	}
	
	
	

	private void createwindows() {
		
	frame= new JFrame()	;
	frame.setTitle("car form");
	frame.setBounds(20,20,500,400);
	frame.getContentPane().setBackground(Color.gray);
	frame.getContentPane().setLayout(null);
	frame.setResizable(true);
	frame.setVisible(true);
	setsizeandlocation();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	





	private void setsizeandlocation() {
		namelb.setBounds(10,10,200,30);
	    agelb.setBounds(10,50,200,30);
		modellb.setBounds(10,90,200,30);
		manufacturerlb.setBounds(10,130,200,30);
		
		nameTextField.setBounds(160,10,130,30);
		ageTextField.setBounds(160,50,130,30);
		modelTextField.setBounds(160,90,130,30);
		manufacturerTextField.setBounds(160,130,130,30);
		
		insertButton.setBounds(10,250,85,30);
		deleteButton.setBounds(190,250,85,30);
	addcomponenttoframe();}


private void addcomponenttoframe() {
	frame.add(namelb);
	
	frame.add(agelb);
	frame.add(modellb);
	frame.add(manufacturerlb);
	frame.add(nameTextField);
		
	frame.add(ageTextField);
	frame.add(modelTextField);
	frame.add(manufacturerTextField);
	
	
	frame.add(insertButton);
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
			String query="INSERT INTO car VALUES(?,?,?,?)";
			PreparedStatement pStatement=connection.prepareStatement(query);
			pStatement.setString(1, nameTextField.getText());
			pStatement.setString(2, ageTextField.getText());
			pStatement.setString(3, modelTextField.getText());
			pStatement.setString(4, manufacturerTextField.getText());
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

deleteButton.addActionListener(this);
deleteButton.addActionListener(new ActionListener() {
	
	public void actionPerformed(java.awt.event.ActionEvent e) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/car_parking_reservation_system","root","");
			String query="DELETE FROM car WHERE age=?";
			 int utxf=Integer.parseInt(JOptionPane.showInputDialog("enter age to delete"));
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
namelb.setFont(fontii);
agelb.setFont(fontii);
modellb.setFont(fontii);
manufacturerlb.setFont(fontii);

nameTextField.setFont(fontii);
ageTextField.setFont(fontii);
modelTextField.setFont(fontii);
manufacturerTextField.setFont(fontii);

Font fii=new Font("courierNew",Font.BOLD,12);

insertButton.setFont(fontii);
deleteButton.setFont(fontii);

}









@Override
public void actionPerformed(ActionEvent e) {
}

// TODO Auto-generated method stub

public static void main(String[] args) {
	carform cf=new carform();
	// TODO Auto-generated method stub

}}




		

