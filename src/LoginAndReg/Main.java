package LoginAndReg;

import java.sql.*;
import java.awt.event.*;



import java.awt.*;
import javax.swing.JOptionPane;


public class Main{
     static login l1;
     static String userName;
     static int passWord;
     static ResultSet loginData;
     static register r1;
     static String queryForLogin ;
     static String queryForReg;
      static int countOfRowsAffected;
    public static void main(String[] args) throws SQLException {
         l1 = new login();
       //  new register();

       //jdbc data

        String url = "jdbc:mysql://127.0.0.1:3306/MicroProject";
        String username = "root";
        String password = "Ashish@2003";
        
        

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
                 int n = JOptionPane.showConfirmDialog(l1, 
                 "Logged in Successfully !!", "Login", JOptionPane.DEFAULT_OPTION);
                if(n != JOptionPane.DEFAULT_OPTION)
                {
                    System.out.println("Logged in Successfully !!");
                    l1.dispose();

                }
                
               
            }
            else{
                JOptionPane.showMessageDialog(l1,"Username or Password doesn't match.");
                System.out.println("Username or Password doesn't match.");
            }
            
        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        
    }

        });

        //event created for when Register button on login page is clicked,
        //register window should appear
        l1.registerButton.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
              r1 =  new register();
              
              //event for Submit button on register window, for when it clicked data entered in textfields 
              //should be stored in database. and return the value of rows affected for our understanding that,
              //data is successfully stored in the database.
              r1.registerButton.addActionListener(new ActionListener()
              {
      
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      // TODO Auto-generated method stub
                      //retriving data entered in the textfields and storing them in register class local variables.
                      r1.userNameValue = r1.userNameTextField.getText();
                      r1.passWordValue = Integer.parseInt(r1.passWordTextField.getText());
                      //query statment which will insert the data which was stored in the local variables to database.
                       queryForReg = "insert into logReg(Username,Password) value('"+r1.userNameValue+"',"+r1.passWordValue+")";
                       System.out.println(r1.userNameValue);
                       System.out.println(r1.passWordValue);
                       try {
                           // method executeUpdate executes the query statement to insert data,
                           //unlike executeQuery method which was returning resultset object value,
                           //this returns int value of rows affected after execution of query.
                          countOfRowsAffected = st.executeUpdate(queryForReg);
                          JOptionPane.showMessageDialog(r1,"User registered successfully.");
                          System.out.println(countOfRowsAffected+" row(s) affected." );
                      } catch (SQLException e1) {
                          // TODO Auto-generated catch block
                          e1.printStackTrace();
                      }
      
                  }
              
              });

             
              
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


























































































































// though I don't really understand yet why is sql exception is getting created , ide is asking to add try catch and surround that specific block with it to resolve this issue, thats the only reason behind it 