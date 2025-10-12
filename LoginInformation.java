import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class LoginInformation implements ActionListener
{
    private JFrame loginInfoFrame = null;
    private JButton loginButton = null;
    private JButton cancelButton = null;
    private JTextField usernameTextField = null;
    private JTextField passwordTextField = null;

        LoginInformation()
        {   
            loginInfoFrame = new JFrame("Login information frame...");
            loginInfoFrame.setVisible(true);
            loginInfoFrame.setLocation(1000, 200);
            loginInfoFrame.setSize(800, 500);
            loginInfoFrame.getContentPane().setBackground(Color.PINK);
            loginInfoFrame.setLayout(null);


            JLabel lblUsername = new JLabel("Username : ");
            loginInfoFrame.add(lblUsername);
            lblUsername.setBounds(150, 100, 100, 21);
            lblUsername.setForeground(Color.WHITE);
            lblUsername.setFont(new Font("Serif", Font.BOLD, 18));
            usernameTextField = new JTextField("");
            loginInfoFrame.add(usernameTextField);
            usernameTextField.setBounds(245, 101, 150, 21);
            usernameTextField.addKeyListener(new KeyAdapter()
            {
                 public void keyReleased(KeyEvent ke)
                 {
                    String userStr = usernameTextField.getText();
                    passwordTextField.setText(userStr);
                 }
            });

            JLabel lblPassword = new JLabel("Password : ");
            loginInfoFrame.add(lblPassword);
            lblPassword.setBounds(150, 140, 100, 21);
            lblPassword.setForeground(Color.WHITE);
            lblPassword.setFont(new Font("Serif", Font.BOLD, 18));
            passwordTextField = new JTextField("");
            loginInfoFrame.add(passwordTextField);
            passwordTextField.setBounds(245, 141, 150, 21);
            passwordTextField.addKeyListener(new KeyAdapter()
            {
                 public void keyReleased(KeyEvent ke)
                 {
                    if(ke.getKeyText(ke.getKeyCode()) == "Enter")
                    {
                        JOptionPane.showMessageDialog(null, "Login failed...");
                    }
                 }
            }); 


            loginButton = new JButton("Login");
            loginInfoFrame.add(loginButton);
            loginButton.setBounds(150, 180, 121, 34);
            loginButton.setFont(new Font("Serif", Font.BOLD, 15));

            loginButton.addActionListener(this);

            cancelButton = new JButton("Cancel");
            loginInfoFrame.add(cancelButton);
            cancelButton.setBounds(275, 180, 121, 34);
            cancelButton.setFont(new Font("Serif", Font.BOLD, 15));
        
            cancelButton.addActionListener(this);   
        }

    public static void main(String[] args)
    {  
        LoginInformation loginInfo = new LoginInformation(); 
    }

    public void actionPerformed(ActionEvent ae)
    {       
        if(ae.getSource() == loginButton) // alternative method :  ae.getActionCommand() == "Submit"
        {
            String username = usernameTextField.getText();
            String password = passwordTextField.getText();

            if(username.equalsIgnoreCase("Sunshine") && password.equals("7588005214"))
            {
                JOptionPane.showMessageDialog(null, "Login success...");
                usernameTextField.setText("");
                passwordTextField.setText("");
                loginInfoFrame.setVisible(false);
                PersonalInformation.main(null);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Login failed...");
                usernameTextField.setText("");
                passwordTextField.setText("");
            }
        }
        else
        {
            loginInfoFrame.setVisible(false);
        }
    }

}

class PersonalInformation implements ActionListener
{
    private JFrame personalInfoFrame = null;
    private JTextField fullNameTextField = null;
    private JTextField dateOfBirthTextField = null;
    private JTextField emailTextField = null;
    private JTextField phoneNumberTextField = null;
    private JButton cancelButton = null;
    private JButton submitButton = null;

    public static boolean validateJavaDate(String strDate)
    {
	
	    if (strDate.trim().equals(""))
	    {
	        return true;
	    }
	
	    else
	    {
	        SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
	        sdfrmt.setLenient(false);
	        try
	        {
	            Date javaDate = sdfrmt.parse(strDate);
                return true;
	        }
	        catch (ParseException e)
	        {
	            return false;
	        }
	    }
    }

    PersonalInformation()
    {
        personalInfoFrame = new JFrame("Personal information frame...");
        personalInfoFrame.setVisible(true);
        personalInfoFrame.setLocation(1000, 200);
        personalInfoFrame.setSize(800, 500);
        personalInfoFrame.getContentPane().setBackground(Color.PINK);
        personalInfoFrame.setLayout(null);

        JLabel lblFullName = new JLabel("Full Name : ");
        personalInfoFrame.add(lblFullName);
        lblFullName.setBounds(150, 100, 130, 21);
        lblFullName.setForeground(Color.WHITE);
        lblFullName.setFont(new Font("Serif", Font.BOLD, 18));
        fullNameTextField = new JTextField("");
        personalInfoFrame.add(fullNameTextField);
        fullNameTextField.setBounds(280, 101, 150, 21);

        JLabel lblDateOfBirth = new JLabel("Date Of Birth : ");
        personalInfoFrame.add(lblDateOfBirth);
        lblDateOfBirth.setBounds(150, 125, 130, 21);
        lblDateOfBirth.setForeground(Color.WHITE);
        lblDateOfBirth.setFont(new Font("Serif", Font.BOLD, 18));
        dateOfBirthTextField = new JTextField("");
        personalInfoFrame.add(dateOfBirthTextField);
        dateOfBirthTextField.setBounds(280, 126, 150, 21);

        JLabel lblEmail = new JLabel("Email : ");
        personalInfoFrame.add(lblEmail);
        lblEmail.setBounds(150, 150, 100, 21);
        lblEmail.setForeground(Color.WHITE);
        lblEmail.setFont(new Font("Serif", Font.BOLD, 18));
        emailTextField = new JTextField("");
        personalInfoFrame.add(emailTextField);
        emailTextField.setBounds(280, 151, 150, 21);

        JLabel lblPhoneNumber = new JLabel("Phone : ");
        personalInfoFrame.add(lblPhoneNumber);
        lblPhoneNumber.setBounds(150, 175, 100, 21);
        lblPhoneNumber.setForeground(Color.WHITE);
        lblPhoneNumber.setFont(new Font("Serif", Font.BOLD, 18));
        phoneNumberTextField = new JTextField("");
        personalInfoFrame.add(phoneNumberTextField);
        phoneNumberTextField.setBounds(280, 176, 150, 21);

        submitButton = new JButton("Submit");
        personalInfoFrame.add(submitButton);
        submitButton.setBounds(150, 210, 133, 34);
        submitButton.setFont(new Font("Serif", Font.BOLD, 15));

        submitButton.addActionListener(this);

        cancelButton = new JButton("Cancel");
        personalInfoFrame.add(cancelButton);
        cancelButton.setBounds(295, 210, 133, 34);
        cancelButton.setFont(new Font("Serif", Font.BOLD, 15));

        cancelButton.addActionListener(this);
    }
    
    public static void main(String[] args)
    {
        PersonalInformation personalInfo = new PersonalInformation();
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == submitButton)
        { 
            String fullName = fullNameTextField.getText();
            String dateOfBirth = dateOfBirthTextField.getText();
            String email = emailTextField.getText();
            String phone = phoneNumberTextField.getText();

            boolean flag = true;

            if(!fullName.equals(""))
            {
                for(int i = 0 ; i < fullName.length() ; i++)
                {
                    char c = fullName.charAt(i);
                    if(!Character.isLetter(c) && fullName.charAt(i) != ' ')
                    {
                        JOptionPane.showMessageDialog(null, "Name must be a string containing only letters..."); 
                        flag = false;
                        break;
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Full name mustn't be empty...");
                flag = false;
            }


            if(!dateOfBirth.equals(""))
            {
                if(!validateJavaDate(dateOfBirth))
                {
                    JOptionPane.showMessageDialog(null, "Invalid date...");
                    flag = false;
                }   
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Date of birth mustn't be empty...");
                flag = false;
            }


            if(!email.equals(""))
            {
                String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
                Pattern pattern = Pattern.compile(emailRegex);
                Matcher matcher = pattern.matcher(email);

                if (!matcher.matches()) 
                {
                    JOptionPane.showMessageDialog(null, "Email is invalid.");
                    flag = false;
                }  
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Email mustn't be empty...");
                flag = false;
            }


            if(!phone.equals(""))
            {
                for(int i = 0 ; i < phone.length() ; i++)
                {
                    char c = phone.charAt(i);
                    if(!Character.isDigit(c))
                    {
                        JOptionPane.showMessageDialog(null, "Phone number must be containing only digits...");
                        flag = false; 
                        break;
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Phone mustn't be empty...");
                flag = false;
            }


            if(flag == true)
            {
                JOptionPane.showMessageDialog(null, "Personal Information submitted successfully...");
                personalInfoFrame.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed to submit Personal Information...");
                personalInfoFrame.setVisible(false);
            }
        }
        else
        {
            personalInfoFrame.setVisible(false);
        }
    }
}

