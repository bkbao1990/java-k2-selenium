package practice.Practice07_1;

import java.security.SecureRandom;

public class Tiger extends Animals{
    private final int TIGER_MAX_SPEED = 100;

    @Override
    protected int speed() {
        return 0;
    }

    @Override
    protected boolean flyable() {
        return false;
    }

    @Override
    protected String raceName() {
        return "Tiger";
    }
}
