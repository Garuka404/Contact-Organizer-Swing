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


        JPanel contactInfro=new JPanel(new GridLayout(1,2));

        JPanel contactInfroLeft=new JPanel(new GridLayout(8,1));

        JPanel nemepanel=new JPanel(new FlowLayout(FlowLayout. LEFT));
        name=new JLabel("Name");
        name.setHorizontalAlignment(JLabel.LEFT);
        name.setFont(new Font("",1,20));

        JPanel contactNummberpanel=new JPanel(new FlowLayout(FlowLayout. LEFT));
        contactNummber=new JLabel("Contact Number");
        contactNummber.setHorizontalAlignment(JLabel.LEFT);
        contactNummber.setFont(new Font("",1,20));

        JPanel companypanel=new JPanel(new FlowLayout(FlowLayout. LEFT));
        company=new JLabel("Company");
        company.setHorizontalAlignment(JLabel.LEFT);
        company.setFont(new Font("",1,20));

        JPanel salarypanel=new JPanel(new FlowLayout(FlowLayout. LEFT));
        salary=new JLabel("Salary");
        salary.setHorizontalAlignment(JLabel.LEFT);
        salary.setFont(new Font("",1,20));

        JPanel Brithdaypanel=new JPanel(new FlowLayout(FlowLayout. LEFT));
        Brithday=new JLabel("Birthday");
        Brithday.setHorizontalAlignment(JLabel.LEFT);
        Brithday.setFont(new Font("",1,20));

        nemepanel.add(name);
        contactNummberpanel.add(contactNummber);
        companypanel.add(company);
        salarypanel.add(salary);
        Brithdaypanel.add(Brithday);

        contactInfroLeft.add(nemepanel);
        contactInfroLeft.add(contactNummberpanel);
        contactInfroLeft.add(companypanel);
        contactInfroLeft.add(salarypanel);
        contactInfroLeft.add(Brithdaypanel);

        contactInfro.add(contactInfroLeft);
        add("West",contactInfro);


    }
}

public class addContact {
    public static void main(String[] args) {
        new ContactAdd().setVisible(true);;
    }
}

