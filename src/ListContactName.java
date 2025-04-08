import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

class ListContactNameTabel extends JFrame{
    private JButton homeButton;
    private JTable tblCustomerDetails;
    private DefaultTableModel dtm;
    static ContactAdd  contactAdd=new ContactAdd();
    homePage HomePage;

    public DefaultTableModel getDefaultTableModel(){
        return dtm;
    }
    public void setDefaultTableModel(DefaultTableModel dtm){
        this.dtm=dtm;
    }
    ListContactNameTabel(){
        setSize(800, 500);
        setTitle("Add Contact");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel mainGrid=new JPanel(new GridLayout(2,1,10,10));

        //////////////////////title
        JPanel contentPanel=new JPanel();
        contentPanel.setBackground(new Color(0,191,255));
        contentPanel.setPreferredSize(new Dimension(270,65));
        mainGrid.add("North",contentPanel);


        JLabel UpdateContactTitle=new JLabel("LIST Contact By Name");
        UpdateContactTitle.setHorizontalAlignment(JLabel.CENTER);
        UpdateContactTitle.setFont(new Font("",1,35));

        contentPanel.add(UpdateContactTitle);
        mainGrid.add(contentPanel);
        add("North",mainGrid);

        ////////////////////////////

        String [] ColumnsName={"Customer Id","Name","Number","Company","Salary","date"};
        dtm=new  DefaultTableModel(ColumnsName,0);

        tblCustomerDetails=new JTable(dtm);
        JScrollPane tabelPane=new JScrollPane(tblCustomerDetails);
        add("Center",tabelPane);


        JPanel btHomeName=new JPanel(new FlowLayout(FlowLayout.CENTER));
        homeButton =new JButton("Home Page");
        homeButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                if(HomePage==null){
                    HomePage=new homePage();
                    new  homePage().setVisible(false);
                }
                HomePage.setVisible(true);
                dispose();
            }});
        homeButton.setPreferredSize(new Dimension(150,25));
        homeButton.setFont(new Font("",1,12));

        btHomeName.add(homeButton);
        add("South",btHomeName);
    }

    public  void  sortName(){

        for(int x=0;x<contactAdd.Contactinfro.length;x++){
            for(int i=1;i<contactAdd.Contactinfro.length-x;i++){
                if (contactAdd.Contactinfro[i-1].getCname().compareTo(contactAdd.Contactinfro[i].getCname()) > 0) {
                    ContactAdd temp=contactAdd.Contactinfro[i-1];
                    contactAdd.Contactinfro[i-1]=contactAdd.Contactinfro[i];
                    contactAdd.Contactinfro[i]=temp;

                }
            }
        }

    }

    public  void reloadList(DefaultTableModel dtm){
        for(int i=0;i<contactAdd.Contactinfro.length;i++){
            Object [] rowData={contactAdd.Contactinfro[i].getCId(),contactAdd.Contactinfro[i].getCname(),contactAdd.Contactinfro[i].getCphonenumber(),
                    contactAdd.Contactinfro[i].getCcompany(),contactAdd.Contactinfro[i].getCsalary(),contactAdd.Contactinfro[i].getCdate()};
            dtm.addRow(rowData);
        }
    }

}

class ListContactName{

    public static void main(String args []){
        new ListContactNameTabel().setVisible(true);
    }

}
