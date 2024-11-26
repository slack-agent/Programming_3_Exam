package org.example;


import APIs.LocationSystem;

import java.awt.*;
import java.util.ArrayList;
import Shape.Drawing;
import Zoo.Abstracts.Location;
import Zoo.Animals.Lion;
import Zoo.Interfaces.*;
import Zoo.*;

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

        ArrayList<Dots> Dots_list = new ArrayList<>();
        ArrayList<Attributes> Attributes_list = new ArrayList<>();

        for (int i = 0; i < Lion_list.size(); i++) {
            Dots_list.add((Dots) Lion_list.get(i));
            Attributes_list.add((Attributes) Lion_list.get(i));
        }

        for (int i = 0; i < Keeper_list.size(); i++) {
            Dots_list.add((Dots) Keeper_list.get(i));
            Attributes_list.add((Attributes) Keeper_list.get(i));
        }

        for (int i = 0; i < Drone_list.size(); i++) {
            Dots_list.add((Dots) Drone_list.get(i));
            Attributes_list.add((Attributes) Drone_list.get(i));
        }

        Drawing drawingPanel = new Drawing(Dots_list, Attributes_list);

        // Add panels to frame
        frame.add(drawingPanel);

        frame.setVisible(true);

        while (true) {
            try {
                for (int i = 0; i < Lion_list.size(); i++) {
                    ((Location) Lion_list.get(i)).updateLocation();
                }
                for (int i = 0; i < Lion_list.size(); i++) {
                    ((Location) Keeper_list.get(i)).updateLocation();
                }
                for (int i = 0; i < Lion_list.size(); i++) {
                    ((Location) Drone_list.get(i)).updateLocation();
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