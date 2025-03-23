import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ContactUpdate extends JFrame{
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
    ContactAdd  contactAdd = new ContactAdd();

    ContactUpdate() {
        setSize(500, 600);
        setTitle("Add Contact");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel mainGrid = new JPanel(new GridLayout(2, 1, 20, 20));

        //////////////////////title
        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(new Color(0, 191, 255));
        contentPanel.setPreferredSize(new Dimension(270, 65));
        mainGrid.add("North", contentPanel);


        JLabel UpdateContactTitle = new JLabel("UPDATE CONTACT");
        UpdateContactTitle.setHorizontalAlignment(JLabel.CENTER);
        UpdateContactTitle.setFont(new Font("", 1, 35));

        contentPanel.add(UpdateContactTitle);
        mainGrid.add(contentPanel);
        add("North", mainGrid);

        ////////////////////////////////////search bar
        JPanel panelSearch = new JPanel(new GridLayout(1, 2));

        tfSearch = new JTextField(20);
        tfSearch.setFont(new Font("", 1, 17));
        JPanel TextPanelSearch = new JPanel(new FlowLayout(FlowLayout.LEFT));

        btSearch = new JButton("Search");
        btSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) { ////
                String valSearch = tfSearch.getText().trim();
                int index = findId(valSearch);
                if (index >= 0) {
                    txtName.setText(contactAdd.Contactinfro[index].Cname);
                    txtcontactNummber.setText(contactAdd.Contactinfro[index].Cphonenumber);
                    txtcompany.setText(contactAdd.Contactinfro[index].Ccompany);
                    txtsalary.setText(contactAdd.Contactinfro[index].Csalary);
                    txtBrithday.setText(contactAdd.Contactinfro[index].Cdate);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Details", "Error", JOptionPane.ERROR_MESSAGE);
                }
                System.out.print("length is " + contactAdd.Contactinfro.length);

            }
        });
        btSearch.setPreferredSize(new Dimension(110, 25));
        btSearch.setFont(new Font("", 1, 16));

        TextPanelSearch.add(tfSearch);
        TextPanelSearch.add(btSearch);

        panelSearch.add(TextPanelSearch);
        mainGrid.add(panelSearch);

        ////////////////////////////////contact info
        JPanel contactInfro = new JPanel(new GridLayout(1, 2));

        JPanel contactInfroLeft = new JPanel(new GridLayout(8, 1));

        JPanel nemepanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        name = new JLabel("Name");
        name.setHorizontalAlignment(JLabel.LEFT);
        name.setFont(new Font("", 1, 20));

        JPanel contactNummberpanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contactNummber = new JLabel("Contact Number");
        contactNummber.setHorizontalAlignment(JLabel.LEFT);
        contactNummber.setFont(new Font("", 1, 20));

        JPanel companypanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        company = new JLabel("Company");
        company.setHorizontalAlignment(JLabel.LEFT);
        company.setFont(new Font("", 1, 20));

        JPanel salarypanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        salary = new JLabel("Salary");
        salary.setHorizontalAlignment(JLabel.LEFT);
        salary.setFont(new Font("", 1, 20));

        JPanel Brithdaypanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Brithday = new JLabel("Birthday");
        Brithday.setHorizontalAlignment(JLabel.LEFT);
        Brithday.setFont(new Font("", 1, 20));

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
        add("West", contactInfro);

    }   }
    class updateContact{
        public static void main(String arg[]){
            new ContactUpdate().setVisible(true);

        }


    }