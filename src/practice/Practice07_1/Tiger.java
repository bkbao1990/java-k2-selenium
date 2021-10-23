package practice.Practice07_1;

import java.security.SecureRandom;

public class Tiger extends Animals{
    private int TIGER_MAX_SPEED = 100;
    @Override
    protected int getSpeed() {
        return new SecureRandom().nextInt(TIGER_MAX_SPEED);
    }

    @Override
    protected boolean getFlyable() {
        return false;
    }

    @Override
    protected String getRace() {
        return "Tiger";
    }

    @Override
    protected int raceDistance(int raceDistance) {
        return raceDistance;
    }
}
