import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CheckoutGUI extends JFrame{

        JButton submit_btn;
        private String name;
        private String address;
        static String summary;
        JTextField nametxt = new JTextField();
        JTextField addresstxt = new JTextField();

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

            JButton submit_btn = new JButton("Submit");
            submit_btn.setBounds(180, 500, 120, 40);
            add(submit_btn);

            setVisible(true);




       submit_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String Submit = e.getActionCommand();
                if(e.getSource() == submit_btn || Submit.equals("Submit"))
                {
                    JOptionPane.showMessageDialog(null,"Order Received");

                    name =("");
                    address=("");

                    name = nametxt.getText().trim();
                    address = addresstxt.getText().trim();

                    summary = ("Customer Details: \n" + name) + ("\n" + address);

                   String Data = CheckoutGUI.summary;
                   try{
                       BufferedWriter reader = new BufferedWriter(new FileWriter(new File("C:\\Users\\t00198396\\Desktop\\OOPproject\\src\\checkout.txt"),true));
                        reader.write(Data);
                        reader.newLine();
                        reader.close();
                   }catch (IOException E)
                   {
                       JOptionPane.showMessageDialog(null,"Error!");
                   }
                }



                }

            } );
        }
}








