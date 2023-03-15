package ProgressBar;

import javax.swing.*;
import java.awt.*;

public class ProgressBar extends JFrame {
    JProgressBar bar = new JProgressBar(0,100);
    JLabel label = new JLabel();
    ImageIcon icon = new ImageIcon("middle.png");
    ProgressBar() throws InterruptedException {

        new JFrame();
        label.setBounds(100,50,300,300);
        label.setText("Complete");
        label.setFont(new Font("MV Boli",Font.BOLD,25));
        label.setIconTextGap(20);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setIcon(icon);
        bar.setBackground(Color.BLACK );
        bar.setStringPainted(true);
        bar.setBounds(0,0,400,100);
        bar.setFont(new Font("Consolas",Font.PLAIN,30));
        bar.setForeground(Color.GREEN);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(null);
        this.add(bar);
        this.setVisible(true);
        fill();
    }
    public void fill() throws InterruptedException {
        Thread.sleep(1000);
        int counter = 0;
        while(counter<=100){
            Thread.sleep(50);
            bar.setValue(counter);
            counter += 1;
        }
        Thread.sleep(50);

        this.remove(bar);
        this.setResizable(false);
        this.validate();
        this.add(label);

    }
}
