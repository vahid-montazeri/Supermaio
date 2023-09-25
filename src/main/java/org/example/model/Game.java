package org.example.model;

import org.example.exception.WrongChallengeException;
import org.example.model.level.Easy;
import org.example.model.level.Level;
import org.example.model.step.Step;
import org.example.model.step.StepThree;

public class Game {
    private Level level;
    private Player player;

    public void start(Step step, Level level) {
        if (step instanceof StepThree) {
            if (level instanceof Easy) {
                throw new WrongChallengeException("در این مرحله نمی توانید سختی بازی را آسان انتخاب کنید!");
            }
        }
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
