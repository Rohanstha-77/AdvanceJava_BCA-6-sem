import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class gridLayout extends JFrame {
    public gridLayout(){

        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);

        setLayout(new GridLayout(2,2,10,10));

        setTitle("Grid Layout");
        setSize(600,900);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new gridLayout();
    }
}
