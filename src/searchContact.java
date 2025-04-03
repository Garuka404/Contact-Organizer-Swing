import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ContactSearch extends JFrame{
    private JTextField tfSearch;
    private JButton btSearch;
    private JLabel name;
    private JLabel contactNummber;
    private JLabel company;
    private JLabel salary;
    private JLabel Brithday;
    private JLabel lbName;
    private JLabel lbcontactNummber;
    private JLabel lbcompany;
    private JLabel lbsalary;
    private JLabel lbBrithday;
    private JButton bthome;
    homePage HomePage;
    ContactUpdate Updatecon=new ContactUpdate();
    ContactAdd  contactAdd=new ContactAdd();


    ContactSearch(){
        setSize(500, 600);
        setTitle("Add Contact");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel mainGrid=new JPanel(new GridLayout(2,1,20,20));

        //////////////////////title
        JPanel contentPanel=new JPanel();
        contentPanel.setBackground(new Color(0,191,255));
        contentPanel.setPreferredSize(new Dimension(270,65));
        mainGrid.add("North",contentPanel);


        JLabel UpdateContactTitle=new JLabel("SEARCH CONTACT");
        UpdateContactTitle.setHorizontalAlignment(JLabel.CENTER);
        UpdateContactTitle.setFont(new Font("",1,35));

        contentPanel.add(UpdateContactTitle);
        mainGrid.add(contentPanel);
        add("North",mainGrid);

        ////////////////////////////////////search bar
        JPanel panelSearch=new JPanel(new GridLayout(1,2));

        tfSearch=new JTextField(20);
        tfSearch.setFont(new Font("",1,17));
        JPanel TextPanelSearch=new JPanel(new FlowLayout(FlowLayout.LEFT));

        btSearch =new JButton("Search");
        btSearch.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                int index=Updatecon.findId(tfSearch.getText().trim());
                if(index>=0){
                    lbName.setText(contactAdd.Contactinfro[index].getCname());
                    lbcontactNummber.setText(contactAdd.Contactinfro[index].getCphonenumber());
                    lbcompany.setText(contactAdd.Contactinfro[index].getCcompany());
                    lbsalary.setText(contactAdd.Contactinfro[index].getCsalary());
                    lbBrithday.setText(contactAdd.Contactinfro[index].getCdate());
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Details", "Alert", JOptionPane.ERROR_MESSAGE);
                }
                //JOptionPane.showMessageDialog(null, "This is an alert message!", "Alert", JOptionPane.ERROR_MESSAGE);
                // contactAdd.UpdateNewContact();

            }});
        btSearch.setPreferredSize(new Dimension(110,25));
        btSearch.setFont(new Font("",1,16));

        TextPanelSearch.add(tfSearch);
        TextPanelSearch.add(btSearch);

        panelSearch.add(TextPanelSearch);
        mainGrid.add(panelSearch);

        ////////////////////////////////contact info
        JPanel contactInfro=new JPanel(new GridLayout(1,2));
        JPanel contactInfroLeft=new JPanel(new GridLayout(8,2));

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
        // add(contactInfroLeft);
        ///////////////////////////////////////Contactlabel
        JPanel contactInfroRight=new JPanel(new GridLayout(8,1));

        lbName=new JLabel("Name");
        lbName.setFont(new Font("",1,15));
        JPanel nameTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));

        lbcontactNummber=new JLabel("Number");
        lbcontactNummber.setFont(new Font("",1,15));
        JPanel contactNumTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));

        lbcompany=new JLabel("Company");
        lbcompany.setFont(new Font("",1,15));
        JPanel companyTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));

        lbsalary=new JLabel("Salary");
        lbsalary.setFont(new Font("",1,15));
        JPanel salaryTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));

        lbBrithday=new JLabel("Brith");
        lbBrithday.setFont(new Font("",1,15));
        JPanel brithdayTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));

        /////////////////////////////////Button grid

        JPanel buttonPanel2=new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel buttonPanel= new JPanel(new GridLayout(1,2,5,5));


        JPanel btHomePanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
        bthome =new JButton("Back To HomePage");
        bthome.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                if(HomePage==null){
                    HomePage=new homePage();
                    // new homePage().setVisible(false);
                }
                HomePage.setVisible(true);
                dispose();

            }});
        bthome.setPreferredSize(new Dimension(220,25));
        bthome.setFont(new Font("",1,12));


        btHomePanel.add(bthome);
        buttonPanel2.add(buttonPanel);
        nameTextPanel.add(lbName);
        contactNumTextPanel.add(lbcontactNummber);
        companyTextPanel.add(lbcompany);
        salaryTextPanel.add(lbsalary);
        brithdayTextPanel.add(lbBrithday);

        contactInfroRight.add(nameTextPanel);
        contactInfroRight.add(contactNumTextPanel);
        contactInfroRight.add(companyTextPanel);
        contactInfroRight.add(salaryTextPanel);
        contactInfroRight.add(brithdayTextPanel);
        contactInfroRight.add(buttonPanel2);
        contactInfroRight.add(btHomePanel);

        contactInfro.add(contactInfroRight);
    }

}

class searchContact{
    public static void main(String args[]){
        new ContactSearch().setVisible(true);



    }
}
