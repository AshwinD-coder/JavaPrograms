package mySlider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.Arrays;

public class Myslider extends JFrame implements ChangeListener , MouseWheelListener {
    JSlider slider;
    JPanel panel;
    JLabel label;
    Cursor cursor;
    Toolkit toolkit;
    Myslider(){
        new JFrame();
toolkit = Toolkit.getDefaultToolkit();

        cursor = toolkit.createCustomCursor(
                toolkit.getImage("scrolling.png"),
                new Point(0,0),
                "Scrolling Cursor"
        );
        label = new JLabel();
        label.setFont(new Font("Consolas",Font.PLAIN,20));
        panel = new JPanel();
        panel.setSize(400,400);
        slider = new JSlider(0,100,0);
        slider.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,25));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setOrientation(JSlider.VERTICAL);
        slider.setPaintLabels(true);
        slider.setFocusable(false);
        slider.setCursor(cursor);
        slider.addChangeListener(this);
        slider.addMouseWheelListener(this);
        label.setText("Your age: "+slider.getValue());

        panel.add(slider);
        panel.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(panel);
        this.setVisible(true);

        this.setSize(420,420);
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource()==slider){
            label.setText("Your age: "+slider.getValue());
        }
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        if(e.getSource()==slider && e.getWheelRotation()<0){
            slider.setValue(slider.getValue()+1);
        }
        if(e.getSource()==slider && e.getWheelRotation()>0){
            slider.setValue(slider.getValue()-1);
        }
    }
}
