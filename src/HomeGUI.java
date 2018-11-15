import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeGUI extends JFrame {//implements ActionListener {

    JButton buyButton;
    JButton searchButton;
    JButton compareButton;

    public static void main(String[] args) {
        HomeGUI homegui = new HomeGUI();
        homegui.setVisible(true);
    }

    public HomeGUI() {
        FlowLayout HomeLayout = new FlowLayout();

        setLayout(HomeLayout);

        setSize(400, 100);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton buyButton = new JButton("Buy");

        add(buyButton);

        JButton searchButton = new JButton("Search");

        add(searchButton);

        JButton compareButton = new JButton("Compare");

        add(compareButton);

        setVisible(true);


        buyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                setVisible(false);
                BuyGUI buygui = new BuyGUI();
                buygui.setVisible(true);
            }
        }); // end actionPerformed

        //this.searchButton.addActionListener(this);
        //this.compareButton.addActionListener(this);


    }
}
    /*public void actionPerformed(ActionEvent e)
    {

        if(e.getSource() == buyButton)
        {
           System.out.println("in buyButton");
           // setVisible(false);
            BuyGUI buygui = new BuyGUI();
            buygui.setVisible(true);
        }

        if(e.getSource() == searchButton)
        {

        }

        if(e.getSource() == compareButton)
        {

        }

    }
}*/
