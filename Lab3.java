import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Lab3 extends JFrame {

    private JTextField textField1, textField2, outputTextField;

    public Lab3() {
        setTitle("Sum & Difference Calculator");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Labels
        JLabel label1 = new JLabel("Enter First Number:");
        label1.setBounds(30, 30, 150, 30);
        add(label1);

        JLabel label2 = new JLabel("Enter Second Number:");
        label2.setBounds(30, 70, 150, 30);
        add(label2);

        JLabel outputLabel = new JLabel("Output:");
        outputLabel.setBounds(30, 150, 150, 30);
        add(outputLabel);

        // Text Fields
        textField1 = new JTextField();
        textField1.setBounds(180, 30, 150, 30);
        add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(180, 70, 150, 30);
        add(textField2);

        outputTextField = new JTextField();
        outputTextField.setBounds(180, 150, 150, 30);
        outputTextField.setEditable(false);
        add(outputTextField);

        // Sum Button (performs sum when pressed)
        JButton sumButton = new JButton("Sum");
        sumButton.setBounds(80, 110, 100, 30);
        add(sumButton);

        sumButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                performOperation(true); // Perform sum when button is pressed
            }
        });

        // Difference Button (performs difference when released)
        JButton diffButton = new JButton("Difference");
        diffButton.setBounds(200, 110, 120, 30);
        add(diffButton);

        diffButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                performOperation(false); // Perform difference when button is released
            }
        });

        setVisible(true);
    }

    private void performOperation(boolean isSum) {
        try {
            int num1 = Integer.parseInt(textField1.getText().trim());
            int num2 = Integer.parseInt(textField2.getText().trim());
            int result = isSum ? (num1 + num2) : (num1 - num2);
            outputTextField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            outputTextField.setText("Invalid input!");
        }
    }

    public static void main(String[] args) {
        new Lab3();
    }
}
