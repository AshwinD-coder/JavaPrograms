package TwoDimensionalGraphics;

import javax.swing.*;
import javax.xml.stream.Location;
import java.awt.*;

public class myFrame extends JFrame {
    myPanel panel = new myPanel();
    myFrame(){
        this.setTitle("2D-Graphics");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }

}
