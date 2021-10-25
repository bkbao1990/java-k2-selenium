package practice.Practice06_1;

import java.security.SecureRandom;

public class Horse extends Animals{
    private static final int HORSE_MAX_SPEED = 75;

    public Horse(){
        super(new SecureRandom().nextInt(HORSE_MAX_SPEED));
    }
//    public Horse(String race) {
//        super(race);
//    }
//
//    @Override
//    public int getSpeed() {
//        return new SecureRandom().nextInt(HORSE_MAX_SPEED);
//    }
}
