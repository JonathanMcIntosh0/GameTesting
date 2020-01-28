package components;

import com.sun.javafx.geom.Vec2d;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

import java.util.Random;

public class Bot extends Pane {
    private static final int RADIUS = 5;
    private static final int NUM_MOVES = 100;

    Shape form;

    int fitness;
    Vec2d[] moves = new Vec2d[NUM_MOVES];

//    Random rng = new Random(System.currentTimeMillis());
    Random rng = new Random();

    public Bot(Coord pos) {
        setPos(pos);
        init_Form();
    }

    public Bot(double x, double y) {
        setPos(new Coord(x, y));
        init_Form();
        init_moves();
    }


    void setPos(Coord pos) {
        this.setLayoutX(pos.x);
        this.setLayoutY(pos.y);
    }

    private void init_Form() {
        form = new Circle(RADIUS, Color.GRAY);
        this.setHeight(2 * RADIUS);
        this.setWidth(2 * RADIUS);
        this.getChildren().add(form);
    }

    private void init_moves() {
        for (int i = 0; i < NUM_MOVES; i++) {
            moves[i] = genRandMove();
        }
    }

    private Vec2d genRandMove() {
        return new Vec2d(rng.nextDouble(), rng.nextDouble());
    }
}
