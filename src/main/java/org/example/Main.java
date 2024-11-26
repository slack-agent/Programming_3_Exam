package org.example;


import APIs.*;

import java.awt.*;
import java.util.ArrayList;
import Shape.Drawing;
import Zoo.Abstracts.Location;
import Zoo.Animals.Lion;
import Zoo.Interfaces.*;
import Zoo.*;
import Functions.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Map");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 1));

        ArrayList<Lion> Lion_list = new ArrayList<>();
        ArrayList<Keeper> Keeper_list = new ArrayList<>();
        ArrayList<Drone> Drone_list = new ArrayList<>();

        Lion_list.add(new Lion("Simba", 7, 30));
        Keeper_list.add(new Keeper("Geoff", "4392", 80));
        Drone_list.add(new Drone("Monitor1", 128, 124));

        ArrayList<Drawable> Drawable_list = new ArrayList<>();

        for (int i = 0; i < Lion_list.size(); i++) {
            Drawable_list.add((Drawable) Lion_list.get(i));
        }

        for (int i = 0; i < Keeper_list.size(); i++) {
            Drawable_list.add((Drawable) Keeper_list.get(i));
        }

        for (int i = 0; i < Drone_list.size(); i++) {
            Drawable_list.add((Drawable) Drone_list.get(i));
        }

        Drawing drawingPanel = new Drawing(Drawable_list);

        // Add panels to frame
        frame.add(drawingPanel);

        frame.setVisible(true);

        while (true) {
            try {
                for (int i = 0; i < Lion_list.size(); i++) {
                    ((Location) Lion_list.get(i)).updateLocation();
                }
                for (int i = 0; i < Keeper_list.size(); i++) {
                    ((Location) Keeper_list.get(i)).updateLocation();
                }
                for (int i = 0; i < Drone_list.size(); i++) {
                    ((Location) Drone_list.get(i)).updateLocation();
                }
                for (int i = 0; i < Keeper_list.size(); i++) {
                    for (int j = 0; j < Lion_list.size(); j++) {
                        double distance = Distance.getDistance(((Location) Keeper_list.get(i)).getLocation(),
                                                               ((Location) Lion_list.get(i)).getLocation());
                        if (distance < 60) {
                            AlertSystem.alertAKeeper(Keeper_list.get(i).getPhone_number());
                            for (int k = 0; k < Drone_list.size(); k++) {
                                AlertSystem.alertADrone(Drone_list.get(i).getRadio_freq());
                            }
                        }
                    }
                }
                drawingPanel.paintShapes();
                drawingPanel.repaint();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}