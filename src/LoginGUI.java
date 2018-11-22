import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LoginGUI extends JFrame implements ActionListener {
    JTextField usernameField;
    JPasswordField passwordField;
    JButton LoginButton;

    public LoginGUI() {
        FlowLayout LoginLayout = new FlowLayout();

        setLayout(LoginLayout);

        setSize(400, 100);

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
    }

    public void actionPerformed(ActionEvent e) {
        if (!usernameField.getText().isEmpty()) {
            if (!passwordField.getText().isEmpty()) {

                if (e.getSource() == usernameField) {

                    passwordField.requestFocus();
                }

                if (e.getSource() == passwordField) {
                    setVisible(false);
                    HomeGUI phonegui = new HomeGUI();
                    phonegui.setVisible(true);

                }
                if (e.getSource() == LoginButton) {
                    setVisible(false);
                    HomeGUI phonegui = new HomeGUI();
                    phonegui.setVisible(true);
                }
            }else JOptionPane.showMessageDialog(null,"Please enter a password");
            } else JOptionPane.showMessageDialog(null, "Please enter a user name");
        }
    }





