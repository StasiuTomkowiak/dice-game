package org.example;

import java.util.Random;

public class RollDie {

    public RollDie(int numSides) {
        Die die = new Die(numSides);
    }

    public int rollDie() {
        Random rand = new Random();
        return rand.nextInt(Die.getNumSides()) + 1;
    }
}
