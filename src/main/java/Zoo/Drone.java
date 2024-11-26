package Zoo;

import java.awt.*;

import Zoo.Abstracts.Location;
import Zoo.Interfaces.Dots;

public class Drone extends Location implements Dots{
    private String name;
    private int radio_freq;
    private int radius;
    private Color color;

    public Drone(String name, int radio_freq, int GPS_ID) {
        super(GPS_ID);
        this.name = name;
        this.radio_freq = radio_freq;
        this.radius = 3;
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
    public int getRadius() {
        return radius;
    }

    @Override
    public Point getPoint() {
        return super.getLocation();
    }

    @Override
    public String getTxt() {
        return this.name + " " + this.radio_freq;
    }
}
