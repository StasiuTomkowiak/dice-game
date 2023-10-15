package org.example;

import java.util.Random;

public class RollDie {
    private final Die die;

    public RollDie(int numSides) {
        die = new Die(numSides);
    }

    public int rollDie() {
        Random rand = new Random();
        return rand.nextInt(Die.getNumSides()) + 1;
    }
}
