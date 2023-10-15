package org.example;

public class Die {
    private static int numSides;

        public Die(int numSides) {
            Die.numSides = numSides;
        }

        public static int getNumSides() {
            return numSides;
        }


}
