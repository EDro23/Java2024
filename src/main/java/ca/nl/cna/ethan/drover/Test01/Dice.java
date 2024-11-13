package ca.nl.cna.ethan.drover.Test01;

import java.util.Random;

public class Dice {

    private final Integer sides;

    public Dice(Integer sides) {

        this.sides = sides;
    }

    public Dice() {
        this.sides = 6;
    }

    public Integer roll() {
        Random random = new Random();
        return random.nextInt(sides) + 1;
    }

    public Integer getSides() {
        return sides;
    }
}
