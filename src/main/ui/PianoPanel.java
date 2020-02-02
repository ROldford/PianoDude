package ui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PianoPanel extends JPanel {
    private List<PianoKeyView> pianoKeys;
    public static final int PIANO_BORDER = 5;
    public static final int KEY_SPACING = 1;
    public static final int KEY_WIDTH = 50;
    public static final int KEY_HEIGHT = 100;
    public static final int KEYS_COUNT = 7;
    public static final int CORNER_RADIUS = 3;
    public static final int BORDER_THICKNESS = 2;
    public static final int PANEL_WIDTH = PIANO_BORDER * 2 + KEY_WIDTH * KEYS_COUNT + KEY_SPACING * (KEYS_COUNT - 1);
    public static final int PANEL_HEIGHT = PIANO_BORDER * 2 + KEY_HEIGHT;

    // EFFECTS: Constructs new PianoPanel with list of PianoKeyViews
    public PianoPanel() {
        this.pianoKeys = new ArrayList<PianoKeyView>();
        for (int i = 0; i < KEYS_COUNT; i++) {
            float hue = (i * 1.0F) / KEYS_COUNT;
            Color color = new Color(Color.HSBtoRGB(hue, 1.0F, 1.0F));
            pianoKeys.add(new PianoKeyView(
                    PIANO_BORDER + i * (KEY_WIDTH + KEY_SPACING),
                    PIANO_BORDER,
                    KEY_WIDTH,
                    KEY_HEIGHT,
                    CORNER_RADIUS,
                    BORDER_THICKNESS,
                    color));
        }
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        setBackground(Color.GRAY);
    }

    // EFFECTS: Paints all PianoPanel elements onto panel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawKeys(g);
    }

    // EFFECTS: Draws visual of piano keys on panel
    private void drawKeys(Graphics g) {
        for (PianoKeyView pianoKey: pianoKeys) {
            pianoKey.draw(g);
        }
    }
}
