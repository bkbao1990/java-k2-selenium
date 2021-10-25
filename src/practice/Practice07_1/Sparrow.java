package practice.Practice07_1;

import java.security.SecureRandom;

public class Sparrow extends Animals{
    private final int SPARROW_MAX_SPEED = 120;
    @Override
    protected int speed() {
        return new SecureRandom().nextInt(SPARROW_MAX_SPEED);
    }

    @Override
    protected boolean flyable() {
        return true;
    }

    @Override
    protected String raceName() {
        return "Sparrow";
    }
}
