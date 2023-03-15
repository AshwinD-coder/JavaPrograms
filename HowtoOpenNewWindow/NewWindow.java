package HowtoOpenNewWindow;

import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame newFrame = new JFrame("New Window");
    JLabel label = new JLabel("Hello, I'm Ashwin Dhougoda and this is your new window. ",0);
    NewWindow(){
        label.setOpaque(true);
        label.setBounds(0,0,500,50);
        label.setHorizontalAlignment(JLabel.LEFT);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setLayout(null);
        newFrame.setSize(500,500);
        newFrame.setVisible(true);
        newFrame.add(label);
    }
}
