package HowtoOpenNewWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchWindow implements ActionListener{
    JFrame launchFrame = new JFrame("Launch Window");
    JButton launchButton = new JButton("Click here to open new window");
    LaunchWindow(){
        launchButton.setFocusable(false);
        launchButton.setBounds(100,100,300,100);
//        launchButton.addActionListener(e -> {
//            launchFrame.dispose();
//            NewWindow window = new NewWindow();
//        });
        launchButton.addActionListener(this);
        launchFrame.add(launchButton);
        launchFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        launchFrame.setLayout(null);
        launchFrame.setSize(500,500);
        launchFrame.setVisible(true);



    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==launchButton){
            launchFrame.dispose();
            NewWindow newWindow = new NewWindow();


        }
    }



}
