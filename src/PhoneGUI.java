import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PhoneGUI{
    JTextField usernameField;
    JPasswordField passwordField;
    JButton LoginButton;
    JFrame home;
    JFrame login;

    public PhoneGUI()
    {
        login = new JFrame("Authentication");

        FlowLayout LoginLayout = new FlowLayout();

        login.setLayout(LoginLayout);

        login.setSize(400,100);

        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel usernameLabel = new JLabel("Username:");

        login.add(usernameLabel);

        usernameField = new JTextField(10);

        login.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");

        login.add(passwordLabel);

        passwordField = new JPasswordField(10);

        login.add(passwordField);

        LoginButton = new JButton("Login");

        login.add(LoginButton);

        TextFieldEventHandler loginHandler = new TextFieldEventHandler();

        ButtonEventHandler loginButtonHandler = new  ButtonEventHandler();

        usernameField.addActionListener(loginHandler);
        passwordField.addActionListener(loginHandler);
        LoginButton.addActionListener(loginButtonHandler);

        login.setVisible(true);

        //////////////////////////////////////////////////////////////////////////////////

        home = new JFrame("Home");

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

        ButtonEventHandler homeHandler = new  ButtonEventHandler();


        buyButton.addActionListener(homeHandler);
        searchButton.addActionListener(homeHandler);
        compareButton.addActionListener(homeHandler);




    }

    private class TextFieldEventHandler implements ActionListener{

        public void actionPerformed(ActionEvent e)
        {

            if(e.getSource() == usernameField)
            {

                passwordField.requestFocus();
            }

          /*  if(e.getSource() == passwordField)
            {
                    JOptionPane.showMessageDialog(null,"Welcome to the system " +
                                    usernameField.getText(),"Authenticated",
                            JOptionPane.INFORMATION_MESSAGE);

            }*/

        }
    }

    private class ButtonEventHandler implements ActionListener{

        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == LoginButton)
            {
                login.setVisible(false);
                home.setVisible(true);
            }

        }
    }

}






