import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 *This program implements an application that allows the user to compare and purchase phones
 *
 * @author  Adam Hurley
 * @version 1.0
 * @since   26-11-2018
 */

public class CompareGUI extends JFrame implements ActionListener {

    JPanel p = new JPanel();
    JPanel p2 = new JPanel();

    JTextArea textArea = new JTextArea(20,50); //added by JB as global instances to ensure they can just continually be rewritten on
    JTextArea textArea1 = new JTextArea(20,50); //for the "Compare" option

    JScrollPane scrollPane = new JScrollPane(textArea); //code moved by JB to make global for similar reasons to above
    JScrollPane scrollPane1 = new JScrollPane(textArea1); //as you just want to create these components once and rewrite to them

    String[] itemString = {"OnePlus 6","Samsung Galaxy Note 9","Huawei Mate 20 Pro","iPhone XS Max", "Google Pixel 3 XL","Nokia 3310"};
    JComboBox itemList = new JComboBox(itemString);   //https://www.youtube.com/watch?v=iOV_oaJhABQ
    JComboBox itemList2 = new JComboBox(itemString);

    public CompareGUI() {
        /** This method is used to create the graphical user interface and add various items
         * including JButtons and JComboBoxes.
         */
        BorderLayout CompareLayout = new BorderLayout();

        setLayout(CompareLayout);

        setSize(1700, 600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p.setPreferredSize(new Dimension(300,50));

        add(p,BorderLayout.NORTH);

        p2.add(scrollPane);

        p2.add(scrollPane1);

        add(p2,BorderLayout.CENTER);

        itemList.setSelectedIndex(0);

        itemList.addActionListener(this);

        p.add(itemList,BorderLayout.NORTH);

        itemList2.setSelectedIndex(0);

        itemList2.addActionListener(this);

        p.add(itemList2,BorderLayout.NORTH);

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
    }

    public void actionPerformed(ActionEvent e)
    {/**
     *This method allows the program to perform actions based on input from the user.
     */
        if(e.getSource() == itemList)
    {
        /*JB added code to retrieve a combo-box selected index value and use this to
         *index into the corresponding slot of the allNewPhones array and display the contents of
         *this newPhone object to the console for test purposes*/

        int indexSelected = itemList.getSelectedIndex();
        newPhone.createPhone();
        ArrayList<newPhone> allPhones = newPhone.getAllPhones();

        newPhone np = allPhones.get(indexSelected);

        //small modifications by JB here to ensure multiple text-areas are not created and added to GUI
        textArea.setEditable(false);

        textArea.setText(String.valueOf(np));

        revalidate();
    }

        if(e.getSource() == itemList2)
        {
            //small modifications by JB to ensure multiple text-areas are not created and added to GUI

            int indexSelected = itemList2.getSelectedIndex();
            newPhone.createPhone();
            ArrayList<newPhone> allPhones = newPhone.getAllPhones();
            newPhone np = allPhones.get(indexSelected);

            textArea1.setEditable(false);
            textArea1.setText(String.valueOf(np));
            revalidate();
        }
    }
}




