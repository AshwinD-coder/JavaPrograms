package KeyBindings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {
    JLabel label;
    Action UpAction;
    Action DownAction;
    Action LeftAction;
    Action RightAction;

    Game(){
        UpAction = new upAction();
        DownAction = new downAction();
        LeftAction = new leftAction();
        RightAction = new rightAction();

        label = new JLabel();
        label.setBackground(Color.RED);
        label.setBounds(100,100,100,100);
        label.setOpaque(true);
        label.getInputMap().put(KeyStroke.getKeyStroke("UP"),"UpAction");
        label.getActionMap().put("UpAction",UpAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"DownAction");
        label.getActionMap().put("DownAction",DownAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"LeftAction");
        label.getActionMap().put("LeftAction",LeftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"RightAction");
        label.getActionMap().put("RightAction",RightAction);

        JFrame frame = new JFrame("Key Bindings in Java Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);

    }
    public class upAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()-10);
        }
    }
    public class downAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()+10);

        }
    }
    public class leftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10,label.getY());


        }
    }
    public class rightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+10,label.getY());

        }
    }
}
