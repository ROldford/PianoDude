package Sound;

import jm.music.data.Note;
import jm.util.Play;

public class PianoNote {
    Note noteA;
    Note noteB;
    Note noteC;
    Note noteD;
    Note noteE;
    Note noteF;
    Note noteG;

    private String name;
    private int pitch;
    private int volume;
    private int noteLength;

    public void makeNoteA(){
        noteA = new Note();
        this.name = "a";
        noteA.setPitch(57);
        noteA.setDynamic(5);
        noteA.setDuration(1);
    }

    public void makeNoteB(){
        noteA = new Note();
        this.name = "b";
        noteA.setPitch(59);
        noteA.setDynamic(5);
        noteA.setDuration(1);
    }

    public void makeNoteC(){
        noteA = new Note();
        this.name = "c";
        noteA.setPitch(60);
        noteA.setDynamic(5);
        noteA.setDuration(1);
    }

    public void makeNoteD(){
        noteA = new Note();
        this.name = "d";
        noteA.setPitch(62);
        noteA.setDynamic(5);
        noteA.setDuration(1);
    }

    public void makeNoteF(){
        noteA = new Note();
        this.name = "f";
        noteA.setPitch(65);
        noteA.setDynamic(5);
        noteA.setDuration(1);
    }
    public void makeNoteG(){
        noteA = new Note();
        this.name = "g";
        noteA.setPitch(67);
        noteA.setDynamic(5);
        noteA.setDuration(1);
    }

    public void play(){
        Play.midi(noteA);
    }


}
