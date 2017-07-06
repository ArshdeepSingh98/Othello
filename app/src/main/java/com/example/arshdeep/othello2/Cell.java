package com.example.arshdeep.othello2;

import android.content.Context;

/**
 * Created by Arshdeep on 6/20/2017.
 */

public class Cell extends android.support.v7.widget.AppCompatImageButton{

    private Player player = new Player();

    private int x,y;

    public Cell(Context context) {
        super(context);
    }

    public void setPlayer(final Player player) {
        this.player = player;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getXPos() {
        return x;
    }

    public int getYPos() {
        return y;
    }

    public Player getPlayer() {
        return player;
    }

    public void setColor(COLOR color) {
        player.setColor(color);
    }

    public COLOR getColor() {
        return player.getColor();
    }

}

