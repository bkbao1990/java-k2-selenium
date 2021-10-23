package practice.Practice07_1;

import java.security.SecureRandom;

public class Puma extends Animals{
    private int PUMA_MAX_SPEED = 180;
    @Override
    protected int getSpeed() {
        return new SecureRandom().nextInt(PUMA_MAX_SPEED);
    }

    @Override
    protected boolean getFlyable() {
        return false;
    }

    @Override
    protected String getRace() {
        return "Puma";
    }

    @Override
    protected int raceDistance(int raceDistance) {
        return raceDistance;
    }
}
