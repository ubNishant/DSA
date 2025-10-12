import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.logging.LoggingMXBean;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;


class MyFrame implements ActionListener
{
    private JButton btn_login =null;
    private JTextField txt_username =null;
    private JTextField txt_password =null;


    MyFrame()
    {  
        JFrame myframe= new JFrame("Student information");
        myframe.setVisible(true);
        myframe.setSize(500,300);
        //myframe.setTitle("Login Frame");
        
        myframe.getContentPane().setBackground(Color.RED);
        myframe.setLocation(500, 500);
        myframe.setLayout(null);
        
        JLabel lbl_username=new JLabel("Name:");
        myframe.add(lbl_username);
        lbl_username.setBounds(80,20,70,30);
        lbl_username.setForeground(Color.LIGHT_GRAY);
        Font font=new Font("Serif",Font.BOLD,10);
        lbl_username.setFont(font);
        
        JLabel lbl_password=new JLabel("Addesss:");
        myframe.add(lbl_password);
        lbl_password.setBounds(80,60,70,30);
        lbl_password.setForeground(Color.LIGHT_GRAY);
        //Font font=new Font("Serif",Font.BOLD,34);
        lbl_password.setFont(font);

        txt_username = new JTextField();
        myframe.add(txt_username);
        txt_username.setBounds(150,20,140,30);

        txt_password = new JTextField();
        myframe.add(txt_password);
        txt_password.setBounds(150,60,140,30);

        btn_login=new JButton("Submit");
        myframe.add(btn_login);
        btn_login.setBounds(100,100,100,30);

        JButton btn_cancel=new JButton("Cancel");
        myframe.add(btn_cancel);
        btn_cancel.setBounds(200,100,100,30);
        btn_login.addActionListener(this);
        btn_cancel.addActionListener(this);
    }
    public static void main(String[] args) 
    {
        MyFrame myframe=new MyFrame();
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand()=="submit")
        {   
	     
	       
            String user=txt_username.getText();
            String pass=txt_password.getText();
            if(user.equalsIgnoreCase("Nishant") && pass.equalsIgnoreCase("751786329"))
            {
                JOptionPane.showMessageDialog(null,"information subbmit");
                System.out.println("Login Successfully");

            }
            else{
				
                JOptionPane.showMessageDialog(null,"not subbmited");
                txt_username.setText("");
                txt_password.setText("");
				
                //myframe.setVisible(false);

                System.out.println("Login Failed");

            }
            //System.out.println("Login Button Click");
        }
        else
        {
            System.out.println("Cancel Button Clicked:");
			System.out.println("try again:");
			
        }
    }
}