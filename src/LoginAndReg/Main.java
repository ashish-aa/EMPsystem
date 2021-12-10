package LoginAndReg;

import java.sql.*;
import java.util.Vector;
import java.awt.event.*;



import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Main{
    static String name;
    static String address;
    static String emailId;
    static long phoneNo ;
     static login l1;
     static String userName;
     static int passWord;
     static ResultSet loginData;
     static register r1;
     static String queryForLogin ;
     static String queryForReg;
      static int countOfRowsAffected;
      static EmpInfo emp;
      static String queryForaddEmp;
      static String queryForShowAllEmp;
      static String queryForShowEmp;

     
      
      static JTable jt;
      static ResultSet rs1 =null;
      static String Id;

      
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
                    emp = new EmpInfo();
                    System.out.println("Logged in Successfully !!");
                    l1.dispose();
                    emp.addEmpButton.addActionListener(new ActionListener()
                    {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // TODO Auto-generated method stub
                            emp.addEmp();

                            emp.addEmpSubmiButton.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                name = emp.addEmpNameTextField.getText();
                address = emp.addEmpAddressTextField.getText();
                emailId = emp.addEmpEmailTextField.getText();
                try{
                    phoneNo = Long.parseLong(emp.addEmpPhoneTextField.getText());

                }
                catch(NumberFormatException ex)
                {
                    System.out.println("We can catch NumbeFormat Exception.");
                }

                // System.out.println(emp.department);
                // System.out.println(phoneNo);




                queryForaddEmp = "insert into addEmp(Name,Department,Address,Email,Phone) values('"+name+"','"+emp.department+"','"+address+"','"+emailId+"','"+phoneNo+"')";
                
                if(name.length()<=0 && address.length()<=0 && emailId.length()<=0 && phoneNo == 0)
                {
                    JOptionPane.showMessageDialog(emp.addFrame,"Field values has been left blank, Please Enter the valid input in all required Fields.");

                }
                else if(name.length()<=0)
                {
                    JOptionPane.showMessageDialog(emp.addFrame,"Please Enter Name !");
                }
                else if(address.length()<=0)
                {
                    JOptionPane.showMessageDialog(emp.addFrame,"Please Enter Address !");
                }
                else if(emailId.length()<=0)
                {
                    JOptionPane.showMessageDialog(emp.addFrame,"Please Enter Email Id !");
                }
                else if(phoneNo == 0)
                {
                    JOptionPane.showMessageDialog(emp.addFrame,"Please Enter Phone number !");

                }
                else {

                    try {
                        countOfRowsAffected = st.executeUpdate(queryForaddEmp);
                    } catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    System.out.println(countOfRowsAffected+" row(s) affected.");
                    JOptionPane.showMessageDialog(emp.addFrame,"Submitted Successfully");
                    emp.addFrame.dispose();
                }
            }
            
        });

                            
                        }
                        
                    });

                    emp.searchEmpButton.addActionListener(new ActionListener(){

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // TODO Auto-generated method stub
                            emp.searchEmp();
                            emp.searchEmpShowAllButton.addActionListener(new ActionListener()
                            {

                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    // TODO Auto-generated method stub
                                    queryForShowAllEmp = "Select * from addEmp";
                            try {
                                rs1 = st.executeQuery(queryForShowAllEmp);
                            } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                            }
                            try {
                                ResultSetMetaData rsmt = rs1.getMetaData();
                                int c = rsmt.getColumnCount();
                                Vector column = new Vector(c);
                                for(int i =1 ;i<= c;i++)
                                {
                                    column.add(rsmt.getColumnName(i));
                                }

                                Vector data = new Vector();
                                Vector row  = new Vector();
                                while(rs1.next())
                                {
                                    row = new Vector(c);
                                    for(int i =1;i<=c;i++)
                                    {
                                        row.add(rs1.getString(i));
                                    }
                                    data.add(row);
                                    
                                }
                                System.out.println(data);
                                
                            JTable jt = new JTable(data,column);
                            JScrollPane jsp = new JScrollPane(jt);
                            jsp.setBounds(20,250, 350, 200);
                            emp.searchEmpPanel2.add(jsp);

                            } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                            }

                                }
                                
                            });

                            emp.searchEmpIdButton.addActionListener(new ActionListener()
                            {

                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    // TODO Auto-generated method stub

                                    Id = emp.searchEmpIdTextField.getText();
                                    queryForShowEmp = " select * from addEmp where EmpId ="+Id+" ";
                                    try {
                                        rs1 = st.executeQuery(queryForShowEmp);
                                    } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        e1.printStackTrace();
                                    }
                                    try {
                                        ResultSetMetaData rsmt = rs1.getMetaData();
                                        int c = rsmt.getColumnCount();
                                        Vector column = new Vector(c);
                                        for(int i =1 ;i<= c;i++)
                                        {
                                            column.add(rsmt.getColumnName(i));
                                        }
        
                                        Vector data = new Vector();
                                        Vector row  = new Vector();
                                        while(rs1.next())
                                        {
                                            row = new Vector(c);
                                            for(int i =1;i<=c;i++)
                                            {
                                                row.add(rs1.getString(i));
                                            }
                                            data.add(row);
                                            
                                        }
                                        System.out.println(data);
                                        
                                    JTable jt = new JTable(data,column);
                                    JScrollPane jsp = new JScrollPane(jt);
                                    jsp.setBounds(20,250, 500, 50);
                                    emp.searchEmpPanel1.add(jsp);
        
                                    } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        e1.printStackTrace();
                                    }

                                    
                                }
                                
                            });
                           
                            
                            



                        }

                    });

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