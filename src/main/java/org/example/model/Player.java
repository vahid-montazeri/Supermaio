package org.example.model;

import org.example.model.step.Step;

public class Player {
    private String name;
    private int score;
    private Step step;

    public Player() {
    }

    public Player(String name, int score, Step step) {
        this.name = name;
        this.score = score;
        this.step = step;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Step getStep() {
        return step;
    }

    public void setStep(Step step) {
        this.step = step;
    }
}
