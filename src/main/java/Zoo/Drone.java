package Zoo;

import java.awt.*;

import Zoo.Abstracts.Location;
import Zoo.Interfaces.Drawable;

public class Drone extends Location implements Drawable{
    private String name;
    private int radio_freq;
    private int edge;
    private Color color;

    public Drone(String name, int radio_freq, int GPS_ID) {
        super(GPS_ID);
        this.name = name;
        this.radio_freq = radio_freq;
        this.edge = 3;
        this.color = Color.BLACK;
    }

    public String getName() {
        return name;
    }

    public int getRadio_freq() {
        return radio_freq;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public int getSize() {
        return edge;
    }

    @Override
    public Point getPoint() {
        return super.getLocation();
    }

    @Override
    public String getTxt() {
        return this.name + " " + this.radio_freq;
    }

    @Override
    public String getShape() {
        return "Rect";
    }
}
