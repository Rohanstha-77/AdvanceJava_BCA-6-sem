import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab2 extends JFrame {
    private JFrame frame;
    private JTable table;
    private DefaultTableModel model;
    private JTextField nameField, ageField;
    private JRadioButton maleButton, femaleButton;
    private JComboBox<String> courseBox;
    private JCheckBox scholarshipBox;
    private JList<String> subjectsList;

    public lab2() {
        frame = new JFrame("College Management System");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null); // Center the frame

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(_ -> System.exit(0));
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        // Form Panel
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createTitledBorder("Student Details"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;

        formPanel.add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        nameField = new JTextField(15);
        formPanel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Age:"), gbc);
        gbc.gridx = 1;
        ageField = new JTextField(15);
        formPanel.add(ageField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(new JLabel("Gender:"), gbc);
        gbc.gridx = 1;
        JPanel genderPanel = new JPanel();
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        formPanel.add(genderPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(new JLabel("Course:"), gbc);
        gbc.gridx = 1;
        courseBox = new JComboBox<>(new String[]{"BCA", "BBA", "B.Sc", "B.Tech"});
        formPanel.add(courseBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        formPanel.add(new JLabel("Subjects:"), gbc);
        gbc.gridx = 1;
        subjectsList = new JList<>(new String[]{"Maths", "Science", "Programming", "Economics"});
        formPanel.add(new JScrollPane(subjectsList), gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        formPanel.add(new JLabel("Scholarship:"), gbc);
        gbc.gridx = 1;
        scholarshipBox = new JCheckBox("Apply for Scholarship");
        formPanel.add(scholarshipBox, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        JButton addButton = new JButton("Add Student");
        addButton.setBackground(Color.BLUE);
        addButton.setForeground(Color.WHITE);
        formPanel.add(addButton, gbc);

        // Table Panel
        JPanel tablePanel = new JPanel(new BorderLayout());
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Name", "Age", "Gender", "Course", "Scholarship"});
        table = new JTable(model);
        table.setFillsViewportHeight(true);
        tablePanel.add(new JScrollPane(table), BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String gender = maleButton.isSelected() ? "Male" : "Female";
                String course = (String) courseBox.getSelectedItem();
                String scholarship = scholarshipBox.isSelected() ? "Yes" : "No";

                model.addRow(new Object[]{name, age, gender, course, scholarship});
            }
        });

        // Adding components to frame
        frame.add(formPanel, BorderLayout.WEST);
        frame.add(tablePanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(lab2::new);
    }
}