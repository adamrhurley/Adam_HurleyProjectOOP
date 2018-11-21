import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class CompareGUI extends JFrame implements ActionListener {

        JButton home_btn;
        String[] itemString = {"OnePlus 6","Samsung Galaxy Note 9","Huawei Mate 20 Pro","iPhone XS Max", "Google Pixel 3 XL"};
        JComboBox itemList = new JComboBox(itemString);   //https://www.youtube.com/watch?v=iOV_oaJhABQ
        JComboBox itemList2 = new JComboBox(itemString);

        public CompareGUI() {
            FlowLayout CompareLayout = new FlowLayout();

            setLayout(CompareLayout);

            setSize(500, 400);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            itemList.setSelectedIndex(1);

            itemList.addActionListener(this);

            add(itemList);

            itemList2.setSelectedIndex(1);

            itemList2.addActionListener(this);

            add(itemList2);

            JButton home_btn = new JButton("Home");
            home_btn.setBounds(180, 500, 120, 40);
            add(home_btn);

            setVisible(true);
            home_btn.addActionListener(new ActionListener() {
                                           public void actionPerformed(ActionEvent e)
                                           {

                                               setVisible(false);
                                               HomeGUI homegui = new HomeGUI();
                                               homegui.setVisible(true);
                                           }
        });
        }

        public void actionPerformed(ActionEvent e)
       {
           if(e.getSource() == itemList)
           {
               int indexSelected = itemList.getSelectedIndex();
               System.out.println(indexSelected);
               //newPhone np = allPhones.get(indexSelected);
              // System.out.println(np);
           }
        }
    }


