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

            JLabel name_lbl=new JLabel("Name : ");
            name_lbl.setBounds(50,80,100,30);
            add(name_lbl);

            JTextField name_txt=new JTextField();
            name_txt.setBounds(180,80,180,30);
            add(name_txt);

            JButton submit_btn=new JButton("Submit");
            submit_btn.setBounds(180,500,120,40);
            add(submit_btn);

            setVisible(true);

            submit_btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null,"Order recieved");
                }});
        }



    }


