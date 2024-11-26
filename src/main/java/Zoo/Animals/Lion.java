package Zoo.Animals;

import java.awt.*;
import java.io.IOException;

import Zoo.Abstracts.Location;
import Zoo.Interfaces.Dots;
import Zoo.Interfaces.Attributes;

public class Lion extends Location implements Dots, Attributes{
    private String name;
    private int age;
    private int radius;
    private Color color;

    public Lion(String name, int age, int GPS_ID) {
        super(GPS_ID);
        this.name = name;
        this.age = age;
        this.radius = 3;
        this.color = Color.RED;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getClassName() {
        return "Lion";
    }

    @Override
    public int getInt_attribute() {
        return this.getAge();
    }

    @Override
    public String getStr_attribute() {
        return "";
    }

    public int getAge() {
        return age;
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
