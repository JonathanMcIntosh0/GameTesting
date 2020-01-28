package main;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import components.Bot;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GameWindow extends Stage {
    Group root;

    ArrayList<Shape> obstacles;
    Shape finishLine;
    ArrayList<Bot> bots;

    public GameWindow() {
        root = new Group();

        init_obstacles();
        init_finishLine();
        init_bots();

        this.setScene(new Scene(root, Database.WIDTH, Database.HEIGHT));
    }


    private void init_obstacles() {
        obstacles = new ArrayList<>();

        Rectangle obs = new Rectangle(200, 25, Color.BLACK);
        obs.setLayoutY(100);
        obstacles.add(obs);

        Rectangle northWall = new Rectangle(Database.WIDTH, 5, Color.BLACK);
        obstacles.add(northWall);

        Rectangle eastWall = new Rectangle(5, Database.HEIGHT, Color.BLACK);
        eastWall.setLayoutX(Database.WIDTH - 5);
        obstacles.add(eastWall);

        Rectangle southWall = new Rectangle(Database.WIDTH, 5, Color.BLACK);
        southWall.setLayoutY(Database.HEIGHT - 5);
        obstacles.add(southWall);

        Rectangle westWall = new Rectangle(5, Database.HEIGHT, Color.BLACK);
        obstacles.add(westWall);

        root.getChildren().addAll(obstacles);
    }

    private void init_finishLine() {
        finishLine = new Rectangle(10, 10, Color.GREEN);
        finishLine.setLayoutX(Database.WIDTH / 2 - 5);
        finishLine.setLayoutY(10);

        root.getChildren().add(finishLine);
    }

    private void init_bots() {
        bots = new ArrayList<>();
        for (int i = 0; i < Database.NUM_BOTS; i++) {
            bots.add(new Bot(Database.WIDTH / 2 - 5, Database.HEIGHT - 20));
        }
        root.getChildren().addAll(bots);
    }
}
