package com.kefah.project.java;

import javafx.scene.shape.Ellipse;

public class Piece extends Ellipse {
    private int xCoord;
    private int yCoord;

    /****** Constructors *******/

    public Piece() {
        xCoord = 0;
        yCoord = 0;
    }

    public Piece(int x, int y) {
        xCoord = x;
        yCoord = y;
    }

    /****** Methods *******/

    public int getY() {
        return yCoord;
    }

    public int getX() {
        return xCoord;
    }
}
