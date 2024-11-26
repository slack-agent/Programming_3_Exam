package Functions;

import java.awt.*;

public class Distance {
    public static double getDistance(Point p1, Point p2){
        int x1 = p1.x;
        int y1 = p1.y;
        int x2 = p2.x;
        int y2 = p2.y;
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
