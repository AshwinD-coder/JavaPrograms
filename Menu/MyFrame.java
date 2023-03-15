package Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {
    JMenuBar menu = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenu edit = new JMenu("Edit");
    JMenu help = new JMenu("Help");
    JMenuItem load = new JMenuItem("Load");
    JMenuItem save = new JMenuItem("Save");
    JMenuItem exit = new JMenuItem("Exit");
    JMenuItem Colorpicker = new JMenuItem("Color Picker");

    JLabel label;
    MyFrame(){
        label = new JLabel("This is a text :D.");

        label.setFont(new Font(Font.SERIF,Font.PLAIN,25));
        label.setBackground(Color.white);
        label.setVerticalTextPosition(JLabel.CENTER);
        new JFrame();
        this.setTitle("Menu bars");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(new BorderLayout());
        this.add(menu,BorderLayout.NORTH);
        this.add(label,BorderLayout.CENTER);
        menu.add(file);
        menu.add(edit);
        menu.add(help);
        file.add(load);
        file.add(save);
        file.add(exit);
        edit.add(Colorpicker);
        Colorpicker.addActionListener(this);
        load.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);

        file.setMnemonic(KeyEvent.VK_F);
        edit.setMnemonic(KeyEvent.VK_E);
        help.setMnemonic(KeyEvent.VK_H);

        load.setMnemonic(KeyEvent.VK_L);
        save.setMnemonic(KeyEvent.VK_S);
        exit.setMnemonic(KeyEvent.VK_E);

        this.setSize(500,500);


        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == load){
          JFileChooser fileChooser = new JFileChooser();
          int response = fileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                System.out.println(fileChooser.getSelectedFile().getAbsolutePath());
            }
        }
        if(e.getSource() == save){
            System.out.println("Save menu clicked!");
        }
        if(e.getSource() == exit){
        System.exit(0);
        }
        if(e.getSource() == Colorpicker){
          JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null,"Color picker",Color.WHITE);
            label.setForeground(color);
        }
    }
}
