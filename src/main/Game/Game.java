package Game;


import Sound.*;
import ui.PianoPanel;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;

// Game is the loop of one game,
// Game would start with certain key (start key)
// Each game can only has one error:
//      if the wrong key is pressed, restart the game
//      once one sequence is completed (all correct), start the next sequence
//          (next or exit button)
//      end game when out of sequence

public class Game {

    public static final ArrayList<String> PIANO_KEYS = new ArrayList<>(Arrays.asList(
            "a", "b", "c", "d", "e", "f", "g"));

    private boolean isCorrectKey;
    private boolean isNextGame;
    private boolean isGameComplete;
    private int score;
    private ArrayList<String> currSong;
    private SequenceGenerator sqGen;
    private boolean isListening;
    private String lastKeyPressed;
    private PianoNote notePlayer;
    private PianoPanel piano;
    private boolean b;

    public Game(PianoPanel pp){
        isCorrectKey = true;
        isNextGame = false;
        isGameComplete = false;
        isListening = false;
        lastKeyPressed = "";
        b = false;

        sqGen = new SequenceGenerator();
        notePlayer = new PianoNote();
        piano = pp;
    }

    // MODIFIES: this
    // EFFECTS: receives the last pressed key string value,
    //          call play song on last pressed note, update piano panel
    public void keyPressed(KeyEvent ke) {
        char temp;


        if (isListening) {
            temp = ke.getKeyChar();
            lastKeyPressed = Character.toString(temp).toLowerCase();

            if (PIANO_KEYS.contains(lastKeyPressed)) {
            playSong(lastKeyPressed);
            updatePanel(lastKeyPressed);
            b = true;
            } else if (lastKeyPressed.equalsIgnoreCase("r")) {
                for (String s: currSong) {
                    playSong(s);
                }
            }
        }

    }

    // EFFECTS: returns true if the input string matches the corresponding string in song
    public boolean checkKey(String expectedNote){

        while (!b) {

        }

        return (lastKeyPressed.equalsIgnoreCase(expectedNote));
    }

    // EFFECTS: play the current song
    public void playSong(String note){
        notePlayer.playNote(note);
    }

    // EFFECTS: update the piano panel with the last pressed key
    public void updatePanel(String inputKey) {
        piano.brightenKey(inputKey.toLowerCase());
        //piano.paintComponents();
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
