package LoginAndReg;

import java.sql.*;
import java.awt.event.*;
import java.awt.*;


public class Main{
     static login l1;
     static String userName;
     static int passWord;
     static ResultSet loginData;
    public static void main(String[] args) throws SQLException {
         l1 = new login();
       // register r1 = new register();

        String url = "jdbc:mysql://127.0.0.1:3306/MicroProject";
        String username = "root";
        String password = "Ashish@2003";
        String queryForLogin = "select * from logReg";


        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        loginData = st.executeQuery(queryForLogin);



        l1.loginButton.addActionListener(new ActionListener(){
            @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        l1.userNameValue = l1.usernameTextField.getText();
        l1.array = l1.passwordTextfield.getPassword();
        l1.passWordValue = charArrayToInteger(l1.array);

        System.out.println(l1.userNameValue);
        System.out.println(l1.passWordValue);
        
        try {
            while(loginData.next())
            {
                userName = loginData.getString(2);
                passWord = loginData.getInt(3);

                if(l1.userNameValue.equals(userName)&& l1.passWordValue == passWord)
                {
                    System.out.println("You have Successfully logged in !!");
                }


            }
        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        
    }

        });
        
    
}

public static int charArrayToInteger(char[] array){
    String arr = new String(array);
    int number = Integer.parseInt(arr);

    return number;
}

   

    
}
