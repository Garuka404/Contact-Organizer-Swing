import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
class ContactAdd extends JFrame {
    JLabel AddContact;
    JLabel lbname;
    JLabel lbcontactNummber;
    JLabel lbcompany;
    JLabel lbsalary;
    JLabel lbBrithday;
    JTextField txtName;
    JTextField txtcontactNummber;
    JTextField txtcompany;
    JTextField txtsalary;
    JTextField txtBrithday;
    JButton btAddContact;
    JButton btCancel;
    JButton bthome;
    homePage HomePage;


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

        ////////////////////////////////// Cotact label

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
        btAddContact.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                boolean status =contact(name,contactNummber,company,salary,Brithday);
                if(status==true){
                    JOptionPane.showMessageDialog(null, "This is an alert message!", "Alert", JOptionPane.PLAIN_MESSAGE);
                }

            }});
        btAddContact.setPreferredSize(new Dimension(110,25));
        btAddContact.setFont(new Font("",1,12));

        btCancel =new JButton("Cancel");
        btCancel.setPreferredSize(new Dimension(110,25));
        btCancel.setFont(new Font("",1,12));

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
    public  boolean contact(String name,String number,String coname,String salary,String date){

       /*

        char s= ' ';
        do{
            s= ' ';

            System.out.println("\n\n cid "+ ++count);
            System.out.println("=======");

            System.out.print("\n Name             :");
            name=scan.next();


            char c=' ';
            do{
                c=' ';
                System.out.print("\n Phone Number     :");
                number=scan.next();

                if(number.length()!=10 ||number.charAt(0)-48!=0){

                    System.out.println("\n\tInvalid phone number");
                    System.out.print("\n\nDo you want to add phone number again(Y/N):");
                    c=scan.next().charAt(0);
                }
                else{
                     boolean Tname=true;
                }
            }while(c=='Y');

            System.out.print(" Company Name     :");
            coname=scan.next();

            do{
                c=' ';
                System.out.print(" Salary           :");
                salary=scan.nextLong();
                if(salary>0){
                    boolean Tsalary=true;
                }
                else{
                    System.out.println("\n\tInvalid Salary");
                    System.out.print("\n\nDo you want to add Salary again(Y/N):");
                    c=scan.next().charAt(0);
                }
            }while(c=='Y');

            System.out.print(" B'Day(YYYY-MM-DD): ");
            String date=scan.next();

            Contact setContact=new Contact(" "+count,name,number,coname,salary,date);
            Contact [] tempContact=new Contact[con.length+1];
            for(int i=0;i<con.length;i++){
				tempContact[i]=con[i];
			}
            con=tempContact;
            con[con.length-1]=setContact;

            System.out.println("\nContact has been added successfully...");

            System.out.print("\n\nDo you want to add another Contact(Y/N):");
            s=scan.next().charAt(0);
        }while(s=='Y');

       Main2();*/
        return true;
    }

}

public class addContact {
    public static void main(String[] args) {
        new ContactAdd().setVisible(true);;
    }
}

