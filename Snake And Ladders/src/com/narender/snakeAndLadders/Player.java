package com.narender.snakeAndLadders;

public class Player {
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    private String name;
    private String color;
    private int score;

    public Player(String name, String color) {
        this.name = name;
        this.color = color;
        this.score = 0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
