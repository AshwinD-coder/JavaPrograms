package GUI;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class ThemeSong {
    File file = new File("dota2.wav");
    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
    Clip clip = AudioSystem.getClip();

    public void playClip() throws LineUnavailableException, IOException {
        clip.open(audioInputStream);
        clip.start();
    }

    public ThemeSong() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    }
}
