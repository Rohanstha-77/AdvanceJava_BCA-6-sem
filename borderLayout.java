import javax.swing.*;
import java.awt.BorderLayout;

public class borderLayout extends JFrame {

    public borderLayout() {
    
        JButton btnNorth = new JButton("Button 1");
        JButton btnSouth = new JButton("Button 2");
        JButton btnEast = new JButton("Button 3");
        JButton btnWest = new JButton("Button 4");
        JButton btnCenter = new JButton("Button 5");

        add(btnNorth,BorderLayout.NORTH);
        add(btnSouth,BorderLayout.SOUTH);
        add(btnEast,BorderLayout.EAST);
        add(btnWest,BorderLayout.WEST);
        add(btnCenter,BorderLayout.CENTER);
        
        setTitle("Border Layout");
        setSize(600,900);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new borderLayout();
    }
}
