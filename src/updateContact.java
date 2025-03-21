import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ContactUpdate extends JFrame {
    JTextField tfSearch;
    JButton btSearch;
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
    homePage HomePage;
    ContactAdd contactAdd = new ContactAdd();

    ContactUpdate() {
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
                    txtName.setText(contactAdd.Contactinfro[0].Cname);
                    txtcontactNummber.setText(contactAdd.Contactinfro[index].Cphonenumber);
                    txtcompany.setText(contactAdd.Contactinfro[index].Ccompany);
                    txtsalary.setText(contactAdd.Contactinfro[index].Csalary);
                    txtBrithday.setText(contactAdd.Contactinfro[index].Cdate);
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
    }

}
        public class updateContact {
            public static void main(String[] args) {
                new ContactUpdate().setVisible(true);
            }
}
