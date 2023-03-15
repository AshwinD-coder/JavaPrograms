package MusicPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("C:\\Users\\Administrator\\OneDrive\\Desktop\\Super Mario Bros. Theme Song.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        String response = "";
        while (!response.equals("Q")) {
            System.out.println("P-->Play\t S-->Stop\t R-->Reset F-->Forward\t B-->Backward\tQ-->Quit");
            response = scanner.nextLine();
            response = response.toUpperCase();
            switch (response) {
                case "P":
                    clip.start();
                    break;
                case "S":
                    clip.stop();
                    break;
                case "R": clip.setMicrosecondPosition(0);
                break;
                case "F":
                    int forward = clip.getFramePosition()+200000;
                    clip.setFramePosition(forward);
                    break;
                case "B":
                    int backward = clip.getFramePosition()-200000;
                    clip.setFramePosition(backward);
                    break;
                case "Q": clip.close();
                break;
                default:
                    System.out.println("** Invalid input **");
            }
        };
        System.out.println("*** Music Player Stopped ***");
    }
}
