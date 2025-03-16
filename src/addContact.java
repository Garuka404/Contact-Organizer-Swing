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


        /////////////////////////////////////contact textfeild

        JPanel contactInfroRight=new JPanel(new GridLayout(8,1));

        txtName=new JTextField(15);
        txtName.setFont(new Font("",1,15));
        JPanel nameTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));

        txtcontactNummber=new JTextField(15);
        txtcontactNummber.setFont(new Font("",1,15));
        JPanel contactNumTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));

        txtcompany=new JTextField(15);
        txtcompany.setFont(new Font("",1,15));
        JPanel companyTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));

        txtsalary=new JTextField(10);
        txtsalary.setFont(new Font("",1,15));
        JPanel salaryTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));

        txtBrithday=new JTextField(10);
        txtBrithday.setFont(new Font("",1,15));
        JPanel brithdayTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));


        String name= txtName.getText();
        String contactNummber= txtcontactNummber.getText();
        String company= txtcompany.getText();
        String salary=txtsalary.getText().trim();
        // Long salary=Long.parseLong(Ssalary);
        String Brithday= txtBrithday.getText();;
        /////////////////////////////////Button grid

        JPanel buttonPanel2=new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel buttonPanel= new JPanel(new GridLayout(1,2,5,5));
        btAddContact =new JButton("ADD Contact");
        btAddContact.setPreferredSize(new Dimension(110,25));
        btAddContact.setFont(new Font("",1,12));

        btCancel =new JButton("Cancel");
        btCancel.setPreferredSize(new Dimension(110,25));
        btCancel.setFont(new Font("",1,12));

        JPanel btHomePanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
        bthome =new JButton("Back To HomePage");
        bthome.setPreferredSize(new Dimension(220,25));
        bthome.setFont(new Font("",1,12));

        btHomePanel.add(bthome);
        buttonPanel.add(btAddContact);
        buttonPanel.add(btCancel);
        buttonPanel2.add(buttonPanel);
        nameTextPanel.add(txtName);
        contactNumTextPanel.add(txtcontactNummber);
        companyTextPanel.add(txtcompany);
        salaryTextPanel.add(txtsalary);
        brithdayTextPanel.add(txtBrithday);

        contactInfroRight.add(nameTextPanel);
        contactInfroRight.add(contactNumTextPanel);
        contactInfroRight.add(companyTextPanel);
        contactInfroRight.add(salaryTextPanel);
        contactInfroRight.add(brithdayTextPanel);
        contactInfroRight.add(buttonPanel2);
        contactInfroRight.add(btHomePanel);

        contactInfro.add(contactInfroRight);
        // add("East",contactInfro);
    }



}

public class addContact {
    public static void main(String[] args) {
        new ContactAdd().setVisible(true);;
    }
}

