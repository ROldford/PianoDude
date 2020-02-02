package Game;


import Sound.*;

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
    private PianoNote notePlayer;

    public Game(){
        isCorrectKey = true;
        isNextGame = false;
        isGameComplete = false;
        isListening = false;
    }

    // MODIFIES: this
    // EFFECTS: receives the last pressed key string value,
    //          call play song on last pressed note, update piano panel
    public void keyPressed(KeyEvent ke) {
        char temp;

        if (isListening) {
            temp = ke.getKeyChar();
            lastKeyPressed = Character.toString(temp).toUpperCase();
            playSong(lastKeyPressed);
            updatePanel(lastKeyPressed);
        }

    }

    // EFFECTS: returns true if the input string matches the corresponding string in song
    public boolean checkKey(String expectedNote){
        return (lastKeyPressed.equalsIgnoreCase(expectedNote));
    }

    // EFFECTS: play the current song
    public void playSong(String note){
        notePlayer.playNote(note);
    }

    // EFFECTS: update the piano panel with the last pressed key
    public void updatePanel(String inputKey) {
        System.out.println("update panel" + inputKey);// stub
    }


    // EFFECTS: starts a new song
    public void startNewSong(){

        while (!isNextGame) {

            currSong = sqGen.generateString();
            ArrayList<String> song = currSong;
            String note;

            for (String s: currSong) {
                playSong(s);
            }

            while (!isGameComplete) {

                while (isCorrectKey && song.size() > 0) {
                    isListening = true;
                    note = song.get(0);

                    isCorrectKey = checkKey(note);

                    song.remove(0);
                }

                if (song.size() == 0) {
                    isListening = false;
                    isGameComplete = true;
                }

                System.out.println("try again!");
            }

            if (isGameComplete && isCorrectKey) {
                System.out.println("Congratulation! You complete the song!\n next song!");
            }
        }

    }

}
