import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class BuyGUI extends JFrame implements ActionListener {

        JButton buyButton;
        JButton searchButton;
        JButton compareButton;
        String[] itemString = {"OnePlus 6","Samsung Galaxy Note 9","Huawei Mate 20 Pro","iPhone XS Max", "Google Pixel 3 XL"};
        JComboBox itemList = new JComboBox(itemString);   //https://www.youtube.com/watch?v=iOV_oaJhABQ

        public static void main(String[] args) {
            BuyGUI buygui = new BuyGUI();
            buygui.setVisible(true);
        }
        public BuyGUI() {
            FlowLayout BuyLayout = new FlowLayout();

            setLayout(BuyLayout);

            setSize(500, 400);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            itemList.setSelectedIndex(1);

            itemList.addActionListener(this);

            add(itemList);

            setVisible(true);

        }
        public void actionPerformed(ActionEvent e)
        {

        }
    }


