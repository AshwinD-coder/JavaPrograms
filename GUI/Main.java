package GUI;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
//        JFrame frame  = new JFrame();
//        frame.setVisible(true);
//        frame.setSize(1920,1080);
//        frame.setResizable(false);
//        frame.setTitle("Spasta Nepali");
//        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
//        ImageIcon icon = new ImageIcon("dota.jpg");
//        frame.setIconImage(icon.getImage());

        myFrame frame  = new myFrame();
        ThemeSong theme = new ThemeSong();
        theme.playClip();
    }
}
