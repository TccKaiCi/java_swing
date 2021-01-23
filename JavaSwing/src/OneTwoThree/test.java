package OneTwoThree;

import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class test {

    public static void main(String[] args) {

        String bip = "src/OneTwoThree/music.mp3";
        Media hit = new Media(new File(bip).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();

//        try {
//            java.applet.AudioClip clip
//                    = java.applet.Applet.newAudioClip(
//                            new java.net.URL(
//                                    "file://C:/Users/HiamKaito/Desktop/Java/java_swing/JavaSwing/src/OneTwoThree/music.wav"));
//            clip.play();
//        } catch (java.net.MalformedURLException murle) {
//            System.out.println(murle);
//        }
//        while (true) {
//
//        }
    }
}
