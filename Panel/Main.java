package Panel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
            ImageIcon titleicon = new ImageIcon("smileyface.png");
            ImageIcon labelicon = new ImageIcon("tongueout.png");
            int height = labelicon.getIconHeight();
            int width = labelicon.getIconWidth();
        System.out.println(width + "*" +height);
            JLabel label = new JLabel();
            label.setText("Hello Sexy");

            label.setIcon(labelicon);
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.TOP);
            label.setBounds(0,0,250,250);
//            label.setVerticalAlignment(JLabel.TOP);
//            label.setHorizontalAlignment(JLabel.CENTER);


            JPanel redpanel = new JPanel();
            redpanel.setBackground(Color.RED);
            redpanel.setLayout(null);
            redpanel.setBounds(0,0,300,300);
            redpanel.add(label);

            JPanel greenpanel = new JPanel();
            greenpanel.setBackground(Color.GREEN);
            greenpanel.setBounds(300,0,300,300);
            greenpanel.setLayout(null);
//            greenpanel.add(label);

            JPanel bluepanel = new JPanel();
            bluepanel.setBackground(Color.BLUE);
            bluepanel.setBounds(0,300,600,600);
            bluepanel.setLayout(null);
//            bluepanel.add(label);



            JFrame frame = new JFrame();
            frame.setVisible(true);
            frame.setSize(1920,1080);
            frame.setResizable(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Panels in Java");
            frame.setIconImage(titleicon.getImage());
            frame.setLayout(null);
            frame.add(redpanel);
            frame.add(greenpanel);
            frame.add(bluepanel);
    }
}
