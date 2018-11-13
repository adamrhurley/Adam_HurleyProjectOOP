import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeGUI extends JFrame implements ActionListener {

    JButton buyButton;
     JButton searchButton;
    JButton compareButton;
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


  //      this.buyButton.addActionListener(this);
   //     this.searchButton.addActionListener(this);
     //   this.compareButton.addActionListener(this);


    }
    public void actionPerformed(ActionEvent e)
    {

       /* if(e.getSource() == buyButton)
        {

        }

        if(e.getSource() == searchButton)
        {

        }

        if(e.getSource() == compareButton)
        {

        }*/

    }
}
