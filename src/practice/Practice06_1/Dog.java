package practice.Practice06_1;

import java.security.SecureRandom;

public class Dog extends Animals{
    private static final int DOG_MAX_SPEED = 60;

    public  Dog(){
        super(new SecureRandom().nextInt(DOG_MAX_SPEED));
    }
//    public Dog(String race) {
//        super(race);

//    }

//    @Override
//    public int getSpeed() {
//        return new SecureRandom().nextInt(DOG_MAX_SPEED);
//    }
}
