package practice.Practice07_1;

import java.security.SecureRandom;

public class Snake extends Animals{
    private int SNAKE_MAX_SPEED = 120;
    @Override
    protected int getSpeed() {
        return new SecureRandom().nextInt(SNAKE_MAX_SPEED);
    }

    @Override
    protected boolean getFlyable() {
        return false;
    }

    @Override
    protected String getRace() {
        return "Snake";
    }

    @Override
    protected int raceDistance(int raceDistance) {
        return raceDistance;
    }
}
