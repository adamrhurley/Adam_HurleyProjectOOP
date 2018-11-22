import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CompareGUI extends JFrame implements ActionListener {
        JTextArea textArea;
        JTextArea textArea1;
        JButton home_btn;
        String[] itemString = {"OnePlus 6","Samsung Galaxy Note 9","Huawei Mate 20 Pro","iPhone XS Max", "Google Pixel 3 XL","Nokia 3310"};
        JComboBox itemList = new JComboBox(itemString);   //https://www.youtube.com/watch?v=iOV_oaJhABQ
        JComboBox itemList2 = new JComboBox(itemString);

        public CompareGUI() {
            FlowLayout CompareLayout = new FlowLayout();

            setLayout(CompareLayout);

            setSize(1000, 1000);

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

           // textArea = new JTextArea(5, 20);
       //     textArea.setEditable(false);
         //   textArea.setBounds(580, 0, 120, 40);
          //  JScrollPane scrollPane = new JScrollPane(textArea);


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
          // if(e.getSource() == itemList)
          // {
            //   int indexSelected = itemList.getSelectedIndex();
           //    System.out.println(indexSelected);
               //newPhone np = allPhones.get(indexSelected);
              // System.out.println(np);
               if(e.getSource() == itemList)
               {

                   /*JB added code to retrieve a combo-box selected index value and use this to
                    *index into the corresponding slot of the allNewPhones array and display the contents of
                    *this newPhone object to the console for test purposes*/

                   /*JB Advice - Ideally, you would be adding Phone objects to the application through a GUI
                    *rather than hard-coding them within the newPhone class. You would also have "amend phone"
                    *and "delete phone" options available on the main GUI to allow you to add/amend/delete Phone
                    *objects. Each new Phone object would then be added to an array list of Phone and ultimately
                    *this would then be saved to a file on disk called e.g. phones.dat
                    *
                    *The contents of this file would be retrieved when the application launches, after the
                    *user supplies the correct username/password combo. It would then be loaded into an
                    *array list of Phone object for further processing*/

                   int indexSelected = itemList.getSelectedIndex();
                   System.out.println(indexSelected);
                   newPhone.createPhone();
                   ArrayList<newPhone> allPhones = newPhone.getAllPhones();
                   newPhone np = allPhones.get(indexSelected);
                   //System.out.println(np);


                     //You can display this information in any way you like e.g. on a text area, nicely formatted
                   textArea = new JTextArea();
                   textArea.setBounds(900, 0, 120, 100);
                   textArea.setLocation(0,900);
                   textArea.setEditable(false);
                   JScrollPane scrollPane = new JScrollPane(textArea);
                   add(textArea);
                   textArea.append(String.valueOf(np));
                   //You could do something similar for the other combo-box and then you'd have maybe 2 text-areas filled with information
                   //about the 2 Phone objects for comparison purposes
               }

           if(e.getSource() == itemList2)
           {

               int indexSelected = itemList2.getSelectedIndex();
               System.out.println(indexSelected);
               newPhone.createPhone();
               ArrayList<newPhone> allPhones = newPhone.getAllPhones();
               newPhone np = allPhones.get(indexSelected);




               textArea1 = new JTextArea(5, 20);
               textArea1.setEditable(false);
               JScrollPane scrollPane = new JScrollPane(textArea1);
               add(textArea1);
               textArea1.append(String.valueOf(np));
           }
       }
           }





