package Zoo;

import APIs.LocationSystem;

import java.awt.*;
import java.io.IOException;

import Zoo.Abstracts.Location;
import Zoo.Interfaces.Dots;
import Zoo.Interfaces.Attributes;

public class Keeper extends Location implements Dots, Attributes{
    private String name;
    private String phone_number;
    private int radius;
    private Color color;

    public Keeper(String name, String phone_number, int GPS_ID) {
        super(GPS_ID);
        this.name = name;
        this.phone_number = phone_number;
        this.radius = 2;
        this.color = Color.BLUE;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getClassName() {
        return "Keeper";
    }

    @Override
    public int getInt_attribute() {
        return -1;
    }

    @Override
    public String getStr_attribute() {
        return this.getPhone_number();
    }

    public String getPhone_number() {
        return phone_number;
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
