package JButtonPractice;

import javax.swing.*;
import java.awt.*;

public class Myframe extends JFrame {
    Myframe(){
        JButton button = new JButton();
        ImageIcon icon = new ImageIcon("poop.jpg");

        JLabel label = new JLabel();
        label.setIcon(icon);
        label.setBounds(0,270,225,225);
        label.setVisible(false);
        button.setSize(400,250);

        button.setText("**Click me to poo**");
        button.setFocusable(false);
        button.setLayout(null);
        button.setVerticalAlignment(JButton.CENTER);
        button.setHorizontalAlignment(JButton.CENTER);

        button.addActionListener((e) -> System.out.println("Poo") );
        button.addActionListener((e) -> label.setVisible(true) );


        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.add(button);
        this.add(label);
    }
}
