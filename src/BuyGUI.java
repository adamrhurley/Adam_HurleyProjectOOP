import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class BuyGUI extends JFrame implements ActionListener {

        String[] itemString = {"OnePlus 6","Samsung Galaxy Note 9","Huawei Mate 20 Pro","iPhone XS Max", "Google Pixel 3 XL"};
        JComboBox itemList = new JComboBox(itemString);   //https://www.youtube.com/watch?v=iOV_oaJhABQ

        public BuyGUI() {
            FlowLayout BuyLayout = new FlowLayout();

            setLayout(BuyLayout);

            setSize(500, 400);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            itemList.setSelectedIndex(1);

            itemList.addActionListener(this);

            add(itemList);

            JButton buyButton = new JButton("Buy");

            add(buyButton);

            setVisible(true);

            buyButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    CheckoutGUI checkoutgui = new CheckoutGUI();
                    checkoutgui.setVisible(true);
                }});
        }
        public void actionPerformed(ActionEvent e)
        {

        }
    }


