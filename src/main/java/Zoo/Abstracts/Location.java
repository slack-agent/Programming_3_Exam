package Zoo.Abstracts;

import APIs.LocationSystem;

import java.awt.*;
import java.io.IOException;

public abstract class Location {
    private Point location;
    private int GPS_ID;

    public Location(int GPS_ID) {
        this.GPS_ID = GPS_ID;
    }

    public int getGPS_ID() {
        return GPS_ID;
    }

    public Point getLocation() {
        return location;
    }

    public void updateLocation() throws RuntimeException{
        try {
            this.location = LocationSystem.getCoords(this.GPS_ID);
            if (this.location == null) {
                throw new RuntimeException("GPS Tag ID is not valid.");
            }
        } catch (IOException e) {
            System.out.println("Can not connect to GPS");
        }
    }
}
