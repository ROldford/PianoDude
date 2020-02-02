package Game;


import Sound.SequenceGenerator;

import java.awt.event.KeyEvent;
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
    private SequenceGenerator sqGen;
    private boolean isListening;
    private String lastKeyPressed;

    public Game(){
        isCorrectKey = true;
        isNextGame = false;
        isGameComplete = false;
        isListening = false;
    }

    public void keyPressed(KeyEvent ke) {
        char temp;
        ArrayList<String> tempList = new ArrayList<>();

        if (isListening) {
            temp = ke.getKeyChar();
            lastKeyPressed = Character.toString(temp);
            tempList.add(lastKeyPressed);
            playSong(tempList);
            // update panel
        }

    }

    // EFFECTS: returns true if the input string matches the corresponding string in song
    public boolean checkKey(String expectedNote){
        return (lastKeyPressed.equalsIgnoreCase(expectedNote));
    }

    //EFFECTS: play the current song
    public void playSong(ArrayList<String> song){
        System.out.println("play song!");//stub
    }

    // EFFECTS: starts a new song
    public void startNewSong(){

        currSong = sqGen.generateString();
        ArrayList<String> song = currSong;
        String note;

        playSong(currSong);

        while (!isGameComplete) {

            while (isCorrectKey && song.size()>0) {
                isListening = true;
                note = song.get(0);

                isCorrectKey = checkKey(note);

                song.remove(0);
            }

            isListening = false;
            isGameComplete = true;
        }
        //start next song
        System.out.println("Song completed");
    }

}
