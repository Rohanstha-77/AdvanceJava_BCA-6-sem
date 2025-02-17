import javax.swing.*;
import java.awt.*;
public class FlowLayout extends JFrame {
    public  FlowLayout(){

        JPanel panel = new JPanel();


        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        JButton btn6 = new JButton("Button 6");
        JButton btn7 = new JButton("Button 7");
        JButton btn8 = new JButton("Button 8");


        //adding button in Jpanel
        // panel.add(btn1);
        // panel.add(btn2);
        // panel.add(btn3);
        // panel.add(btn4);
        // panel.add(btn5);
        // panel.add(btn6);
        // panel.add(btn7);
        // panel.add(btn8);


        // adding pane in jFrame

        // add(panel); 
        
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);


        setLayout(new java.awt.FlowLayout());

        setTitle("Flow Layout");
        setSize(600,900);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    public static void main (String[] args){
        new FlowLayout();
    }
}
