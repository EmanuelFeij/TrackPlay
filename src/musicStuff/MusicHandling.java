package musicStuff;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;

public class MusicHandling {
    void playMusic(String musicLocation) {

        try {

            //
            File musicPath = new File(musicLocation);

            //checks if the file exists
            if (musicPath.exists()) {

                //A stream is created to get input to the Clip object
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);


                // Open the stream
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);


                // Start to play
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);

                // A little message to give the option to stop the clip loop
                JOptionPane.showMessageDialog(null,"Press OK to Stop");
                long clipTimePosition = clip.getMicrosecondPosition();
                clip.stop();


                // A little message to give the option to resume the clip loop
                JOptionPane.showMessageDialog(null,"Press OK to Resume");
                clip.setMicrosecondPosition(clipTimePosition);
                clip.start();

                // A little message to give the option to stop the clip loop
                JOptionPane.showMessageDialog(null,"Press OK to Stop");
                clip.stop();
            } else {
                System.out.println("Can't find file!!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
