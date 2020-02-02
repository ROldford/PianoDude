package Sound;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.Random;

public class SequenceGenerator {
    public static final String NOTES = "abcdefg";

    public ArrayList<String> sequence;

    public SequenceGenerator(){
        sequence = new ArrayList<String>();
    }

    public ArrayList<String> generateString() {
        sequence.add("c");

        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(NOTES.length()-1);
            sequence.add(NOTES.substring(index,index+1));
        }
        return sequence;
    }


}
