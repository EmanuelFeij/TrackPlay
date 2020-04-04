/*
the ideia of this project is to play a simple .wav


 */

package musicStuff;

public class Main {
    public static void main(String[] args)  {

        // path to a .wav file
        String path = "./res/brass.wav";

        // call to the musicHandling class
        MusicHandling musicHandling = new MusicHandling();
        musicHandling.playMusic(path);
    }
}
