package TwoDimensionalAnimation;

import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {
    public ImageIcon icon= new ImageIcon("DVD_logo.png");

    myPanel panel = new myPanel();

    myFrame(){

        this.setTitle("Sony TV Display");
        this.setIconImage(icon.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.add(panel);
        this.pack();
    }
}
