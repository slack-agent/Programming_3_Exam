package Zoo;

import java.awt.*;

import Zoo.Abstracts.Location;
import Zoo.Interfaces.Dots;

public class Keeper extends Location implements Dots{
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

    public String getName() {
        return name;
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

    @Override
    public String getTxt() {
        return this.name + " " + this.phone_number;
    }
}
