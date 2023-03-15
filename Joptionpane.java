import javax.swing.*;

public class Joptionpane {
    public static void main(String[] args){
        ImageIcon icon = new ImageIcon("tongueout.png");
// JOptionPane.showMessageDialog(null,"Hello! You look beautiful today ! <3","Message of the Day",JOptionPane.PLAIN_MESSAGE,icon);
//        JOptionPane.showMessageDialog(null,"Do you want to show a question dialog box? ","Question",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Do you want to show a question dialog box? ","Question",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Do you want to show a question dialog box? ","Question",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Do you want to show a question dialog box? ","Question",JOptionPane.ERROR_MESSAGE);
        int value = JOptionPane.showInternalConfirmDialog(null,"This is an internal Confirm Dialog.");
        System.out.println(value);
        int value2 = JOptionPane.showOptionDialog(null,"Do you understand this option dialog?","Option Dialog",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,icon,null,"Ashwin");
        System.out.println(value2);
    }
}
