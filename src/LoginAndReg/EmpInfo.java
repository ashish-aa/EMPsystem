package LoginAndReg;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



import java.util.*;
import java.text.*;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class EmpInfo extends JFrame {
    JPanel panel1;
    JPanel panel2;
    JLabel welcomeLabel;
    JLabel projectName1;
    JLabel projectName3;
    JLabel projectName2;
    JButton addEmpButton;
   // JButton editEmpButton;
    JButton searchEmpButton;
    JLabel selectOptionLabel;
    JPanel addEmpPanel1;
    JPanel addEmpPanel2;
    JLabel addEmpName;
    JLabel addEmpAddress;
    JLabel addEmpDepartment;
    JLabel addEmpEmail;
    JLabel addEmpPhone;
    JLabel addEmpRegisterEmp;
    JTextField addEmpNameTextField;
    JTextField addEmpAddressTextField;
    JComboBox addEmpDepartmentBox;
    JTextField addEmpEmailTextField;
    JTextField addEmpPhoneTextField;
    JButton addEmpSubmiButton;
    JFrame addFrame;
    JFrame searchFrame;
    JPanel searchEmpPanel1;
    JPanel searchEmpPanel2;
    JLabel searchEmpFindEmp;
    JLabel searchEmpIdLabel;
    JTextField searchEmpIdTextField;
    JButton searchEmpIdButton;
    JLabel searchEmpShowAllLabel;
    JButton searchEmpShowAllButton;
    String department;
    ImageIcon image;
    
    
    // JFrame editEmpFrame;
    // JPanel editEmpPanel1;
    // JPanel editEmpPanel2;
    // JLabel editEmpIdLabel;
    // JTextField editEmpIdTextField;
    // JButton editEmpIdButton;
    // JComboBox editEmpColumn;
    // JButton editEmpColumnButton;
    // JTextField editEmpNewValueField;
    public EmpInfo()
    {
        this.setVisible(true);
        this.setSize(1000,800);
        this.setTitle("Home Page");
        this.getContentPane().setBackground(new Color(52,52,52));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        image = new ImageIcon("F:\\Ad. Java\\MicroProject\\src\\LoginAndReg\\arcreactor.png");
        this.setIconImage(image.getImage());


        panel1 = new JPanel();
        panel2 = new JPanel();
        welcomeLabel = new JLabel("Welcome.");
        projectName1 = new JLabel("Employee");
        projectName2 = new JLabel("Management System.");
        addEmpButton = new JButton("Add EMP");
      //  editEmpButton = new JButton("Edit EMP");
        searchEmpButton = new JButton("Search EMP");
        selectOptionLabel = new JLabel("Select Operation.");
        
        






        panel1.setBounds(0,0,600,800);
        panel2.setBounds(600,0,400,800);
        welcomeLabel.setBounds(110,150,400,100);
        projectName1.setBounds(180,300,250,100);
        projectName2.setBounds(80,350,480,100);
        addEmpButton.setBounds(150,250,100,40);
        //editEmpButton.setBounds(150,350,100,40);
        searchEmpButton.setBounds(143,350,120,40);
        selectOptionLabel.setBounds(130,150,150,30);
        panel1.setLayout(null);
        panel2.setLayout(null);



        panel2.setBackground(new Color(40,40,43));
        panel1.setBackground(new Color(96,80,220));
        welcomeLabel.setFont(new Font("Segoe Script",Font.ITALIC,80));
        welcomeLabel.setForeground(Color.WHITE);
        projectName1.setFont(new Font("Arial Black",Font.ITALIC,40));
        projectName2.setFont(new Font("Arial Black",Font.ITALIC,40));
        projectName1.setForeground(new Color(0,255,127));
        projectName2.setForeground(new Color(0,255,127));
        selectOptionLabel.setForeground(Color.WHITE);
        selectOptionLabel.setFont(new Font("Georgia",Font.BOLD,15));






        this.add(panel1);
        this.add(panel2);
        panel1.add(welcomeLabel);
        panel1.add(projectName1);
        panel1.add(projectName2);
        panel2.add(addEmpButton);
       // panel2.add(editEmpButton);
        panel2.add(searchEmpButton);
        panel2.add(selectOptionLabel);


        




    }

    public void addEmp()
    {
        addFrame = new JFrame("Employee Registration.");
        addFrame.setVisible(true);
        addFrame.setSize(1000,800);
        addFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addFrame.setLayout(null);
        image = new ImageIcon("F:\\Ad. Java\\MicroProject\\src\\LoginAndReg\\arcreactor.png");
        addFrame.setIconImage(image.getImage());


        addEmpPanel1 = new JPanel();
        addEmpPanel2 = new JPanel();
        addEmpPanel1.setLayout(null);
        addEmpPanel2.setLayout(null);
        addEmpName = new JLabel("Name : ");
        addEmpAddress = new JLabel("Address : ");
        addEmpDepartment = new JLabel("Department : ");
        addEmpEmail = new JLabel("Email : ");
        addEmpPhone = new JLabel("Phone no. : ");
        addEmpRegisterEmp = new JLabel("Register an Employee.");
        addEmpNameTextField = new JTextField();
        addEmpAddressTextField = new JTextField();
        addEmpDepartmentBox = new JComboBox();
        addEmpDepartmentBox.addItem("Select");
        addEmpDepartmentBox.addItem("R & D");
        addEmpDepartmentBox.addItem("QC");
        addEmpDepartmentBox.addItem("HR");
        addEmpDepartmentBox.addItem("Accounting");
        addEmpEmailTextField = new JTextField();
        addEmpPhoneTextField = new JTextField();
        addEmpSubmiButton = new JButton("Submit");
        projectName1 = new JLabel("Employee");
        projectName2 = new JLabel("Management");
        projectName3 = new JLabel("System.");







        addEmpPanel1.setBounds(0,0,600,800);
        addEmpPanel2.setBounds(600,0,400,800);
        addEmpRegisterEmp.setBounds(180,20,400,100);
        addEmpName.setBounds(50,150,80,30);
        addEmpNameTextField.setBounds(200,150,300,30);
        addEmpAddress.setBounds(50,220,80,30);
        addEmpAddressTextField.setBounds(200,220,300,30);
        addEmpDepartment.setBounds(50,290,80,30);
        addEmpDepartmentBox.setBounds(200,290,300,30);
        addEmpEmail.setBounds(50,360,80,30);
        addEmpEmailTextField.setBounds(200,360,300,30);
        addEmpPhone.setBounds(50,430,80,30);
        addEmpPhoneTextField.setBounds(200,430,300,30);
        addEmpSubmiButton.setBounds(250,550,100,40);
        projectName1.setBounds(70,150,500,150);
        projectName2.setBounds(20,250,360,100);
        projectName3.setBounds(80,330,400,100);





        addEmpPanel1.setBackground(new Color(255,64,64));
        addEmpPanel2.setBackground(new Color(52,52,52));
        addEmpRegisterEmp.setFont(new Font("Arial Black",Font.PLAIN,20));
        addEmpRegisterEmp.setForeground(Color.BLACK);
        addEmpName.setForeground(Color.white);
        addEmpAddress.setForeground(Color.white);
        addEmpDepartment.setForeground(Color.white);
        addEmpEmail.setForeground(Color.WHITE);
        addEmpPhone.setForeground(Color.WHITE);
        projectName1.setForeground(Color.white);
        projectName2.setForeground(Color.white);
        projectName3.setForeground(Color.WHITE);
        projectName1.setFont(new Font("Arial Black",Font.ITALIC,48));
        projectName2.setFont(new Font("Arial Black",Font.ITALIC,48));
        projectName3.setFont(new Font("Arial Black",Font.ITALIC,48));



        addFrame.add(addEmpPanel1);
        addFrame.add(addEmpPanel2);
        addEmpPanel1.add(addEmpRegisterEmp);
        addEmpPanel1.add(addEmpName);
        addEmpPanel1.add(addEmpNameTextField);
        addEmpPanel1.add(addEmpAddress);
        addEmpPanel1.add(addEmpAddressTextField);
        addEmpPanel1.add(addEmpDepartment);
        addEmpPanel1.add(addEmpDepartmentBox);
        addEmpPanel1.add(addEmpEmail);
        addEmpPanel1.add(addEmpEmailTextField);
        addEmpPanel1.add(addEmpPhone);
        addEmpPanel1.add(addEmpPhoneTextField);
        addEmpPanel1.add(addEmpSubmiButton);
        addEmpPanel2.add(projectName1);
        addEmpPanel2.add(projectName2);
        addEmpPanel2.add(projectName3);

        addEmpNameTextField.addKeyListener(new KeyListener()
        {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub

                char c = e.getKeyChar();

                if(Character.isLetter(c)|| Character.isWhitespace(c)|| Character.isISOControl(c))
                {
                    addEmpNameTextField.setEditable(true);
                }
                else{
                    addEmpNameTextField.setEditable(false);
                }

                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });

        addEmpAddressTextField.addKeyListener(new KeyListener()
        {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                 char c = e.getKeyChar();

                 if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
                 {
                     addEmpAddressTextField.setEditable(true);
                 }
                 else{
                     addEmpAddressTextField.setEditable(false);
                 }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });

        addEmpEmailTextField.addKeyListener(new KeyListener()
        {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub

                char c = e.getKeyChar();

                if(Character.isWhitespace(c))
                { 
                    addEmpEmailTextField.setEditable(false);
                }
                else{
                   addEmpEmailTextField.setEditable(true);
                }
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });


        addEmpPhoneTextField.addKeyListener(new KeyListener()
        {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                String phoneNumber = addEmpPhoneTextField.getText();
                int length = phoneNumber.length();
                char c= e.getKeyChar();

                if(e.getKeyChar()>='0'&& e.getKeyChar()<='9')
                {
                    //checking for 10 digits
                    if(length<10)
                    {
                        addEmpPhoneTextField.setEditable(true);
                    }
                    else{
                        addEmpPhoneTextField.setEditable(false);
                    }
                }
                else{
                    //allowing backspace , delete for editing
                    if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE ||e.getExtendedKeyCode()==KeyEvent.VK_DELETE)
                    {
                        addEmpPhoneTextField.setEditable(true);

                    }
                    else{
                        addEmpPhoneTextField.setEditable(false);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });


        addEmpDepartmentBox.addItemListener(new ItemListener() {
            {

            }

            @Override
            public void itemStateChanged(ItemEvent e) {
                // TODO Auto-generated method stub
                if(e.getSource() == addEmpDepartmentBox)
                {
                    department = (String) addEmpDepartmentBox.getSelectedItem();
                }
            }
        });




    }

    public void searchEmp()
    {
        searchFrame = new JFrame("Search Employee.");
        searchFrame.setVisible(true);
        searchFrame.setSize(1000,800);
        searchFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        searchFrame.setLayout(null);
        image = new ImageIcon("F:\\Ad. Java\\MicroProject\\src\\LoginAndReg\\arcreactor.png");
        searchFrame.setIconImage(image.getImage());


        searchEmpPanel1 = new JPanel();
        searchEmpPanel2 = new JPanel();
        searchEmpFindEmp = new JLabel("Find an Employee.");
        searchEmpIdLabel = new JLabel("Enter the EMP ID : ");
        searchEmpIdTextField = new JTextField();
        searchEmpIdButton = new JButton("Submit");
        searchEmpShowAllLabel = new JLabel("Show all Data : ");
        searchEmpShowAllButton = new JButton("Submit");



        searchEmpPanel1.setBounds(0,0,600,800);
        searchEmpPanel2.setBounds(600,0,400,800);
        searchEmpPanel1.setLayout(null);
        searchEmpPanel2.setLayout(null);
        searchEmpFindEmp.setBounds(180,20,400,100);
        searchEmpIdLabel.setBounds(50,150,150,30);
        searchEmpIdTextField.setBounds(200,150,150,30);
        searchEmpIdButton.setBounds(400,150,80,30);
        searchEmpShowAllLabel.setBounds(50,290,150,30);
        searchEmpShowAllButton.setBounds(200,290,80,30);



        searchEmpPanel1.setBackground(new Color(255,64,64));
        searchEmpPanel2.setBackground(new Color(52,52,52));
        searchEmpFindEmp.setFont(new Font("Arial Black",Font.PLAIN,20));
        searchEmpFindEmp.setForeground(Color.BLACK);
        searchEmpIdLabel.setForeground(Color.white);
        searchEmpShowAllLabel.setForeground(Color.WHITE);
        




        searchFrame.add(searchEmpPanel1);
        searchFrame.add(searchEmpPanel2);
        searchEmpPanel1.add(searchEmpFindEmp);
        searchEmpPanel1.add(searchEmpIdLabel);
        searchEmpPanel1.add(searchEmpIdTextField);
        searchEmpPanel1.add(searchEmpIdButton);
        searchEmpPanel1.add(searchEmpShowAllLabel);
        searchEmpPanel1.add(searchEmpShowAllButton);

    }

    // public void editEmp()
    // {
    //     editEmpFrame = new JFrame("Edit Data.");
    //     editEmpFrame.setVisible(true);
    //     editEmpFrame.setSize(1000,800);
    //     editEmpFrame.setLayout(null);
    //     editEmpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //     editEmpPanel1 = new JPanel();
    //     editEmpPanel2 = new JPanel();

    //     editEmpPanel1.setBounds(0,0,600,800);
    //     editEmpPanel2.setBounds(600,0,400,800);
    //     editEmpPanel1.setLayout(null);
    //     editEmpPanel2.setLayout(null);


    //     editEmpPanel1.setBackground(new Color(255,64,64));
    //     editEmpPanel2.setBackground(new Color(52,52,52));




    //     editEmpFrame.add(editEmpPanel1);
    //     editEmpFrame.add(editEmpPanel2);



    // }
}
