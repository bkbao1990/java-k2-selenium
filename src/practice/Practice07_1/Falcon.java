package practice.Practice07_1;

import java.security.SecureRandom;

public class Falcon extends Animals{
    private int FALCON_MAX_SPEED = 150;
    @Override
    protected int getSpeed() {
        return new SecureRandom().nextInt(FALCON_MAX_SPEED);
    }

    @Override
    protected boolean getFlyable() {
        return true;
    }

    @Override
    protected String getRace() {
        return "Falcon";
    }

    @Override
    protected int raceDistance(int raceDistance) {
        return raceDistance;
    }
}
