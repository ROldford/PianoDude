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
    Note note;

    private String name;
    private int pitch;
    private int volume;
    private int length;


    public PianoNote() {
        note = new Note();
    }

//    public Note makeNote(String name, int pitch){
//        this.name = name;
//        this.pitch = note.setPitch(pitch);
//        note.setDynamic(volume);
//        note.setDuration(length);
//        Play.midi(note);
//    }

    public void makeNoteA(){
        noteA = new Note();
        this.name = "a";
        noteA.setPitch(57);
        noteA.setDynamic(volume);
        noteA.setDuration(length);
        Play.midi(noteA);
    }

//    public void makeNoteB(){
//        noteB = new Note();
//        this.name = "b";
//        noteB.setPitch(59);
//        noteB.setDynamic(volume);
//        noteB.setDuration(length);
//    }
//
//    public void makeNoteC(){
//        noteC = new Note();
//        this.name = "c";
//        noteC.setPitch(60);
//        noteC.setDynamic(volume);
//        noteC.setDuration(length);
//    }
//
//    public void makeNoteD(){
//        noteD = new Note();
//        this.name = "d";
//        noteD.setPitch(62);
//        noteD.setDynamic(volume);
//        noteD.setDuration(length);
//    }
//
//    public void makeNoteE(){
//        noteE = new Note();
//        this.name = "e";
//        noteE.setPitch(64);
//        noteE.setDynamic(volume);
//        noteE.setDuration(length);
//    }
//
//    public void makeNoteF(){
//        noteF = new Note();
//        this.name = "f";
//        noteF.setPitch(65);
//        noteF.setDynamic(volume);
//        noteF.setDuration(length);
//    }
//    public void makeNoteG(){
//        noteG = new Note();
//        this.name = "g";
//        noteG.setPitch(67);
//        noteG.setDynamic(volume);
//        noteG.setDuration(length);
//    }

}
