package ui;

import javax.swing.*;
import java.awt.*;

public class PianoDude extends JFrame {
    private PianoPanel pp;

    // EFFECTS: Sets up main window for game
    public PianoDude() {
        super("Piano Dude");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        pp = new PianoPanel();
        add(pp);
        pack();
        centerOnScreen();
        setVisible(true);
    }

    // MODIFIES: this
    // EFFECTS: location of frame is set so frame is centered on screen
    private void centerOnScreen() {
        Dimension scrn = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((scrn.width - getWidth()) / 2, (scrn.height - getHeight()) / 2);
    }

    public static void main(String[] args) {
        new PianoDude();
    }
}
