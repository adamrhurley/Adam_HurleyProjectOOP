import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class CheckoutGUI extends JFrame{

        public CheckoutGUI() {
            setLayout(null);
            setVisible(true);
            setBounds(200,100,700,600 );
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel name =new JLabel("Name : ");
            name.setBounds(50,50,100,30);
            add(name);

            JTextField nametxt=new JTextField();
            nametxt.setBounds(180,50,180,30);
            add(nametxt);

            JLabel phone =new JLabel("Phone Number : ");
            phone.setBounds(50,100,100,30);
            add(phone);

            JTextField phonetxt=new JTextField();
            phonetxt.setBounds(180,100,180,30);
            add(phonetxt);

            JLabel address=new JLabel("Address : ");
            address.setBounds(50,150,100,30);
            add(address);

            JTextField addresstxt=new JTextField();
            addresstxt.setBounds(180,150,180,30);
            add(addresstxt);

            JLabel towncity=new JLabel("Town/City : ");
            towncity.setBounds(50,200,100,30);
            add(towncity);

            JTextField towncitytxt=new JTextField();
            towncitytxt.setBounds(180,200,180,30);
            add(towncitytxt);

            JLabel postcode=new JLabel("Postcode : ");
            postcode.setBounds(50,250,100,30);
            add(postcode);

            JTextField postcodetxt=new JTextField();
            postcodetxt.setBounds(180,250,180,30);
            add(postcodetxt);

            JLabel country=new JLabel("Country : ");
            country.setBounds(50,300,100,30);
            add(country);

            JTextField countrytxt=new JTextField();
            countrytxt.setBounds(180,300,180,30);
            add(countrytxt);

            JButton submit_btn=new JButton("Submit");
            submit_btn.setBounds(180,500,120,40);
            add(submit_btn);

            setVisible(true);

            submit_btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null,"Order received");
                }});
        }



    }


