import javax.swing.*;
import java.awt.Font;

public class MyFrame extends JFrame {
    public MyFrame() {
        // JPanel panel = new JPanel();
        // panel.setBackground(Color.white);

        // JLabel username = new JLabel("Username:");
        // username.setBounds(300,20,50,10);

        // JLabel password = new JLabel("password");
        // password.setBounds(330,30,50,10);
        // JTextField textField = new JTextField(20); 
        // JButton button = new JButton("Click Me");
        // JTextArea textArea = new JTextArea(5,20); 
        
        // panel.add(username);
        // // panel.add(password);
        // panel.add(textField);
        // panel.add(button);
        // panel.add(textArea);

        // add(panel);
        // setSize(800, 800);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setResizable(false);
        // setVisible(true);
        // setTitle("Swing Demo App");

        // constructor
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("ComboBox");
        setLayout(null);
        
        String[] cities = {"Kathmandu","Lalitpur","Bhaktapur"};
        JComboBox comboBox = new JComboBox(cities);
        comboBox.setBounds(100, 100, 150, 50);

        JCheckBox checkBox = new JCheckBox("MO:MO");
        checkBox.setBounds(10, 150, 100, 20);
        JCheckBox checkBox1 = new JCheckBox("MO:MO[]");
        checkBox1.setBounds(90, 150, 100, 20);
        JCheckBox checkBox2 = new JCheckBox("MO:MO");
        checkBox2.setBounds(200, 150, 100, 20);
        JCheckBox checkBox3 = new JCheckBox("MO:MO");
        checkBox3.setBounds(300, 150, 100, 20);
        

        JRadioButton radioButton = new JRadioButton("male");
        radioButton.setBounds(10, 200, 100, 50);
        JRadioButton radioButton1 = new JRadioButton("Female");
        radioButton1.setBounds(90, 200, 100, 50);
        JRadioButton radioButton2 = new JRadioButton("other");
        radioButton2.setBounds(200, 200, 200, 50);

        //List
        String[] names = {"gokarna","Rohan","Bishesh"};
        JList list = new JList(names);
        list.setBounds(10, 300, 200, 130);

        // Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("Run");
        JMenu menu3 = new JMenu("new File");
        JMenu menu4 = new JMenu("debug");

        JMenuItem subJMenu = new JMenuItem("save as");
        JMenuItem subJMenu1 = new JMenuItem("Save");
        JMenuItem subJMenu2 = new JMenuItem("debug all");



        //table
        
        String[] tableColoum = new String[] {"S.NO","Name","Roll NO", "Address"};
        //Declaring values in 2D array
        String[][] tableValue = {
            {
                "1","Rohan","22061003","Lalitpur"
            },
            {
                "2","Gokarna","22061002","Kalanki"
            },
            {
                "3","Bishesh","22061024","Thankot"
            }
        }; 

        JTable table = new JTable(tableValue, tableColoum);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 500, 500, 200);


        // font change
        JLabel fontJLabel = new JLabel("Rohan Shrestha");
        fontJLabel.setBounds(10, 700, 500, 50);  
        fontJLabel.setFont(new Font("Chiller",Font.BOLD,40));



        //setting and adding menu bar
        setJMenuBar(menuBar);
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menuBar.add(menu4);

        //adding sub menu
        menu1.add(subJMenu);
        menu1.setEnabled(false); // disabling the menu
        menu2.add(subJMenu1);
        menu3.add(subJMenu2);


        add(comboBox);
        add(checkBox);
        add(checkBox1);
        add(checkBox2);
        add(checkBox3);
        add(radioButton);
        add(radioButton1);
        add(radioButton2);
        add(list);
        add(scrollPane);
        add(fontJLabel);





        setVisible(true);
    }

    public static void main(String[] args) {
               
        new MyFrame();
    }
}
