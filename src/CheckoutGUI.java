import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CheckoutGUI extends JFrame{

        JButton submit_btn;
        private String name;
        private String phoneNumber;
        private String address;
        private String towncity;
        private String postcode;
        private String country;
        private String cardNumber;
        private String expiryDate;
        private String cvv;


        static String summary;
        JTextField nametxt = new JTextField();
        JTextField addresstxt = new JTextField();
    //https://www.youtube.com/watch?v=a0JktV-EJBk
        public CheckoutGUI() {
            setLayout(null);
            setVisible(true);
            setLocationRelativeTo(null);
            setResizable(false);
            setBounds(200, 100, 700, 600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel namelbl = new JLabel("Name : ");
            namelbl.setBounds(50, 50, 100, 30);
            add(namelbl);


            nametxt.setBounds(180, 50, 180, 30);
            add(nametxt);

            JLabel phonelbl = new JLabel("Phone Number : ");
            phonelbl.setBounds(50, 100, 100, 30);
            add(phonelbl);

            JTextField phonetxt = new JTextField();
            phonetxt.setBounds(180, 100, 180, 30);
            add(phonetxt);

            JLabel addresslbl = new JLabel("Address : ");
            addresslbl.setBounds(50, 150, 100, 30);
            add(addresslbl);


            addresstxt.setBounds(180, 150, 180, 30);
            add(addresstxt);

            JLabel towncitylbl = new JLabel("Town/City : ");
            towncitylbl.setBounds(50, 200, 100, 30);
            add(towncitylbl);

            JTextField towncitytxt = new JTextField();
            towncitytxt.setBounds(180, 200, 180, 30);
            add(towncitytxt);

            JLabel postcodelbl = new JLabel("Postcode : ");
            postcodelbl.setBounds(50, 250, 100, 30);
            add(postcodelbl);

            JTextField postcodetxt = new JTextField();
            postcodetxt.setBounds(180, 250, 180, 30);
            add(postcodetxt);

            JLabel countrylbl = new JLabel("Country : ");
            countrylbl.setBounds(50, 300, 100, 30);
            add(countrylbl);

            JTextField countrytxt = new JTextField();
            countrytxt.setBounds(180, 300, 180, 30);
            add(countrytxt);

            JLabel cardNumlbl = new JLabel("Card Number : ");
            cardNumlbl.setBounds(50, 350, 100, 30);
            add(cardNumlbl);

            JTextField cardNumtxt = new JTextField();
            cardNumtxt.setBounds(180, 350, 180, 30);
            add(cardNumtxt);

            JLabel expirylbl = new JLabel("Expiry Date : ");
            expirylbl.setBounds(50, 400, 100, 30);
            add(expirylbl);

            JTextField expirytxt = new JTextField();
            expirytxt.setBounds(180, 400, 180, 30);
            add(expirytxt);

            JLabel cvvlbl = new JLabel("CVV : ");
            cvvlbl.setBounds(50, 450, 100, 30);
            add(cvvlbl);

            JTextField cvvtxt = new JTextField();
            cvvtxt.setBounds(180, 450, 180, 30);
            add(cvvtxt);

            JButton submit_btn = new JButton("Submit");
            submit_btn.setBounds(180, 500, 120, 40);
            add(submit_btn);

            setVisible(true);




       submit_btn.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {

                                           if (!nametxt.getText().isEmpty()) {
                                               if (!phonetxt.getText().isEmpty()) {
                                                   if (!addresstxt.getText().isEmpty()) {
                                                       if (!towncitytxt.getText().isEmpty()) {
                                                            if (!postcodetxt.getText().isEmpty()) {
                                                               if (!countrytxt.getText().isEmpty()) {
                                                                   if (!cardNumtxt.getText().isEmpty()) {
                                                                       if (!expirytxt.getText().isEmpty()) {
                                                                           if (!cvvtxt.getText().isEmpty()) {


                                                                               String Submit = e.getActionCommand();
                                                                               if (e.getSource() == submit_btn || Submit.equals("Submit"))


                                                                                   setVisible(false);
                                                                               JOptionPane.showMessageDialog(null, "Order Received");

                                                                               name = ("");
                                                                               phoneNumber = ("");
                                                                               address = ("");
                                                                               towncity = ("");
                                                                               postcode = ("");
                                                                               country = ("");
                                                                               cardNumber = ("");
                                                                               expiryDate = ("");
                                                                               cvv = ("");

                                                                               name = nametxt.getText().trim();
                                                                               phoneNumber = phonetxt.getText().trim();
                                                                               address = addresstxt.getText().trim();
                                                                               towncity = towncitytxt.getText().trim();
                                                                               postcode = postcodetxt.getText().trim();
                                                                               country = countrytxt.getText().trim();
                                                                               cardNumber = cardNumtxt.getText().trim();
                                                                               expiryDate = expirytxt.getText().trim();
                                                                               cvv = cvvtxt.getText().trim();
                                                                               summary = "Customer Details: \n" + "Name: " +  name + "\n" + "Phone Number: " + phoneNumber + "\n" + "Address: " + address + "\n" + "Town/City: " + towncity + "\n" + "Postcode: " + postcode + "\n" + "Country: " + country + "\n" + "Card Number: " + cardNumber + "\n" + "Expiry Date: " + expiryDate + "\n" + "CVV: " + cvv ;

                                                                               String Data = CheckoutGUI.summary;
                                                                               try {
                                                                                   BufferedWriter reader = new BufferedWriter(new FileWriter(new File("C:\\Users\\t00198396\\Desktop\\OOP\\src\\checkout.txt"), true));
                                                                                   reader.write(Data);
                                                                                   reader.newLine();
                                                                                   reader.close();
                                                                               } catch (Exception E) {
                                                                                   JOptionPane.showMessageDialog(null, "Error!");
                                                                               }
                                                                               HomeGUI homegui = new HomeGUI();
                                                                               homegui.setVisible(true);

                                                                           } else
                                                                               JOptionPane.showMessageDialog(null,"You Must Enter A CVV");
                                                                   }else
                                                                       JOptionPane.showMessageDialog(null,"Error: You Must Enter An Expiry Date");
                                                                    }else
                                                                        JOptionPane.showMessageDialog(null,"Error: You Must Enter A Card Number");
                                                                   }else
                                                                        JOptionPane.showMessageDialog(null, "Error: You Must Enter A Country");
                                                                } else
                                                                    JOptionPane.showMessageDialog(null, "Error: You Must Enter A Postcode");
                                                           } else
                                                                JOptionPane.showMessageDialog(null, "Error: You Must Enter A Town/City");
                                                        } else
                                                            JOptionPane.showMessageDialog(null, "Error: You Must Enter A Address");
                                                    } else
                                                        JOptionPane.showMessageDialog(null, "Error: You Must Enter A Phone Number");
                                                } else
                                                    JOptionPane.showMessageDialog(null, "Error: You Must Enter A Name");
                                            }
                                        }

                                );
                            }
}












