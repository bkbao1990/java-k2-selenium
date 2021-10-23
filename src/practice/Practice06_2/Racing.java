package practice.Practice06_2;

import practice.Practice06_2.Animals.Builder;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Racing {
    public static void main(String[] args) {
        int totalRaceLength = 1000;
        final int TIGER_MAX_SPEED = 100;
        final int FALCON_MAX_SPEED = 150;
        final int SNAKE_MAX_SPEED = 80;
        final int SPARROW_MAX_SPEED = 100;
        final int PUMA_MAX_SPEED = 120;

        Builder builder = new Builder();
        List<Animals> animals = new ArrayList<>();
        Animals tiger = builder.whatTypeOfAnimal("Tiger").canItFly(false).whatIsTheMaximumSpeed(new SecureRandom().nextInt(TIGER_MAX_SPEED)).build();
        Animals falcon = builder.whatTypeOfAnimal("Falcon").canItFly(true).whatIsTheMaximumSpeed(new SecureRandom().nextInt(FALCON_MAX_SPEED)).build();
        Animals puma = builder.whatTypeOfAnimal("Puma").canItFly(false).whatIsTheMaximumSpeed(new SecureRandom().nextInt(PUMA_MAX_SPEED)).build();
        Animals snake = builder.whatTypeOfAnimal("Snake").canItFly(false).whatIsTheMaximumSpeed(new SecureRandom().nextInt(SNAKE_MAX_SPEED)).build();
        Animals sparrow = builder.whatTypeOfAnimal("Sparrow").canItFly(true).whatIsTheMaximumSpeed(new SecureRandom().nextInt(SPARROW_MAX_SPEED)).build();

        animals.add(tiger);
        animals.add(falcon);
        animals.add(puma);
        animals.add(sparrow);
        animals.add(snake);




        // boolean isFlyable = animals[tiger[1]];
    }

//    public static String racingContest( List<Animals> animals ){
//        for (Animals index : animals) {
//            Animals.
//        }
//
//        return racingContest();
//    }

//        do {
//            for (Animals ignored : animals) {
//                dog.setRaceDistance(dogCurrentDistance += dog.getSpeed());
//                horse.setRaceDistance(horseCurrentDistance += horse.getSpeed());
//                tiger.setRaceDistance(tigerCurrentDistance += tiger.getSpeed());
//                counter++;
//            }
//        }
//        while ((dogCurrentDistance <= totalRaceLength) && (horseCurrentDistance <= totalRaceLength) && (tigerCurrentDistance <= totalRaceLength));
//
//        int dogSpeed = dogCurrentDistance / counter;
//        int tigerSpeed = tigerCurrentDistance / counter;
//        int horseSpeed = horseCurrentDistance / counter;
//    }
//
//        for(
//    Animals animal :animals)
//
//    {
//        if (animal)
//    }
//        do
//
//    {
//        for (Animals ignored : animals) {
//            dog.setRaceDistance(dogCurrentDistance += dog.getSpeed());
//            horse.setRaceDistance(horseCurrentDistance += horse.getSpeed());
//            tiger.setRaceDistance(tigerCurrentDistance += tiger.getSpeed());
//            counter++;
//        }
//    }
//        while((dogCurrentDistance <=totalRaceLength)&&(horseCurrentDistance <=totalRaceLength)&&(tigerCurrentDistance <=totalRaceLength));
//
//    int dogSpeed = dogCurrentDistance / counter;
//    int tigerSpeed = tigerCurrentDistance / counter;
//    int horseSpeed = horseCurrentDistance / counter;
//
//        System.out.println(animals);
//        if((tigerCurrentDistance >dogCurrentDistance)&&(tigerCurrentDistance >horseCurrentDistance))
//            System.out.printf("Winner is %s, with total run distance is: %d and average speed: %d.",tiger.getRace(),tigerCurrentDistance,tigerSpeed);
//        else if((horseCurrentDistance >tigerCurrentDistance)&&(horseCurrentDistance >dogCurrentDistance))
//            System.out.printf("Winner is %s, with total run distance is: %d and average speed: %d.",horse.getRace(),horseCurrentDistance,horseSpeed);
//        else
//                System.out.printf("Winner is %s, with total run distance is: %d and average speed: %d.",dog.getRace(),horseCurrentDistance,dogSpeed);
//    }
}

