package Shape;

import java.awt.*;

public class Rect implements Shapes {
    private int width, height;
    private Point center;
    private Color color;
    private String txt;

    public Rect(int width, int height, Point center, Color color, String txt) {
        this.width = width;
        this.height = height;
        this.center = center;
        this.color = color;
        this.txt = txt;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.drawRect(center.x, center.y, width, height);
        g.drawString(txt, center.x - width, center.y - height);
    }
}
