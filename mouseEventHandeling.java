

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mouseEventHandeling extends JFrame{

    public mouseEventHandeling() {

        setTitle("Calculator");
        setSize(800,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); 
    
        JFrame frame = new JFrame();
        JButton button = new JButton();
        JLabel label = new JLabel("hello");
        add(button);
        add(frame);

        


        
    }
    public static void main(String[] args) {
        new mouseEventHandeling();
    }
}
