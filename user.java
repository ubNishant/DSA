import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

class MyFrame implements ActionListener {
    private JButton btn_login = null;
    private JTextField txt_username = null;
    private JTextField txt_password = null;
    private JFrame myframe;
    private JLabel label;
    private JButton button;
    private int count = 0;

    MyFrame() {
        myframe = new JFrame();
        label = new JLabel();
        label.setText("Sanet Tapal: 0");
        
        myframe.setTitle("page");
        myframe.setSize(420, 420);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.getContentPane().setBackground(Color.RED);
        myframe.setLayout(null); 

        label.setBounds(150, 150, 200, 30);
        myframe.add(label);

        button = new JButton("Click me");
        button.setBounds(150, 200, 100, 50); 
        button.addActionListener(this);
        myframe.add(button);

        myframe.setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }

    public void actionPerformed(ActionEvent ae) {
        count++;
        label.setText("Sanket Tapal " + count);
    }
}
