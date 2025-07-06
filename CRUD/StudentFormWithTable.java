import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;


public class StudentFormWithTable {
    JFrame frame;
    JTextField nameField, addressField;
    JComboBox<String> courseBox;
    JTable table;
    JScrollPane scrollPane;

    public StudentFormWithTable() {
        frame = new JFrame("Student Form");
        frame.setSize(600, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 30, 100, 30);
        frame.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(150, 30, 200, 30);
        frame.add(nameField);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 70, 100, 30);
        frame.add(addressLabel);

        addressField = new JTextField();
        addressField.setBounds(150, 70, 200, 30);
        frame.add(addressField);

        JLabel courseLabel = new JLabel("Course:");
        courseLabel.setBounds(50, 110, 100, 30);
        frame.add(courseLabel);

        courseBox = new JComboBox<>(new String[] { "Math", "Science", "Arts" });
        courseBox.setBounds(150, 110, 200, 30);
        frame.add(courseBox);

        JButton addButton = new JButton("Add");
        addButton.setBounds(150, 160, 80, 30);
        frame.add(addButton);

        JButton showButton = new JButton("Show");
        showButton.setBounds(240, 160, 80, 30);
        frame.add(showButton);

        // Table and ScrollPane
        table = new JTable();
        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 210, 480, 200);
        frame.add(scrollPane);

        // Button to insert data
        addButton.addActionListener(e -> insertData());

        // Button to load data into JTable
        showButton.addActionListener(e -> loadData());

        frame.setVisible(true);
    }

    void insertData() {
        String name = nameField.getText();
        String address = addressField.getText();
        String course = (String) courseBox.getSelectedItem();

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CURDinJava", "root", "Nikesh@2206");
            String query = "INSERT INTO students (name, address, course) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, name);
            stmt.setString(2, address);
            stmt.setString(3, course);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(frame, "Data Inserted");
            stmt.close();
            conn.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
        }
    }

    public void loadData() {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "melishma@123");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");

        // Table Headers (convert ArrayList to String array)
        ArrayList<String> columnNames = new ArrayList<>();
        columnNames.add("ID");
        columnNames.add("Name");
        columnNames.add("Address");
        columnNames.add("Course");

        // Convert ArrayList to String[] for column names
        String[] columnNamesArray = columnNames.toArray(new String[0]);

        // Table Data
        ArrayList<ArrayList<Object>> data = new ArrayList<>();
        while (rs.next()) {
            ArrayList<Object> row = new ArrayList<>();
            row.add(rs.getInt("id"));
            row.add(rs.getString("name"));
            row.add(rs.getString("address"));
            row.add(rs.getString("course"));
            data.add(row);
        }

        // Convert ArrayList<ArrayList<Object>> to Object[][]
        Object[][] dataArray = new Object[data.size()][columnNames.size()];
        for (int i = 0; i < data.size(); i++) {
            ArrayList<Object> row = data.get(i);
            for (int j = 0; j < row.size(); j++) {
                dataArray[i][j] = row.get(j);
            }
        }

        // Set data to table using DefaultTableModel
        table.setModel(new javax.swing.table.DefaultTableModel(dataArray, columnNamesArray));

        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
    }
}


    public static void main(String[] args) {
        new StudentFormWithTable();
    }
}