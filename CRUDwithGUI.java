import javax.swing.*;
// import javax.swing.table.DefaultTableColumnModel;

interface CurdMethods{
    void Insert();
    void update();
    void delete();
    void read();
}

public class CRUDwithGUI extends JFrame {

    public CRUDwithGUI(){
        setVisible(true);
        setSize(700,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel RollNO = new JLabel("Roll No:");
        RollNO.setBounds(50,50,50,40);
        JTextArea RollNOField = new JTextArea();
        RollNOField.setBounds(120,60,200,20);

        JLabel NameLabel = new JLabel("Name:");
        NameLabel.setBounds(50,90,50,40);
        JTextArea NameField = new JTextArea();
        NameField.setBounds(120,100,200,20);

        JLabel LevelLabel = new JLabel("Level:");
        LevelLabel.setBounds(50,140,50,40);
        JTextArea LevelField = new JTextArea();
        LevelField.setBounds(120,150,200,20);

        JLabel MajorLabel = new JLabel("Major:");
        MajorLabel.setBounds(50,190,50,40);
        JTextArea MajorField = new JTextArea();
        MajorField.setBounds(120,200,200,20);

        JLabel DivisionLabel = new JLabel("Divison:");
        DivisionLabel.setBounds(50,240,50,40);
        JTextArea DivisionField = new JTextArea();
        DivisionField.setBounds(120,250,200,20);

        JButton InsertButton = new JButton("Insert");
        InsertButton.setBounds(80, 300, 70, 30);


        // DefaultTableColumnModel tableColumn = new DefaultTableColumnModel();

        add(RollNO);
        add(RollNOField);

        add(NameLabel);
        add(NameField);

        add(LevelLabel);
        add(LevelField);

        add(MajorLabel);
        add(MajorField);

        add(DivisionLabel);
        add(DivisionField);

        add(InsertButton);

    }
    public static void main(String[] args) {
        new CRUDwithGUI();
    }
}
