package Zoo.Animals;

import java.awt.*;

import Zoo.Abstracts.Location;
import Zoo.Interfaces.Drawable;

public class Lion extends Location implements Drawable {
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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public int getSize() {
        return radius;
    }

    @Override
    public Point getPoint() {
        return super.getLocation();
    }

    @Override
    public String getTxt() {
        return this.name + " " + this.age;
    }

    @Override
    public String getShape() {
        return "Circle";
    }
}
