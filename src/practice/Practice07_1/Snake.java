package practice.Practice07_1;

import java.security.SecureRandom;

public class Snake extends Animals{
    private int SNAKE_MAX_SPEED = 120;
    @Override
    protected int speed() {
        return new SecureRandom().nextInt(SNAKE_MAX_SPEED);
    }

    @Override
    protected boolean flyable() {
        return false;
    }

    @Override
    protected String raceName() {
        return "Snake";
    }
}
