package practice.Practice07_1;

import java.security.SecureRandom;

public class Puma extends Animals{
    private final int PUMA_MAX_SPEED = 180;
    @Override
    protected int speed() {
        return new SecureRandom().nextInt(PUMA_MAX_SPEED);
    }

    @Override
    protected boolean flyable() {
        return false;
    }

    @Override
    protected String raceName() {
        return "Puma";
    }
}
