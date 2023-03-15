package AshwinsMusicPlayer;

import javax.sound.sampled.Control;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Arrays;

public class Myframe extends JFrame {
    private ImageIcon titleicon = new ImageIcon("logo.png");
    private ImageIcon playicon = new ImageIcon("play.png");
    private ImageIcon stopicon = new ImageIcon("stop.png");

    private ImageIcon reseticon = new ImageIcon("Reset.png");
    private ImageIcon quiticon = new ImageIcon("quit.png");

    private ImageIcon previcon = new ImageIcon("previous.png");
    private ImageIcon nexticon = new ImageIcon("next.png");


//    public ImageIcon playicon = new ImageIcon("play.png");
//    public ImageIcon playicon = new ImageIcon("play.png");
    Player music = new Player();


    Myframe() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        music.loadMusic();
        music.clip.open(music.audioInputStream);

        JLabel label = new JLabel();
        label.setText("--- Welcome to Ashwin's Music Player ---");
        label.setFont(new Font("Sans-serif", Font.BOLD, 16));
        label.setForeground(new Color(0x272730));
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);




        JButton buttonPlay = new JButton();
        buttonPlay.setIcon(playicon);
        buttonPlay.setLayout(null);
        buttonPlay.setSize(50,50);
        buttonPlay.setFocusable(false);
        buttonPlay.addActionListener(e-> {
            try {
                play();
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            } catch (UnsupportedAudioFileException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        JButton buttonPrev = new JButton();
        buttonPrev.setIcon(previcon);
        buttonPrev.setLayout(null);
        buttonPrev.setSize(50,50);
        buttonPrev.setFocusable(false);
        buttonPrev.addActionListener(e-> {
            try {
                stop();
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            } catch (UnsupportedAudioFileException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });


        JButton buttonStop = new JButton();
        buttonStop.setIcon(stopicon);
        buttonStop.setLayout(null);
        buttonStop.setSize(50,50);
        buttonStop.setFocusable(false);
        buttonStop.addActionListener(e-> {
            try {
                stop();
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            } catch (UnsupportedAudioFileException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        JButton buttonNext = new JButton();
        buttonNext.setIcon(nexticon);
        buttonNext.setLayout(null);
        buttonNext.setSize(50,50);
        buttonNext.setFocusable(false);
        buttonNext.addActionListener(e-> {
            try {
                stop();
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            } catch (UnsupportedAudioFileException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        JButton buttonReset = new JButton();
        buttonReset.setIcon(reseticon);
        buttonReset.setLayout(null);
        buttonReset.setSize(50,50);
        buttonReset.setFocusable(false);
        buttonReset.addActionListener(e-> {
            try {
                reset();
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            } catch (UnsupportedAudioFileException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });


        JButton buttonQuit = new JButton();
        buttonQuit.setIcon(quiticon);
        buttonQuit.setLayout(null);
        buttonQuit.setSize(50,50);
        buttonQuit.setFocusable(false);
        buttonQuit.addActionListener(e-> {
            try {
                quit();
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            } catch (UnsupportedAudioFileException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        buttonPlay.setToolTipText("Play");
        buttonStop.setToolTipText("Pause/Stop ");
        buttonNext.setToolTipText("Next track");
        buttonPrev.setToolTipText("Previous track");
        buttonReset.setToolTipText("Reset current track");
        buttonQuit.setToolTipText("Quit");

        JPanel toppanel = new JPanel();
        toppanel.setVisible(true);
        toppanel.setPreferredSize(new Dimension(100,50));
        toppanel.setBackground(new Color(0x99999F));
        toppanel.setOpaque(true);
        toppanel.add(label);

        JPanel playpanel = new JPanel();
        playpanel.setVisible(true);
        playpanel.setPreferredSize(new Dimension(300,50));
        playpanel.setLayout(new GridLayout(0,6,5,0));

        playpanel.add(buttonPlay);
        playpanel.add(buttonPrev);
        playpanel.add(buttonStop);
        playpanel.add(buttonNext);
        playpanel.add(buttonReset);
        playpanel.add(buttonQuit);


        JPanel playlistpanel = new JPanel();
        playlistpanel.setVisible(true);
        playlistpanel.setPreferredSize(new Dimension(300,0));
        playlistpanel.setBackground(new Color(0x80808F));
        playlistpanel.setOpaque(true);
        playlistpanel.add(new JLabel("1.Mc-Flo - Lay It Down",2));
        playlistpanel.add(new JLabel("2.Miss you",2));

        this.setIconImage(titleicon.getImage());
        this.setVisible(true);
        this.setSize(720,420);
        this.setTitle("Ashwin's Music Player");
        this.setLayout(new BorderLayout(20,20));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(toppanel,BorderLayout.NORTH);
        this.add(playlistpanel,BorderLayout.WEST);

        this.add(playpanel,BorderLayout.SOUTH);



    }
    public void play() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        int length = music.clip.getFrameLength();
        music.clip.start();
        if(music.clip.getFramePosition()==length) {
            System.out.println(length);
            System.out.println(music.clip.getFramePosition());

            music.clip.setMicrosecondPosition(0);
            music.clip.start();
        }

        }
    public void stop() throws LineUnavailableException, UnsupportedAudioFileException, IOException {

        music.clip.stop();
    }
    public void reset() throws LineUnavailableException, UnsupportedAudioFileException, IOException {

        music.clip.setMicrosecondPosition(0);
    }
    public void quit() throws LineUnavailableException, UnsupportedAudioFileException, IOException {

        music.clip.close();
        System.exit(0);
    }


}
