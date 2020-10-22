package com.kefah.project.java;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Point extends Circle {
    private Piece piece;

    public Point(int x, int y) {
        //relocate(x * PenteGame.TILE_SIZE, y * PenteGame.TILE_SIZE);
        setCenterX(x*PenteGame.TILE_SIZE);
        setCenterY(y*PenteGame.TILE_SIZE);
        setRadius(3);
    }

    /**** Methods *****/
    public Piece getPiece(){
        return piece;
    }
    public void setPiece(Piece piece){
        this.piece = piece;
    }
    public boolean hasPiece() {
        return piece != null;
    }
}
