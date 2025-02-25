

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
        

        // label.addMouseListener((MouseListener) new MouseAdapter(){
        //     @Override
        //     public void mouseEntered(MouseEvent e){

        //         label.setText("Rohan");
        //     }
        // });
        


        
    }
    public static void main(String[] args) {
        new mouseEventHandeling();
    }
}
