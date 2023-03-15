package AshwinsMusicPlayer;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.*;
import javax.sound.sampled.LineUnavailableException;
import java.io.File;
import java.io.IOException;

public class Player extends Music{
    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file1);
    Clip clip = AudioSystem.getClip();

    public Player() throws LineUnavailableException, UnsupportedAudioFileException, IOException {

    }
}
