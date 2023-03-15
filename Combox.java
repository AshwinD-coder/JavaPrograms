import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Combox  {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Combo Box");
        String[] foods = {"Pizza","KFC","Burger","Sausages","Fried Chips","this is a long list of food"};
        JComboBox comboBox = new JComboBox(foods);
        comboBox.addItem("Chocolates");
        comboBox.insertItemAt("Choose your desired food from this list",0);
        comboBox.setSelectedIndex(0);
        comboBox.requestFocus();
        comboBox.addActionListener(e -> {
            System.out.println("Current item: "+comboBox.getSelectedItem());

        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.add(comboBox);
    }



}
