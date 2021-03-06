package practice.Practice07_1;

import java.security.SecureRandom;

public class Falcon extends Animals {
    private static final int FALCON_MAX_SPEED = 150;

    public Falcon() {
        super(new SecureRandom().nextInt(FALCON_MAX_SPEED));
    }

    @Override
    protected boolean flyable() {
        return true;
    }

    @Override
    protected String raceName() {
        return "Falcon";
    }
}
