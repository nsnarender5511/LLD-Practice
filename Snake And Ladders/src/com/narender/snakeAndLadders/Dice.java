package com.narender.snakeAndLadders;

import java.util.Random;

public class Dice {
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void roll(Player player){
        this.val = new Random().nextInt(7);
        System.out.println("##DICEROLL  ::  " + player.getName() + "  --  Rolled Dice, and Got  ::  " + val);
    }
}
