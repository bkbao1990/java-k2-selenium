package practice.Practice06_1;

import java.security.SecureRandom;

public class Tiger extends Animals{
    private int TIGER_MAX_SPEED = 100;

    public Tiger(String race) {
        super(race);
    }

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(TIGER_MAX_SPEED);
    }
}
