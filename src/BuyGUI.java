import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BuyGUI extends JFrame implements ActionListener {
    JPanel p = new JPanel();
    JPanel p2 = new JPanel();
    JTextArea textArea = new JTextArea(20,50);
    JScrollPane scrollPane = new JScrollPane(textArea);
    String[] itemString = {"OnePlus 6","Samsung Galaxy Note 9","Huawei Mate 20 Pro","iPhone XS Max", "Google Pixel 3 XL","Nokia 3310"};
    JComboBox itemList = new JComboBox(itemString);   //https://www.youtube.com/watch?v=iOV_oaJhABQ

        public BuyGUI() {
            BorderLayout buyLayout = new BorderLayout();

            setLayout(buyLayout);

            setSize(700, 500);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            p.setPreferredSize(new Dimension(300,50));

            add(p,BorderLayout.NORTH);

            p2.add(scrollPane);

            add(p2,BorderLayout.CENTER);

            itemList.setSelectedIndex(0);

            itemList.addActionListener(this);

            p.add(itemList,BorderLayout.NORTH);

            JButton buyButton = new JButton("Buy");

            buyButton.setBounds(180, 500, 120, 40);

            p.add(buyButton,BorderLayout.NORTH);

            JButton home_btn = new JButton("Home");

            home_btn.setBounds(180, 500, 120, 40);

            p.add(home_btn,BorderLayout.NORTH);

            setVisible(true);

            home_btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e)
                {
                    setVisible(false);
                    HomeGUI homegui = new HomeGUI();
                    homegui.setVisible(true);
                }
            }
            );

            buyButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    CheckoutGUI checkoutgui = new CheckoutGUI();
                    checkoutgui.setVisible(true);
                }
            }
            );
        }
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == itemList)
            {
                int indexSelected = itemList.getSelectedIndex();
                newPhone.createPhone();
                ArrayList<newPhone> allPhones = newPhone.getAllPhones();

                newPhone np = allPhones.get(indexSelected);

                textArea.setEditable(false);

                textArea.setText(String.valueOf(np));

                revalidate();//JB
            }
        }
    }


