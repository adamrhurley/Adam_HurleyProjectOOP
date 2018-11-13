import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PhoneGUI extends JFrame implements ActionListener{
    JTextField usernameField;
    JPasswordField passwordField;
    JButton LoginButton;
    //JButton buyButton;
   // JButton searchButton;
   //JButton compareButton;



    public PhoneGUI()
    {
        //login = new JFrame("Authentication");

        FlowLayout LoginLayout = new FlowLayout();

        setLayout(LoginLayout);

        setSize(400,100);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel usernameLabel = new JLabel("Username:");

        add(usernameLabel);

        usernameField = new JTextField(10);

        add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");

        add(passwordLabel);

        passwordField = new JPasswordField(10);

        add(passwordField);

        LoginButton = new JButton("Login");

        add(LoginButton);

        this.usernameField.addActionListener(this);
        this.passwordField.addActionListener(this);
        this.LoginButton.addActionListener(this);



        setVisible(true);

        //////////////////////////////////////////////////////////////////////////////////

       /* home = new JFrame("Home");

        FlowLayout HomeLayout = new FlowLayout();

        home.setLayout(HomeLayout);

        home.setSize(400,100);

        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton buyButton = new JButton("Buy");

        home.add(buyButton);

        JButton searchButton = new JButton("Search");

        home.add(searchButton);

        JButton compareButton = new JButton("Compare");

        home.add(compareButton);

        //ButtonEventHandler homeHandler = new  ButtonEventHandler();

        this.buyButton.addActionListener(this);
        this.searchButton.addActionListener(this);
        this.compareButton.addActionListener(this);
        //buyButton.addActionListener(homeHandler);
        //searchButton.addActionListener(homeHandler);
        //compareButton.addActionListener(homeHandler);
*/



    }/*
    public PhoneGUI2() {
        // home = new JFrame("Home");

        FlowLayout HomeLayout = new FlowLayout();

        setLayout(HomeLayout);

        setSize(400, 100);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton buyButton = new JButton("Buy");

        add(buyButton);

        JButton searchButton = new JButton("Search");

        add(searchButton);

        JButton compareButton = new JButton("Compare");

        add(compareButton);

        //ButtonEventHandler homeHandler = new  ButtonEventHandler();

        this.buyButton.addActionListener(this);
        this.searchButton.addActionListener(this);
        this.compareButton.addActionListener(this);


    }*/



        public void actionPerformed(ActionEvent e)
        {

            if(e.getSource() == usernameField)
            {

                passwordField.requestFocus();
            }

            if(e.getSource() == passwordField)
            {
                    JOptionPane.showMessageDialog(null,"Welcome to the system " +
                                    usernameField.getText(),"Authenticated",
                            JOptionPane.INFORMATION_MESSAGE);

            }
            if(e.getSource() == LoginButton)
            {
                setVisible(false);
               //   PhoneGUI2();
            }

        }
    }

