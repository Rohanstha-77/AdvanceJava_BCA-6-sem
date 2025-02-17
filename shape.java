import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class shape extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        
        g.setColor(Color.GREEN);
        g.fillRect(20, 20, 300, 200);

        g.fill3DRect(20, 50, 300, 200, true);
        
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Shape");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.add(new shape());
    }
}
