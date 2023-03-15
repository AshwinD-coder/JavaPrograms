import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class myFrame extends JFrame implements ActionListener, KeyListener {
    JFrame frame = new JFrame("TextField");
    JButton myButton =new JButton("Submit");

    JTextField textField = new JTextField();

    public static void main(String[] args) {
      myFrame field = new myFrame();
      field.myButton.setVisible(true);
      field.myButton.setBounds(0,0,100,50);
      field.myButton.addActionListener(field);
      field.textField.setBounds(110,0,200,50);
      field.textField.setBackground(new Color(0x000000));
      field.textField.setFont(new Font("Consolas",Font.PLAIN,20));
      field.textField.setForeground(new Color(0x00FD2A));
      field.textField.setCaretColor(Color.white);
      field.textField.addKeyListener(field);
      field.frame.setVisible(true);
      field.frame.setSize(300,300);
      field.frame.setLayout(null);
      field.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      field.frame.add(field.myButton);
      field.frame.add(field.textField);
      field.textField.requestFocusInWindow();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==myButton){
            System.out.println("Welcome "+textField.getText());
            textField.setText(null);
            textField.setEnabled(false);
            myButton.setEnabled(false);
        }

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar()==KeyEvent.VK_ENTER){
            System.out.println("Welcome "+textField.getText());
            myButton.setEnabled(false);
            textField.setText(null);
            textField.setEnabled(false);
            textField.setVisible(false);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
