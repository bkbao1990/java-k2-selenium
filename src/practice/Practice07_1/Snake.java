package practice.Practice07_1;

import java.security.SecureRandom;

public class Snake extends Animals{
    private static int SNAKE_MAX_SPEED = 120;

   public Snake() {
        super (new SecureRandom().nextInt(SNAKE_MAX_SPEED));
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
