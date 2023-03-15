package GUI;

import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {
        myFrame(){
            JLabel label = new JLabel();
            BorderLayout border = new BorderLayout();
            ImageIcon banner  = new ImageIcon("banner.jpg");
            label.setVisible(true);
            label.setText("Playing Dota 2 Theme Song");
            label.setIcon(banner);
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.TOP);
            label.setVerticalAlignment(JLabel.CENTER);
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setForeground(new Color(0x8A1A1A));
            label.setFont(new Font("MV Boli",Font.PLAIN , 20));
            label.setBackground(Color.BLACK);
            label.setOpaque(true);

            this.setVisible(true);
            this.setSize(500,500);
            this.add(label);
            this.setResizable(true);
            this.setTitle("Dota 2");
            this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
            ImageIcon icon = new ImageIcon("dota.jpg");
            this.setIconImage(icon.getImage());
//            this.getContentPane().setBackground(new Color(153, 26, 26));

        }

}
