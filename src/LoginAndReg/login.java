package LoginAndReg;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


import java.awt.event.*;
import java.awt.*;

public class login extends JFrame
{
   JTextField usernameTextField;
   JPasswordField passwordTextfield ;
   JLabel usernameLabel;
   JLabel passwordLabel;
   JLabel loginName;
   JLabel registerUser ;
   JButton loginButton;
   JButton registerButton;
   char[] array;
   String userNameValue;
   int passWordValue;

   public login()
   {
    this.setTitle("Login Page");
    this.setSize(500,500);
    this.setVisible(true);
    this.getContentPane().setBackground(new Color(93, 63, 211));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
     usernameTextField = new JTextField();
     passwordTextfield = new JPasswordField();
 
    
    
    ImageIcon image = new ImageIcon("F:\\Ad. Java\\MicroProject\\src\\LoginAndReg\\arcreactor.png");
    this.setIconImage(image.getImage());
     usernameLabel = new JLabel("Username : ");
     passwordLabel = new JLabel("Password : ");
     loginName = new JLabel("Login");
     registerUser = new JLabel("Register Here : ");
     loginButton = new JButton("Submit");
     registerButton = new JButton("REGISTER");

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

   // loginButton.addActionListener(this);
    
   
   }

   // @Override
   // public void actionPerformed(ActionEvent e) {
   //    // TODO Auto-generated method stub
   //    userNameValue = usernameTextField.getText();
   //     array = passwordTextfield.getPassword();
      
   //    passWordValue = charArrayToInteger(array);
      

      
      
   // }

//    public static int charArrayToInteger(char[] array){
//       String arr = new String(array);
//       int number = Integer.parseInt(arr);
  
//       return number;
//   }

}