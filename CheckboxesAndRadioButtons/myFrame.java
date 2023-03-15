package CheckboxesAndRadioButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener {
    JCheckBox checkBox1 ;
    JCheckBox checkBox2 ;
    JRadioButton radioButton1;
    JRadioButton radioButton2;

    myFrame(){
        radioButton1 = new JRadioButton("Yes");
        radioButton2 = new JRadioButton("No");
        radioButton1.setFocusable(false);
        radioButton2.setFocusable(false);
        radioButton2.addActionListener(this);
        radioButton1.addActionListener(this);
        checkBox1 = new JCheckBox("Male");
        checkBox2 =  new JCheckBox("Female");
        checkBox1.setFocusable(false);
        checkBox2.setFocusable(false);
        checkBox2.setOpaque(true);
        checkBox1.setSize(50,50);
        checkBox2.setSize(50,50);
        checkBox1.addActionListener(this);
        checkBox2.addActionListener(this);
      new JFrame();
        this.setTitle("CheckBoxes And RadioButtons");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(420,420);
        this.add(checkBox1);
        this.add(checkBox2);
        this.add(radioButton1);
        this.add(radioButton2);
        this.setVisible(true);




    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==checkBox1 && checkBox1.isSelected()==true){
            System.out.println("You are: "+checkBox1.getText());
            checkBox2.setEnabled(false);

        }
        if(e.getSource()==checkBox2 && checkBox2.isSelected()==true){
            System.out.println("You are: "+checkBox2.getText());
            checkBox1.setEnabled(false);

        }
        if(e.getSource()==checkBox1 && checkBox1.isSelected()==false){
            System.out.println("You unchecked: "+checkBox1.getText());
            checkBox2.setEnabled(true);

        }
        if(e.getSource()==checkBox2 && checkBox2.isSelected()==false){
            System.out.println("You unchecked: "+checkBox2.getText());
            checkBox1.setEnabled(true);

        }
        if(e.getSource()==radioButton2){
            if(radioButton2.isSelected()==false){
                System.out.println("You deselected: "+radioButton2.getText());
                radioButton1.setEnabled(true);
                return;
            }
            System.out.println("You selected: "+radioButton2.getText());
            radioButton1.setEnabled(false);
        }
        if(e.getSource()==radioButton1){
            if(radioButton1.isSelected()==false){
                System.out.println("You deselected: "+radioButton1.getText());
                radioButton2.setEnabled(true);
                return;
            }
            System.out.println("You selected: "+radioButton1.getText());
            radioButton2.setEnabled(false);
        }

    }
}
