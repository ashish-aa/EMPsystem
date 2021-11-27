package LoginAndReg;

import javax.security.auth.spi.LoginModule;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.*;

public class login extends JFrame
{

   public login()
   {
    new JFrame("Login Page");
    this.setSize(500,500);
    this.setVisible(true);
    this.getContentPane().setBackground(new Color(93, 63, 211));
    this.setResizable(false);
    this.setLayout(null);
    JTextField usernameTextField = new JTextField();
    JPasswordField passwordTextfield = new JPasswordField();
 
    
    

    JLabel usernameLabel = new JLabel("Username : ");
    JLabel passwordLabel = new JLabel("Password : ");
    JLabel loginName = new JLabel("Login");
    JLabel registerUser = new JLabel("Register Here : ");
    JButton loginButton = new JButton("Submit");
    JButton registerButton = new JButton("REGISTER");

    registerButton.setForeground(Color.BLACK);
    registerButton.setBackground( new Color(144, 108, 218));
    registerButton.setFont(new Font("Sans Serif",Font.ITALIC,10));
    loginName.setForeground(new Color(4, 254, 61 ));
    loginName.setFont(new Font("Serif",Font.BOLD,25));
    loginButton.setFont(new Font("SansSerif",Font.BOLD,13));
    loginButton.setForeground(Color.black);
    loginButton.setBackground(new Color(37, 227, 156  ));
    registerUser.setForeground(Color.WHITE);
    passwordLabel.setForeground(Color.WHITE);
    usernameLabel.setForeground(Color.WHITE);

    registerButton.setBounds(250,345,85,30);
    usernameLabel.setBounds(150,150,80,20);
    passwordLabel.setBounds(150,200,80,20);
    usernameTextField.setBounds(230,150,130,25);
    passwordTextfield.setBounds(230,200,130,25);
    loginName.setBounds(210,60,200,100);
    loginButton.setBounds(210,250,80,30);
    registerUser.setBounds(150,350,100,20);
    this.add(usernameTextField);
    this.add(usernameLabel);
    this.add(passwordTextfield);
    this.add(passwordLabel);
    this.add(loginName);
    this.add(loginButton);
    this.add(registerUser);
    this.add(registerButton);
   }

}