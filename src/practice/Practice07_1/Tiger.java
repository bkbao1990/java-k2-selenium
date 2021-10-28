package practice.Practice07_1;

import java.security.SecureRandom;

public class Tiger extends Animals{
    private static final int TIGER_MAX_SPEED = 100;
    public Tiger(){
        super(new SecureRandom().nextInt(TIGER_MAX_SPEED));
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
