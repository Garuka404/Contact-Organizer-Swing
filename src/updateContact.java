import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ContactUpdate extends JFrame{
    private JTextField tfSearch;
    private JButton btSearch;
    private JLabel name;
    private JLabel contactNummber;
    private JLabel company;
    private JLabel salary;
    private JLabel Brithday;
    private JTextField txtName;
    private JTextField txtcontactNummber;
    private JTextField txtcompany;
    private JTextField txtsalary;
    private JTextField txtBrithday;
    private JButton btAddContact;
    private JButton btCancel;
    private JButton bthome;
    homePage HomePage;
    static ContactAdd  contactAdd = new ContactAdd();

    ContactUpdate(){
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


        JLabel UpdateContactTitle=new JLabel("UPDATE CONTACT");
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
        btSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) { ////
                String valSearch=tfSearch.getText().trim();
                int index=findId(valSearch);
                if(index>=0){
                    txtName.setText(contactAdd.Contactinfro[index].getCname());
                    txtcontactNummber.setText(contactAdd.Contactinfro[index].getCphonenumber());
                    txtcompany.setText(contactAdd.Contactinfro[index].getCcompany());
                    txtsalary.setText(contactAdd.Contactinfro[index].getCsalary());
                    txtBrithday.setText(contactAdd.Contactinfro[index].getCdate());
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Details", "Error", JOptionPane.ERROR_MESSAGE);
                }
                System.out.print("length is "+contactAdd.Contactinfro.length);

            }
        });
        btSearch.setPreferredSize(new Dimension(110,25));
        btSearch.setFont(new Font("",1,16));

        TextPanelSearch.add(tfSearch);
        TextPanelSearch.add(btSearch);

        panelSearch.add(TextPanelSearch);
        mainGrid.add(panelSearch);

        ////////////////////////////////contact info
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

        /////////////////////////////////Button grid

        JPanel buttonPanel2=new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel buttonPanel= new JPanel(new GridLayout(1,2,5,5));
        btAddContact =new JButton("Update");
        btAddContact.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String valSearch=tfSearch.getText().trim();
                int index=findId(valSearch);
                if(index>=0){
                    contactAdd.Contactinfro[index].setCname(txtName.getText().trim());
                    contactAdd.Contactinfro[index].setCphonenumber(txtcontactNummber.getText().trim());
                    contactAdd.Contactinfro[index].setCcompany(txtcompany.getText().trim());
                    contactAdd.Contactinfro[index].setCsalary(txtsalary.getText().trim());
                    contactAdd.Contactinfro[index].setCdate(txtBrithday.getText().trim());
                    txtName.setText("");
                    txtcontactNummber.setText("");
                    txtcompany.setText("");
                    txtsalary.setText("");
                    txtBrithday.setText("");
                    tfSearch.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Details", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }});
        btAddContact.setPreferredSize(new Dimension(110,25));
        btAddContact.setFont(new Font("",1,12));

        btCancel =new JButton("Cancel");
        btCancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                txtName.setText("");
                txtcontactNummber.setText("");
                txtcompany.setText("");
                txtsalary.setText("");
                txtBrithday.setText("");


            }});
        btCancel.setPreferredSize(new Dimension(110,25));
        btCancel.setFont(new Font("",1,12));

        JPanel btHomePanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
        bthome =new JButton("Back To HomePage");
        bthome.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                if(HomePage==null){
                    HomePage=new homePage();
                }
                HomePage.setVisible(true);
                dispose();

            }});
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
    }

    public  int findId(String search){
        for(int i=0;i<contactAdd.Contactinfro.length;i++){
            if((contactAdd.Contactinfro[i].getCname().equalsIgnoreCase(search)| contactAdd.Contactinfro[i].getCphonenumber().equals(search))){
                return i;

            }
        }
        return -1;
    }

}

class updateContact{
    public static void main(String arg[]){
        new ContactUpdate().setVisible(true);

    }


}
