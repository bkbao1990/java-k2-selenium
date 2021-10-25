package practice.Practice06_1;

import java.security.SecureRandom;

public class Tiger extends Animals{
    private static final int TIGER_MAX_SPEED = 100;

    public Tiger(){
        super(new SecureRandom().nextInt(TIGER_MAX_SPEED));
    }

//    public Tiger(String race) {
//        super(race);
//    }
//
//    @Override
//    public int getSpeed() {
//        return new SecureRandom().nextInt(TIGER_MAX_SPEED);
//    }
}
