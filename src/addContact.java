import javax.swing.*;
import java.awt.*;

class ContactAdd extends JFrame {
    JLabel AddContact;
    JLabel name;
    JLabel contactNummber;
    JLabel company;
    JLabel salary;
    JLabel Brithday;
    JTextField txtName;
    JTextField txtcontactNummber;
    JTextField txtcompany;
    JTextField txtsalary;
    JTextField txtBrithday;
    JButton btAddContact;
    JButton btCancel;
    JButton bthome;



    ContactAdd() {
        setSize(500, 600);
        setTitle("Add Contact");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainGrid=new JPanel(new GridLayout(2,1));

        //////////////////////title
        JPanel contentPanel=new JPanel();
        contentPanel.setBackground(new Color(0,191,255));
        contentPanel.setPreferredSize(new Dimension(270,65));
        mainGrid.add("North",contentPanel);


        JLabel AddContact=new JLabel("ADD CONTACT");
        AddContact.setHorizontalAlignment(JLabel.CENTER);
        AddContact.setFont(new Font("",1,35));

        contentPanel.add(AddContact);
        mainGrid.add(contentPanel);
        add("North",mainGrid);


    }
}

public class addContact {
    public static void main(String[] args) {
        new ContactAdd().setVisible(true);;
    }
}

