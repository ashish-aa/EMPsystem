package LoginAndReg;

import java.sql.*;
import java.awt.event.*;
import java.awt.*;


public class Main{
     static login l1;
     static String userName;
     static int passWord;
     static ResultSet loginData;
     static register r1;
     static String queryForLogin ;
    public static void main(String[] args) throws SQLException {
         l1 = new login();
       //  new register();

       //jdbc data

        String url = "jdbc:mysql://127.0.0.1:3306/MicroProject";
        String username = "root";
        String password = "Ashish@2003";
        
        String queryForReg = "insert into logReg(Username,Password) value()";

        //creating connection

        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        


        //added action event for login page submit buttton to submit values entered and evaluate further process

        l1.loginButton.addActionListener(new ActionListener(){
            @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //strong data retrived from text fields in local variables to access them later
        l1.userNameValue = l1.usernameTextField.getText();
        l1.array = l1.passwordTextfield.getPassword();
        l1.passWordValue = charArrayToInteger(l1.array);

        queryForLogin ="select * from logReg where Username='"+l1.userNameValue+"' and Password ='"+l1.passWordValue+"'";

        System.out.println(l1.userNameValue);
        System.out.println(l1.passWordValue);
        try {
            loginData = st.executeQuery(queryForLogin);
        } catch (SQLException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        }
        
        
            //checking whether data entered and data from database matches or not 
            
        try {
            if(loginData.next())
            {
                System.out.println("Logged in Successfully !!");
            }
            else{
                System.out.println("Username or Password doesn't match.");
            }
            
        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        
    }

        });

        l1.registerButton.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
              r1 =  new register();
            }
            
        });
        
    
}
// as password field supports getPassword method to return value entered which returns value as char[]. 
//such data cannot be directly casted to int, so at first it has to be convert into string and then typecasted into an integer. 
public static int charArrayToInteger(char[] array){
    String arr = new String(array);
    int number = Integer.parseInt(arr);

    return number;
}

   

    
}
