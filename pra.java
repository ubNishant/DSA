

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

 class MyFrame
    {  
	public static void main(String[] args)
	{
        JFrame myframe= new JFrame("login frames");
		 myframe.setVisible(true);
         myframe.setSize(500,300);//(width,height)
		// myframe.setBackground(PINK);
		 myframe.getContentPane().setBackground(Color.PINK);//eka function ne dele input dusraya optput dene
		 myframe.setLocation(300,300);//set the location of frame on screen(x-axis,y-axis)
		 myframe.setLayout(null);
		 
		 JLabel lbl_username=new JLabel("username:");
		 myframe.add(lbl_username);//to add the object of the frame in our class
		 lbl_username.setBounds(80,20,70,30);
        lbl_username.setForeground(Color.BLACK);
		
		          JLabel lbl_password=new JLabel("Password :");
                  myframe.add(lbl_password);
                  lbl_password.setBounds(80,60,70,30);
                  lbl_password.setForeground(Color.BLACK);
		 
		 JTextField txt_username = new JTextField();
         myframe.add(txt_username);
         txt_username.setBounds(150,20,140,30);
		 
		 JTextField txt_password = new JTextField();
         myframe.add(txt_password);
         txt_password.setBounds(150,60,140,30);
		 
		 
		 
		}
	}		