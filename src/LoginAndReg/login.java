package LoginAndReg;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;

public class login extends JFrame
{

   public login()
   {
    new JFrame("Login Page");
    this.setSize(500,500);
    this.setVisible(true);
    this.getContentPane().setBackground(new Color(93, 63, 211));
    this.setLayout(null);
    JTextField usernameTextField = new JTextField();
    JTextField passwordTextfield = new JTextField();

    JLabel usernameLabel = new JLabel("Username : ");
    JLabel passwordLabel = new JLabel("Password : ");
    passwordLabel.setForeground(Color.WHITE);
    usernameLabel.setForeground(Color.WHITE);
    usernameLabel.setBounds(150,150,80,20);
    passwordLabel.setBounds(150,200,80,20);
    usernameTextField.setBounds(230,150,130,25);
    passwordTextfield.setBounds(230,200,130,25);
    this.add(usernameTextField);
    this.add(usernameLabel);
    this.add(passwordTextfield);
    this.add(passwordLabel);
   }

}