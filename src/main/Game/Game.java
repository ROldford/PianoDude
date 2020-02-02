package Game;

import java.util.ArrayList;

// Game is the loop of one game,
// Game would start with certain key (start key)
// Each game can only has one error:
//      if the wrong key is pressed, restart the game
//      once one sequence is completed (all correct), start the next sequence
//          (next or exit button)
//      end game when out of sequence

public class Game {
    private boolean isCorrectKey;
    private boolean isNextGame;
    private boolean isGameComplete;
    private int score;
    private ArrayList<String> currSong;
    private Keynote noteInput;
    //private Keynote note;

    public Game(ArrayList<String> nextSong){
        isCorrectKey = true;
        isNextGame = false;
        isGameComplete = false;

        currSong = nextSong;
        noteInput = new Keynote();
    }

    // EFFECTS: returns the string in accordance to the key pressed
    public String getKey(){
        return noteInput.getKeyVal();
    }

    // EFFECTS: returns true if the input string matches the corresponding string in song
    public boolean checkKey(String expectedNote){
        return (expectedNote == getKey());
    }

    //EFFECTS: play the current song
    public void playSong(){
        System.out.println("play song!");//stub
    }

    // EFFECTS: starts a new song
    public void startNewSong(){
        playSong();
        ArrayList<String> song = currSong;
        String note;

        while (!isGameComplete) {
            isGameComplete = false;
            while (isCorrectKey && song.size()>0) {
                note = song.get(0);
                isCorrectKey = checkKey(note);
                song.remove(0);
                isCorrectKey = true;
            }
            isGameComplete = true;
        }
        //start next song
        System.out.println("Song completed");
    }

    // this is a test for the game object
    public static void main(String[] args) {
        ArrayList<String> testSong = new ArrayList<>();
        testSong.add("a");
        testSong.add("b");

        Game testGame = new Game(testSong);

        testGame.startNewSong();

    }
}
