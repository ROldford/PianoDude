package Sound;

import jm.music.data.Note;
import jm.util.Play;

public class PianoNote {

    public void PianoNote (String name) {
        Note note = new Note();

        if (name.equals("a")) {
            note.setPitch(57);
            Play.midi(note);
        }
        if (name.equals("b")) {
            note.setPitch(59);
            Play.midi(note);
        }
        if (name.equals("c")) {
            note.setPitch(60);
            Play.midi(note);
        }
        if (name.equals("d")) {
            note.setPitch(62);
            Play.midi(note);
        }
        if (name.equals("e")) {
            note.setPitch(64);
            Play.midi(note);
        }
        if (name.equals("f")) {
            note.setPitch(65);
            Play.midi(note);
        }
        if (name.equals("g")) {
            note.setPitch(67);
            Play.midi(note);
        }

    }
}
