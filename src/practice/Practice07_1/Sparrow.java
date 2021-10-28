package practice.Practice07_1;

import java.security.SecureRandom;

public class Sparrow extends Animals{
    private static final int SPARROW_MAX_SPEED = 120;

    public Sparrow() {
        super(new SecureRandom().nextInt(SPARROW_MAX_SPEED));
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
