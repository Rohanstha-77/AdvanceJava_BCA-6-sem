import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class lab1 extends JFrame implements ActionListener {

    public lab1(){
        setTitle("Calculator");
        setSize(800,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); 

        // //Adding label and textField for number 1
        // JLabel label1 = new JLabel("Enter First Number");
        // label1.setBounds(50,30,150,30);
        // add(label1);

        // JTextField textField1 = new JTextField();
        // textField1.setBounds(200,30,150,30);
        // add(textField1);

        // //Adding label and textField for number 2
        // JLabel label2 = new JLabel("Enter Second Number");
        // label2.setBounds(50,70,150,30);
        // add(label2);

        // JTextField textField2 = new JTextField();
        // textField2.setBounds(200,70,150,30);
        // add(textField2);


        // // adding button for sum sum and differnce
        // JButton sumButton = new JButton("Sum");
        // sumButton.setBounds(50,130,90,30);
        // add(sumButton);

        // JButton differenceButton = new JButton("Difference");
        // differenceButton.setBounds(230,130,110,30);
        // add(differenceButton);

        // //adding output field
        // JLabel outpuJLabel = new JLabel("output:");
        // outpuJLabel.setBounds(80,180,150,30);
        // add(outpuJLabel);

        // JTextField outpuTextField = new JTextField();
        // outpuTextField.setBounds(130,180,150,30);
        // add(outpuTextField);

        

        // using panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.setBounds(100, 100, 400, 300);
        panel.setLayout(null); 


        JLabel label1 = new JLabel("Enter First Number");
        label1.setBounds(10,10,150,30);
        
        JTextField textField1 = new JTextField();
        textField1.setBounds(160, 10, 170, 30);

        JLabel label2 = new JLabel("Enter second Number");
        label2.setBounds(10,50,150,30);
        
        JTextField textField2 = new JTextField();
        textField2.setBounds(160, 50, 170, 30);


        JButton sumButton = new JButton("Sum");
        sumButton.setBounds(50,130,90,30);
        add(sumButton);

        JButton differenceButton = new JButton("Difference");
        differenceButton.setBounds(230,130,110,30);
        add(differenceButton);

        JLabel outpuJLabel = new JLabel("output:");
        outpuJLabel.setBounds(80,180,150,30);
        add(outpuJLabel);

        JTextField outpuTextField = new JTextField();
        outpuTextField.setBounds(130,180,150,30);
        add(outpuTextField);

        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(sumButton);
        panel.add(differenceButton);
        panel.add(outpuJLabel);
        panel.add(outpuTextField);
        add(panel);
        setVisible(true);



        sumButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText()); 
                int sum = num1 + num2;
                outpuTextField.setText(String.valueOf(sum));;
            }
            
        });
        
        differenceButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText()); 
               int difference = num1 - num2;
               outpuTextField.setText(String.valueOf(difference));
            }
            
        });


    }
    
    public static void main(String[] args){
        new lab1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    
}