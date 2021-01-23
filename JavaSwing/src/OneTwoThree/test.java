package OneTwoThree;

import java.io.File;
import java.util.Random;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class test {

    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(rand.nextInt(4)+1);
        }

    }
}
