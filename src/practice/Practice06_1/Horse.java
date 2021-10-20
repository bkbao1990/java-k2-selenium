package practice.Practice06_1;

import java.security.SecureRandom;

public class Horse extends Animals{
    private int  HORSE_MAX_SPEED = 75;

    public Horse(String race) {
        super(race);
    }

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(HORSE_MAX_SPEED);
    }
}
