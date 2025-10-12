
    import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

class MyFrame1 implements ActionListener
{
    private JButton jb=null;
    private JButton jbc=null;
    private JTextField tf=null;
    private JTextField p_tf=null;
    private JFrame myframe=null;
    MyFrame1()
    {
         myframe=new JFrame("Login");
       myframe.setVisible(true);
       myframe.setSize(500,500);
       myframe.setTitle("Login");
       myframe.setBackground(Color.pink);
       myframe.getContentPane().setBackground(Color.green);
       myframe.setLocation(500,300);
       myframe.setLayout(null);

       JLabel lbl_user=new JLabel("User_Name");
       myframe.add(lbl_user);
       lbl_user.setBounds(100,100,80,80);

       tf=new JTextField();
       myframe.add(tf);
       tf.setBounds(100,150,80,20);
       tf.addKeyListener(new KeyAdapter()
       {
           public void keyReleased(KeyEvent ke)
           {
            if(ke.getKeyText(ke.getKeyCode())=="Enter")
            {
                p_tf.requestFocus();
            }
           }
       });
       jb=new JButton("Login");
       myframe.add(jb);
       jb.setBounds(100,200,80,50);

       jbc=new JButton("Cancel");
       myframe.add(jbc);
       jbc.setBounds(200,200,80,50);

       JLabel p_lbl_user=new JLabel("Password");
       myframe.add(p_lbl_user);
       p_lbl_user.setBounds(200,100,80,80);


        p_tf=new JTextField();
       myframe.add(p_tf);
       p_tf.setBounds(200,150,80,20);

       p_tf.addKeyListener(new KeyAdapter()
       {
           public void keyReleased(KeyEvent ke)
           {
             if(ke.getKeyText(ke.getKeyCode())=="Enter")
             {
                JOptionPane.showMessageDialog(null,"login Successfull");
             }
           }
       });

       jb.addActionListener(this);
       jbc.addActionListener(this);
       

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand()=="Login")
        {
            String user=tf.getText();
            String password=p_tf.getText();

            if(user.equalsIgnoreCase("abhay") && password.equals("Abhay"))
            {
                JOptionPane.showMessageDialog(null,"Login Success");
                myframe.setVisible(false);
                Personal_Information.main(null);


            }
        }
        else if(ae.getActionCommand()=="Cancel")
        {
           //JOptionPane.showMessageDialog(null,"Login SUccess");
        }
    }
    

    public static void main(String[] args) 
    {
       MyFrame1 mf=new MyFrame1();
       
    }

}

