import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ContactSearch extends JFrame{
    JTextField tfSearch;
    JButton btSearch;
    JLabel name;
    JLabel contactNummber;
    JLabel company;
    JLabel salary;
    JLabel Brithday;
    JLabel lbName;
    JLabel lbcontactNummber;
    JLabel lbcompany;
    JLabel lbsalary;
    JLabel lbBrithday;
    JButton bthome;
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
                    lbName.setText(contactAdd.Contactinfro[index].Cname);
                    lbcontactNummber.setText(contactAdd.Contactinfro[index].Cphonenumber);
                    lbcompany.setText(contactAdd.Contactinfro[index].Ccompany);
                    lbsalary.setText(contactAdd.Contactinfro[index].Csalary);
                    lbBrithday.setText(contactAdd.Contactinfro[index].Cdate);
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


        }}
class searchContact{
    public static void main(String args[]){
        new ContactSearch().setVisible(true);



    }
}