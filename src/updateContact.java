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
    }

}
        public class updateContact {
            public static void main(String[] args) {
                new ContactUpdate().setVisible(true);
            }
}
