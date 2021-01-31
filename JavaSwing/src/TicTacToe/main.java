package TicTacToe;

public class main {
    public static void main(String[] args) {
        Runnable_Song a= new Runnable_Song("Home");
        a.run();
        
        Memory.bgSong = new Runnable_Song("Music");
        Memory.bgSong.run();
    }
}
