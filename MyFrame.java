import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
class MyFrame{
	public static void main(String[] args)
	{
		JFrame myframe=new JFrame();
		myframe.setVisible(true);
		//myframe.
		
	  myframe.setTitle("Login");
	  //myframe.setBackgrond(color:red);
	  myframe.getContentPane().setBackground(Color.BLUE);
	  myframe.setLocation(700,500);
	  myframe.setLayout(null);
	  JLabel lbl_username=new JLabel("username");
	  myframe.add(lbl_username);
	  lbl_username.setBounds(20,60,10,50);
	  
	  JLabel lbl_password=new JLabel("password");
	  myframe.add(lbl_password);
	  lbl_password.setBounds(20,30,60,50);
	  
	  JButton login_button=new JButton("login");
	  myframe.add(login_button);
	  login_button.setBounds(20,70,80,20);
	  
	  JTextField text_username=new JTextField("username");
	  myframe.add(text_username);
	  text_username.setBounds(80,45,60,85);
	  
	  
	  
	  
	  
	}
}