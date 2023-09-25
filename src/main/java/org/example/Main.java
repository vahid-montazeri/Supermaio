package org.example;

import org.example.model.*;
import org.example.model.level.Easy;
import org.example.model.level.Level;
import org.example.model.step.Step;
import org.example.model.step.StepOne;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Level easyLevel = new Easy();
        Step step = new StepOne();

        Game game = new Game();
        game.setPlayer(player1);
        game.setLevel(easyLevel);

        game.start(step, easyLevel);
    }
}