
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class homePage extends JFrame{

    private JButton test2;
    private JLabel  lbiFriend;
    private JLabel lbContact;
    private JLabel lbImage;
    private JButton btAdd;
    private JButton btUpdate;
    private JButton btSearch;
    private JButton btDelete;
    private JButton btView;
    private JLabel lbhome;
    ContactAdd contactadd;
    ContactUpdate Contactupdate;
    ContactSearch contactSearch;
    ContactDelete contactDelete;
    ListContact listContact;

    homePage(){
        setSize(750,500);
        setTitle("Home page");
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);

        JPanel homePanel3=new JPanel(new FlowLayout(FlowLayout.CENTER));

        JPanel homePanel=new JPanel();
        //   homePanel.setBackground(Color. RED);
        homePanel3.setLayout(new GridLayout(1,2));

	   /* test=new JButton("test");
	    test.setFont(new Font("",1,20));*/



        JPanel PaneliFriend=new JPanel();
        PaneliFriend.setLayout(new GridLayout(3,1));

        lbiFriend=new JLabel("IFRIEND ");
        lbiFriend.setHorizontalAlignment(JLabel.CENTER);
        lbiFriend.setFont(new Font("",1,35));

        lbContact=new JLabel("Contact Manager");
        lbContact.setHorizontalAlignment(JLabel.CENTER);
        lbContact.setFont(new Font("",1,35));

        lbImage=new JLabel();
        ImageIcon icon = new ImageIcon("car.png");
        lbImage.setIcon(icon);
        // homePanel.add(test);
        PaneliFriend.add(lbiFriend);
        PaneliFriend.add(lbContact);
        //   PaneliFriend.add("North",lbImage);



        homePanel.add(PaneliFriend);
        homePanel3.add(homePanel);


        JPanel homePanel2=new JPanel();
        homePanel2.setLayout(new GridLayout(7,1,2,2));
        homePanel2.setBackground(new Color(135, 206, 235));

        lbhome=new JLabel("Home Page");
        lbhome.setPreferredSize(new Dimension(270,60));
        JPanel panel0=new JPanel(new FlowLayout(FlowLayout. CENTER));
        panel0.setBackground(new Color(135, 206, 235));
        lbhome.setHorizontalAlignment(JLabel.CENTER);
        lbhome.setFont(new Font("",1,35));

        JPanel panel1=new JPanel(new FlowLayout(FlowLayout. CENTER));
        btAdd=new JButton("Add New Contact");
        btAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                if(contactadd==null){
                    contactadd=new ContactAdd();
                    new homePage().setVisible(false);
                }
                contactadd.setVisible(true);
                dispose();

            }});
        btAdd.setPreferredSize(new Dimension(270, 25));
        panel1.setBackground(new Color(135, 206, 235));
        btAdd.setHorizontalAlignment(SwingConstants.CENTER);
        btAdd.setFont(new Font("",1,15));


        JPanel panel2=new JPanel(new FlowLayout(FlowLayout.CENTER));
        btUpdate=new JButton("Update Contact");
        btUpdate.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                if(Contactupdate==null){
                    Contactupdate=new ContactUpdate();
                }
                Contactupdate.setVisible(true);
                dispose();
            }});
        panel2.setBackground(new Color(135, 206, 235));
        btUpdate.setPreferredSize(new Dimension(270, 25));
        btUpdate.setFont(new Font("",1,15));


        JPanel panel3=new JPanel(new FlowLayout(FlowLayout.CENTER));
        btSearch=new JButton("Search Contact");
        btSearch.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                if(contactSearch==null){
                    contactSearch=new ContactSearch();
                }
                contactSearch.setVisible(true);
                dispose();
            }});
        panel3.setBackground(new Color(135, 206, 235));
        btSearch.setPreferredSize(new Dimension(270, 25));
        btSearch.setFont(new Font("",1,15));


        JPanel panel4=new JPanel(new FlowLayout(FlowLayout.CENTER));
        btDelete=new JButton("Delete Contact");
        btDelete.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                if(contactDelete==null){
                    contactDelete=new ContactDelete();
                }
                contactDelete.setVisible(true);
                dispose();
            }});
        panel4.setBackground(new Color(135, 206, 235));
        btDelete.setPreferredSize(new Dimension(270, 25));
        btDelete.setFont(new Font("",1,15));


        JPanel panel5=new JPanel(new FlowLayout(FlowLayout.CENTER));
        btView=new JButton("View Contact");
        btView.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                if(listContact==null){
                    listContact=new ListContact();
                }
                listContact.setVisible(true);
                dispose();
            }});
        panel5.setBackground(new Color(135, 206, 235));
        btView.setPreferredSize(new Dimension(270, 25));
        btView.setFont(new Font("",1,15));



        panel0.add(lbhome);
        panel1.add(btAdd);
        panel2.add(btUpdate);
        panel3.add(btSearch);
        panel4.add(btDelete);
        panel5.add(btView);


        // test2=new JButton("test");
        homePanel2.add(panel0);
        homePanel2.add(panel1);
        homePanel2.add(panel2);
        homePanel2.add(panel3);
        homePanel2.add(panel4);
        homePanel2.add(panel5);

        homePanel3.add(homePanel2);
        add("Center",homePanel3);
    }

}

class iFriendsSwing{

    public static void main (String[] args) {
        new homePage().setVisible(true);


    }


}
