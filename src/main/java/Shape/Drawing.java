package Shape;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

import Zoo.Interfaces.Dots;
import Zoo.Interfaces.Attributes;

public class Drawing extends JPanel {
    private final ArrayList<Shapes> shapes;
    private final ArrayList<Dots> dots;
    private final ArrayList<Attributes> attributes;

    public Drawing(ArrayList<Dots> dots, ArrayList<Attributes> attributes) {
        if (dots.size() != attributes.size()) {
            throw new IllegalArgumentException();
        }

        this.shapes = new ArrayList<>();
        this.dots = dots;
        this.attributes = attributes;
        this.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shapes shape : shapes) {
            shape.draw(g);
        }
    }

    public void paintShapes() {
        shapes.clear();  // Clear all shapes from the list
        for (int i = 0; i < dots.size(); i++) {
            int radius = dots.get(i).getRadius();
            Color color = dots.get(i).getColor();
            Point point = dots.get(i).getPoint();
            String name = attributes.get(i).getName();
            System.out.println(radius + " " + color + " " + point);
            this.shapes.add(new Circle(radius, point, color, name));
        }
    }
}