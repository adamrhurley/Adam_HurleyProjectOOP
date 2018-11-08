//Exercise2.java
/*This program uses a text-field and a password-field to retrieve a username/password
 *combination from the user and decide if it is valid*/

//using the shorthand * to save us lots of typing time
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PhoneGUI{
    //the "global" object references (needed by actionPerformed())
    JTextField usernameField;
    JPasswordField passwordField;

    public PhoneGUI()
    {
        JFrame login = new JFrame("Authentication");

        FlowLayout LoginLayout = new FlowLayout();

        login.setLayout(LoginLayout);

        login.setSize(600,300);

        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel usernameLabel = new JLabel("Username:");

        login.add(usernameLabel);

        usernameField = new JTextField(10);

        login.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");

        login.add(passwordLabel);

        passwordField = new JPasswordField(10);

        login.add(passwordField);

        JButton LoginButton = new JButton("Login");

        login.add(LoginButton);

        TextFieldEventHandler loginHandler = new TextFieldEventHandler();


        usernameField.addActionListener(loginHandler);
        passwordField.addActionListener(loginHandler);
        LoginButton.addActionListener(loginHandler);

        //login.setVisible(true);



        JFrame home = new JFrame("Home");

        FlowLayout HomeLayout = new FlowLayout();

        home.setLayout(HomeLayout);

        home.setSize(600,300);

        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton buyButton = new JButton("Buy");

        home.add(buyButton);

        JButton searchButton = new JButton("Search");

        home.add(searchButton);

        JButton compareButton = new JButton("Compare");

        home.add(compareButton);

        ButtonEventHandler homeHandler = new  ButtonEventHandler();


        buyButton.addActionListener(homeHandler);
        searchButton.addActionListener(homeHandler);
        compareButton.addActionListener(homeHandler);

        home.setVisible(true);


    }



    public static void main(String args[])
    {
       PhoneGUI guiApp = new PhoneGUI();
    }


    private class TextFieldEventHandler implements ActionListener{

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

        }
    }

    private class ButtonEventHandler implements ActionListener{

        public void actionPerformed(ActionEvent e)
        {

            if(e.getSource() == usernameField)
            {

                passwordField.requestFocus();
            }

            if(e.getSource() == passwordField)
            {

                // char[] passwordCharacters = passwordField.getPassword();




                JOptionPane.showMessageDialog(null,"Welcome to the system " +
                                usernameField.getText(),"Authenticated",
                        JOptionPane.INFORMATION_MESSAGE);

            }

        }
    }

}






