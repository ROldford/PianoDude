package ui;

import java.awt.*;

public class PianoKeyView {
    private int originX;
    private int originY;
    private int width;
    private int height;
    private int cornerRadius;
    private int borderThickness;
    private Color brightColor;
    private Color normalColor;
    private Color color;


    // EFFECTS: Construct new PianoKeyView with given origin, color and dimension
    public PianoKeyView(int x, int y, int w, int h, int cr, int bt, Color c) {
        this.originX = x;
        this.originY = y;
        this.width = w;
        this.height = h;
        this.cornerRadius = cr;
        this.borderThickness = bt;
        this.normalColor = c;
        this.brightColor = Color.WHITE;
        this.color = c;
    }

    // EFFECTS: Draw current state of key
    public void draw(Graphics g) {
        Color savedCol = g.getColor();
        g.setColor(Color.BLACK);
        g.fillRoundRect(originX, originY, width, height, cornerRadius, cornerRadius);
        g.setColor(color);
        g.fillRoundRect(
                originX + borderThickness,
                originY + borderThickness,
                width - 2 * borderThickness,
                height - 2 * borderThickness,
                cornerRadius, cornerRadius);
        g.setColor(savedCol);
    }

    public void brightenColor() {
        this.color = brightColor;
    }

    public void resetColor() {
        this.color = normalColor;
    }
}
