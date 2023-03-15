import javax.swing.*;
import java.awt.*;

public class layeredpane extends JFrame {


    layeredpane(){
        JLayeredPane layeredPane = new JLayeredPane();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();

        label1.setBackground(Color.BLUE);
        label1.setBounds(0,0,50,100);
        label1.setOpaque(true);

        label2.setBackground(Color.RED);
        label2.setBounds(0,0,100,200);
        label2.setOpaque(true);

        label3.setBackground(Color.lightGray);
        label3.setBounds(0,0,150,200);
        label3.setOpaque(true);
        layeredPane.add(label1,JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label2,JLayeredPane.DRAG_LAYER);
        layeredPane.add(label3,JLayeredPane.MODAL_LAYER);
        layeredPane.setBackground(Color.BLACK);
        layeredPane.setSize(420,420);

        layeredPane.setVisible(true);



     JFrame frame = new JFrame("Layered Pane");
     frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setLayout(null);
     frame.setSize(420,420);
     frame.add(layeredPane);
 }

    public static void main(String[] args) {
        new layeredpane();
    }
}
