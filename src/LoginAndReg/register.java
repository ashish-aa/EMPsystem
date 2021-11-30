package LoginAndReg;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class register extends JFrame {

   String userNameValue;
   int passWordValue;
   JTextField userNameTextField;
   JTextField passWordTextField ;
   JLabel userNameLabel;
   JLabel passWordLabel ;
   JButton registerButton;
   JLabel registerName;
   JLabel loginUser;
  // JButton loginButton;
 
    public  register()
    {
        this.setVisible(true);
        this.setTitle("Register Window");
        this.setSize(500,500);
        this.getContentPane().setBackground(new Color(93, 63, 211));
        this.setLayout(null);

         userNameTextField = new JTextField();
        passWordTextField = new JTextField();
        userNameLabel = new JLabel("Username : ");
        passWordLabel = new JLabel("Password : ");
        registerButton = new JButton("Submit");
        registerName = new JLabel("Register");
        loginUser = new JLabel("*Close this Window to Login* ");
      //  loginButton = new JButton("Login");
        ImageIcon image = new ImageIcon("F:\\Ad. Java\\MicroProject\\src\\LoginAndReg\\arcreactor.png");
        this.setIconImage(image.getImage());




        userNameLabel.setForeground(Color.WHITE);
        passWordLabel.setForeground(Color.WHITE); 
        registerButton.setFont(new Font("SansSerif",Font.BOLD,13));
        registerButton.setForeground(Color.black);
        registerButton.setBackground(new Color(37, 227, 156  ));
        registerName.setForeground(new Color(4, 254, 61 ));
        registerName.setFont(new Font("Serif",Font.BOLD,25));
        loginUser.setForeground(Color.WHITE);
        // loginButton.setForeground(Color.BLACK);
        // loginButton.setBackground( new Color(144, 108, 218));
        // loginButton.setFont(new Font("Sans Serif",Font.ITALIC,10));


        userNameTextField.setBounds(230,150,130,25);
        passWordTextField.setBounds(230,200,130,25);
        userNameLabel.setBounds(150,150,80,20);
        passWordLabel.setBounds(150,200,80,20);
        registerButton.setBounds(210,250,80,30);
        registerName.setBounds(210,60,200,100);
        loginUser.setBounds(180,350,180,20);
        // loginButton.setBounds(250,345,85,30);








        this.add(userNameTextField);
        this.add(passWordTextField);
        this.add(userNameLabel);
        this.add(passWordLabel);
        this.add(registerButton);
        this.add(registerName);
      this.add(loginUser);
        // this.add(loginButton);

       // registerButton.addActionListener(this);




    }

    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     // TODO Auto-generated method stub
    //     userNameValue = userNameTextField.getText();
    //     passWordValue = Integer.parseInt(passWordTextField.getText());
    //    System.out.println(userNameValue);
    //    passWordValue = Integer.parseInt(array);
 
    //    System.out.println(passWordValue);
        
    // }

    
}
