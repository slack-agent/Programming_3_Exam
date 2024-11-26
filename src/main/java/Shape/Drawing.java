package Shape;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.*;

import Zoo.Interfaces.Drawable;

public class Drawing extends JPanel {
    private final ArrayList<Shapes> shapes;
    private final ArrayList<Drawable> drawables;

    public Drawing(ArrayList<Drawable> drawables) {
        this.shapes = new ArrayList<>();
        this.drawables = drawables;
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
        for (int i = 0; i < drawables.size(); i++) {
            int size = drawables.get(i).getSize();
            Color color = drawables.get(i).getColor();
            Point point = drawables.get(i).getPoint();
            String txt = drawables.get(i).getTxt();
            String shapeName = drawables.get(i).getShape();
            System.out.println(size + " " + color + " " + point);
            if (Objects.equals(shapeName, "Circle")) {
                this.shapes.add(new Circle(size, point, color, txt));
            } else if (Objects.equals(shapeName, "Rect")) {
                this.shapes.add(new Rect(size, size, point, color, txt));
            }
        }
    }
}