import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeGUI extends JFrame {
    public HomeGUI() {
        FlowLayout HomeLayout = new FlowLayout();

        setLayout(HomeLayout);

        setSize(400, 100);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton buyButton = new JButton("Buy");

        add(buyButton);

        JButton compareButton = new JButton("Compare");

        add(compareButton);

        setVisible(true);

        buyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                BuyGUI buygui = new BuyGUI();
                buygui.setVisible(true);}
            }
        );

       compareButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                CompareGUI comparegui = new CompareGUI();
                comparegui.setVisible(true);}
            }
        );
    }
}

