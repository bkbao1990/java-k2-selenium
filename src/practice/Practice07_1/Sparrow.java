package practice.Practice07_1;

import java.security.SecureRandom;

public class Sparrow extends Animals{
    private int SPARROW_MAX_SPEED = 120;
    @Override
    protected int getSpeed() {
        return new SecureRandom().nextInt(SPARROW_MAX_SPEED);
    }

    @Override
    protected boolean getFlyable() {
        return true;
    }

    @Override
    protected String getRace() {
        return "Sparrow";
    }

    @Override
    protected int raceDistance(int raceDistance) {
        return raceDistance;
    }
}
