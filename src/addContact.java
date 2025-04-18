import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
class ContactAdd extends JFrame {
    private JLabel AddContact;
    private JLabel lbname;
    private JLabel lbcontactNummber;
    private JLabel lbcompany;
    private JLabel lbsalary;
    private JLabel lbBrithday;
    private JTextField txtName;
    private JTextField txtcontactNummber;
    private JTextField txtcompany;
    private JTextField txtsalary;
    private JTextField txtBrithday;
    private JButton btAddContact;
    private JButton btCancel;
    private JButton bthome;
    homePage HomePage;

    private String Cname;
    private String Cphonenumber;
    private String Ccompany;
    private String Csalary;
    private String Cdate;
    private String CId;
    public static ContactAdd [] Contactinfro=new ContactAdd[0];
    ContactAdd(String CId,String Cname,String Cphonenumber,String Ccompany,String Csalary,String Cdate ){
        this.CId=CId;
        this.Cname=Cname;
        this.Cphonenumber=Cphonenumber;
        this.Ccompany=Ccompany;
        this.Csalary=Csalary;;
        this.Cdate=Cdate;
    }
    public String getCId(){
        return CId;
    }
    public void setCId(String CId){
        this.CId=CId;
    }

    public String getCname(){
        return Cname;
    }
    public void setCname(String Cname){
        this.Cname=Cname;
    }

    public String getCphonenumber(){
        return Cphonenumber;
    }
    public void setCphonenumber(String Cphonenumber){
        this.Cphonenumber=Cphonenumber;
    }

    public String getCcompany(){
        return Ccompany;
    }
    public void setCcompany(String Ccompany){
        this.Ccompany=Ccompany;
    }

    public String getCsalary(){
        return Csalary;
    }
    public void setCsalary(String Csalary){
        this.Csalary=Csalary;
    }

    public String getCdate(){
        return Cdate;
    }
    public void setCdate(String Cdate){
        this.Cdate=Cdate;
    }


    ContactAdd() {
        setSize(500, 600);
        setTitle("Add Contact");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        /* ContactAdd newContact1 = new ContactAdd(""+1,"Caruka", "0712026512","maga","52000","5225222");
         ContactAdd newContact2 = new ContactAdd("" +2  ,"Bimhana","0710644491","hama","26223","565682");
         ContactAdd newContact3 = new ContactAdd("" +3  ,"Aimhana","0710644491","hama","16223","565682");

           Contactinfro[0]=newContact1;
           Contactinfro[1]=newContact2;
           Contactinfro[2]=newContact3;
        */
        JPanel mainGrid=new JPanel(new GridLayout(3,1));

        //////////////////////title
        JPanel contentPanel=new JPanel();
        contentPanel.setBackground(new Color(0,191,255));
        contentPanel.setPreferredSize(new Dimension(270,65));
        mainGrid.add("North",contentPanel);


        JLabel AddContact=new JLabel("ADD CONTACT");
        AddContact.setHorizontalAlignment(JLabel.CENTER);
        AddContact.setFont(new Font("",1,35));

        JLabel lbid=new JLabel(" Contact ID - B"+Contactinfro.length+1);
        lbid.setHorizontalAlignment(JLabel.LEFT);
        lbid.setFont(new Font("",1,25));

        contentPanel.add(AddContact);
        mainGrid.add(contentPanel);
        mainGrid.add(lbid);
        add("North",mainGrid);

        ////////////////////////////////// Contact label

        JPanel contactInfro=new JPanel(new GridLayout(1,2));

        JPanel contactInfroLeft=new JPanel(new GridLayout(8,1));

        JPanel nemepanel=new JPanel(new FlowLayout(FlowLayout. LEFT));
        lbname=new JLabel("Name");
        lbname.setHorizontalAlignment(JLabel.LEFT);
        lbname.setFont(new Font("",1,20));

        JPanel contactNummberpanel=new JPanel(new FlowLayout(FlowLayout. LEFT));
        lbcontactNummber=new JLabel("Contact Number");
        lbcontactNummber.setHorizontalAlignment(JLabel.LEFT);
        lbcontactNummber.setFont(new Font("",1,20));

        JPanel companypanel=new JPanel(new FlowLayout(FlowLayout. LEFT));
        lbcompany=new JLabel("Company");
        lbcompany.setHorizontalAlignment(JLabel.LEFT);
        lbcompany.setFont(new Font("",1,20));

        JPanel salarypanel=new JPanel(new FlowLayout(FlowLayout. LEFT));
        lbsalary=new JLabel("Salary");
        lbsalary.setHorizontalAlignment(JLabel.LEFT);
        lbsalary.setFont(new Font("",1,20));

        JPanel Brithdaypanel=new JPanel(new FlowLayout(FlowLayout. LEFT));
        lbBrithday=new JLabel("Birthday");
        lbBrithday.setHorizontalAlignment(JLabel.LEFT);
        lbBrithday.setFont(new Font("",1,20));

        nemepanel.add(lbname);
        contactNummberpanel.add(lbcontactNummber);
        companypanel.add(lbcompany);
        salarypanel.add(lbsalary);
        Brithdaypanel.add(lbBrithday);

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

///////////////////////////////////////////////////////////////////////////////// Button implementation
        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 5, 5));

        btAddContact = new JButton("ADD Contact");
        btAddContact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String name = txtName.getText().trim();
                String contactNumber = txtcontactNummber.getText().trim();
                String company = txtcompany.getText().trim();
                String salary = txtsalary.getText().trim();                          //Add button to call contact function
                String birthday = txtBrithday.getText().trim();
                UpdateNewContact(name,contactNumber,company,salary,birthday);
            }
        });

        btAddContact.setPreferredSize(new Dimension(110, 25));
        btAddContact.setFont(new Font("", Font.BOLD, 12));

        btCancel = new JButton("Cancel");
        btCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {////// Cancel Button to Clear Data
                txtName.setText("");
                txtcontactNummber.setText("");
                txtcompany.setText("");
                txtsalary.setText("");
                txtBrithday.setText("");
                int i=1;
                // for(int i=0;i<Contactinfro.length-1;i++){
                System.out.println("ID "+Contactinfro[i].getCId());
                System.out.println("Name "+Contactinfro[i].getCname());
                System.out.println("Number "+Contactinfro[i].getCphonenumber());
                System.out.println("Company "+Contactinfro[i].getCcompany());
                System.out.println("Salary "+Contactinfro[i].getCsalary());
                System.out.println("////////////////////////////////////////////////////");
                //}

            }
        });
        btCancel.setPreferredSize(new Dimension(110, 25));
        btCancel.setFont(new Font("", Font.BOLD, 12));

        JPanel btHomePanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); /////Home Button
        bthome = new JButton("Back To HomePage");
        bthome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (HomePage == null) {
                    HomePage = new homePage();
                }
                HomePage.setVisible(true);
                dispose();
            }
        });

        bthome.setPreferredSize(new Dimension(220, 25));
        bthome.setFont(new Font("", Font.BOLD, 12));

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
///////////////////////////////////////////// contact add to the Object array

    public boolean contact(String name, String number, String coname, String salary, String date) {
        boolean status = true;
        if (number.length() != 10 || !number.startsWith("0")){
            status = false;
            return status;
        }
        if (salary.startsWith("-")) {
            status = false;
            return status;
        }
        ContactAdd newContact = new ContactAdd("" + (Contactinfro.length + 1), name, number, coname, salary, date);
        ContactAdd[] tempContact = new ContactAdd[Contactinfro.length + 1];
        for(int i=0;i<Contactinfro.length;i++){
            tempContact[i]=Contactinfro[i];
        }
        Contactinfro = tempContact;
        Contactinfro[Contactinfro.length - 1] = newContact;

        return status ;
    }
    public  void UpdateNewContact(String name,String contactNumber,String company,String salary,String birthday){

        boolean status = contact(name, contactNumber, company, salary, birthday);
        if (status) {
            JOptionPane.showMessageDialog(null, "Successfully Added", "Alert", JOptionPane.PLAIN_MESSAGE);
            System.out.print("Length is "+Contactinfro.length);
            txtName.setText("");
            txtcontactNummber.setText("");
            txtcompany.setText("");
            txtsalary.setText("");
            txtBrithday.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Details", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
public class addContact {
    public static void main(String[] args) {
        new ContactAdd().setVisible(true);;
    }
}

