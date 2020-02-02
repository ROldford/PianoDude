package Sound;

import jm.music.data.Note;
import jm.util.Play;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testPianoNote {
    Note
    private static final int NOTE_A = 57;
    private static final int NOTE_B = 59;
    private static final int NOTE_C = 60;
    private static final int NOTE_D = 62;
    private static final int NOTE_E = 64;
    private static final int NOTE_F = 65;
    private static final int NOTE_G = 67;
    private PianoNote note;
    private PianoNote noteA;

    private String name;
    private int pitch;
    private int volume;
    private int length;

    @BeforeEach
    private void runBefore(){
        note = new PianoNote();
    }

//    @Test
//    private Note testMakeNote(){
//        assertEquals(NOTE_A, );
//        makeNoteA("a", NOTE_A);
//        Play.midi();
//    }

        }




