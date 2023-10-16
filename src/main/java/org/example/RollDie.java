package org.example;

import java.util.Random;

public class RollDie {

    private Die die;
    public RollDie(int numSides) {
        die = new Die(numSides);
    }

    public int rollDie() {
        final Random rand = new Random();
        return rand.nextInt(die.getNumSides()) + 1;
    }
}
