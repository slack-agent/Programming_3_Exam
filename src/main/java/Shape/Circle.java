package Shape;

import java.awt.*;

public class Circle implements Shapes {
    private int radius;
    private Point center;
    private Color color;
    private String txt;

    public Circle(int radius, Point center, Color color, String txt) {
        this.radius = radius;
        this.center = center;
        this.color = color;
        this.txt = txt;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawOval(center.x - radius, center.y - radius, 2 * radius, 2 * radius);
        g.drawString(txt, center.x - radius, center.y - radius);
    }
}
