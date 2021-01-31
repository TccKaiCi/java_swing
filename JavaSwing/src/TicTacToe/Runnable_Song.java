package TicTacToe;

import OneTwoThree.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Runnable_Song implements Runnable {

    private Thread t;
    private String threadName;
    Player player;

    public Runnable_Song(String threadName) {
        this.threadName = threadName;
    }

    public void playSound(String namepath) {
        File file = new File("Music/" + namepath);
        String s = file.getAbsolutePath();
        try {
            FileInputStream fileInputStream = new FileInputStream(s);
            player = new Player(fileInputStream);
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

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            if (threadName.equalsIgnoreCase("Music")) {
                String arrStr = "jojo.mp3";
                
                Thread.sleep(0);
                do {
                    playSound(arrStr);
                } while (player.isComplete());
                
            } 
            if (threadName.equalsIgnoreCase("Home")){
                Thread.sleep(0);
                Home home = new Home();
                home.setVisible(true);
            }
            if (threadName.equalsIgnoreCase("Game")){
                Thread.sleep(0);
                Game game = new Game();
                game.setVisible(true);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    public void stop() {
        System.out.println("Stopping music");
        player.close();
    }
    
}
