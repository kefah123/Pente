package com.kefah.project.java;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PenteGame extends Application {
    public static final int TILE_SIZE = 55;
    public static final int WIDTH = 12;
    public static final int HEIGHT = 12;
    private Group pointGroup = new Group();

    public static void main(String[] args)
    {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        root.setPrefSize(WIDTH * TILE_SIZE, HEIGHT * TILE_SIZE);
        root.setStyle("-fx-background-color:bisque;");
        drawBoard();
        root.getChildren().addAll(pointGroup);
        Scene scene = new Scene(root);

        primaryStage.setTitle("Pente");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     The drawBoard method creates a grid of tiles representing the game board
     */
    public void drawBoard() {
        for (int i=0;i<HEIGHT; i++) {
            for (int j=0; j < WIDTH; j++) {
                Rectangle border = new Rectangle(i * TILE_SIZE, j * TILE_SIZE, TILE_SIZE, TILE_SIZE);
                border.setFill(null);
                border.setStroke(Color.BLACK);
                border.setStrokeWidth(3.7);
                pointGroup.getChildren().add(border);
            }
        }

        for (int i=1;i<HEIGHT; i++) {
            for (int j=1; j<WIDTH;j++) {
                Point point = new Point(i,j);
                pointGroup.getChildren().add(point);

            }
        }
    }
}
