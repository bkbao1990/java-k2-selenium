package practice.Practice07_1;

import java.security.SecureRandom;

public class Puma extends Animals{
    private static final int PUMA_MAX_SPEED = 180;

    public Puma() {
        super(new SecureRandom().nextInt(PUMA_MAX_SPEED));
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
