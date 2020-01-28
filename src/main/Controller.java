package main;

public class Controller {

    GameWindow gameStage;

    public Controller() {
    }

//    Init and run gamewindow stage
    public void runGame() {
        gameStage = new GameWindow();
        gameStage.setTitle("AI testing");
        gameStage.show();
    }
}
