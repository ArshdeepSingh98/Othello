package com.example.arshdeep.othello2;

/**
 * Created by Arshdeep on 6/20/2017.
 */

public class Player {

    private COLOR color;

    public Player() {
        this.color = COLOR.EMPTY;
    }

    public Player(COLOR color) {
        this.color = color;
    }

    public COLOR getColor() {
        return color;
    }

    public void setColor(COLOR color) {
        this.color = color;
    }
}
