import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class  ListContact extends JFrame{
    private JButton listName;
    private JButton listSalary;
    private JButton listBirthday;
    private JButton homeButton;
    private JButton lCancel;;
    ContactAdd  contactAdd=new ContactAdd();
    ListContactNameTabel listNameTabel=new ListContactNameTabel();
    ListContactSalaryTabel listSalaryTabel=new ListContactSalaryTabel();

    ListContact(){
        setSize(500, 500);
        setTitle("Add Contact");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainGrid=new JPanel(new GridLayout(6,1,10,10));

        //////////////////////title
        JPanel contentPanel=new JPanel();
        contentPanel.setBackground(new Color(0,191,255));
        contentPanel.setPreferredSize(new Dimension(270,65));
        mainGrid.add("North",contentPanel);


        JLabel UpdateContactTitle=new JLabel("CONTACT LIST");
        UpdateContactTitle.setHorizontalAlignment(JLabel.CENTER);
        UpdateContactTitle.setFont(new Font("",1,35));

        contentPanel.add(UpdateContactTitle);
        mainGrid.add(contentPanel);
        add("North",mainGrid);

        /////////////////////////////////////////////////////////
        JPanel test=new JPanel(new GridLayout(1,3,10,10) );

        JPanel btHomeName=new JPanel(new FlowLayout(FlowLayout.CENTER));
        listName =new JButton("List By Name");
        listName.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                if(listNameTabel==null){
                    listNameTabel=new ListContactNameTabel();
                    new  ListContactNameTabel().setVisible(false);
                }
                listNameTabel.setVisible(true);
                listNameTabel.sortName();
                listNameTabel.reloadList(listNameTabel.getDefaultTableModel());
                dispose();
            }});
        listName.setPreferredSize(new Dimension(250,25));
        listName.setFont(new Font("",1,12));


        JPanel btHomeSalary=new JPanel(new FlowLayout(FlowLayout.CENTER));
        listSalary =new JButton("List By  Salary");
        listSalary.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                if(listSalaryTabel==null){
                    listSalaryTabel=new ListContactSalaryTabel();
                    new  ListContactSalaryTabel().setVisible(false);
                }
                listSalaryTabel.setVisible(true);
                listSalaryTabel.sortSalary();
                listNameTabel.reloadList(listSalaryTabel.getDefaultTableModel());
                dispose();
            }});

        listSalary.setPreferredSize(new Dimension(250,25));
        listSalary.setFont(new Font("",1,12));

        JPanel btHomeBirthday=new JPanel(new FlowLayout(FlowLayout.CENTER));
        listBirthday =new JButton("List By Brithday");
        listBirthday.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){

            }});
        listBirthday.setPreferredSize(new Dimension(250,25));
        listBirthday.setFont(new Font("",1,12));


        JPanel btHomeCancel=new JPanel(new FlowLayout(FlowLayout.CENTER));
        lCancel =new JButton("Cancel");
        lCancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){

            }});
        lCancel.setPreferredSize(new Dimension(100,25));
        lCancel.setFont(new Font("",1,12));



        btHomeName.add(listName);
        btHomeSalary.add(listSalary);
        btHomeBirthday.add(listBirthday);
        btHomeCancel.add(lCancel);
        // test.add(btHomeCancel);

        mainGrid.add(btHomeName);
        mainGrid.add(btHomeSalary);
        mainGrid.add(btHomeBirthday);
        mainGrid.add(btHomeCancel);



        add("Center",mainGrid);
        // add("West",lCancel);
    }

}

public class ContactList{
    public static void main(String args []){
        new ListContact().setVisible(true);
    }
}
