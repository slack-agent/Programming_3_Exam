package Zoo;

import APIs.LocationSystem;

import java.awt.*;
import java.io.IOException;

import Zoo.Abstracts.Location;
import Zoo.Interfaces.Dots;
import Zoo.Interfaces.Attributes;

public class Drone extends Location implements Dots, Attributes{
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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getClassName() {
        return "Drone";
    }

    @Override
    public int getInt_attribute() {
        return this.getRadio_freq();
    }

    @Override
    public String getStr_attribute() {
        return "";
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
}
