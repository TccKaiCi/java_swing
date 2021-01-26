package OneTwoThree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class test {

    public static void main(String[] args) {
//        playSound("Every Jojo’s Bizarre Adventure Opening But With 8-Bit Music.mp3");
//        Home home = new Home();
//        home.setVisible(true);


        // Get Current Directory using getAbsolutePath()
        File file = new File("Music/Every Jojo’s Bizarre Adventure Opening But With 8-Bit Music.mp3");
        String currentDirectory = file.getAbsolutePath();

//        FileInputStream fileInputStream = new FileInputStream(currentDirectory);
//        Player player = new Player(fileInputStream);
//        System.out.println("Song is playing...");
//        System.out.println(currentDirectory);
//        player.play();
    }

    public static void playSound(String namepath) {
        String s = "C:/Users/HiamKaito/Desktop/Java/java_swing/JavaSwing/src/OneTwoThree/" + namepath;
        try {
            FileInputStream fileInputStream = new FileInputStream(s);
            Player player = new Player(fileInputStream);
            System.out.println("Song is playing...");
            System.out.println(s);
            player.play();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JavaLayerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
