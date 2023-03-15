package BorderLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.BLUE);
        panel2.setBackground(Color.RED);
        panel3.setBackground(Color.GRAY);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.PINK);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));



        JFrame frame = new JFrame();
        frame.setSize(750,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        frame.setTitle("Border Testing");
        frame.add(panel1,BorderLayout.NORTH);
//        frame.add(panel2,BorderLayout.EAST);
        frame.add(panel3,BorderLayout.WEST);
//        frame.add(panel4,BorderLayout.SOUTH);
//        frame.add(panel5,BorderLayout. CENTER);



    }
}
