package AshwinsMusicPlayer;

import java.io.File;

public class Music {
   public File[] files = new File[10];
    File file1 = new File("Mc-Flo - Lay It Down.wav");
    File file2 = new File("Miss You.wav");
    public void loadMusic(){
        files[0] =file1;
        files[1] =file2;

    }
}
